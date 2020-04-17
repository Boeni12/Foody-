
package net.mcreator.foody.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.foody.block.FruitPressBlock;
import net.mcreator.foody.FoodyElements;

@FoodyElements.ModElement.Tag
public class FoodyTabMachinesBlocksItemGroup extends FoodyElements.ModElement {
	public FoodyTabMachinesBlocksItemGroup(FoodyElements instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabfoodytabmachinesblocks") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(FruitPressBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
