package mintchkin.keyofsolomon.items;

import mintchkin.keyofsolomon.KeyOfSolomon;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by dobner on 5/14/2017.
 */
public class TestItem extends Item{
    public TestItem() {
        setRegistryName("testitem");
        setUnlocalizedName(KeyOfSolomon.MODID + ".testitem");
        GameRegistry.register(this);
        setCreativeTab(CreativeTabs.TOOLS);
    }
}
