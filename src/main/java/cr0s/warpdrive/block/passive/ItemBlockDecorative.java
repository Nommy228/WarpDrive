package cr0s.warpdrive.block.passive;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockDecorative extends ItemBlock {
	
	public ItemBlockDecorative(Block block) {
		super(block);
		setHasSubtypes(true);
		setUnlocalizedName("warpdrive.passive.decorative");
	}
	
	@Override
	public int getMetadata(int damage) {
		return damage;
	}
	
	@Override
	public void getSubItems(Item par1, CreativeTabs par2CreativeTabs, List par3List) {
		for (int i = 0; i < BlockDecorative.decorativeTypes.values().length; i++) {
			par3List.add(new ItemStack(par1, 1, i));
		}
	}
	
	@Override
	public String getUnlocalizedName(ItemStack itemstack) {
		if (itemstack == null)
			return getUnlocalizedName();
		return "tile.warpdrive.passive." + BlockDecorative.decorativeTypes.values()[itemstack.getItemDamage()].toString();
	}

}
