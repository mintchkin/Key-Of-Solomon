package mintchkin.keyofsolomon.blocks;

import mintchkin.keyofsolomon.KeyOfSolomon;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by dobner on 5/14/2017.
 */
public class TestBlock extends Block{
    public TestBlock() {
        super(Material.ROCK);
        setUnlocalizedName(KeyOfSolomon.MODID + ".testblock");
        setRegistryName("testblock");
        GameRegistry.register(this);
        GameRegistry.register(new ItemBlock(this), getRegistryName());
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    }
}
