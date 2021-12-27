package io.github.linkle.valleycraft.init;

import io.github.linkle.valleycraft.items.armorMaterials.VArmorMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class VArmorMaterials {

	public static final VArmorMaterial FUR = createArmorMaterial("fur", 10, new int[] {2, 5, 6, 2}, 20, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, MiscItems.FUR_CLUMP);
	public static final VArmorMaterial ROSE_GOLD = createArmorMaterial("rose_gold", 15, new int[] {1, 3, 5, 2}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, Items.COPPER_INGOT);

	//This is here to be able to initialize these before their actually used
	public static void initialize() {}

	private static VArmorMaterial createArmorMaterial(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantability, SoundEvent equipSound, Item repairItem) {
		return new VArmorMaterial() {
			@Override
			public int getDurability(EquipmentSlot slot) {
				return getDurability(slot, durabilityMultiplier);
			}

			@Override
			public int getProtectionAmount(EquipmentSlot slot) {
				return protectionAmounts[slot.getEntitySlotId()];
			}

			@Override
			public int getEnchantability() {
				return enchantability;
			}

			@Override
			public SoundEvent getEquipSound() {
				return equipSound;
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.ofItems(repairItem);
			}

			@Override
			public String getName() {
				return name;
			}
		};
	}
}
