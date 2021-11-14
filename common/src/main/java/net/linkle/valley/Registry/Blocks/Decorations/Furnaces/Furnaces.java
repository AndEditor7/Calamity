package net.linkle.valley.Registry.Blocks.Decorations.Furnaces;

import static net.linkle.valley.Registry.Initializers.ItemGroups.FURNITURE_GROUP;
import static net.linkle.valley.ValleyMain.MOD_ID;

import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Furnaces {
	public static final Block BRICK_FURNACE = new BrickFurnace(
	        Block.Settings.of(Material.STONE)
			.sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
			.strength(1.5f, 2f).luminance(s->7));
	
	public static void ints() {
		var identity = new Identifier(MOD_ID, "brick_furnace");
	    Registry.register(Registry.BLOCK, identity, BRICK_FURNACE);
	    Registry.register(Registry.ITEM, identity, new BlockItem(BRICK_FURNACE, new BlockItem.Settings().group(FURNITURE_GROUP)));
	    //BrickFurnace.BLOCK_ENTITY = createFurnaceEntity(identity, BRICK_FURNACE);
	}
	
	/*
	private static BlockEntityType<BrickFurnaceBlockEntity> createFurnaceEntity(Identifier id, Block block) {
		var type = Util.getChoiceType(TypeReferences.BLOCK_ENTITY, id.toString());
		var entity = FabricBlockEntityTypeBuilder.create(BrickFurnaceBlockEntity::new, block).build(type);
		return Registry.register(Registry.BLOCK_ENTITY_TYPE, id, entity);
	} */
}
