package sireButItsUnique.intotheages.init;

import java.util.ArrayList;
import sireButItsUnique.intotheages.IntoTheAges;
import sireButItsUnique.intotheages.objects.items.*;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

@ObjectHolder(IntoTheAges.modid)
public class ModItems {
    public static ArrayList<ItemBase> items = new ArrayList<ItemBase>();
    public static final Item nuts = new ItemBase("nuts");
}
