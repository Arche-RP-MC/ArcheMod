package fr.archemod.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes
{
    
    public static ModRecipes instance = new ModRecipes();

    public void initRecipes()
    {

        GameRegistry.addSmelting(Blocks.SAND, new ItemStack(ModItems.VERRE_EN_FUSION,1),0);
        GameRegistry.addSmelting(ModItems.BOL_DE_GRUAU_CRU, new ItemStack(ModItems.BOL_DE_GRUAU,1),0);
        GameRegistry.addSmelting(ModItems.AUBERGINE_CRU, new ItemStack(ModItems.AUBERGINE,1),0);
        GameRegistry.addSmelting(ModItems.BEIGNET_CRU, new ItemStack(ModItems.BEIGNET,1),0);
        GameRegistry.addSmelting(ModItems.BEIGNET_DE_CRABE_CRU, new ItemStack(ModItems.BEIGNET_DE_CRABE,1),0);
        GameRegistry.addSmelting(ModItems.BISCUIT_CRU, new ItemStack(ModItems.BISCUIT,1),0);
        GameRegistry.addSmelting(ModItems.BISCUIT_AU_CHOCOLAT_CRU, new ItemStack(ModItems.BISCUIT_AU_CHOCOLAT,1),0);
        GameRegistry.addSmelting(ModItems.BOL_DE_POT_AU_FEU_CRU, new ItemStack(ModItems.BOL_DE_POT_AU_FEU,1),0);
        GameRegistry.addSmelting(ModItems.BOL_DE_POTAGE_CRU, new ItemStack(ModItems.BOL_DE_POTAGE,1),0);
        GameRegistry.addSmelting(ModItems.BOL_DE_RAGOUT_CRU, new ItemStack(ModItems.BOL_DE_RAGOUT,1),0);
        GameRegistry.addSmelting(ModItems.BOL_DE_RAGOUT_DE_CRUSTACES_CRU, new ItemStack(ModItems.BOL_DE_RAGOUT_DE_CRUSTACES,1),0);
        GameRegistry.addSmelting(ModItems.BOL_DE_RAGOUT_DE_PATATES_CRU, new ItemStack(ModItems.BOL_DE_RAGOUT_DE_PATATES,1),0);
        GameRegistry.addSmelting(ModItems.BOL_DE_RAGOUT_DE_VIANDE_CRU, new ItemStack(ModItems.BOL_DE_RAGOUT_DE_VIANDE,1),0);
        GameRegistry.addSmelting(ModItems.BOL_DE_RIZ_CRU, new ItemStack(ModItems.BOL_DE_RIZ,1),0);
        GameRegistry.addSmelting(ModItems.BOL_DE_SOUPE_AVEC_CROUTONS_CRU, new ItemStack(ModItems.BOL_DE_SOUPE_AVEC_CROUTONS,1),0);
        GameRegistry.addSmelting(ModItems.BOL_DE_SOUPE_DE_CHOUX_CRU, new ItemStack(ModItems.BOL_DE_SOUPE_DE_CHOUX,1),0);
        GameRegistry.addSmelting(ModItems.BOL_DE_SOUPE_DE_CITROUILLE_CRU, new ItemStack(ModItems.BOL_DE_SOUPE_DE_CITROUILLE,1),0);
        GameRegistry.addSmelting(ModItems.BOL_DE_SOUPE_DE_POIS_CRU, new ItemStack(ModItems.BOL_DE_SOUPE_DE_POIS,1),0);
        GameRegistry.addSmelting(ModItems.BOL_DE_SOUPE_DE_POISSON_CRU, new ItemStack(ModItems.BOL_DE_SOUPE_DE_POISSON,1),0);
        GameRegistry.addSmelting(ModItems.BOL_DE_SOUPE_DE_TOMATES_CRU, new ItemStack(ModItems.BOL_DE_SOUPE_DE_TOMATES,1),0);
        GameRegistry.addSmelting(ModItems.BOL_DE_SOUPE_VERTE_CRU, new ItemStack(ModItems.BOL_DE_SOUPE_VERTE,1),0);
        GameRegistry.addSmelting(ModItems.BOUDIN_CRU, new ItemStack(ModItems.BOUDIN,1),0);
        GameRegistry.addSmelting(ModItems.BRETZEL_CRU, new ItemStack(ModItems.BRETZEL,1),0);
        GameRegistry.addSmelting(ModItems.BRIOCHE_CRU, new ItemStack(ModItems.BRIOCHE,1),0);
        GameRegistry.addSmelting(ModItems.BROCHETTE_DE_VIANDE_CRU, new ItemStack(ModItems.BROCHETTE_DE_VIANDE,1),0);
        GameRegistry.addSmelting(ModItems.BROCOLI_CRU, new ItemStack(ModItems.BROCOLI,1),0);
        GameRegistry.addSmelting(ModItems.CELERI_BRANCHE_CRU, new ItemStack(ModItems.CELERI_BRANCHE,1),0);
        GameRegistry.addSmelting(ModItems.CEPES_CRU, new ItemStack(ModItems.CEPES,1),0);
        GameRegistry.addSmelting(ModItems.CHATAIGNE_CRU, new ItemStack(ModItems.CHATAIGNE,1),0);
        GameRegistry.addSmelting(ModItems.CHOU_FLEUR_CRU, new ItemStack(ModItems.CHOU_FLEUR,1),0);
        GameRegistry.addSmelting(ModItems.COURGE_CRU, new ItemStack(ModItems.COURGE,1),0);
        GameRegistry.addSmelting(ModItems.COURGETTE_CRU, new ItemStack(ModItems.COURGETTE,1),0);
        GameRegistry.addSmelting(ModItems.CREPE_CRU, new ItemStack(ModItems.CREPE,1),0);
        GameRegistry.addSmelting(ModItems.CROISSANT_CRU, new ItemStack(ModItems.CROISSANT,1),0);
        GameRegistry.addSmelting(ModItems.CUISSE_DE_GRENOUILLE_CRU, new ItemStack(ModItems.CUISSE_DE_GRENOUILLE_CUITE,1),0);
        GameRegistry.addSmelting(ModItems.ENDIVE_CRU, new ItemStack(ModItems.ENDIVE,1),0);
        GameRegistry.addSmelting(ModItems.EPINARD_CRU, new ItemStack(ModItems.EPINARD,1),0);
        GameRegistry.addSmelting(ModItems.FENOUIL_CRU, new ItemStack(ModItems.FENOUIL,1),0);
        GameRegistry.addSmelting(ModItems.GALETTE_DE_MAIS_CRU, new ItemStack(ModItems.GALETTE_DE_MAIS,1),0);
        GameRegistry.addSmelting(ModItems.GAUFFRE_CRU, new ItemStack(ModItems.GAUFFRE,1),0);
        GameRegistry.addSmelting(ModItems.GROS_RAVIOLI_CRU, new ItemStack(ModItems.GROS_RAVIOLI,1),0);
        GameRegistry.addSmelting(ModItems.HARICOT_BLANC_CRU, new ItemStack(ModItems.HARICOT_BLANC,1),0);
        GameRegistry.addSmelting(ModItems.HARICOT_ROUGE_CRU, new ItemStack(ModItems.HARICOT_ROUGE,1),0);
        GameRegistry.addSmelting(ModItems.HARICOT_VERT_CRU, new ItemStack(ModItems.HARICOT_VERT,1),0);
        GameRegistry.addSmelting(ModItems.MAIS_CRU, new ItemStack(ModItems.MAIS,1),0);
        GameRegistry.addSmelting(ModItems.NAVET_CRU, new ItemStack(ModItems.NAVET,1),0);
        GameRegistry.addSmelting(ModItems.OEUF_A_LA_COQUE_CRU, new ItemStack(ModItems.OEUF_A_LA_COQUE,1),0);
        GameRegistry.addSmelting(ModItems.OEUF_A_PLAT_CRU, new ItemStack(ModItems.OEUF_A_PLAT,1),0);
        GameRegistry.addSmelting(ModItems.OEUF_DUR_CRU, new ItemStack(ModItems.OEUF_DUR,1),0);
        GameRegistry.addSmelting(ModItems.PAIN_AU_CHOUX_CRU, new ItemStack(ModItems.PAIN_AU_CHOUX,1),0);
        GameRegistry.addSmelting(ModItems.PAIN_NOIR_CRU, new ItemStack(ModItems.PAIN_NOIR,1),0);
        GameRegistry.addSmelting(ModItems.PATISSERIE_CRU, new ItemStack(ModItems.PATISSERIE,1),0);
        GameRegistry.addSmelting(ModItems.PATISSERIE_A_LA_PATE_D_AMANDE_CRU, new ItemStack(ModItems.PATISSERIE_A_LA_PATE_D_AMANDE,1),0);
        GameRegistry.addSmelting(ModItems.PATISSERIES_COLOREES_CRU, new ItemStack(ModItems.PATISSERIES_COLOREES,1),0);
        GameRegistry.addSmelting(ModItems.PETITS_POIS_CRU, new ItemStack(ModItems.PETITS_POIS,1),0);
        GameRegistry.addSmelting(ModItems.POIREAU_CRU, new ItemStack(ModItems.POIREAU,1),0);
        GameRegistry.addSmelting(ModItems.POIVRON_JAUNE_FARCI_CRU, new ItemStack(ModItems.POIVRON_JAUNE_FARCI,1),0);
        GameRegistry.addSmelting(ModItems.POIVRON_JAUNE_M_CRU, new ItemStack(ModItems.POIVRON_JAUNE_M,1),0);
        GameRegistry.addSmelting(ModItems.POIVRON_ROUGE_FARCI_CRU, new ItemStack(ModItems.POIVRON_ROUGE_FARCI,1),0);
        GameRegistry.addSmelting(ModItems.POIVRON_ROUGE_M_CRU, new ItemStack(ModItems.POIVRON_ROUGE_M,1),0);
        GameRegistry.addSmelting(ModItems.POIVRON_VERT_FARCI_CRU, new ItemStack(ModItems.POIVRON_VERT_FARCI,1),0);
        GameRegistry.addSmelting(ModItems.POIVRON_VERT_M_CRU, new ItemStack(ModItems.POIVRON_VERT_M,1),0);
        GameRegistry.addSmelting(ModItems.POMME_DE_TERRE_CRU, new ItemStack(ModItems.POMME_DE_TERRE,1),0);
        GameRegistry.addSmelting(ModItems.POMME_DE_TERRE_FARCIE_CRU, new ItemStack(ModItems.POMME_DE_TERRE_FARCIE,1),0);
        GameRegistry.addSmelting(Items.CHICKEN, new ItemStack(ModItems.POULET_ROTI,1),0);
        GameRegistry.addSmelting(ModItems.RIZ_CRU, new ItemStack(ModItems.RIZ,1),0);
        GameRegistry.addSmelting(ModItems.SALSIFI_CRU, new ItemStack(ModItems.SALSIFI,1),0);
        GameRegistry.addSmelting(ModItems.SAUCISSE_CRU, new ItemStack(ModItems.SAUCISSE,1),0);
        GameRegistry.addSmelting(ModItems.ASPERGE_CRU, new ItemStack(ModItems.ASPERGE,1),0);
        GameRegistry.addSmelting(ModItems.MORCEAU_DE_POULPE_CRU, new ItemStack(ModItems.MORCEAU_DE_POULPE,1),0);
        GameRegistry.addSmelting(ModItems.BOL_EN_ARGILE_CRUE, new ItemStack(ModItems.BOL_EN_ARGILE,1),0);
        GameRegistry.addSmelting(ModItems.CHOPPE_EN_ARGILE_CRUE, new ItemStack(ModItems.CHOPPE_EN_ARGILE,1),0);
        GameRegistry.addSmelting(ModItems.PEPITE_FER, new ItemStack(ModItems.FER_FONDU,1),0);
        GameRegistry.addSmelting(ModItems.PEPITE_ARGENT, new ItemStack(ModItems.ARGENT_FONDU,1),0);
        GameRegistry.addSmelting(ModItems.PEPITE_PLOMB, new ItemStack(ModItems.PLOMB_FONDU,1),0);
        GameRegistry.addSmelting(ModItems.PEPITE_BRONZE, new ItemStack(ModItems.BRONZE_FONDU,1),0);
        GameRegistry.addSmelting(ModItems.PEPITE_OR, new ItemStack(ModItems.OR_FONDU,1),0);
        GameRegistry.addSmelting(ModItems.PEPITE_ACIER, new ItemStack(ModItems.ACIER_FONDU,1),0);
        GameRegistry.addSmelting(ModItems.PEPITE_ETAIN, new ItemStack(ModItems.ETAIN_FONDU,1),0);
        GameRegistry.addSmelting(ModItems.PEPITE_CUIVRE, new ItemStack(ModItems.CUIVRE_FONDU,1),0);
        GameRegistry.addSmelting(ModItems.POT_DE_FLEUR_CRU, new ItemStack(Blocks.FLOWER_POT,1),0);
        GameRegistry.addSmelting(ModItems.TUILE_SIMPLE_CRU, new ItemStack(ModItems.TUILE_SIMPLE,1),0);
        GameRegistry.addSmelting(ModItems.ARTICHAUT_CRU, new ItemStack(ModItems.ARTICHAUT,1),0);
        GameRegistry.addSmelting(ModItems.POULET_CRU, new ItemStack(ModItems.POULET_ROTI,1),0);
        GameRegistry.addSmelting(ModItems.TOMATE_CRU, new ItemStack(ModItems.TOMATE,1),0);
        GameRegistry.addSmelting(ModItems.PETITE_VIANDE_CRUE, new ItemStack(ModItems.PETITE_VIANDE_CUITE,1),0);
        GameRegistry.addSmelting(ModItems.PETITE_VIANDE_DE_GIBIER_CRUE, new ItemStack(ModItems.PETITE_VIANDE_DE_GIBIER_CUITE,1),0);
        GameRegistry.addSmelting(ModItems.VIANDE_CRUE, new ItemStack(ModItems.VIANDE_CUITE,1),0);
        GameRegistry.addSmelting(ModItems.VIANDE_DE_GIBIER_CRUE, new ItemStack(ModItems.VIANDE_DE_GIBIER_CUITE,1),0);
        GameRegistry.addSmelting(ModItems.VIANDE_DE_RAT, new ItemStack(ModItems.VIANDE_DE_RAT_CUITE,1),0);
        GameRegistry.addSmelting(ModItems.VIANDE_DE_VOLAILLE_CRUE, new ItemStack(ModItems.VIANDE_DE_VOLAILLE_CUITE,1),0);
        GameRegistry.addSmelting(ModItems.GROSSE_VIANDE_CRUE, new ItemStack(ModItems.GROSSE_VIANDE_CUITE,1),0);
        GameRegistry.addSmelting(ModItems.CROISSANT_CRU, new ItemStack(ModItems.CROISSANT,1),0);
        GameRegistry.addSmelting(ModItems.GAUFFRE_CRU, new ItemStack(ModItems.GAUFFRE,1),0);
        GameRegistry.addSmelting(ModItems.CHOU_VERT_CRU, new ItemStack(ModItems.CHOU_VERT,1),0);
        GameRegistry.addSmelting(ModItems.GRAND_POT_EN_ARGILE_CRUE, new ItemStack(ModItems.GRAND_POT_EN_ARGILE,1),0);
        GameRegistry.addSmelting(ModItems.JARRE_EN_ARGILE_CRUE, new ItemStack(ModItems.JARRE_EN_ARGILE,1),0);
        GameRegistry.addSmelting(ModItems.THEIERE_CRUE, new ItemStack(ModItems.THEIERE,1),0);

    }
}
