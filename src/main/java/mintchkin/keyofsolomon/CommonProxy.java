package mintchkin.keyofsolomon;

import mintchkin.keyofsolomon.blocks.ModBlocks;
import mintchkin.keyofsolomon.items.ModItems;

/**
 * Created by dobner on 5/14/2017.
 */
public class CommonProxy {
    public void preInit() {
        ModBlocks.init();
        ModItems.init();
    }

    public void init() {

    }

    public void postInit() {

    }
}
