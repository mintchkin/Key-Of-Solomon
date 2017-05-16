package mintchkin.keyofsolomon.items;

import mintchkin.keyofsolomon.KeyOfSolomon;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

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

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
