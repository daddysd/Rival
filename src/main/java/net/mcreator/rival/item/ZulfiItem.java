
package net.mcreator.rival.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ZulfiItem extends Item {
	public ZulfiItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
