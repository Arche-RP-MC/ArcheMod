package fr.archemod.items.agriculture;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSeeds;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.common.EnumPlantType;

public class ItemGraine extends ItemSeeds {
    private EnumPlantType sol = EnumPlantType.Plains;

    public ItemGraine(String name, Block crops, Block soil) {
        super(crops, soil);
        setTranslationKey(name);
        setRegistryName(name);
        //A REGISTER DANS MODBLOCK CAR DOIT ETRE REGISTER APRES LE CROP
    }

    public ItemGraine(String name, Block crops, Block soil, EnumPlantType sol) {
        super(crops, soil);
        this.sol = sol;
        setTranslationKey(name);
        setRegistryName(name);
        //A REGISTER DANS MODBLOCK CAR DOIT ETRE REGISTER APRES LE CROP
    }

    @Override
    public net.minecraftforge.common.EnumPlantType getPlantType(net.minecraft.world.IBlockAccess world, BlockPos pos)
    {
        return sol;
    }
}
