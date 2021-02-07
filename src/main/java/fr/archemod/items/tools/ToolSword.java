package fr.archemod.items.tools;

import fr.archemod.ArcheMod;
import fr.archemod.init.ModItems;
import fr.archemod.util.IHasModel;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword implements IHasModel {

public ToolSword(String name, ToolMaterial material){
        super(material);
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(ArcheMod.archeCreativeTabs);
        ModItems.ITEMS.add(this);
        }




        @Override
public void registerModels() {
        ArcheMod.proxy.registerItemRenderer(this,0,"inventory");
        }
        }
