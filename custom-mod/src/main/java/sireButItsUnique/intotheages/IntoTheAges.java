package sireButItsUnique.intotheages;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraft.init.Blocks;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(useMetadata = true, modid = "into-the-ages", name = "Into The Ages", version = "0.1")

public class IntoTheAges {
    public static final String modid = "into-the-ages";
    private static Logger logger = LogManager.getLogger("into-the-ages");

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        logger.info("heyy");
    }

    @EventHandler
    public void postInit(FMLInitializationEvent event) {
    }
}

// takeaways:
/*
 * -world.isRemote (true = client, false = server)
 * -
 */