package fr.archemod.init;

import fr.archemod.ArcheMod;
import fr.archemod.blocks.*;
import fr.archemod.blocks.agriculture.BlockPlanLin;
import fr.archemod.blocks.signhrp.BlockWallSignHrp;
import fr.archemod.blocks.signhrp.SignStandingSign;
import fr.archemod.items.agriculture.ItemGraine;
import fr.archemod.blocks.signhrp.SigneHrp;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSign;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import java.util.ArrayList;
import java.util.List;


public class ModBlocks {

    public static final List<Block> BLOCKS = new ArrayList<>();

    //BLOCKS

    public static final Block FISH_CASE = new BlockFishCase("casier_a_poisson", Material.WOOD, 0.5F, 0.5F, SoundType.WOOD);

    public static final Block BLOC_DE_PIERRE_PRECIEUSE = new PierrePrecieuseOre("bloc_de_pierre_precieuse",Material.IRON);
    public static final Block PLACARD_HRP = new PlacardHRP("placard_hrp", Material.WOOD, 0.5F, 0.5F, SoundType.WOOD);

    public static final Block standing_sign_hrp = new SignStandingSign();
    public static final Block wall_sign_hrp = new BlockWallSignHrp();


    public static final Block SHOWCASE = new Showcase("showcase",Material.WOOD);
    public static final Block SHOWCASE_CENTER = new Showcase("showcase_center",Material.WOOD);
    public static final Block SHOWCASE_LEFT = new Showcase("showcase_left",Material.WOOD);
    public static final Block SHOWCASE_RIGHT = new Showcase("showcase_right",Material.WOOD);

    public static final Block TABLE = new Table("table",Material.WOOD);
    public static final Block TABLE_MIDDLE = new Table("table_middle",Material.WOOD);
    public static final Block TABLE_END_1 = new Table("table_end_1",Material.WOOD);
    public static final Block TABLE_END_2 = new Table("table_end_2",Material.WOOD);

