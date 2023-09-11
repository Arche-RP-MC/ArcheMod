package fr.archemod.blocks;

import fr.archemod.blocks.tileentity.TileEntityBlockPorteManteau;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class BlockContainerPorteManteau extends BlockContainer{

    public BlockContainerPorteManteau(String name, Material material, float hardness, float resistance, SoundType soundType, String id, int size, int slotInRow, int invStackLimit, AxisAlignedBB boundingBox, int modGuiId, boolean visibleInventory) {
        super(name, material, hardness, resistance, soundType, id, size, slotInRow, invStackLimit, boundingBox, modGuiId, visibleInventory);
    }

    @Nullable
    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileEntityBlockPorteManteau();
    }
}