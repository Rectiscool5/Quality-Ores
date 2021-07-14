
package net.mcreator.qualityores.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.qualityores.item.EnderStrideSwordItem;
import net.mcreator.qualityores.QualityOresModElements;

@QualityOresModElements.ModElement.Tag
public class QOItemGroup extends QualityOresModElements.ModElement {
	public QOItemGroup(QualityOresModElements instance) {
		super(instance, 91);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabqo") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(EnderStrideSwordItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