    public static final Block ANDESITE_PAVE_MOUSSU = new BlockBase("andesite_pave_moussu", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block ANDESITE_POLIE = new BlockBase("andesite_polie", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block ANDESITE_SCULPTEE = new BlockBase("andesite_sculptee", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block ARDOISE_BRUTE = new BlockBase("ardoise_brute", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block ARDOISE_BRUTE_BLEUE = new BlockBase("ardoise_brute_bleue", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block ARDOISE_PEINTE = new BlockBase("ardoise_peinte", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block BLOC_D_ACIER = new BlockBase("bloc_d_acier", Material.IRON, 5F, 5F, SoundType.METAL);
    public static final Block BLOC_D_ARGENT = new BlockBase("bloc_d_argent",  Material.IRON, 5F, 5F, SoundType.METAL);
    public static final Block BLOC_DE_BRONZE = new BlockBase("bloc_de_bronze",  Material.IRON, 5F, 5F, SoundType.METAL);
    public static final Block BLOC_DE_CENDRES = new BlockBase("bloc_de_cendres", Material.SAND, 5F, 5F, SoundType.SAND);
    public static final Block BLOC_DE_CHAUME = new BlockBase("bloc_de_chaume", Material.GRASS, 5F, 5F, SoundType.GROUND);
    public static final Block BLOC_DE_CUIVRE = new BlockBase("bloc_de_cuivre",  Material.IRON, 5F, 5F, SoundType.METAL);
    public static final Block BLOC_DE_PAILLE = new BlockBase("bloc_de_paille", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block BLOC_DE_PLOMB = new BlockBase("bloc_de_plomb",  Material.IRON, 5F, 5F, SoundType.METAL);
    public static final Block BLOC_ETAIN = new BlockBase("bloc_etain",  Material.IRON, 5F, 5F, SoundType.METAL);
    public static final Block BRIQUE_ANDESITE = new BlockBase("brique_andesite", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block BRIQUE_ANDESITE_CRAQUELEE = new BlockBase("brique_andesite_craquelee", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block BRIQUE_ANDESITE_MOUSSUE = new BlockBase("brique_andesite_moussue", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block BRIQUE_CRAQUELEE = new BlockBase("brique_craquelee", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block BRIQUE_DIORITE = new BlockBase("brique_diorite", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block BRIQUE_DIORITE_CRAQUELEE = new BlockBase("brique_diorite_craquelee", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block BRIQUE_DIORITE_MOUSSUE = new BlockBase("brique_diorite_moussue", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block BRIQUE_GRANITE_CRAQUELEE = new BlockBase("brique_granite_craquelee", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block BRIQUE_GRANITE_MOUSSUE = new BlockBase("brique_granite_moussue", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block BRIQUE_GRANITE = new BlockBase("brique_granite", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block CARRELAGE_DAMIER_GRES = new BlockBase("carrelage_damier_gres", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block CARRELAGE_DAMIER_GRIS = new BlockBase("carrelage_damier_gris", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block CARRELAGE_DAMIER_POLI_GRES = new BlockBase("carrelage_damier_poli_gres", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block CARRELAGE_DAMIER_POLI_GRIS = new BlockBase("carrelage_damier_poli_gris", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block CARRELAGE_DAMIER_POLI_ROSE = new BlockBase("carrelage_damier_poli_rose", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block CARRELAGE_DAMIER_ROSE = new BlockBase("carrelage_damier_rose", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block COLOMBAGE = new BlockBase("colombage", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block DALLAGE_PRECIS = new BlockBase("dallage_precis", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block DALLAGE_PRECIS_BRIQUE = new BlockBase("dallage_precis_brique", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block DIORITE_PAVE_MOUSSU = new BlockBase("diorite_pave_moussu", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block DIORITE_POLIE = new BlockBase("diorite_polie", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block DIORITE_SCULPTEE = new BlockBase("diorite_sculptee", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block ECAILLE_EN_ARDOISE = new BlockBase("ecaille_en_ardoise", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block ECAILLE_EN_ARDOISE_CYAN = new BlockBase("ecaille_en_ardoise_cyan", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block ECAILLE_EN_ARDOISE_VERTE = new BlockBase("ecaille_en_ardoise_verte", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block ECAILLE_EN_ARDOISE_VERTE_CLAIRE = new BlockBase("ecaille_en_ardoise_verte_claire", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block GRANITE_PAVE_MOUSSU = new BlockBase("granite_pave_moussu", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block GRANITE_POLI = new BlockBase("granite_poli", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block GRANITE_SCULPTEE = new BlockBase("granite_sculptee", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block JONC_DE_MER = new BlockBase("jonc_de_mer", Material.GRASS, 5F, 5F, SoundType.GROUND);
    public static final Block LAINE_BLANCHE_CROISEE = new BlockBase("laine_blanche_croisee", Material.CLOTH, 5F, 5F, SoundType.CLOTH);
    public static final Block LAINE_BLEUE_CIEL_CROISEE = new BlockBase("laine_bleue_ciel_croisee", Material.CLOTH, 5F, 5F, SoundType.CLOTH);
    public static final Block LAINE_BLEUE_CROISEE = new BlockBase("laine_bleue_croisee",  Material.CLOTH, 5F, 5F, SoundType.CLOTH);
    public static final Block LAINE_CYAN_CROISEE = new BlockBase("laine_cyan_croisee",  Material.CLOTH, 5F, 5F, SoundType.CLOTH);
    public static final Block LAINE_GRIS_CROISEE = new BlockBase("laine_gris_croisee",  Material.CLOTH, 5F, 5F, SoundType.CLOTH);
    public static final Block LAINE_JAUNE_CROISEE = new BlockBase("laine_jaune_croisee",  Material.CLOTH, 5F, 5F, SoundType.CLOTH);
    public static final Block LAINE_MAGENTA_CROISEE = new BlockBase("laine_magenta_croisee",  Material.CLOTH, 5F, 5F, SoundType.CLOTH);
    public static final Block LAINE_MARRON_CROISEE = new BlockBase("laine_marron_croisee",  Material.CLOTH, 5F, 5F, SoundType.CLOTH);
    public static final Block LAINE_NOIRE_CROISEE = new BlockBase("laine_noire_croisee",  Material.CLOTH, 5F, 5F, SoundType.CLOTH);
    public static final Block LAINE_ORANGE_CROISEE = new BlockBase("laine_orange_croisee", Material.CLOTH, 5F, 5F, SoundType.CLOTH);
    public static final Block LAINE_ROSE_CROISEE = new BlockBase("laine_rose_croisee",  Material.CLOTH, 5F, 5F, SoundType.CLOTH);
    public static final Block LAINE_ROUGE_CROISEE = new BlockBase("laine_rouge_croisee",  Material.CLOTH, 5F, 5F, SoundType.CLOTH);
    public static final Block LAINE_VERTE_CLAIRE_CROISEE = new BlockBase("laine_verte_claire_croisee", Material.CLOTH, 5F, 5F, SoundType.CLOTH);
    public static final Block LAINE_VERTE_CROISEE = new BlockBase("laine_verte_croisee",  Material.CLOTH, 5F, 5F, SoundType.CLOTH);
    public static final Block LAINE_VIOLETTE_CROISEE = new BlockBase("laine_violette_croisee",  Material.CLOTH, 5F, 5F, SoundType.CLOTH);
    public static final Block MARBRAGE_SOL_GRES = new BlockBase("marbrage_sol_gres", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block PAVE_CRAQUELE = new BlockBase("pave_craquele", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block PIERRES_DE_GRES_NATURELLES = new BlockBase("pierres_de_gres_naturelles", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block PLANCHE_ACACIA_VERNIE = new BlockBase("planche_acacia_vernie", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHE_BOULEAU_VERNIE = new BlockBase("planche_bouleau_vernie", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHE_CHENE_NOIR_VERNIE = new BlockBase("planche_chene_noir_vernie", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHE_CHENE_VERNIE = new BlockBase("planche_chene_vernie",Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHE_MELANGE_DE_BOIS = new BlockBase("planche_melange_de_bois", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHE_SAPIN_VERNIE = new BlockBase("planche_sapin_vernie", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHER_ACACIA_CHEVRON = new BlockBase("plancher_acacia_chevron",Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHER_ACACIA_CIRE = new BlockBase("plancher_acacia_cire", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHER_ACACIA_CLOUE = new BlockBase("plancher_acacia_cloue", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHER_ACACIA_CRAQUELE = new BlockBase("plancher_acacia_craquele", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHER_ACACIA_CROISE = new BlockBase("plancher_acacia_croise", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHER_ACACIA_MOUSSU = new BlockBase("plancher_acacia_moussu", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHER_ACAJOU_CHEVRON = new BlockBase("plancher_acajou_chevron", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHER_ACAJOU_CIRE = new BlockBase("plancher_acajou_cire",Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHER_ACAJOU_CLOUE = new BlockBase("plancher_acajou_cloue", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHER_ACAJOU_CRAQUELE = new BlockBase("plancher_acajou_craquele", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHER_ACAJOU_CROISE = new BlockBase("plancher_acajou_croise", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHER_ACAJOU_MOUSSU = new BlockBase("plancher_acajou_moussu", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHER_BAMBOU = new BlockBase("plancher_bambou", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHER_BOULEAU_CHEVRON = new BlockBase("plancher_bouleau_chevron",Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHER_BOULEAU_CIRE = new BlockBase("plancher_bouleau_cire", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHER_BOULEAU_CLOUE = new BlockBase("plancher_bouleau_cloue", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHER_BOULEAU_CRAQUELE = new BlockBase("plancher_bouleau_craquele", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHER_BOULEAU_CROISE = new BlockBase("plancher_bouleau_croise",Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHER_BOULEAU_MOUSSU = new BlockBase("plancher_bouleau_moussu", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHER_CHENE_CHEVRON = new BlockBase("plancher_chene_chevron", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHER_CHENE_CIRE = new BlockBase("plancher_chene_cire", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHER_CHENE_CLOUE = new BlockBase("plancher_chene_cloue", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHER_CHENE_CRAQUELE = new BlockBase("plancher_chene_craquele", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHER_CHENE_CROISE = new BlockBase("plancher_chene_croise", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHER_CHENE_MOUSSU = new BlockBase("plancher_chene_moussu",Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHER_CHENE_NOIR_CHEVRON = new BlockBase("plancher_chene_noir_chevron", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHER_CHENE_NOIR_CIRE = new BlockBase("plancher_chene_noir_cire", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHER_CHENE_NOIR_CLOUE = new BlockBase("plancher_chene_noir_cloue", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHER_CHENE_NOIR_CRAQUELE = new BlockBase("plancher_chene_noir_craquele", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHER_CHENE_NOIR_CROISE = new BlockBase("plancher_chene_noir_croise", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHER_CHENE_NOIR_MOUSSU = new BlockBase("plancher_chene_noir_moussu", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHER_SAPIN_CHEVRON = new BlockBase("plancher_sapin_chevron", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHER_SAPIN_CIRE = new BlockBase("plancher_sapin_cire", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHER_SAPIN_CLOUE = new BlockBase("plancher_sapin_cloue", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHER_SAPIN_CRAQUELE = new BlockBase("plancher_sapin_craquele", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHER_SAPIN_CROISE = new BlockBase("plancher_sapin_croise",Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHER_SAPIN_MOUSSU = new BlockBase("plancher_sapin_moussu", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block ROCHE_ET_PIERRE = new BlockBase("roche_et_pierre", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block STUC = new BlockBase("stuc", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block TUILE = new BlockBase("tuile", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block TUILE_EN_ARDOISE = new BlockBase("tuile_en_ardoise", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block TUILE_EN_ARDOISE_TAILLEE = new BlockBase("tuile_en_ardoise_taillee", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block TUILE_EN_ARDOISE_TRAVAILLEE = new BlockBase("tuile_en_ardoise_travaillee", Material.ROCK, 5F, 5F, SoundType.STONE);

    //ESCALIER
    public static final Block WOOL_COLORED_MAGENTA_STAIRS = new BlockEscalier("wool_colored_magenta_stairs",3F,3F, SoundType.CLOTH, Block.getStateById(35));
    public static final Block ADESITSMOOTHMOSSYSTAIR = new BlockEscalier("adesitsmoothmossystair",5F,5F, SoundType.STONE, Block.getStateById(35));
    public static final Block ANDESITECRACKEDBRICKSTAIRS  = new BlockEscalier("andesitecrackedbrickstairs",5F,5F, SoundType.STONE, Block.getStateById(35));
    public static final Block ANDESITMOSSYBRICKSTAIR  = new BlockEscalier("andesitmossybrickstair",5F,5F, SoundType.STONE, Block.getStateById(35));
    public static final Block ANDESITSMOOTH2STAIR  = new BlockEscalier("andesitsmooth2stair",5F,5F, SoundType.STONE, Block.getStateById(35));
    public static final Block ANDESITSMOOTHSTAIR  = new BlockEscalier("andesitsmoothstair",5F,5F, SoundType.STONE, Block.getStateById(35));
    public static final Block CONCRETEBLACKSTAIR  = new BlockEscalier("concreteblackstair",5F,5F, SoundType.STONE, Block.getStateById(35));
    public static final Block CONCRETEBLUESTAIR  = new BlockEscalier("concretebluestair",5F,5F, SoundType.STONE, Block.getStateById(35));
    public static final Block CONCRETEBROWNSTAIR  = new BlockEscalier("concretebrownstair",5F,5F, SoundType.STONE, Block.getStateById(35));
    public static final Block CONCRETECYANSTAIR  = new BlockEscalier("concretecyanstair",5F,5F, SoundType.STONE, Block.getStateById(35));
    public static final Block CONCRETEGRAYSTAIR  = new BlockEscalier("concretegraystair",5F,5F, SoundType.STONE, Block.getStateById(35));
    public static final Block CONCRETEGREENSTAIR  = new BlockEscalier("concretegreenstair",5F,5F, SoundType.STONE, Block.getStateById(35));
    public static final Block CONCRETELIGHTBLUESTAIR  = new BlockEscalier("concretelightbluestair",5F,5F, SoundType.STONE, Block.getStateById(35));
    public static final Block CONCRETELIMESTAIR  = new BlockEscalier("concretelimestair",5F,5F, SoundType.STONE, Block.getStateById(35));
    public static final Block CONCRETEMAGENTASTAIR  = new BlockEscalier("concretemagentastair",5F,5F, SoundType.STONE, Block.getStateById(35));
    public static final Block CONCRETEORANGESTAIR  = new BlockEscalier("concreteorangestair",5F,5F, SoundType.STONE, Block.getStateById(35));
    public static final Block CONCRETEPINKSTAIR  = new BlockEscalier("concretepinkstair",5F,5F, SoundType.STONE, Block.getStateById(35));
    public static final Block CONCRETEPURPLESTAIR  = new BlockEscalier("concretepurplestair",5F,5F, SoundType.STONE, Block.getStateById(35));
    public static final Block CONCRETEREDSTAIR  = new BlockEscalier("concreteredstair",5F,5F, SoundType.STONE, Block.getStateById(35));
    public static final Block CONCRETESILVERSTAIR  = new BlockEscalier("concretesilverstair",5F,5F, SoundType.STONE, Block.getStateById(35));
    public static final Block CONCRETEYELLOWSTAIR  = new BlockEscalier("concreteyellowstair",5F,5F, SoundType.STONE, Block.getStateById(35));
    public static final Block DIORITECRACKEDBRICKSTAIR  = new BlockEscalier("dioritecrackedbrickstair",5F,5F, SoundType.STONE, Block.getStateById(35));
    public static final Block DIORITEMOSSYSTAIR  = new BlockEscalier("dioritemossystair",5F,5F, SoundType.STONE, Block.getStateById(35));
    public static final Block DIORITESMOOTH2STAIR  = new BlockEscalier("dioritesmooth2stair",5F,5F, SoundType.STONE, Block.getStateById(35));
    public static final Block DIORITESMOOTHBRICKSTAIR  = new BlockEscalier("dioritesmoothbrickstair",5F,5F, SoundType.STONE, Block.getStateById(35));
    public static final Block DIORITESMOOTHMOSSYSTAIRS  = new BlockEscalier("dioritesmoothmossystairs",5F,5F, SoundType.STONE, Block.getStateById(35));
    public static final Block GRANITECRACKEDBRICKSTAIR  = new BlockEscalier("granitecrackedbrickstair",5F,5F, SoundType.STONE, Block.getStateById(35));
    public static final Block GRANITEMOSSYSTAIR  = new BlockEscalier("granitemossystair",5F,5F, SoundType.STONE, Block.getStateById(35));
    public static final Block GRANITESMOOTH2STAIR  = new BlockEscalier("granitesmooth2stair",5F,5F, SoundType.STONE, Block.getStateById(35));
    public static final Block GRANITESMOOTHBRICKSTAIR  = new BlockEscalier("granitesmoothbrickstair",5F,5F, SoundType.STONE, Block.getStateById(35));
    public static final Block GRANITESMOOTHMOSSYSTAIR  = new BlockEscalier("granitesmoothmossystair",5F,5F, SoundType.STONE, Block.getStateById(35));
    public static final Block HIDDENPLANKACACIASTAIR  = new BlockEscalier("hiddenplankacaciastair",4F,4F, SoundType.WOOD, Block.getStateById(35));
    public static final Block HIDDENPLANKBIGOAKSTAIR  = new BlockEscalier("hiddenplankbigoakstair",4F,4F, SoundType.WOOD, Block.getStateById(35));
    public static final Block HIDDENPLANKBIRCHSTAIR  = new BlockEscalier("hiddenplankbirchstair",4F,4F, SoundType.WOOD, Block.getStateById(35));
    public static final Block HIDDENPLANKJUNGLESTAIR  = new BlockEscalier("hiddenplankjunglestair",4F,4F, SoundType.WOOD, Block.getStateById(35));
    public static final Block HIDDENPLANKOAKSTAIR  = new BlockEscalier("hiddenplankoakstair",4F,4F, SoundType.WOOD, Block.getStateById(35));
    public static final Block HIDDENPLANKSACACIASTAIR  = new BlockEscalier("hiddenplanksacaciastair",4F,4F, SoundType.WOOD, Block.getStateById(35));
    public static final Block WOOLBLACKSTAIR  = new BlockEscalier("woolblackstair",3F,3F, SoundType.CLOTH, Block.getStateById(35));
    public static final Block WOOLBLUESTAIR  = new BlockEscalier("woolbluestair",3F,3F, SoundType.CLOTH, Block.getStateById(35));
    public static final Block WOOLBROWNSTAIR  = new BlockEscalier("woolbrownstair",3F,3F, SoundType.CLOTH, Block.getStateById(35));
    public static final Block WOOLCYANSTAIR  = new BlockEscalier("woolcyanstair",3F,3F, SoundType.CLOTH, Block.getStateById(35));
    public static final Block WOOLGRAYSTAIRS  = new BlockEscalier("woolgraystairs",3F,3F, SoundType.CLOTH, Block.getStateById(35));
    public static final Block WOOLGREENSTAIR  = new BlockEscalier("woolgreenstair",3F,3F, SoundType.CLOTH, Block.getStateById(35));
    public static final Block WOOLLIGHTBLUESTAIR  = new BlockEscalier("woollightbluestair",3F,3F, SoundType.CLOTH, Block.getStateById(35));
    public static final Block WOOLLIMESTAIR  = new BlockEscalier("woollimestair",3F,3F, SoundType.CLOTH, Block.getStateById(35));
    public static final Block WOOLMAGENTASTAIR  = new BlockEscalier("woolmagentastair",3F,3F, SoundType.CLOTH, Block.getStateById(35));
    public static final Block WOOLORANGESTAIR  = new BlockEscalier("woolorangestair",3F,3F, SoundType.CLOTH, Block.getStateById(35));
    public static final Block WOOLREDSTAIR  = new BlockEscalier("woolredstair",3F,3F, SoundType.CLOTH, Block.getStateById(35));
    public static final Block WOOLSILVERSTAIR  = new BlockEscalier("woolsilverstair",3F,3F, SoundType.CLOTH, Block.getStateById(35));
    public static final Block WOOLWHITESTAIR  = new BlockEscalier("woolwhitestair",3F,3F, SoundType.CLOTH, Block.getStateById(35));
    public static final Block WOOLYELLOWSTAIR  = new BlockEscalier("woolyellowstair",3F,3F, SoundType.CLOTH, Block.getStateById(35));
    public static final Block WOOLPEURPLESTAIR  = new BlockEscalier("woolpeurplestair",3F,3F, SoundType.CLOTH, Block.getStateById(35));
    public static final Block WOOLPINKSTAIR  = new BlockEscalier("woolpinkstair",3F,3F, SoundType.CLOTH, Block.getStateById(35));

    public static final Block ESCALIER_EN_BLOC_DE_CHAUME = new BlockEscalier("escalier_en_bloc_de_chaume",5F,5F, SoundType.STONE, Block.getStateById(35));
    public static final Block ESCALIER_EN_BLOC_DE_PAILLE = new BlockEscalier("escalier_en_bloc_de_paille",5F,5F, SoundType.STONE, Block.getStateById(35));
    public static final Block ESCALIER_EN_ECAILLE_EN_ARDOISE = new BlockEscalier("escalier_en_ecaille_en_ardoise",5F,5F, SoundType.STONE, Block.getStateById(35));
    public static final Block ESCALIER_EN_ECAILLE_EN_ARDOISE_CYAN = new BlockEscalier("escalier_en_ecaille_en_ardoise_cyan",5F,5F, SoundType.STONE, Block.getStateById(35));
    public static final Block ESCALIER_EN_ECAILLE_EN_ARDOISE_VERTE = new BlockEscalier("escalier_en_ecaille_en_ardoise_verte",5F,5F, SoundType.STONE, Block.getStateById(35));
    public static final Block ESCALIER_EN_ECAILLE_EN_ARDOISE_VERTE_CLAIRE = new BlockEscalier("escalier_en_ecaille_en_ardoise_verte_claire",5F,5F, SoundType.STONE, Block.getStateById(35));
    public static final Block ESCALIER_EN_JONC_DE_MER = new BlockEscalier("escalier_en_jonc_de_mer",5F,5F, SoundType.STONE, Block.getStateById(35));
    public static final Block ESCALIER_EN_LAINE_BLANCHE_CROISEE = new BlockEscalier("escalier_en_laine_blanche_croisee",5F,5F, SoundType.STONE, Block.getStateById(35));
    public static final Block ESCALIER_EN_LAINE_BLEUE_CIEL_CROISEE = new BlockEscalier("escalier_en_laine_bleue_ciel_croisee",5F,5F, SoundType.STONE, Block.getStateById(35));
    public static final Block ESCALIER_EN_LAINE_BLEUE_CROISEE = new BlockEscalier("escalier_en_laine_bleue_croisee",5F,5F, SoundType.STONE, Block.getStateById(35));
    public static final Block ESCALIER_EN_LAINE_CYAN_CROISEE = new BlockEscalier("escalier_en_laine_cyan_croisee",5F,5F, SoundType.STONE, Block.getStateById(35));
    public static final Block ESCALIER_EN_LAINE_GRIS_CROISEE = new BlockEscalier("escalier_en_laine_gris_croisee",5F,5F, SoundType.STONE, Block.getStateById(35));
    public static final Block ESCALIER_EN_LAINE_JAUNE_CROISEE = new BlockEscalier("escalier_en_laine_jaune_croisee",5F,5F, SoundType.STONE, Block.getStateById(35));
    public static final Block ESCALIER_EN_LAINE_MAGENTA_CROISEE = new BlockEscalier("escalier_en_laine_magenta_croisee",5F,5F, SoundType.STONE, Block.getStateById(35));
    public static final Block ESCALIER_EN_LAINE_MARRON_CROISEE = new BlockEscalier("escalier_en_laine_marron_croisee",5F,5F, SoundType.STONE, Block.getStateById(35));
    public static final Block ESCALIER_EN_LAINE_NOIRE_CROISEE = new BlockEscalier("escalier_en_laine_noire_croisee",5F,5F, SoundType.STONE, Block.getStateById(35));
    public static final Block ESCALIER_EN_LAINE_ORANGE_CROISEE = new BlockEscalier("escalier_en_laine_orange_croisee",5F,5F, SoundType.STONE, Block.getStateById(35));
    public static final Block ESCALIER_EN_LAINE_ROSE_CROISEE = new BlockEscalier("escalier_en_laine_rose_croisee",5F,5F, SoundType.STONE, Block.getStateById(35));
    public static final Block ESCALIER_EN_LAINE_ROUGE_CROISEE = new BlockEscalier("escalier_en_laine_rouge_croisee",5F,5F, SoundType.STONE, Block.getStateById(35));
    public static final Block ESCALIER_EN_LAINE_VERTE_CLAIRE_CROISEE = new BlockEscalier("escalier_en_laine_verte_claire_croisee",5F,5F, SoundType.STONE, Block.getStateById(35));
    public static final Block ESCALIER_EN_LAINE_VERTE_CROISEE = new BlockEscalier("escalier_en_laine_verte_croisee",5F,5F, SoundType.STONE, Block.getStateById(35));
    public static final Block ESCALIER_EN_LAINE_VIOLETTE_CROISEE = new BlockEscalier("escalier_en_laine_violette_croisee",5F,5F, SoundType.STONE, Block.getStateById(35));
    public static final Block ESCALIER_EN_PLANCHE_ACACIA_VERNIE = new BlockEscalier("escalier_en_planche_acacia_vernie",5F,5F, SoundType.STONE, Block.getStateById(35));
    public static final Block ESCALIER_EN_PLANCHE_BOULEAU_VERNIE = new BlockEscalier("escalier_en_planche_bouleau_vernie",5F,5F, SoundType.STONE, Block.getStateById(35));
    public static final Block ESCALIER_EN_PLANCHE_CHENE_NOIR_VERNIE = new BlockEscalier("escalier_en_planche_chene_noir_vernie",5F,5F, SoundType.STONE, Block.getStateById(35));
    public static final Block ESCALIER_EN_PLANCHE_CHENE_VERNIE = new BlockEscalier("escalier_en_planche_chene_vernie",5F,5F, SoundType.STONE, Block.getStateById(35));
    public static final Block ESCALIER_EN_PLANCHE_SAPIN_VERNIE = new BlockEscalier("escalier_en_planche_sapin_vernie",5F,5F, SoundType.STONE, Block.getStateById(35));
    public static final Block ESCALIER_EN_PLANCHER_BAMBOU = new BlockEscalier("escalier_en_plancher_bambou",5F,5F, SoundType.STONE, Block.getStateById(35));
    public static final Block ESCALIER_EN_TUILE = new BlockEscalier("escalier_en_tuile",5F,5F, SoundType.STONE, Block.getStateById(35));
    public static final Block ESCALIER_EN_TUILE_EN_ARDOISE = new BlockEscalier("escalier_en_tuile_en_ardoise",5F,5F, SoundType.STONE, Block.getStateById(35));
    public static final Block ESCALIER_EN_TUILE_EN_ARDOISE_TAILLEE = new BlockEscalier("escalier_en_tuile_en_ardoise_taillee",5F,5F, SoundType.STONE, Block.getStateById(35));
    public static final Block ESCALIER_EN_TUILE_EN_ARDOISE_TRAVAILLEE = new BlockEscalier("escalier_en_tuile_en_ardoise_travaillee",5F,5F, SoundType.STONE, Block.getStateById(35));

    //DALLES \!/ block de base, dalle et double dalle + méthode init & register en bas de ce code.
    /*public static final Block WOOLMAGENTA = new BlockBase("wool_colored_magenta",Material.CLOTH,2F,2F,SoundType.CLOTH);



    public static BlockDalleWoolColoredMagenta.Half ANDESITECRACKEDBRICKSLAB;
    public static BlockDalleWoolColoredMagenta.Half ANDESITMOSSYBRICKSLAB ;
    public static BlockDalleWoolColoredMagenta.Half ANDESITSMOOTH2SLAB ;
    public static BlockDalleWoolColoredMagenta.Half ANDESITSMOOTHMOSSYSLAB ;
    public static BlockDalleWoolColoredMagenta.Half ANDESITSMOOTHSLAB ;
    public static BlockDalleWoolColoredMagenta.Half CONCRETEBLACKSLAB ;
    public static BlockDalleWoolColoredMagenta.Half CONCRETEBLUESLAB ;
    public static BlockDalleWoolColoredMagenta.Half CONCRETEBROWNSLAB ;
    public static BlockDalleWoolColoredMagenta.Half CONCRETECYANSLAB ;
    public static BlockDalleWoolColoredMagenta.Half CONCRETEGRAYSLAB ;
    public static BlockDalleWoolColoredMagenta.Half CONCRETEGREENSLAB ;
    public static BlockDalleWoolColoredMagenta.Half CONCRETELIGHTBLUESLAB ;
    public static BlockDalleWoolColoredMagenta.Half CONCRETELIMESLAB ;
    public static BlockDalleWoolColoredMagenta.Half CONCRETEMAGENTASLAB ;
    public static BlockDalleWoolColoredMagenta.Half CONCRETEORANGESLAB ;
    public static BlockDalleWoolColoredMagenta.Half CONCRETEPINKSLAB ;
    public static BlockDalleWoolColoredMagenta.Half CONCRETEPURPLESLAB ;
    public static BlockDalleWoolColoredMagenta.Half CONCRETEREDSLAB ;
    public static BlockDalleWoolColoredMagenta.Half CONCRETESILVERSLAB ;
    public static BlockDalleWoolColoredMagenta.Half CONCRETEYELLOWSLAB ;
    public static BlockDalleWoolColoredMagenta.Half DIORITECRACKEDBRICKSLAB ;
    public static BlockDalleWoolColoredMagenta.Half DIORITEMOSSYSLAB ;
    public static BlockDalleWoolColoredMagenta.Half DIORITESMOOTH2SLAB ;
    public static BlockDalleWoolColoredMagenta.Half DIORITESMOOTHBRICKSLAB ;
    public static BlockDalleWoolColoredMagenta.Half DIORITESMOOTHMOSSYSLAB ;
    public static BlockDalleWoolColoredMagenta.Half GRANITECRACKEDBRICKSLAB ;
    public static BlockDalleWoolColoredMagenta.Half GRANITEMOSSYSLAB ;
    public static BlockDalleWoolColoredMagenta.Half GRANITESMOOTH2SLAB ;
    public static BlockDalleWoolColoredMagenta.Half GRANITESMOOTHBRICKSLAB ;
    public static BlockDalleWoolColoredMagenta.Half GRANITESMOOTHMOSSYSLAB ;
    public static BlockDalleWoolColoredMagenta.Half HIDDENPLANKBIGOAKSLAB ;
    public static BlockDalleWoolColoredMagenta.Half HIDDENPLANKBIRCHSLAB ;
    public static BlockDalleWoolColoredMagenta.Half HIDDENPLANKJUNGLESLAB ;
    public static BlockDalleWoolColoredMagenta.Half HIDDENPLANKOAKSLAB ;
    public static BlockDalleWoolColoredMagenta.Half HIDDENPLANKSACACIASLAB ;
    public static BlockDalleWoolColoredMagenta.Half HIDDENPLANKSPRUCESLAB ;
    public static BlockDalleWoolColoredMagenta.Half WOOLBLACKSLAB ;
    public static BlockDalleWoolColoredMagenta.Half WOOLBLUESLAB ;
    public static BlockDalleWoolColoredMagenta.Half WOOLBROWNSLAB ;
    public static BlockDalleWoolColoredMagenta.Half WOOLCYANSLAB ;
    public static BlockDalleWoolColoredMagenta.Half WOOLGRAYSLAB ;
    public static BlockDalleWoolColoredMagenta.Half WOOLGREENSLAB ;
    public static BlockDalleWoolColoredMagenta.Half WOOLLIGHTBLUESLAB ;
    public static BlockDalleWoolColoredMagenta.Half WOOLLIMESLAB ;
    public static BlockDalleWoolColoredMagenta.Half WOOL_COLORED_MAGENTA_HALF_SLAB ;
    public static BlockDalleWoolColoredMagenta.Half WOOLORANGESLAB ;
    public static BlockDalleWoolColoredMagenta.Half WOOLREDSLAB ;
    public static BlockDalleWoolColoredMagenta.Half WOOLSILVERSLAB ;
    public static BlockDalleWoolColoredMagenta.Half WOOLWHITESLAB ;
    public static BlockDalleWoolColoredMagenta.Half WOOLYELLOWSLAB ;
    public static BlockDalleWoolColoredMagenta.Half WOOLPINKSLAB ;
    public static BlockDalleWoolColoredMagenta.Half WOOLPURPLESLAB ;

    public static BlockDalleWoolColoredMagenta.Double ANDESITECRACKEDBRICK_DOUBLE_SLAB;
    public static BlockDalleWoolColoredMagenta.Double ANDESITMOSSYBRICK_DOUBLE_SLAB ;
    public static BlockDalleWoolColoredMagenta.Double ANDESITSMOOTH2_DOUBLE_SLAB ;
    public static BlockDalleWoolColoredMagenta.Double ANDESITSMOOTHMOSSY_DOUBLE_SLAB ;
    public static BlockDalleWoolColoredMagenta.Double ANDESITSMOOTH_DOUBLE_SLAB ;
    public static BlockDalleWoolColoredMagenta.Double CONCRETEBLACK_DOUBLE_SLAB ;
    public static BlockDalleWoolColoredMagenta.Double CONCRETEBLUE_DOUBLE_SLAB ;
    public static BlockDalleWoolColoredMagenta.Double CONCRETEBROWN_DOUBLE_SLAB ;
    public static BlockDalleWoolColoredMagenta.Double CONCRETECYAN_DOUBLE_SLAB ;
    public static BlockDalleWoolColoredMagenta.Double CONCRETEGRAY_DOUBLE_SLAB ;
    public static BlockDalleWoolColoredMagenta.Double CONCRETEGREEN_DOUBLE_SLAB ;
    public static BlockDalleWoolColoredMagenta.Double CONCRETELIGHTBLUE_DOUBLE_SLAB ;
    public static BlockDalleWoolColoredMagenta.Double CONCRETELIME_DOUBLE_SLAB ;
    public static BlockDalleWoolColoredMagenta.Double CONCRETEMAGENTA_DOUBLE_SLAB ;
    public static BlockDalleWoolColoredMagenta.Double CONCRETEORANGE_DOUBLE_SLAB ;
    public static BlockDalleWoolColoredMagenta.Double CONCRETEPINK_DOUBLE_SLAB ;
    public static BlockDalleWoolColoredMagenta.Double CONCRETEPURPLE_DOUBLE_SLAB ;
    public static BlockDalleWoolColoredMagenta.Double CONCRETERED_DOUBLE_SLAB ;
    public static BlockDalleWoolColoredMagenta.Double CONCRETESILVER_DOUBLE_SLAB ;
    public static BlockDalleWoolColoredMagenta.Double CONCRETEYELLOW_DOUBLE_SLAB ;
    public static BlockDalleWoolColoredMagenta.Double DIORITECRACKEDBRICK_DOUBLE_SLAB ;
    public static BlockDalleWoolColoredMagenta.Double DIORITEMOSSY_DOUBLE_SLAB ;
    public static BlockDalleWoolColoredMagenta.Double DIORITESMOOTH2_DOUBLE_SLAB ;
    public static BlockDalleWoolColoredMagenta.Double DIORITESMOOTHBRICK_DOUBLE_SLAB ;
    public static BlockDalleWoolColoredMagenta.Double DIORITESMOOTHMOSSY_DOUBLE_SLAB ;
    public static BlockDalleWoolColoredMagenta.Double GRANITECRACKEDBRICK_DOUBLE_SLAB ;
    public static BlockDalleWoolColoredMagenta.Double GRANITEMOSSY_DOUBLE_SLAB ;
    public static BlockDalleWoolColoredMagenta.Double GRANITESMOOTH2_DOUBLE_SLAB ;
    public static BlockDalleWoolColoredMagenta.Double GRANITESMOOTHBRICK_DOUBLE_SLAB ;
    public static BlockDalleWoolColoredMagenta.Double GRANITESMOOTHMOSSY_DOUBLE_SLAB ;
    public static BlockDalleWoolColoredMagenta.Double HIDDENPLANKBIGOAK_DOUBLE_SLAB ;
    public static BlockDalleWoolColoredMagenta.Double HIDDENPLANKBIRCH_DOUBLE_SLAB ;
    public static BlockDalleWoolColoredMagenta.Double HIDDENPLANKJUNGLE_DOUBLE_SLAB ;
    public static BlockDalleWoolColoredMagenta.Double HIDDENPLANKOAK_DOUBLE_SLAB ;
    public static BlockDalleWoolColoredMagenta.Double HIDDENPLANKSACACIA_DOUBLE_SLAB ;
    public static BlockDalleWoolColoredMagenta.Double HIDDENPLANKSPRUCE_DOUBLE_SLAB ;
    public static BlockDalleWoolColoredMagenta.Double WOOLBLACK_DOUBLE_SLAB ;
    public static BlockDalleWoolColoredMagenta.Double WOOLBLUE_DOUBLE_SLAB ;
    public static BlockDalleWoolColoredMagenta.Double WOOLBROWN_DOUBLE_SLAB ;
    public static BlockDalleWoolColoredMagenta.Double WOOLCYAN_DOUBLE_SLAB ;
    public static BlockDalleWoolColoredMagenta.Double WOOLGRAY_DOUBLE_SLAB ;
    public static BlockDalleWoolColoredMagenta.Double WOOLGREEN_DOUBLE_SLAB ;
    public static BlockDalleWoolColoredMagenta.Double WOOLLIGHTBLUE_DOUBLE_SLAB ;
    public static BlockDalleWoolColoredMagenta.Double WOOLLIME_DOUBLE_SLAB ;
    public static BlockDalleWoolColoredMagenta.Double WOOLMAGENTA_DOUBLE_SLAB ;
    public static BlockDalleWoolColoredMagenta.Double WOOLORANGE_DOUBLE_SLAB ;
    public static BlockDalleWoolColoredMagenta.Double WOOLRED_DOUBLE_SLAB ;
    public static BlockDalleWoolColoredMagenta.Double WOOLSILVER_DOUBLE_SLAB ;
    public static BlockDalleWoolColoredMagenta.Double WOOLWHITE_DOUBLE_SLAB ;
    public static BlockDalleWoolColoredMagenta.Double WOOLYELLOW_DOUBLE_SLAB ;
    public static BlockDalleWoolColoredMagenta.Double WOOLPINK_DOUBLE_SLAB ;
    public static BlockDalleWoolColoredMagenta.Double WOOLPURPLE_DOUBLE_SLAB ;*/



    //PLANTES
    public static final Block BASILIC = new BlockPlante("basilic");
    public static final Block ALGUES = new BlockPlante("algues");
    public static final Block ANETH = new BlockPlante("aneth");
    public static final Block ANIS = new BlockPlante("anis");
    public static final Block BELLE_DE_NUIT = new BlockPlante("belle_de_nuit");
    public static final Block BLEUETS = new BlockPlante("bleuets");
    public static final Block BONZAI = new BlockPlante("bonzai");
    public static final Block BUISSON = new BlockPlante("buisson");
    public static final Block BUISSON_DE_FLEURS_BLANCHES = new BlockPlante("buisson_de_fleurs_blanches");
    public static final Block BUISSON_ETRANGE = new BlockPlante("buisson_etrange");
    public static final Block BUISSON_HERBEUX = new BlockPlante("buisson_herbeux");
    public static final Block CAMOMILLE = new BlockPlante("camomille");
    public static final Block CHARDON = new BlockPlante("chardon");
    public static final Block CIBOULETTE = new BlockPlante("ciboulette");
    public static final Block CLOCHETTES = new BlockPlante("clochettes");
    public static final Block COSMOS = new BlockPlante("cosmos");
    public static final Block ETOILE_DES_GLACIERS = new BlockPlante("etoile_des_glaciers");
    public static final Block GERANIUM = new BlockPlante("geranium");
    public static final Block GIROUETTE = new BlockPlante("girouette");
    public static final Block GLYCINE = new BlockPlante("glycine");
    public static final Block GUI = new BlockPlante("gui");
    public static final Block GUZMANIAS = new BlockPlante("guzmanias");
    public static final Block HIBISCUS = new BlockPlante("hibiscus");
    public static final Block HORTENSIAS = new BlockPlante("hortensias");
    public static final Block HOUX = new BlockPlante("houx");
    public static final Block HYDRANGEE = new BlockPlante("hydrangee");
    public static final Block IRIS = new BlockPlante("iris");
    public static final Block JACINTHE_DES_BOIS = new BlockPlante("jacinthe_des_bois");
    public static final Block JASMIN = new BlockPlante("jasmin");
    public static final Block JOLI_BUISSON = new BlockPlante("joli_buisson");
    public static final Block JONQUILLE = new BlockPlante("jonquille");
    public static final Block LAURIER = new BlockPlante("laurier");
    public static final Block LAVANDE = new BlockPlante("lavande");
    public static final Block LYS = new BlockPlante("lys");
    public static final Block MANDRAGORE = new BlockPlante("mandragore");
    public static final Block MENTHE = new BlockPlante("menthe");
    public static final Block MUGUET = new BlockPlante("muguet");
    public static final Block MYOSOTIS = new BlockPlante("myosotis");
    public static final Block NARCISSES = new BlockPlante("narcisses");
    public static final Block OEILLETS = new BlockPlante("oeillets");
    public static final Block ORCHIDEE_ROSE = new BlockPlante("orchidee_rose");
    public static final Block PENSEES = new BlockPlante("pensees");
    public static final Block PERSIL = new BlockPlante("persil");
    public static final Block PIVOINE = new BlockPlante("pivoine");
    public static final Block PLANTE_ETRANGE = new BlockPlante("plante_etrange");
    public static final Block PLANTE_GRASSE = new BlockPlante("plante_grasse");
    public static final Block PLANTE_GRASSE_COLOREE = new BlockPlante("plante_grasse_coloree");
    public static final Block POIVRON_JAUNE = new BlockPlante("poivron_jaune");
    public static final Block POIVRON_ORANGE = new BlockPlante("poivron_orange");
    public static final Block POIVRON_ROUGE = new BlockPlante("poivron_rouge");
    public static final Block POIVRON_VERT = new BlockPlante("poivron_vert");
    public static final Block ROMARIN = new BlockPlante("romarin");
    public static final Block RONCES = new BlockPlante("ronces");
    public static final Block SALICORNE = new BlockPlante("salicorne");
    public static final Block VERGE_D_OR = new BlockPlante("verge_d_or");
    public static final Block VERVEINE = new BlockPlante("verveine");
    public static final Block VIOLETTES = new BlockPlante("violettes");

    //PORTE
    public static final Block PORTE_RENFORCEE = new BlockPorte("porte_renforcee", Material.WOOD, SoundType.WOOD, 4F);
    public static final Block PORTE_DELABREE = new BlockPorte("porte_delabree", Material.WOOD, SoundType.WOOD, 4F);
    public static final Block PORTE_PEINTE_BLEU_CIEL = new BlockPorte("porte_peinte_bleu_ciel", Material.WOOD, SoundType.WOOD, 4F);
    public static final Block PORTE_PEINTE_BLEU = new BlockPorte("porte_peinte_bleu", Material.WOOD, SoundType.WOOD, 4F);
    public static final Block PORTE_PEINTE_CYAN = new BlockPorte("porte_peinte_cyan", Material.WOOD, SoundType.WOOD, 4F);
    public static final Block PORTE_PEINTE_MAGENTA = new BlockPorte("porte_peinte_magenta", Material.WOOD, SoundType.WOOD, 4F);
    public static final Block PORTE_PEINTE_MARRON = new BlockPorte("porte_peinte_marron", Material.WOOD, SoundType.WOOD, 4F);
    public static final Block PORTE_PEINTE_NOIR = new BlockPorte("porte_peinte_noir", Material.WOOD, SoundType.WOOD, 4F);
    public static final Block PORTE_PEINTE_ORANGE = new BlockPorte("porte_peinte_orange", Material.WOOD, SoundType.WOOD, 4F);
    public static final Block PORTE_PEINTE_ROSE = new BlockPorte("porte_peinte_rose", Material.WOOD, SoundType.WOOD, 4F);
    public static final Block PORTE_PEINTE_ROUGE = new BlockPorte("porte_peinte_rouge", Material.WOOD, SoundType.WOOD, 4F);
    public static final Block PORTE_PEINTE_VERT_CLAIR = new BlockPorte("porte_peinte_vert_clair", Material.WOOD, SoundType.WOOD, 4F);
    public static final Block PORTE_PEINTE_VERT = new BlockPorte("porte_peinte_vert", Material.WOOD, SoundType.WOOD, 4F);
    public static final Block PORTE_PEINTE_VIOLET = new BlockPorte("porte_peinte_violet", Material.WOOD, SoundType.WOOD, 4F);
    public static final Block VOLET = new BlockPorte("volet", Material.WOOD, SoundType.WOOD, 4F);
    public static final Block VOLET_RENFORCE = new BlockPorte("volet_renforce", Material.WOOD, SoundType.WOOD, 4F);

    //TRAPPE
    public static final Block TRAPPE_EN_ACAJOU = new BlockTrappe("trappe_en_acajou",2F,Material.WOOD);
    public static final Block TRAPPE_AJOUREE_EN_ACACIA = new BlockTrappe("trappe_ajouree_en_acacia",2F,Material.WOOD);
    public static final Block TRAPPE_AJOUREE_EN_BOULEAU = new BlockTrappe("trappe_ajouree_en_bouleau",2F,Material.WOOD);
    public static final Block TRAPPE_AJOUREE_EN_CHENE = new BlockTrappe("trappe_ajouree_en_chene",2F,Material.WOOD);
    public static final Block TRAPPE_AJOUREE_EN_SAPIN = new BlockTrappe("trappe_ajouree_en_sapin",2F,Material.WOOD);
    public static final Block TRAPPE_EN_ACACIA = new BlockTrappe("trappe_en_acacia",2F,Material.WOOD);
    public static final Block TRAPPE_EN_BOULEAU = new BlockTrappe("trappe_en_bouleau",2F,Material.WOOD);
    public static final Block TRAPPE_EN_CHENE_NOIR = new BlockTrappe("trappe_en_chene_noir",2F,Material.WOOD);
    public static final Block TRAPPE_EN_SAPIN = new BlockTrappe("trappe_en_sapin",2F,Material.WOOD);
    public static final Block TRAPPE_TRAVAILLEE_EN_CHENE_NOIR = new BlockTrappe("trappe_travaillee_en_chene_noir",2F,Material.WOOD);
    public static final Block TRAPPE_TRAVAILLEE_EN_SAPIN = new BlockTrappe("trappe_travaillee_en_sapin",2F,Material.WOOD);

    //BARRIERE
    public static final Block ANDESITE_FENCE = new BlockBarriere("andesite_fence", Material.ROCK, MapColor.STONE, 5F, 5F);
    public static final Block ANDESITEFENCE  = new BlockBarriere("andesitefence", Material.ROCK, MapColor.STONE, 5F, 5F);
    public static final Block DIORITEFENCE  = new BlockBarriere("dioritefence", Material.ROCK, MapColor.STONE, 5F, 5F);
    public static final Block GRANITEFENCE  = new BlockBarriere("granitefence", Material.ROCK, MapColor.STONE, 5F, 5F);
    public static final Block LOGACACIAFENCE  = new BlockBarriere("logacaciafence", Material.WOOD, MapColor.WOOD, 4F, 4F);
    public static final Block LOGBIGOAKFENCE  = new BlockBarriere("logbigoakfence", Material.WOOD, MapColor.WOOD, 4F, 4F);
    public static final Block LOGBIRCHFENCE  = new BlockBarriere("logbirchfence",  Material.WOOD, MapColor.WOOD, 4F, 4F);
    public static final Block LOGJUNGLEFENCE  = new BlockBarriere("logjunglefence",  Material.WOOD, MapColor.WOOD, 4F, 4F);
    public static final Block LOGOAKFENCE  = new BlockBarriere("logoakfence",  Material.WOOD, MapColor.WOOD, 4F, 4F);
    public static final Block LOGSPRUCEFENCE  = new BlockBarriere("logsprucefence",  Material.WOOD, MapColor.WOOD, 4F, 4F);

    //MUR \!/ Créer le block de même composition avant
    public static final Block ANDESITE = new BlockBase("andesite", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block ANDESITEWALL  = new BlockMur("andesite_wall", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block DIORITE = new BlockBase("diorite", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block DIORITEWALL  = new BlockMur("diorite_wall", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block GRANITE = new BlockBase("granite", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block GRANITEWALL  = new BlockMur("granite_wall", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block ACACIA = new BlockBase("acacia", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block WALLLEGACACIA  = new BlockMur("acacia_wall", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block BIGOAK = new BlockBase("bigoak", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block WALLLEGBIGOAK  = new BlockMur("bigoak_wall", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block BIRCH = new BlockBase("birch", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block WALLLEGBIRCH  = new BlockMur("birch_wall", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block JUNGLE = new BlockBase("jungle", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block WALLLEGJUNGLE  = new BlockMur("jungle_wall", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block OAK = new BlockBase("oak", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block WALLLEGOAK  = new BlockMur("oak_wall", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block SPRUCE = new BlockBase("spruce", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block WALLLEGSPRUCE  = new BlockMur("spruce_wall", Material.WOOD, 5F, 5F, SoundType.WOOD);


    //TÄCHES
    public static final Block TACHE_DE_SANG = new BlockTache("tache_de_sang", Material.WOOD,0.5F,5F,SoundType.WOOD);
    public static final Block TACHE_EAU = new BlockTache("tache_d_eau", Material.WOOD, 0.5F, 0.5F, SoundType.WOOD);
    public static final Block TACHE_DE_BOUE = new BlockTache("tache_de_boue", Material.WOOD, 0.5F, 0.5F, SoundType.WOOD);
    public static final Block TACHE_DE_VOMI = new BlockTache("tache_de_vomi", Material.WOOD, 0.5F, 0.5F, SoundType.WOOD);
    public static final Block TACHE_D_URINE = new BlockTache("tache_d_urine", Material.WOOD, 0.5F, 0.5F, SoundType.WOOD);

    //PLANTATION \!/ Allez changer la graine correspondant dans init.ModItems en ItemGraine (faire ctrl+f pour la trouver) + register l'item ici, dans init() et register();
    public static final Block PLAN_DE_LIN = new BlockPlanLin("plan_de_lin",ModItems.GRAINE_LIN, ModItems.LIN);
    public static final Block PLAN_CELERI = new BlockPlanLin("plan_celeri",ModItems.GRAINE_CELERI, ModItems.CELERI_BRANCHE);
    public static final Block PLAN_FENOUIL = new BlockPlanLin("plan_fenouil",ModItems.GRAINE_FENOUIL, ModItems.FENOUIL);
    public static final Block PLAN_MAIS = new BlockPlanLin("plan_mais",ModItems.GRAINE_MAIS, ModItems.MAIS);
    public static final Block PLAN_NAVET = new BlockPlanLin("plan_navet",ModItems.GRAINE_NAVET, ModItems.NAVET);
    public static final Block PLAN_ORGE = new BlockPlanLin("plan_orge",ModItems.GRAINE_ORGE, ModItems.ORGE);
    public static final Block PLAN_FRAISE = new BlockPlanLin("plan_fraise",ModItems.GRAINE_FRAISE, ModItems.FRAISE);
    public static final Block PLAN_FRAMBOISE = new BlockPlanLin("plan_framboise",ModItems.GRAINE_FRAMBOISE, ModItems.FRAMBOISE);
    public static final Block PLAN_MYRTILLE = new BlockPlanLin("plan_myrtille",ModItems.GRAINE_MYRTILLE, ModItems.MYRTILLES);
    public static final Block PLAN_POIREAU = new BlockPlanLin("plan_poireau",ModItems.GRAINE_POIREAU, ModItems.POIREAU);
    public static final Block PLAN_RADIS = new BlockPlanLin("plan_radis",ModItems.GRAINE_RADIS, ModItems.RADIS);
    public static final Block PLAN_SALSIFI = new BlockPlanLin("plan_salsifi",ModItems.GRAINE_SALSIFI, ModItems.SALSIFI);
    public static final Block PLAN_TOMATE = new BlockPlanLin("plan_tomate",ModItems.GRAINE_TOMATE, ModItems.TOMATE);
    public static final Block PLAN_VIGNE_NOIRE = new BlockPlanLin("plan_vigne_noire",ModItems.GRAINE_VIGNE_NOIRE, ModItems.RAISIN_NOIR);
    public static final Block PLAN_EPINARD = new BlockPlanLin("plan_epinard",ModItems.GRAINE_EPINARD, ModItems.EPINARD);
    public static final Block PLAN_CHOU = new BlockPlanLin("plan_chou",ModItems.GRAINE_CHOU, ModItems.CHOU_VERT);
    public static final Block PLAN_THE = new BlockPlanLin("plan_the",ModItems.GRAINE_DE_THE, ModItems.FEUILLE_DE_THE);
    public static final Block PLAN_SALADE = new BlockPlanLin("plan_salade",ModItems.GRAINE_SALADE, ModItems.SALADE);
    public static final Block PLAN_ARTICHAUT = new BlockPlanLin("plan_artichaut",ModItems.GRAINE_ARTICHAUT, ModItems.ARTICHAUT);
    public static final Block PLAN_BROCOLIS = new BlockPlanLin("plan_brocolis",ModItems.GRAINE_BROCOLIS, ModItems.BROCOLI);
    public static final Block PLAN_ASPERGE = new BlockPlanLin("plan_asperge",ModItems.GRAINE_ASPERGE, ModItems.ASPERGE);
    public static final Block PLAN_ENDIVE = new BlockPlanLin("plan_endive",ModItems.GRAINE_ENDIVE, ModItems.ENDIVE);
    public static final Block PLAN_RIZ = new BlockPlanLin("plan_riz",ModItems.GRAINE_RIZ, ModItems.RIZ);
    public static final Block PLAN_CHANVRE = new BlockPlanLin("plan_chanvre",ModItems.GRAINE_CHANVRE, ModItems.CHANVRE);



    //LUMINEUX
    public static final Block LANTERNE_JAUNE_ETEINTE = new BlockLantern("lanterne_jaune",false,Material.GLASS,0.5F,3F,SoundType.GLASS);
    public static final Block LANTERNE_JAUNE_ALLUMEE = new BlockLantern("lanterne_jaune",true,Material.GLASS,0.5F,3F,SoundType.GLASS);

    //FLOWER POT \!/ Venir ajouter les plantes ici pour pouvoir les planter dans ces nouveaux pots ! (ctrl+f BASILIC dans le fichier BlockFlowerPot ;) ) + BlockStates et model à ajuster
    public static final Block FLOWER_POT = new BlockFlowerPot("flower_pot_am");

    //BARIL \!/ Ajouter les interactions avec d'autres objets et liquides dans la classe directement en suivant l'exemple de l'eau
    public static final Block BARIL_VIDE = new BlockBaril("baril_vide", Material.WOOD, 1.5F, 1.5f, SoundType.WOOD, BlockBaril.BarilType.VIDE);
    public static final Block BARIL_EAU = new BlockBaril("baril_eau", Material.WOOD, 1.5F, 1.5f, SoundType.WOOD, BlockBaril.BarilType.EAU);
    public static final Block BARIL_LAIT = new BlockBaril("baril_lait", Material.WOOD, 1.5F, 1.5f, SoundType.WOOD, BlockBaril.BarilType.LAIT);
    public static final Block BARIL_BIERRE_BLONDE = new BlockBaril("baril_bierre_blonde", Material.WOOD, 1.5F, 1.5f, SoundType.WOOD, BlockBaril.BarilType.BIERRE_BLONDE);
    public static final Block BARIL_BIERE_BRUNE = new BlockBaril("baril_biere_brune", Material.WOOD, 1.5F, 1.5f, SoundType.WOOD, BlockBaril.BarilType.BIERE_BRUNE);
    public static final Block BARIL_BIERE_ROUSSE = new BlockBaril("baril_biere_rousse", Material.WOOD, 1.5F, 1.5f, SoundType.WOOD, BlockBaril.BarilType.BIERE_ROUSSE);
    public static final Block BARIL_VIN_BLANC = new BlockBaril("baril_vin_blanc", Material.WOOD, 1.5F, 1.5f, SoundType.WOOD, BlockBaril.BarilType.VIN_BLANC);
    public static final Block BARIL_VIN_ROUGE = new BlockBaril("baril_vin_rouge", Material.WOOD, 1.5F, 1.5f, SoundType.WOOD, BlockBaril.BarilType.VIN_ROUGE);
    public static final Block BARIL_RHUM = new BlockBaril("baril_rhum", Material.WOOD, 1.5F, 1.5f, SoundType.WOOD, BlockBaril.BarilType.RHUM);
    public static final Block BARIL_HYDROMEL = new BlockBaril("baril_hydromel", Material.WOOD, 1.5F, 1.5f, SoundType.WOOD, BlockBaril.BarilType.HYDROMEL);

    //CONTENEUR \!/ Il faut recréer Block, TileEntity, Container, Inventory, GUI, Registry dans util.handlers.RegistryHandler et gérer le GUIid du Block (onBlockActivated) dans le switch case du GUIHandler
    public static final Block ECRIN_A_BIJOUX = new BlockEcrinABijoux("ecrin_a_bijoux", Material.WOOD, 1.5F, 1.5F, SoundType.WOOD);



    //Minerai
    public static final Block BLOC_MINERAI_ARGENT = new BlockBase("bloc_minerai_argent", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block BLOC_MINERAI_FER = new BlockBase("bloc_minerai_fer", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block BLOC_MINERAI_ETAIN = new BlockBase("bloc_minerai_etain", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block BLOC_MINERAI_PLOMB = new BlockBase("bloc_minerai_plomb", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block BLOC_MINERAI_CUIVRE = new BlockBase("bloc_minerai_cuivre", Material.ROCK, 5F, 5F, SoundType.STONE);


    /*public static final Block CHAISE_CHENE = new BlocChaise("chaise_chene", Material.WOOD, SoundType.WOOD);




    /**
     * Init the blocks
     */
    public static void init(){
        //dalles
       /* WOOL_COLORED_MAGENTA_HALF_SLAB = new BlockDalleWoolColoredMagenta.Half("wool_colored_magenta_half_slab",1F,1F, Material.CLOTH, SoundType.CLOTH);
        WOOLMAGENTA_DOUBLE_SLAB = new BlockDalleWoolColoredMagenta.Double("wool_colored_magenta_double_slab",1F,1F, Material.CLOTH, SoundType.CLOTH);
*/

        //cultures
        ModItems.GRAINE_LIN = new ItemGraine("graine_lin",ModBlocks.PLAN_DE_LIN, Blocks.FARMLAND);
        ModItems.GRAINE_CELERI = new ItemGraine("GRAINE_CELERI",ModBlocks.PLAN_CELERI, Blocks.FARMLAND);
        ModItems.GRAINE_FENOUIL = new ItemGraine("GRAINE_FENOUIL",ModBlocks.PLAN_FENOUIL, Blocks.FARMLAND);
        ModItems.GRAINE_FRAISE = new ItemGraine("GRAINE_FRAISE",ModBlocks.PLAN_FRAISE, Blocks.FARMLAND);
        ModItems.GRAINE_FRAMBOISE = new ItemGraine("GRAINE_FRAMBOISE",ModBlocks.PLAN_FRAMBOISE, Blocks.FARMLAND);
        ModItems.GRAINE_MAIS = new ItemGraine("GRAINE_MAIS",ModBlocks.PLAN_MAIS, Blocks.FARMLAND);
        ModItems.GRAINE_MYRTILLE = new ItemGraine("GRAINE_MYRTILLE",ModBlocks.PLAN_MYRTILLE, Blocks.FARMLAND);
        ModItems.GRAINE_NAVET = new ItemGraine("GRAINE_NAVET",ModBlocks.PLAN_NAVET, Blocks.FARMLAND);
        ModItems.GRAINE_ORGE = new ItemGraine("GRAINE_ORGE",ModBlocks.PLAN_ORGE, Blocks.FARMLAND);
        ModItems.GRAINE_POIREAU = new ItemGraine("GRAINE_POIREAU",ModBlocks.PLAN_POIREAU, Blocks.FARMLAND);
        ModItems.GRAINE_RADIS = new ItemGraine("GRAINE_RADIS",ModBlocks.PLAN_RADIS, Blocks.FARMLAND);
        ModItems.GRAINE_SALSIFI = new ItemGraine("GRAINE_SALSIFI",ModBlocks.PLAN_SALSIFI, Blocks.FARMLAND);
        ModItems.GRAINE_TOMATE = new ItemGraine("GRAINE_TOMATE",ModBlocks.PLAN_TOMATE, Blocks.FARMLAND);
        ModItems.GRAINE_VIGNE_NOIRE = new ItemGraine("GRAINE_VIGNE_NOIRE",ModBlocks.PLAN_VIGNE_NOIRE, Blocks.FARMLAND);
        ModItems.GRAINE_CHOU = new ItemGraine("GRAINE_CHOU",ModBlocks.PLAN_CHOU, Blocks.FARMLAND);
        ModItems.GRAINE_EPINARD = new ItemGraine("GRAINE_EPINARD",ModBlocks.PLAN_EPINARD, Blocks.FARMLAND);
        ModItems.GRAINE_DE_THE = new ItemGraine("GRAINE_THE",ModBlocks.PLAN_THE, Blocks.FARMLAND);
    }

    /**
     * Register the blocks
     */
    public static void register(){


        //dalles
       /* registerBlock(WOOL_COLORED_MAGENTA_HALF_SLAB, new ItemSlab(WOOL_COLORED_MAGENTA_HALF_SLAB,WOOL_COLORED_MAGENTA_HALF_SLAB,WOOLMAGENTA_DOUBLE_SLAB));
        ForgeRegistries.BLOCKS.register(WOOLMAGENTA_DOUBLE_SLAB);
*/



        //cultures


        /*registerBlock(WOOL_COLORED_MAGENTA_HALF_SLAB, new ItemSlab(WOOL_COLORED_MAGENTA_HALF_SLAB,WOOL_COLORED_MAGENTA_HALF_SLAB,WOOL_COLORED_MAGENTA_DOUBLE_SLAB));
        ForgeRegistries.BLOCKS.register(WOOL_COLORED_MAGENTA_DOUBLE_SLAB);*/
        registerItem(ModItems.GRAINE_LIN);
        registerItem(ModItems.GRAINE_CELERI);
        registerItem(ModItems.GRAINE_FENOUIL);
        registerItem(ModItems.GRAINE_FRAISE);
        registerItem(ModItems.GRAINE_FRAMBOISE);
        registerItem(ModItems.GRAINE_MAIS);
        registerItem(ModItems.GRAINE_MYRTILLE);
        registerItem(ModItems.GRAINE_NAVET);
        registerItem(ModItems.GRAINE_ORGE);
        registerItem(ModItems.GRAINE_POIREAU);
        registerItem(ModItems.GRAINE_RADIS);
        registerItem(ModItems.GRAINE_SALSIFI);
        registerItem(ModItems.GRAINE_TOMATE);
        registerItem(ModItems.GRAINE_VIGNE_NOIRE);
        registerItem(ModItems.GRAINE_VIGNE_BLANCHE);
        registerItem(ModItems.GRAINE_CHOU);
        registerItem(ModItems.GRAINE_EPINARD);
        registerItem(ModItems.GRAINE_SALADE);
        registerItem(ModItems.GRAINE_ARTICHAUT);
        registerItem(ModItems.GRAINE_BROCOLIS);
        registerItem(ModItems.GRAINE_ASPERGE);
        registerItem(ModItems.GRAINE_ENDIVE);
        registerItem(ModItems.GRAINE_RIZ);

        //registerB(ModBlocks.CHAISE_CHENE, new ItemBlock(ModBlocks.CHAISE_CHENE));

        registerItem(ModItems.GRAINE_DE_THE);



    }

    public static void registerBlock(Block block){
        ForgeRegistries.BLOCKS.register(block);
        block.setCreativeTab(ArcheMod.archeCreativeTabs);
        ItemBlock item = new ItemBlock(block);
        item.setRegistryName(block.getRegistryName());
        ForgeRegistries.ITEMS.register(item);

        ArcheMod.proxy.registerItemRenderer(Item.getItemFromBlock(block),0,"inventory");
    }

    public static void registerBlock(Block block, ItemBlock itemBlock){
        ForgeRegistries.BLOCKS.register(block);
        block.setCreativeTab(ArcheMod.archeCreativeTabs);
        itemBlock.setRegistryName(block.getRegistryName());
        ForgeRegistries.ITEMS.register(itemBlock);

        ArcheMod.proxy.registerItemRenderer(Item.getItemFromBlock(block),0,"inventory");
    }

    public static void registerB(Block block, ItemBlock itemBlock){
        ForgeRegistries.BLOCKS.register(block);
        block.setCreativeTab(ArcheMod.archeCreativeTabs);
        itemBlock.setRegistryName(block.getRegistryName());
        ForgeRegistries.ITEMS.register(itemBlock);

        ArcheMod.proxy.registerItemRenderer(Item.getItemFromBlock(block),0,"inventory");
    }


    public static void registerItem(Item item){
        ForgeRegistries.ITEMS.register(item);
        ArcheMod.proxy.registerItemRenderer(item,0,"inventory");
    }

}
