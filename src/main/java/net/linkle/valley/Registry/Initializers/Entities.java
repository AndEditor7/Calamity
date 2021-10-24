package net.linkle.valley.Registry.Initializers;

import java.util.UUID;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.network.ClientSidePacketRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.linkle.valley.ValleyMain;
import net.linkle.valley.Registry.Entity.BearEntity;
import net.linkle.valley.Registry.Entity.BearEntityRenderer;
import net.linkle.valley.Registry.Entity.DuckEntity;
import net.linkle.valley.Registry.Entity.DuckEntityRenderer;
import net.linkle.valley.Registry.Entity.EntitySpawnPacket;
import net.linkle.valley.Registry.Entity.GrapplingHookEntity;
import net.minecraft.block.Blocks;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.entity.FlyingItemEntityRenderer;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.BiomeKeys;

public class Entities {

    public static final EntityType<BearEntity> BEAR = Registry.register(Registry.ENTITY_TYPE,
        new Identifier(ValleyMain.MOD_ID, "bear"),
        FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, BearEntity::new)
        .dimensions(EntityDimensions.fixed(1.4F, 1.4F)).trackRangeBlocks(10)
        .specificSpawnBlocks(Blocks.GRASS_BLOCK, Blocks.PODZOL, Blocks.COARSE_DIRT).build()
    );
    
    public static final EntityType<DuckEntity> DUCK = Registry.register(Registry.ENTITY_TYPE,
        new Identifier(ValleyMain.MOD_ID, "duck"),
        FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, DuckEntity::new)
        .dimensions(EntityDimensions.fixed(0.4F, 0.7F)).trackRangeBlocks(10)
        .specificSpawnBlocks(Blocks.GRASS_BLOCK).build()
    );
    
    public static final EntityType<GrapplingHookEntity> GRAPPLING_HOOK = Registry.register(Registry.ENTITY_TYPE,
        new Identifier(ValleyMain.MOD_ID, "grappling_hook"),
        FabricEntityTypeBuilder.<GrapplingHookEntity>create(SpawnGroup.MISC, GrapplingHookEntity::new)
        .dimensions(EntityDimensions.fixed(0.25F, 0.25F))
        .trackRangeBlocks(4).trackedUpdateRate(10).build());
    
    public static final Identifier PacketID = new Identifier(ValleyMain.MOD_ID, "spawn_packet");

    @SuppressWarnings("deprecation")
    public static void initialize() {
        FabricDefaultAttributeRegistry.register(BEAR, BearEntity.createPolarBearAttributes());
        FabricDefaultAttributeRegistry.register(DUCK, DuckEntity.createChickenAttributes());

        var keys = BiomeSelectors.includeByKey(
            BiomeKeys.GIANT_SPRUCE_TAIGA,
            BiomeKeys.GIANT_SPRUCE_TAIGA_HILLS,
            BiomeKeys.GIANT_TREE_TAIGA,
            BiomeKeys.GIANT_TREE_TAIGA_HILLS
        );
        BiomeModifications.addSpawn(keys, SpawnGroup.CREATURE, BEAR, 2, 1, 2);
    }

    @Environment(EnvType.CLIENT)
    public static void initializeClient() {
        EntityRendererRegistry.register(BEAR, BearEntityRenderer::new);
        EntityRendererRegistry.register(DUCK, DuckEntityRenderer::new);
        EntityRendererRegistry.register(GRAPPLING_HOOK, FlyingItemEntityRenderer::new);
        receiveEntityPacket();
    }
    
    @SuppressWarnings("deprecation")
    @Environment(EnvType.CLIENT)
    public static void receiveEntityPacket() {
        //ClientPlayNetworking.registerReceiver(PacketID, (client, handler, byteBuf, responseSender) -> {
        ClientSidePacketRegistry.INSTANCE.register(PacketID, (ctx, byteBuf) -> {
            EntityType<?> et = Registry.ENTITY_TYPE.get(byteBuf.readVarInt());
            UUID uuid = byteBuf.readUuid();
            int entityId = byteBuf.readVarInt();
            var pos = EntitySpawnPacket.PacketBufUtil.readVec3d(byteBuf);
            float pitch = EntitySpawnPacket.PacketBufUtil.readAngle(byteBuf);
            float yaw = EntitySpawnPacket.PacketBufUtil.readAngle(byteBuf);
            var client = MinecraftClient.getInstance();
            client.execute(() -> {
                var world = client.world;
                if (world == null)
                    throw new IllegalStateException("Tried to spawn entity in a null world!");
                var entity = et.create(world);
                if (entity == null)
                    throw new IllegalStateException("Failed to create instance of entity \"" + Registry.ENTITY_TYPE.getId(et) + "\"!");
                entity.updateTrackedPosition(pos);
                entity.setPos(pos.x, pos.y, pos.z);
                entity.setPitch(pitch);
                entity.setYaw(yaw);
                entity.setId(entityId);
                entity.setUuid(uuid);
                world.addEntity(entityId, entity);
            });
        });
    }
}
