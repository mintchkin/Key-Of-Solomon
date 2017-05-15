package mintchkin.keyofsolomon;

import mintchkin.keyofsolomon.blocks.ModBlocks;

/**
 * Created by dobner on 5/14/2017.
 */
public class ClientProxy extends CommonProxy {
    @Override
    public void preInit() {
        super.preInit();
        ModBlocks.initModels();
    }
}
