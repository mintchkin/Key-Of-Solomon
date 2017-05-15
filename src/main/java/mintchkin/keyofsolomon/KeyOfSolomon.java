package mintchkin.keyofsolomon;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = KeyOfSolomon.MODID, version = KeyOfSolomon.VERSION)
public class KeyOfSolomon
{
    public static final String MODID = "keyofsolomon";
    public static final String VERSION = "0.0.1";

    @SidedProxy(clientSide = "mintchkin.keyofsolomon.ClientProxy", serverSide = "mintchkin.keyofsolomon.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static KeyOfSolomon instance;

    public static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit();
    }
}
