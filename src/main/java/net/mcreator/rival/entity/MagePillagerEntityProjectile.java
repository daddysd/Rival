
package net.mcreator.rival.entity;

import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;

import net.mcreator.rival.init.RivalModEntities;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class MagePillagerEntityProjectile extends AbstractArrow implements ItemSupplier {
	public MagePillagerEntityProjectile(PlayMessages.SpawnEntity packet, Level world) {
		super(RivalModEntities.MAGE_PILLAGER_PROJECTILE.get(), world);
	}

	public MagePillagerEntityProjectile(EntityType<? extends MagePillagerEntityProjectile> type, Level world) {
		super(type, world);
	}

	public MagePillagerEntityProjectile(EntityType<? extends MagePillagerEntityProjectile> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public MagePillagerEntityProjectile(EntityType<? extends MagePillagerEntityProjectile> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void doPostHurtEffects(LivingEntity livingEntity) {
		super.doPostHurtEffects(livingEntity);
		livingEntity.setArrowCount(livingEntity.getArrowCount() - 1);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(Blocks.PACKED_ICE);
	}

	@Override
	protected ItemStack getPickupItem() {
		return new ItemStack(Blocks.PACKED_ICE);
	}
}
