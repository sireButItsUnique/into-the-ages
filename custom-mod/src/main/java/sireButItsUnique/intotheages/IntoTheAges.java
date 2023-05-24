package sireButItsUnique.intotheages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import sireButItsUnique.intotheages.proxy.CommonProxy;
import sireButItsUnique.util.Ref;

@Mod(useMetadata = true, modid = "intotheages", name = "Into The Ages", version = "0.1")

public class IntoTheAges {
    public static final String modid = "intotheages";
    private static Logger logger = LogManager.getLogger("intotheages");

    @Instance
    public static IntoTheAges instance;

    @SidedProxy(clientSide = Ref.client, serverSide = Ref.common)
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        logger.info("heyy");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }
}

// takeaways:
/*
 * -world.isRemote (true = client, false = server)
 * -
 */