package net.linkle.valley.Registry.Entity;

import net.linkle.valley.Registry.Initializers.Entities;
import net.linkle.valley.Registry.Initializers.Furniture;
import net.linkle.valley.Registry.Initializers.MiscItems;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.network.Packet;
import net.minecraft.state.property.Properties;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import static net.minecraft.util.math.MathHelper.fractionalPart;

public class GrapplingHookEntity extends ThrownItemEntity {

    public GrapplingHookEntity(EntityType<? extends ThrownItemEntity> entityType, World world) {
        super(entityType, world);
    }

    public GrapplingHookEntity(World world, LivingEntity owner) {
        super(Entities.GRAPPLING_HOOK, owner, world);
    }

    public GrapplingHookEntity(World world, double x, double y, double z) {
        super(Entities.GRAPPLING_HOOK, x, y, z, world);
    }

    @Override
    protected void onCollision(HitResult hitResult) {
        super.onCollision(hitResult);
        if (!world.isClient) {
            world.sendEntityStatus(this, (byte) 3);
            kill();
        }
    }

    @Override
    protected void onEntityHit(EntityHitResult result) {
        super.onEntityHit(result);
        if (getOwner() == null) return;
        drawBlockLine(getOwner().getBlockPos().up(), result.getEntity().getBlockPos());
    }

    @Override
    protected void onBlockHit(BlockHitResult result) {
        super.onBlockHit(result);
        if (getOwner() == null) return;
        drawBlockLine(getOwner().getBlockPos().up(), result.getBlockPos().offset(result.getSide()));
    }

    private void drawBlockLine(BlockPos from, BlockPos to) {
        int xMin = Math.min(from.getX(), to.getX());
        int yMin = Math.min(from.getY(), to.getY());
        int zMin = Math.min(from.getZ(), to.getZ());
        int xMax = Math.max(from.getX(), to.getX());
        int yMax = Math.max(from.getY(), to.getY());
        int zMax = Math.max(from.getZ(), to.getZ());
        if (!world.isRegionLoaded(xMin, yMin, zMin, xMax, yMax, zMax)) return;
        drawBlockLine(new Vec3d(from.getX() + 0.5, from.getY() + 0.5, from.getZ() + 0.5), new Vec3d(to.getX() + 0.5, to.getY() + 0.5, to.getZ() + 0.5));
    }

    private void drawBlockLine(Vec3d from, Vec3d to) {
        var dir = to.subtract(from).normalize();

        double dx, dy, dz;
        dx = dir.x;
        dy = dir.y;
        dz = dir.z;

        if (Double.isNaN(dx) || Double.isNaN(dy) || Double.isNaN(dz)) {
            return;
        }

        int x, y, z;
        x = MathHelper.floor(from.x);
        y = MathHelper.floor(from.y);
        z = MathHelper.floor(from.z);

        final int xStep, yStep, zStep;
        xStep = MathHelper.sign(dx);
        yStep = MathHelper.sign(dy);
        zStep = MathHelper.sign(dz);

        double tDeltaX = xStep == 0 ? Double.MAX_VALUE : (double) xStep / dx;
        double tDeltaY = yStep == 0 ? Double.MAX_VALUE : (double) yStep / dy;
        double tDeltaZ = zStep == 0 ? Double.MAX_VALUE : (double) zStep / dz;

        var fracts = 
        new Vec3d(fractionalPart(from.x), fractionalPart(from.y), fractionalPart(from.z));
        double tMaxX = tDeltaX * (xStep > 0 ? 1.0 - fracts.x : fracts.x);
        double tMaxY = tDeltaY * (yStep > 0 ? 1.0 - fracts.y : fracts.y);
        double tMaxZ = tDeltaZ * (zStep > 0 ? 1.0 - fracts.z : fracts.z);

        double radius = from.distanceTo(to) / Math.sqrt(dx * dx + dy * dy + dz * dz);

        var axis = Direction.Axis.Y;
        double absX = Math.abs(dx);
        double absY = Math.abs(dy);
        double absZ = Math.abs(dz);
        
        if (absX > absY) {
            if (absX > absZ) {
                axis = Direction.Axis.X;
            } else {
                axis = Direction.Axis.Z;
            }
        } else {
            if (absY > absZ) {
                axis = Direction.Axis.Y;
            } else {
                axis = Direction.Axis.Z;
            }
        }
        
        var mutable = new BlockPos.Mutable();
        var state = Furniture.CLIMBABLE_ROPE.getDefaultState();
        while (true) {
            if (world.isAir(mutable.set(x, y, z))) {
                world.setBlockState(mutable, state.with(Properties.AXIS, axis));
            } else {
                break;
            }
            
            // Traversal stepping.
            if (tMaxX < tMaxY) {
                if (tMaxX < tMaxZ) {
                    if (tMaxX > radius) break;
                    axis = Direction.Axis.X;
                    x += xStep;
                    tMaxX += tDeltaX;
                } else {
                    if (tMaxZ > radius) break;
                    axis = Direction.Axis.Z;
                    z += zStep;
                    tMaxZ += tDeltaZ;
                }
            } else {
                if (tMaxY < tMaxZ) {
                    if (tMaxY > radius) break;
                    axis = Direction.Axis.Y;
                    y += yStep;
                    tMaxY += tDeltaY;
                } else {
                    if (tMaxZ > radius) break;
                    axis = Direction.Axis.Z;
                    z += zStep;
                    tMaxZ += tDeltaZ;
                }
            }
        }
    }

    @Override
    public Packet<?> createSpawnPacket() {
        return EntitySpawnPacket.create(this, Entities.PacketID);
    }
    
    @Override
    protected Item getDefaultItem() {
        return MiscItems.GRAPPLING_HOOK;
    }
}
