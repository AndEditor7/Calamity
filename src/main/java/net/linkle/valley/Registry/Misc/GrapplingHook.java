package net.linkle.valley.Registry.Misc;

import net.linkle.valley.Registry.Entity.GrapplingHookEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class GrapplingHook extends Item {

    public GrapplingHook(Settings settings) {
        super(settings);
    }
    
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        var itemStack = user.getStackInHand(hand);
        world.playSound(null, user.getX(), user.getY(), user.getZ(), SoundEvents.ENTITY_SNOWBALL_THROW, SoundCategory.NEUTRAL, 0.5F, 1F);
        /*
        user.getItemCooldownManager().set(this, 5);
        Optionally, you can add a cooldown to your item's right-click use, similar to Ender Pearls.
        */
        if (!world.isClient) {
            var entity = new GrapplingHookEntity(world, user);
            entity.setItem(itemStack);
            entity.setProperties(user, user.getPitch(), user.getYaw(), 0.0F, 1.5F, 0F);
            world.spawnEntity(entity);
        }
 
        user.incrementStat(Stats.USED.getOrCreateStat(this));
        return TypedActionResult.success(itemStack, world.isClient());
    }
}
