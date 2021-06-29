
package me.spacemex.moreores.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import me.spacemex.moreores.itemgroup.MoreOresHYItemGroup;
import me.spacemex.moreores.MoreoresModElements;

@MoreoresModElements.ModElement.Tag
public class TinIngotItem extends MoreoresModElements.ModElement {
	@ObjectHolder("moreores:tin_ingot")
	public static final Item block = null;
	public TinIngotItem(MoreoresModElements instance) {
		super(instance, 34);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(MoreOresHYItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("tin_ingot");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
