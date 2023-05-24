package sireButItsUnique.util.handlers;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import sireButItsUnique.intotheages.IntoTheAges;
import sireButItsUnique.intotheages.init.ModItems;
import sireButItsUnique.intotheages.objects.items.ItemBase;

@EventBusSubscriber(modid = IntoTheAges.modid)
public class RegistrationHandler {

    @SubscribeEvent
    public static void registerItems(Register<Item> event) {
        event.getRegistry().registerAll(ModItems.items.toArray(new Item[0]));
    }

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        for (ItemBase item : ModItems.items) {
            item.registerModels();
        }
    }
}