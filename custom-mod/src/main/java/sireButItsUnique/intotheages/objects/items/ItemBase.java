package sireButItsUnique.intotheages.objects.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import sireButItsUnique.intotheages.IntoTheAges;
import sireButItsUnique.intotheages.init.*;

public class ItemBase extends Item {

    public ItemBase(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MISC);

        ModItems.items.add(this);
    }

    public void registerModels() {
        IntoTheAges.proxy.registerItemModel(this, 0, "inventory");
    }
}
