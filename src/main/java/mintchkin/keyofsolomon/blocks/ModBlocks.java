package mintchkin.keyofsolomon.blocks;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by dobner on 5/14/2017.
 */
public class ModBlocks {
    public static TestBlock testBlock;
    public static Etching etching;

    public static void init() {
        testBlock = new TestBlock();
        etching = new Etching();
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        testBlock.initModel();
    }
}
