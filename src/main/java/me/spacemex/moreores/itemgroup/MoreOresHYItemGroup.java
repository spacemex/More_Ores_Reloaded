
package me.spacemex.moreores.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import me.spacemex.moreores.block.OreAluminumBlock;
import me.spacemex.moreores.MoreoresModElements;

@MoreoresModElements.ModElement.Tag
public class MoreOresHYItemGroup extends MoreoresModElements.ModElement {
	public MoreOresHYItemGroup(MoreoresModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmore_ores_hy") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(OreAluminumBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
