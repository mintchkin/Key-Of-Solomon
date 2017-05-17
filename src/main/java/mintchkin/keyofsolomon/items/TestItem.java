package mintchkin.keyofsolomon.items;

import mintchkin.keyofsolomon.KeyOfSolomon;
import mintchkin.keyofsolomon.blocks.ModBlocks;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by dobner on 5/14/2017.
 */
public class TestItem extends Item {
    public TestItem() {
        setRegistryName("testitem");
        setUnlocalizedName(KeyOfSolomon.MODID + ".testitem");
        GameRegistry.register(this);
        setCreativeTab(CreativeTabs.TOOLS);
    }

    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        ItemStack stack = player.getHeldItem(hand);
        if (!player.canPlayerEdit(pos, facing, stack) || facing != EnumFacing.UP) {
            return EnumActionResult.FAIL;
        } else {
            pos = pos.offset(facing);
            if (worldIn.isAirBlock(pos)) {
                worldIn.setBlockState(pos, ModBlocks.etching.getDefaultState());
            }
            return EnumActionResult.SUCCESS;
        }
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
