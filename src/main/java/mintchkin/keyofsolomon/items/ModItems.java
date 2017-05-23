package mintchkin.keyofsolomon.items;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by dobner on 5/14/2017.
 */
public class ModItems {
    public static TestItem testItem;

    public static void init() {
        testItem = new TestItem();
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        testItem.initModel();
    }
}
