package sireButItsUnique.intotheages;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber(modid = IntoTheAges.modid)
public class RegistrationHandler {

    @SubscribeEvent
    public static void registerItems(Register<Item> event) {
        final Item[] items = {
                new Item().setRegistryName(IntoTheAges.modid, "nuts").setCreativeTab(CreativeTabs.COMBAT)
        };

        event.getRegistry().registerAll(items);
    }
}