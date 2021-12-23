package io.github.linkle.valleycraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.SweetBerryBushBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class AppleLeavesBlock extends LeavesBlock {
	public static final BooleanProperty HAS_APPLES = BooleanProperty.of("has_apples");

	public AppleLeavesBlock(Settings settings) {
		super(settings);
		this.setDefaultState(this.getDefaultState().with(HAS_APPLES, false));
	}

	@Override
	protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
		super.appendProperties(builder);
		builder.add(HAS_APPLES);
	}

	@Override
	public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
		if (state.get(HAS_APPLES)) {
			SweetBerryBushBlock.dropStack(world, pos, new ItemStack(Items.APPLE, 1 + world.random.nextInt(4)));
			world.playSound(null, pos, SoundEvents.BLOCK_SWEET_BERRY_BUSH_PICK_BERRIES, SoundCategory.BLOCKS, 1.0f, 0.8f + world.random.nextFloat() * 0.4f);
			world.setBlockState(pos, state.with(HAS_APPLES, false), Block.NOTIFY_LISTENERS);
			return ActionResult.success(world.isClient);
		}
		return ActionResult.FAIL;
	}

}