package fr.archemod.init;

import fr.archemod.ArcheMod;
import fr.archemod.blocks.*;
import fr.archemod.blocks.agriculture.BlocPlantesAgriculture;
import fr.archemod.blocks.agriculture.BlocPlantesBotaniste;
import fr.archemod.blocks.gateau.*;
import fr.archemod.items.agriculture.ItemGraine;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import java.util.ArrayList;
import java.util.List;


public class ModBlocks {

    public static final List<Block> BLOCKS = new ArrayList<>();

    //BLOCKS

    public static final Block FISH_CASE = new BlockFishCase("casier_a_poisson", Material.WOOD, 0.5F, 0.5F, SoundType.WOOD);

    public static final Block BLOC_DE_PIERRE_PRECIEUSE = new PierrePrecieuseOre("bloc_de_pierre_precieuse", Material.IRON);
    public static final Block PLACARD_HRP = new BlockContainerPlacardHRP("placard_hrp", Material.WOOD, 0.5F, 0.5F, SoundType.WOOD, "am:placardhrp", 9, 3, 50, new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.0D, 1.0D), 2, true);

    //public static final Block SHOWCASE = new Showcase("showcase",Material.WOOD);
    //public static final Block SHOWCASE_CENTER = new Showcase("showcase_center",Material.WOOD);
    //public static final Block SHOWCASE_LEFT = new Showcase("showcase_left",Material.WOOD);
    //public static final Block SHOWCASE_RIGHT = new Showcase("showcase_right",Material.WOOD);

    //public static final Block TABLE = new Table("table",Material.WOOD);
    //public static final Block TABLE_MIDDLE = new Table("table_middle",Material.WOOD);
    //public static final Block TABLE_END_1 = new Table("table_end_1",Material.WOOD);
    //public static final Block TABLE_END_2 = new Table("table_end_2",Material.WOOD);

    //Blocs

    //Métaux
    public static final Block BLOC_D_ACIER = new BlockBase("bloc_d_acier", Material.IRON, 5F, 5F, SoundType.METAL);
    public static final Block BLOC_D_ARGENT = new BlockBase("bloc_d_argent", Material.IRON, 5F, 5F, SoundType.METAL);
    public static final Block BLOC_DE_BRONZE = new BlockBase("bloc_de_bronze", Material.IRON, 5F, 5F, SoundType.METAL);
    public static final Block BLOC_DE_CENDRES = new BlockBase("bloc_de_cendres", Material.SAND, 5F, 5F, SoundType.SAND);
    public static final Block BLOC_DE_CHAUME = new BlockBase("bloc_de_chaume", Material.GRASS, 5F, 5F, SoundType.GROUND);
    public static final Block BLOC_DE_CUIVRE = new BlockBase("bloc_de_cuivre", Material.IRON, 5F, 5F, SoundType.METAL);
    public static final Block BLOC_DE_PAILLE = new BlockBase("bloc_de_paille", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block BLOC_DE_PLOMB = new BlockBase("bloc_de_plomb", Material.IRON, 5F, 5F, SoundType.METAL);
    public static final Block BLOC_ETAIN = new BlockBase("bloc_etain", Material.IRON, 5F, 5F, SoundType.METAL);

    //Pierre
    public static final Block ANDESITE_PAVE_MOUSSU = new BlockBase("andesite_pave_moussu", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block ANDESITE_POLIE = new BlockBase("andesite_polie", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block ANDESITE_SCULPTEE = new BlockBase("andesite_sculptee", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block ARDOISE_BRUTE = new BlockBase("ardoise_brute", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block ARDOISE_BRUTE_BLEUE = new BlockBase("ardoise_brute_bleue", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block ARDOISE_PEINTE = new BlockBase("ardoise_peinte", Material.ROCK, 5F, 5F, SoundType.STONE);
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
    public static final Block MARBRAGE_SOL_GRES = new BlockBase("marbrage_sol_gres", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block PAVE_CRAQUELE = new BlockBase("pave_craquele", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block PIERRES_DE_GRES_NATURELLES = new BlockBase("pierres_de_gres_naturelles", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block ROCHE_ET_PIERRE = new BlockBase("roche_et_pierre", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block STUC = new BlockBase("stuc", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block TUILE = new BlockBase("tuile", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block TUILE_EN_ARDOISE = new BlockBase("tuile_en_ardoise", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block TUILE_EN_ARDOISE_TAILLEE = new BlockBase("tuile_en_ardoise_taillee", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block TUILE_EN_ARDOISE_TRAVAILLEE = new BlockBase("tuile_en_ardoise_travaillee", Material.ROCK, 5F, 5F, SoundType.STONE);


    //Bois
    public static final Block JONC_DE_MER = new BlockBase("jonc_de_mer", Material.GRASS, 5F, 5F, SoundType.GROUND);
    public static final Block PLANCHE_ACACIA_VERNIE = new BlockBase("planche_acacia_vernie", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHE_BOULEAU_VERNIE = new BlockBase("planche_bouleau_vernie", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHE_CHENE_NOIR_VERNIE = new BlockBase("planche_chene_noir_vernie", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHE_CHENE_VERNIE = new BlockBase("planche_chene_vernie", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHE_MELANGE_DE_BOIS = new BlockBase("planche_melange_de_bois", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHE_SAPIN_VERNIE = new BlockBase("planche_sapin_vernie", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHER_ACACIA_CHEVRON = new BlockBase("plancher_acacia_chevron", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHER_ACACIA_CIRE = new BlockBase("plancher_acacia_cire", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHER_ACACIA_CLOUE = new BlockBase("plancher_acacia_cloue", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHER_ACACIA_CRAQUELE = new BlockBase("plancher_acacia_craquele", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHER_ACACIA_CROISE = new BlockBase("plancher_acacia_croise", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHER_ACACIA_MOUSSU = new BlockBase("plancher_acacia_moussu", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHER_ACAJOU_CHEVRON = new BlockBase("plancher_acajou_chevron", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHER_ACAJOU_CIRE = new BlockBase("plancher_acajou_cire", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHER_ACAJOU_CLOUE = new BlockBase("plancher_acajou_cloue", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHER_ACAJOU_CRAQUELE = new BlockBase("plancher_acajou_craquele", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHER_ACAJOU_CROISE = new BlockBase("plancher_acajou_croise", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHER_ACAJOU_MOUSSU = new BlockBase("plancher_acajou_moussu", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHER_BAMBOU = new BlockBase("plancher_bambou", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHER_BOULEAU_CHEVRON = new BlockBase("plancher_bouleau_chevron", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHER_BOULEAU_CIRE = new BlockBase("plancher_bouleau_cire", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHER_BOULEAU_CLOUE = new BlockBase("plancher_bouleau_cloue", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHER_BOULEAU_CRAQUELE = new BlockBase("plancher_bouleau_craquele", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHER_BOULEAU_CROISE = new BlockBase("plancher_bouleau_croise", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHER_BOULEAU_MOUSSU = new BlockBase("plancher_bouleau_moussu", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHER_CHENE_CHEVRON = new BlockBase("plancher_chene_chevron", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHER_CHENE_CIRE = new BlockBase("plancher_chene_cire", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHER_CHENE_CLOUE = new BlockBase("plancher_chene_cloue", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHER_CHENE_CRAQUELE = new BlockBase("plancher_chene_craquele", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHER_CHENE_CROISE = new BlockBase("plancher_chene_croise", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHER_CHENE_MOUSSU = new BlockBase("plancher_chene_moussu", Material.WOOD, 5F, 5F, SoundType.WOOD);
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
    public static final Block PLANCHER_SAPIN_CROISE = new BlockBase("plancher_sapin_croise", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block PLANCHER_SAPIN_MOUSSU = new BlockBase("plancher_sapin_moussu", Material.WOOD, 5F, 5F, SoundType.WOOD);


    //ESCALIER

    //LAINE
    public static final Block ESCALIER_EN_JONC_DE_MER = new BlockEscalier("escalier_en_jonc_de_mer", 5F, 5F, SoundType.STONE, Block.getStateById(35));
    public static final Block ESCALIER_EN_LAINE_BLANCHE_CROISEE = new BlockEscalier("escalier_en_laine_blanche_croisee", 5F, 5F, SoundType.STONE, Block.getStateById(35));
    public static final Block ESCALIER_EN_LAINE_BLEUE_CIEL_CROISEE = new BlockEscalier("escalier_en_laine_bleue_ciel_croisee", 5F, 5F, SoundType.STONE, Block.getStateById(35));
    public static final Block ESCALIER_EN_LAINE_BLEUE_CROISEE = new BlockEscalier("escalier_en_laine_bleue_croisee", 5F, 5F, SoundType.STONE, Block.getStateById(35));
    public static final Block ESCALIER_EN_LAINE_CYAN_CROISEE = new BlockEscalier("escalier_en_laine_cyan_croisee", 5F, 5F, SoundType.STONE, Block.getStateById(35));
    public static final Block ESCALIER_EN_LAINE_GRIS_CROISEE = new BlockEscalier("escalier_en_laine_gris_croisee", 5F, 5F, SoundType.STONE, Block.getStateById(35));
    public static final Block ESCALIER_EN_LAINE_JAUNE_CROISEE = new BlockEscalier("escalier_en_laine_jaune_croisee", 5F, 5F, SoundType.STONE, Block.getStateById(35));
    public static final Block ESCALIER_EN_LAINE_MAGENTA_CROISEE = new BlockEscalier("escalier_en_laine_magenta_croisee", 5F, 5F, SoundType.STONE, Block.getStateById(35));
    public static final Block ESCALIER_EN_LAINE_MARRON_CROISEE = new BlockEscalier("escalier_en_laine_marron_croisee", 5F, 5F, SoundType.STONE, Block.getStateById(35));
    public static final Block ESCALIER_EN_LAINE_NOIRE_CROISEE = new BlockEscalier("escalier_en_laine_noire_croisee", 5F, 5F, SoundType.STONE, Block.getStateById(35));
    public static final Block ESCALIER_EN_LAINE_ORANGE_CROISEE = new BlockEscalier("escalier_en_laine_orange_croisee", 5F, 5F, SoundType.STONE, Block.getStateById(35));
    public static final Block ESCALIER_EN_LAINE_ROSE_CROISEE = new BlockEscalier("escalier_en_laine_rose_croisee", 5F, 5F, SoundType.STONE, Block.getStateById(35));
    public static final Block ESCALIER_EN_LAINE_ROUGE_CROISEE = new BlockEscalier("escalier_en_laine_rouge_croisee", 5F, 5F, SoundType.STONE, Block.getStateById(35));
    public static final Block ESCALIER_EN_LAINE_VERTE_CLAIRE_CROISEE = new BlockEscalier("escalier_en_laine_verte_claire_croisee", 5F, 5F, SoundType.STONE, Block.getStateById(35));
    public static final Block ESCALIER_EN_LAINE_VERTE_CROISEE = new BlockEscalier("escalier_en_laine_verte_croisee", 5F, 5F, SoundType.STONE, Block.getStateById(35));
    public static final Block ESCALIER_EN_LAINE_VIOLETTE_CROISEE = new BlockEscalier("escalier_en_laine_violette_croisee", 5F, 5F, SoundType.STONE, Block.getStateById(35));
    public static final Block WOOLBLACKSTAIR = new BlockEscalier("woolblackstair", 3F, 3F, SoundType.CLOTH, Block.getStateById(35));
    public static final Block WOOLBLUESTAIR = new BlockEscalier("woolbluestair", 3F, 3F, SoundType.CLOTH, Block.getStateById(35));
    public static final Block WOOLBROWNSTAIR = new BlockEscalier("woolbrownstair", 3F, 3F, SoundType.CLOTH, Block.getStateById(35));
    public static final Block WOOLCYANSTAIR = new BlockEscalier("woolcyanstair", 3F, 3F, SoundType.CLOTH, Block.getStateById(35));
    public static final Block WOOLGRAYSTAIRS = new BlockEscalier("woolgraystairs", 3F, 3F, SoundType.CLOTH, Block.getStateById(35));
    public static final Block WOOLGREENSTAIR = new BlockEscalier("woolgreenstair", 3F, 3F, SoundType.CLOTH, Block.getStateById(35));
    public static final Block WOOLLIGHTBLUESTAIR = new BlockEscalier("woollightbluestair", 3F, 3F, SoundType.CLOTH, Block.getStateById(35));
    public static final Block WOOLLIMESTAIR = new BlockEscalier("woollimestair", 3F, 3F, SoundType.CLOTH, Block.getStateById(35));
    public static final Block WOOLMAGENTASTAIR = new BlockEscalier("woolmagentastair", 3F, 3F, SoundType.CLOTH, Block.getStateById(35));
    public static final Block WOOLORANGESTAIR = new BlockEscalier("woolorangestair", 3F, 3F, SoundType.CLOTH, Block.getStateById(35));
    public static final Block WOOLPEURPLESTAIR = new BlockEscalier("woolpeurplestair", 3F, 3F, SoundType.CLOTH, Block.getStateById(35));
    public static final Block WOOLPINKSTAIR = new BlockEscalier("woolpinkstair", 3F, 3F, SoundType.CLOTH, Block.getStateById(35));
    public static final Block WOOLREDSTAIR = new BlockEscalier("woolredstair", 3F, 3F, SoundType.CLOTH, Block.getStateById(35));
    public static final Block WOOLSILVERSTAIR = new BlockEscalier("woolsilverstair", 3F, 3F, SoundType.CLOTH, Block.getStateById(35));
    public static final Block WOOLWHITESTAIR = new BlockEscalier("woolwhitestair", 3F, 3F, SoundType.CLOTH, Block.getStateById(35));
    public static final Block WOOLYELLOWSTAIR = new BlockEscalier("woolyellowstair", 3F, 3F, SoundType.CLOTH, Block.getStateById(35));
    public static final Block WOOL_COLORED_MAGENTA_STAIRS = new BlockEscalier("wool_colored_magenta_stairs", 3F, 3F, SoundType.CLOTH, Block.getStateById(35));

    //BOIS
    public static final Block ESCALIER_EN_PLANCHER_BAMBOU = new BlockEscalier("escalier_en_plancher_bambou", 5F, 5F, SoundType.STONE, Block.getStateById(35));
    public static final Block ESCALIER_EN_PLANCHE_ACACIA_VERNIE = new BlockEscalier("escalier_en_planche_acacia_vernie", 5F, 5F, SoundType.STONE, Block.getStateById(35));
    public static final Block ESCALIER_EN_PLANCHE_BOULEAU_VERNIE = new BlockEscalier("escalier_en_planche_bouleau_vernie", 5F, 5F, SoundType.STONE, Block.getStateById(35));
    public static final Block ESCALIER_EN_PLANCHE_CHENE_NOIR_VERNIE = new BlockEscalier("escalier_en_planche_chene_noir_vernie", 5F, 5F, SoundType.STONE, Block.getStateById(35));
    public static final Block ESCALIER_EN_PLANCHE_CHENE_VERNIE = new BlockEscalier("escalier_en_planche_chene_vernie", 5F, 5F, SoundType.STONE, Block.getStateById(35));
    public static final Block ESCALIER_EN_PLANCHE_SAPIN_VERNIE = new BlockEscalier("escalier_en_planche_sapin_vernie", 5F, 5F, SoundType.STONE, Block.getStateById(35));
    public static final Block HIDDENPLANKACACIASTAIR = new BlockEscalier("hiddenplankacaciastair", 4F, 4F, SoundType.WOOD, Block.getStateById(35));
    public static final Block HIDDENPLANKBIGOAKSTAIR = new BlockEscalier("hiddenplankbigoakstair", 4F, 4F, SoundType.WOOD, Block.getStateById(35));
    public static final Block HIDDENPLANKBIRCHSTAIR = new BlockEscalier("hiddenplankbirchstair", 4F, 4F, SoundType.WOOD, Block.getStateById(35));
    public static final Block HIDDENPLANKJUNGLESTAIR = new BlockEscalier("hiddenplankjunglestair", 4F, 4F, SoundType.WOOD, Block.getStateById(35));
    public static final Block HIDDENPLANKOAKSTAIR = new BlockEscalier("hiddenplankoakstair", 4F, 4F, SoundType.WOOD, Block.getStateById(35));
    public static final Block HIDDENPLANKSACACIASTAIR = new BlockEscalier("hiddenplanksacaciastair", 4F, 4F, SoundType.WOOD, Block.getStateById(35));


    //PIERRE
    public static final Block ADESITSMOOTHMOSSYSTAIR = new BlockEscalier("adesitsmoothmossystair", 5F, 5F, SoundType.STONE, Block.getStateById(35));
    public static final Block ANDESITECRACKEDBRICKSTAIRS = new BlockEscalier("andesitecrackedbrickstairs", 5F, 5F, SoundType.STONE, Block.getStateById(35));
    public static final Block ANDESITMOSSYBRICKSTAIR = new BlockEscalier("andesitmossybrickstair", 5F, 5F, SoundType.STONE, Block.getStateById(35));
    public static final Block ANDESITSMOOTH2STAIR = new BlockEscalier("andesitsmooth2stair", 5F, 5F, SoundType.STONE, Block.getStateById(35));
    public static final Block ANDESITSMOOTHSTAIR = new BlockEscalier("andesitsmoothstair", 5F, 5F, SoundType.STONE, Block.getStateById(35));
    public static final Block CONCRETEBLACKSTAIR = new BlockEscalier("concreteblackstair", 5F, 5F, SoundType.STONE, Block.getStateById(35));
    public static final Block CONCRETEBLUESTAIR = new BlockEscalier("concretebluestair", 5F, 5F, SoundType.STONE, Block.getStateById(35));
    public static final Block CONCRETEBROWNSTAIR = new BlockEscalier("concretebrownstair", 5F, 5F, SoundType.STONE, Block.getStateById(35));
    public static final Block CONCRETECYANSTAIR = new BlockEscalier("concretecyanstair", 5F, 5F, SoundType.STONE, Block.getStateById(35));
    public static final Block CONCRETEGRAYSTAIR = new BlockEscalier("concretegraystair", 5F, 5F, SoundType.STONE, Block.getStateById(35));
    public static final Block CONCRETEGREENSTAIR = new BlockEscalier("concretegreenstair", 5F, 5F, SoundType.STONE, Block.getStateById(35));
    public static final Block CONCRETELIGHTBLUESTAIR = new BlockEscalier("concretelightbluestair", 5F, 5F, SoundType.STONE, Block.getStateById(35));
    public static final Block CONCRETELIMESTAIR = new BlockEscalier("concretelimestair", 5F, 5F, SoundType.STONE, Block.getStateById(35));
    public static final Block CONCRETEMAGENTASTAIR = new BlockEscalier("concretemagentastair", 5F, 5F, SoundType.STONE, Block.getStateById(35));
    public static final Block CONCRETEORANGESTAIR = new BlockEscalier("concreteorangestair", 5F, 5F, SoundType.STONE, Block.getStateById(35));
    public static final Block CONCRETEPINKSTAIR = new BlockEscalier("concretepinkstair", 5F, 5F, SoundType.STONE, Block.getStateById(35));
    public static final Block CONCRETEPURPLESTAIR = new BlockEscalier("concretepurplestair", 5F, 5F, SoundType.STONE, Block.getStateById(35));
    public static final Block CONCRETEREDSTAIR = new BlockEscalier("concreteredstair", 5F, 5F, SoundType.STONE, Block.getStateById(35));
    public static final Block CONCRETESILVERSTAIR = new BlockEscalier("concretesilverstair", 5F, 5F, SoundType.STONE, Block.getStateById(35));
    public static final Block CONCRETEYELLOWSTAIR = new BlockEscalier("concreteyellowstair", 5F, 5F, SoundType.STONE, Block.getStateById(35));
    public static final Block DIORITECRACKEDBRICKSTAIR = new BlockEscalier("dioritecrackedbrickstair", 5F, 5F, SoundType.STONE, Block.getStateById(35));
    public static final Block DIORITEMOSSYSTAIR = new BlockEscalier("dioritemossystair", 5F, 5F, SoundType.STONE, Block.getStateById(35));
    public static final Block DIORITESMOOTH2STAIR = new BlockEscalier("dioritesmooth2stair", 5F, 5F, SoundType.STONE, Block.getStateById(35));
    public static final Block DIORITESMOOTHBRICKSTAIR = new BlockEscalier("dioritesmoothbrickstair", 5F, 5F, SoundType.STONE, Block.getStateById(35));
    public static final Block DIORITESMOOTHMOSSYSTAIRS = new BlockEscalier("dioritesmoothmossystairs", 5F, 5F, SoundType.STONE, Block.getStateById(35));
    public static final Block ESCALIER_EN_ECAILLE_EN_ARDOISE = new BlockEscalier("escalier_en_ecaille_en_ardoise", 5F, 5F, SoundType.STONE, Block.getStateById(35));
    public static final Block ESCALIER_EN_ECAILLE_EN_ARDOISE_CYAN = new BlockEscalier("escalier_en_ecaille_en_ardoise_cyan", 5F, 5F, SoundType.STONE, Block.getStateById(35));
    public static final Block ESCALIER_EN_ECAILLE_EN_ARDOISE_VERTE = new BlockEscalier("escalier_en_ecaille_en_ardoise_verte", 5F, 5F, SoundType.STONE, Block.getStateById(35));
    public static final Block ESCALIER_EN_ECAILLE_EN_ARDOISE_VERTE_CLAIRE = new BlockEscalier("escalier_en_ecaille_en_ardoise_verte_claire", 5F, 5F, SoundType.STONE, Block.getStateById(35));
    public static final Block ESCALIER_EN_TUILE = new BlockEscalier("escalier_en_tuile", 5F, 5F, SoundType.STONE, Block.getStateById(35));
    public static final Block ESCALIER_EN_TUILE_EN_ARDOISE = new BlockEscalier("escalier_en_tuile_en_ardoise", 5F, 5F, SoundType.STONE, Block.getStateById(35));
    public static final Block ESCALIER_EN_TUILE_EN_ARDOISE_TAILLEE = new BlockEscalier("escalier_en_tuile_en_ardoise_taillee", 5F, 5F, SoundType.STONE, Block.getStateById(35));
    public static final Block ESCALIER_EN_TUILE_EN_ARDOISE_TRAVAILLEE = new BlockEscalier("escalier_en_tuile_en_ardoise_travaillee", 5F, 5F, SoundType.STONE, Block.getStateById(35));
    public static final Block GRANITECRACKEDBRICKSTAIR = new BlockEscalier("granitecrackedbrickstair", 5F, 5F, SoundType.STONE, Block.getStateById(35));
    public static final Block GRANITEMOSSYSTAIR = new BlockEscalier("granitemossystair", 5F, 5F, SoundType.STONE, Block.getStateById(35));
    public static final Block GRANITESMOOTH2STAIR = new BlockEscalier("granitesmooth2stair", 5F, 5F, SoundType.STONE, Block.getStateById(35));
    public static final Block GRANITESMOOTHBRICKSTAIR = new BlockEscalier("granitesmoothbrickstair", 5F, 5F, SoundType.STONE, Block.getStateById(35));
    public static final Block GRANITESMOOTHMOSSYSTAIR = new BlockEscalier("granitesmoothmossystair", 5F, 5F, SoundType.STONE, Block.getStateById(35));

    //AUTRES
    public static final Block ESCALIER_EN_BLOC_DE_CHAUME = new BlockEscalier("escalier_en_bloc_de_chaume", 5F, 5F, SoundType.STONE, Block.getStateById(35));
    public static final Block ESCALIER_EN_BLOC_DE_PAILLE = new BlockEscalier("escalier_en_bloc_de_paille", 5F, 5F, SoundType.STONE, Block.getStateById(35));


    //DALLES \!/ block de base, dalle et double dalle + méthode init & register en bas de ce code.
    //public static final Block LAINE_MAGENTA = new BlockBase("laine_magenta",Material.CLOTH,2F,2F,SoundType.CLOTH);
    //public static DalleLaineMagenta.Half DALLE_LAINE_MAGENTA;
    //public static DalleLaineMagenta.Double DALLE_LAINE_MAGENTA_DOUBLE_SLAB ;
    //public static final Block LAINE_BLEU = new BlockBase("laine_bleu",Material.CLOTH,2F,2F,SoundType.CLOTH);
    //public static DalleLaineMagenta.Half DALLE_LAINE_BLEU;
    //public static DalleLaineMagenta.Double DALLE_LAINE_BLEU_DOUBLE_SLAB ;
    public static final Block LAINE_BLANCHE_CROISEE = new BlockBase("laine_blanche_croisee", Material.CLOTH, 5F, 5F, SoundType.CLOTH);
    public static final Block LAINE_BLEUE_CIEL_CROISEE = new BlockBase("laine_bleue_ciel_croisee", Material.CLOTH, 5F, 5F, SoundType.CLOTH);
    public static final Block LAINE_BLEUE_CROISEE = new BlockBase("laine_bleue_croisee", Material.CLOTH, 5F, 5F, SoundType.CLOTH);
    public static final Block LAINE_CYAN_CROISEE = new BlockBase("laine_cyan_croisee", Material.CLOTH, 5F, 5F, SoundType.CLOTH);
    public static final Block LAINE_GRIS_CROISEE = new BlockBase("laine_gris_croisee", Material.CLOTH, 5F, 5F, SoundType.CLOTH);
    public static final Block LAINE_JAUNE_CROISEE = new BlockBase("laine_jaune_croisee", Material.CLOTH, 5F, 5F, SoundType.CLOTH);
    public static final Block LAINE_MAGENTA_CROISEE = new BlockBase("laine_magenta_croisee", Material.CLOTH, 5F, 5F, SoundType.CLOTH);
    public static final Block LAINE_MARRON_CROISEE = new BlockBase("laine_marron_croisee", Material.CLOTH, 5F, 5F, SoundType.CLOTH);
    public static final Block LAINE_NOIRE_CROISEE = new BlockBase("laine_noire_croisee", Material.CLOTH, 5F, 5F, SoundType.CLOTH);
    public static final Block LAINE_ORANGE_CROISEE = new BlockBase("laine_orange_croisee", Material.CLOTH, 5F, 5F, SoundType.CLOTH);
    public static final Block LAINE_ROSE_CROISEE = new BlockBase("laine_rose_croisee", Material.CLOTH, 5F, 5F, SoundType.CLOTH);
    public static final Block LAINE_ROUGE_CROISEE = new BlockBase("laine_rouge_croisee", Material.CLOTH, 5F, 5F, SoundType.CLOTH);
    public static final Block LAINE_VERTE_CLAIRE_CROISEE = new BlockBase("laine_verte_claire_croisee", Material.CLOTH, 5F, 5F, SoundType.CLOTH);
    public static final Block LAINE_VERTE_CROISEE = new BlockBase("laine_verte_croisee", Material.CLOTH, 5F, 5F, SoundType.CLOTH);
    public static final Block LAINE_VIOLETTE_CROISEE = new BlockBase("laine_violette_croisee", Material.CLOTH, 5F, 5F, SoundType.CLOTH);

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
    public static final Block TRAPPE_EN_ACAJOU = new BlockTrappe("trappe_en_acajou", 2F, Material.WOOD);
    public static final Block TRAPPE_AJOUREE_EN_ACACIA = new BlockTrappe("trappe_ajouree_en_acacia", 2F, Material.WOOD);
    public static final Block TRAPPE_AJOUREE_EN_BOULEAU = new BlockTrappe("trappe_ajouree_en_bouleau", 2F, Material.WOOD);
    public static final Block TRAPPE_AJOUREE_EN_CHENE = new BlockTrappe("trappe_ajouree_en_chene", 2F, Material.WOOD);
    public static final Block TRAPPE_AJOUREE_EN_SAPIN = new BlockTrappe("trappe_ajouree_en_sapin", 2F, Material.WOOD);
    public static final Block TRAPPE_EN_ACACIA = new BlockTrappe("trappe_en_acacia", 2F, Material.WOOD);
    public static final Block TRAPPE_EN_BOULEAU = new BlockTrappe("trappe_en_bouleau", 2F, Material.WOOD);
    public static final Block TRAPPE_EN_CHENE_NOIR = new BlockTrappe("trappe_en_chene_noir", 2F, Material.WOOD);
    public static final Block TRAPPE_EN_SAPIN = new BlockTrappe("trappe_en_sapin", 2F, Material.WOOD);
    public static final Block TRAPPE_TRAVAILLEE_EN_CHENE_NOIR = new BlockTrappe("trappe_travaillee_en_chene_noir", 2F, Material.WOOD);
    public static final Block TRAPPE_TRAVAILLEE_EN_SAPIN = new BlockTrappe("trappe_travaillee_en_sapin", 2F, Material.WOOD);

    //BARRIERE
    public static final Block ANDESITE_FENCE = new BlockBarriere("andesite_fence", Material.ROCK, MapColor.STONE, 5F, 5F);
    public static final Block ANDESITEFENCE = new BlockBarriere("andesitefence", Material.ROCK, MapColor.STONE, 5F, 5F);
    public static final Block DIORITEFENCE = new BlockBarriere("dioritefence", Material.ROCK, MapColor.STONE, 5F, 5F);
    public static final Block GRANITEFENCE = new BlockBarriere("granitefence", Material.ROCK, MapColor.STONE, 5F, 5F);
    public static final Block LOGACACIAFENCE = new BlockBarriere("logacaciafence", Material.WOOD, MapColor.WOOD, 4F, 4F);
    public static final Block LOGBIGOAKFENCE = new BlockBarriere("logbigoakfence", Material.WOOD, MapColor.WOOD, 4F, 4F);
    public static final Block LOGBIRCHFENCE = new BlockBarriere("logbirchfence", Material.WOOD, MapColor.WOOD, 4F, 4F);
    public static final Block LOGJUNGLEFENCE = new BlockBarriere("logjunglefence", Material.WOOD, MapColor.WOOD, 4F, 4F);
    public static final Block LOGOAKFENCE = new BlockBarriere("logoakfence", Material.WOOD, MapColor.WOOD, 4F, 4F);
    public static final Block LOGSPRUCEFENCE = new BlockBarriere("logsprucefence", Material.WOOD, MapColor.WOOD, 4F, 4F);

    //MUR \!/ Créer le block de même composition avant
    public static final Block ANDESITE = new BlockBase("andesite", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block ANDESITEWALL = new BlockMur("andesite_wall", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block DIORITE = new BlockBase("diorite", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block DIORITEWALL = new BlockMur("diorite_wall", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block GRANITE = new BlockBase("granite", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block GRANITEWALL = new BlockMur("granite_wall", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block ACACIA = new BlockBase("acacia", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block WALLLEGACACIA = new BlockMur("acacia_wall", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block BIGOAK = new BlockBase("bigoak", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block WALLLEGBIGOAK = new BlockMur("bigoak_wall", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block BIRCH = new BlockBase("birch", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block WALLLEGBIRCH = new BlockMur("birch_wall", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block JUNGLE = new BlockBase("jungle", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block WALLLEGJUNGLE = new BlockMur("jungle_wall", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block OAK = new BlockBase("oak", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block WALLLEGOAK = new BlockMur("oak_wall", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block SPRUCE = new BlockBase("spruce", Material.WOOD, 5F, 5F, SoundType.WOOD);
    public static final Block WALLLEGSPRUCE = new BlockMur("spruce_wall", Material.WOOD, 5F, 5F, SoundType.WOOD);


    //TÂCHES
    public static final Block TACHE_DE_SANG = new BlockTache("tache_de_sang", Material.WOOD, 0.5F, 5F, SoundType.WOOD);
    public static final Block TACHE_EAU = new BlockTache("tache_d_eau", Material.WOOD, 0.5F, 0.5F, SoundType.WOOD);
    public static final Block TACHE_DE_BOUE = new BlockTache("tache_de_boue", Material.WOOD, 0.5F, 0.5F, SoundType.WOOD);
    public static final Block TACHE_DE_VOMI = new BlockTache("tache_de_vomi", Material.WOOD, 0.5F, 0.5F, SoundType.WOOD);
    public static final Block TACHE_D_URINE = new BlockTache("tache_d_urine", Material.WOOD, 0.5F, 0.5F, SoundType.WOOD);

    //PLANTATION \!/ Allez changer la graine correspondant dans init.ModItems en ItemGraine (faire ctrl+f pour la trouver) + register l'item ici, dans init() et register();
    public static final Block PLAN_DE_LIN = new BlocPlantesAgriculture("plan_de_lin", ModItems.GRAINE_LIN, ModItems.LIN);
    public static final Block PLAN_CELERI = new BlocPlantesBotaniste("plan_celeri", ModItems.GRAINE_CELERI, ModItems.CELERI_BRANCHE_CRU, 2, 2, 2);
    public static final Block PLAN_FENOUIL = new BlocPlantesBotaniste("plan_fenouil", ModItems.GRAINE_FENOUIL, ModItems.FENOUIL_CRU, 2, 2, 2);
    public static final Block PLAN_MAIS = new BlocPlantesAgriculture("plan_mais", ModItems.GRAINE_MAIS, ModItems.MAIS_CRU);
    public static final Block PLAN_NAVET = new BlocPlantesBotaniste("plan_navet", ModItems.GRAINE_NAVET, ModItems.NAVET_CRU, 2, 2, 2);
    public static final Block PLAN_ORGE = new BlocPlantesAgriculture("plan_orge", ModItems.GRAINE_ORGE, ModItems.ORGE);
    public static final Block PLAN_FRAISE = new BlocPlantesBotaniste("plan_fraise", ModItems.GRAINE_FRAISE, ModItems.FRAISE, 2, 2, 2);
    public static final Block PLAN_FRAMBOISE = new BlocPlantesBotaniste("plan_framboise", ModItems.GRAINE_FRAMBOISE, ModItems.FRAMBOISE, 2, 2, 2);
    public static final Block PLAN_MYRTILLE = new BlocPlantesBotaniste("plan_myrtille", ModItems.GRAINE_MYRTILLE, ModItems.MYRTILLES, 2, 2, 2);
    public static final Block PLAN_POIREAU = new BlocPlantesBotaniste("plan_poireau", ModItems.GRAINE_POIREAU, ModItems.POIREAU_CRU, 2, 2, 2);
    public static final Block PLAN_RADIS = new BlocPlantesBotaniste("plan_radis", ModItems.GRAINE_RADIS, ModItems.RADIS, 2, 2, 2);
    public static final Block PLAN_SALSIFI = new BlocPlantesBotaniste("plan_salsifi", ModItems.GRAINE_SALSIFI, ModItems.SALSIFI_CRU, 2, 2, 2);
    public static final Block PLAN_TOMATE = new BlocPlantesBotaniste("plan_tomate", ModItems.GRAINE_TOMATE, ModItems.TOMATE_CRU, 2, 2, 2);
    public static final Block PLAN_VIGNE_NOIRE = new BlocPlantesBotaniste("plan_vigne_noire", ModItems.GRAINE_VIGNE_NOIRE, ModItems.RAISIN_NOIR, 2, 2, 2);
    public static final Block PLAN_VIGNE_BLANCHE = new BlocPlantesBotaniste("plan_vigne_blanche", ModItems.GRAINE_VIGNE_BLANCHE, ModItems.RAISIN_BLANC, 2, 2, 2);
    public static final Block PLAN_EPINARD = new BlocPlantesBotaniste("plan_epinard", ModItems.GRAINE_EPINARD, ModItems.EPINARD_CRU, 2, 2, 2);
    public static final Block PLAN_CHOU = new BlocPlantesBotaniste("plan_chou", ModItems.GRAINE_CHOU, ModItems.CHOU_VERT_CRU, 2, 2, 2);
    public static final Block PLAN_THE = new BlocPlantesBotaniste("plan_the", ModItems.GRAINE_DE_THE, ModItems.FEUILLE_DE_THE, 2, 2, 2);
    public static final Block PLAN_SALADE = new BlocPlantesBotaniste("plan_salade", ModItems.GRAINE_SALADE, ModItems.SALADE, 2, 2, 2);
    public static final Block PLAN_ARTICHAUT = new BlocPlantesBotaniste("plan_artichaut", ModItems.GRAINE_ARTICHAUT, ModItems.ARTICHAUT_CRU, 2, 2, 2);
    public static final Block PLAN_BROCOLIS = new BlocPlantesBotaniste("plan_brocolis", ModItems.GRAINE_BROCOLIS, ModItems.BROCOLI_CRU, 2, 2, 2);
    public static final Block PLAN_ASPERGE = new BlocPlantesBotaniste("plan_asperge", ModItems.GRAINE_ASPERGE, ModItems.ASPERGE_CRU, 2, 2, 2);
    public static final Block PLAN_ENDIVE = new BlocPlantesBotaniste("plan_endive", ModItems.GRAINE_ENDIVE, ModItems.ENDIVE_CRU, 1, 2, 3);
    public static final Block PLAN_RIZ = new BlocPlantesBotaniste("plan_riz", ModItems.GRAINE_RIZ, ModItems.RIZ_CRU, 2, 2, 2);
    public static final Block PLAN_CHANVRE = new BlocPlantesBotaniste("plan_chanvre", ModItems.GRAINE_CHANVRE, ModItems.CHANVRE, 2, 2, 2);
    public static final Block PLAN_BLE = new BlocPlantesAgriculture("plan_ble", ModItems.GRAINE_BLE, ModItems.BLE);
    public static final Block PLAN_THYM = new BlocPlantesBotaniste("plan_thym", ModItems.GRAINE_THYM, ModItems.THYM, 2, 2, 2);

    //public static final Block PLAN_TEST = new BlockMushroom("plan_test" );

    public static final Block PLAN_BASILIC = new BlocPlantesBotaniste("plan_basilic", ModItems.GRAINE_BASILIC, ModItems.BASILIC2, 2, 2, 2);
    public static final Block PLAN_ANETH = new BlocPlantesBotaniste("plan_aneth", ModItems.GRAINE_ANETH, ModItems.ANETH2, 2, 2, 2);
    public static final Block PLAN_ANIS = new BlocPlantesBotaniste("plan_anis", ModItems.GRAINE_ANIS, ModItems.ANIS2, 2, 2, 2);
    public static final Block PLAN_BELLE_DE_NUIT = new BlocPlantesBotaniste("plan_belle_de_nuit", ModItems.GRAINE_BELLE_DE_NUIT, ModItems.BELLE_DE_NUIT2, 2, 2, 2);
    public static final Block PLAN_BLEUETS = new BlocPlantesBotaniste("plan_bleuets", ModItems.GRAINE_BLEUETS, ModItems.BLEUETS2, 2, 2, 2);
    public static final Block PLAN_BUISSON = new BlocPlantesBotaniste("plan_buisson", ModItems.GRAINE_BUISSON, ModItems.BUISSON2, 2, 2, 2);
    public static final Block PLAN_BUISSON_DE_FLEURS_BLANCHES = new BlocPlantesBotaniste("plan_buisson_de_fleurs_blanches", ModItems.GRAINE_BUISSON_DE_FLEURS_BLANCHES, ModItems.BUISSON_DE_FLEURS_BLANCHES2, 2, 2, 2);
    public static final Block PLAN_BUISSON_ETRANGE = new BlocPlantesBotaniste("plan_buisson_etrange", ModItems.GRAINE_BUISSON_ETRANGE, ModItems.BUISSON_ETRANGE2, 2, 2, 2);
    public static final Block PLAN_BUISSON_HERBEUX = new BlocPlantesBotaniste("plan_buisson_herbeux", ModItems.GRAINE_BUISSON_HERBEUX, ModItems.BUISSON_HERBEUX2, 2, 2, 2);
    public static final Block PLAN_CAMOMILLE = new BlocPlantesBotaniste("plan_camomille", ModItems.GRAINE_CAMOMILLE, ModItems.CAMOMILLE2, 2, 2, 2);
    public static final Block PLAN_CHARDON = new BlocPlantesBotaniste("plan_chardon", ModItems.GRAINE_CHARDON, ModItems.CHARDON2, 2, 2, 2);
    public static final Block PLAN_CIBOULETTE = new BlocPlantesBotaniste("plan_ciboulette", ModItems.GRAINE_CIBOULETTE, ModItems.CIBOULETTE2, 2, 2, 2);
    public static final Block PLAN_CLOCHETTES = new BlocPlantesBotaniste("plan_clochettes", ModItems.GRAINE_CLOCHETTES, ModItems.CLOCHETTES2, 2, 2, 2);
    public static final Block PLAN_COSMOS = new BlocPlantesBotaniste("plan_cosmos", ModItems.GRAINE_COSMOS, ModItems.COSMOS2, 2, 2, 2);
    public static final Block PLAN_ETOILE_DES_GLACIERS = new BlocPlantesBotaniste("plan_etoile_des_glaciers", ModItems.GRAINE_ETOILE_DES_GLACIERS, ModItems.ETOILE_DES_GLACIERS2, 2, 2, 2);
    public static final Block PLAN_GERANIUM = new BlocPlantesBotaniste("plan_geranium", ModItems.GRAINE_GERANIUM, ModItems.GERANIUM2, 2, 2, 2);
    public static final Block PLAN_GLYCINE = new BlocPlantesBotaniste("plan_glycine", ModItems.GRAINE_GLYCINE, ModItems.GLYCINE2, 2, 2, 2);
    public static final Block PLAN_GUI = new BlocPlantesBotaniste("plan_gui", ModItems.GRAINE_GUI, ModItems.GUI2, 2, 2, 2);
    public static final Block PLAN_GUZMANIAS = new BlocPlantesBotaniste("plan_guzmanias", ModItems.GRAINE_GUZMANIAS, ModItems.GUZMANIAS2, 2, 2, 2);
    public static final Block PLAN_HIBISCUS = new BlocPlantesBotaniste("plan_hibiscus", ModItems.GRAINE_HIBISCUS, ModItems.HIBISCUS2, 2, 2, 2);
    public static final Block PLAN_HORTENSIAS = new BlocPlantesBotaniste("plan_hortensias", ModItems.GRAINE_HORTENSIAS, ModItems.HORTENSIAS2, 2, 2, 2);
    public static final Block PLAN_HOUX = new BlocPlantesBotaniste("plan_houx", ModItems.GRAINE_HOUX, ModItems.HOUX2, 2, 2, 2);
    public static final Block PLAN_HYDRANGEE = new BlocPlantesBotaniste("plan_hydrangee", ModItems.GRAINE_HYDRANGEE, ModItems.HYDRANGEE2, 2, 2, 2);
    public static final Block PLAN_IRIS = new BlocPlantesBotaniste("plan_iris", ModItems.GRAINE_IRIS, ModItems.IRIS2, 2, 2, 2);
    public static final Block PLAN_JACINTHE_DES_BOIS = new BlocPlantesBotaniste("plan_jacinthe_des_bois", ModItems.GRAINE_JACINTHE_DES_BOIS, ModItems.JACINTHE_DES_BOIS2, 2, 2, 2);
    public static final Block PLAN_JASMIN = new BlocPlantesBotaniste("plan_jasmin", ModItems.GRAINE_JASMIN, ModItems.JASMIN2, 2, 2, 2);
    public static final Block PLAN_JOLI_BUISSON = new BlocPlantesBotaniste("plan_joli_buisson", ModItems.GRAINE_JOLI_BUISSON, ModItems.JOLI_BUISSON2, 2, 2, 2);
    public static final Block PLAN_JONQUILLE = new BlocPlantesBotaniste("plan_jonquille", ModItems.GRAINE_JONQUILLE, ModItems.JONQUILLE2, 2, 2, 2);
    public static final Block PLAN_LAURIER = new BlocPlantesBotaniste("plan_laurier", ModItems.GRAINE_LAURIER, ModItems.LAURIER2, 2, 2, 2);
    public static final Block PLAN_LAVANDE = new BlocPlantesBotaniste("plan_lavande", ModItems.GRAINE_LAVANDE, ModItems.LAVANDE2, 2, 2, 2);
    public static final Block PLAN_LYS = new BlocPlantesBotaniste("plan_lys", ModItems.GRAINE_LYS, ModItems.LYS2, 2, 2, 2);
    public static final Block PLAN_MANDRAGORE = new BlocPlantesBotaniste("plan_mandragore", ModItems.GRAINE_MANDRAGORE, ModItems.MANDRAGORE2, 2, 2, 2);
    public static final Block PLAN_MENTHE = new BlocPlantesBotaniste("plan_menthe", ModItems.GRAINE_MENTHE, ModItems.MENTHE2, 2, 2, 2);
    public static final Block PLAN_MUGUET = new BlocPlantesBotaniste("plan_muguet", ModItems.GRAINE_MUGUET, ModItems.MUGUET2, 2, 2, 2);
    public static final Block PLAN_MYOSOTIS = new BlocPlantesBotaniste("plan_myosotis", ModItems.GRAINE_MYOSOTIS, ModItems.MYOSOTIS2, 2, 2, 2);
    public static final Block PLAN_NARCISSES = new BlocPlantesBotaniste("plan_narcisses", ModItems.GRAINE_NARCISSES, ModItems.NARCISSES2, 2, 2, 2);
    public static final Block PLAN_RONCES = new BlocPlantesBotaniste("plan_ronces", ModItems.GRAINE_RONCES, ModItems.RONCES2, 2, 2, 2);
    public static final Block PLAN_OEILLETS = new BlocPlantesBotaniste("plan_oeillets", ModItems.GRAINE_OEILLETS, ModItems.OEILLETS2, 2, 2, 2);
    public static final Block PLAN_ORCHIDEE_ROSE = new BlocPlantesBotaniste("plan_orchidee_rose", ModItems.GRAINE_ORCHIDEE_ROSE, ModItems.ORCHIDEE_ROSE2, 2, 2, 2);
    public static final Block PLAN_PENSEES = new BlocPlantesBotaniste("plan_pensees", ModItems.GRAINE_PENSEES, ModItems.PENSEES2, 2, 2, 2);
    public static final Block PLAN_PERSIL = new BlocPlantesBotaniste("plan_persil", ModItems.GRAINE_PERSIL, ModItems.PERSIL2, 2, 2, 2);
    public static final Block PLAN_PIVOINE = new BlocPlantesBotaniste("plan_pivoine", ModItems.GRAINE_PIVOINE, ModItems.PIVOINE2, 2, 2, 2);
    public static final Block PLAN_PLANTE_ETRANGE = new BlocPlantesBotaniste("plan_plante_etrange", ModItems.GRAINE_PLANTE_ETRANGE, ModItems.PLANTE_ETRANGE2, 2, 2, 2);
    public static final Block PLAN_PLANTE_GRASSE_COLOREE = new BlocPlantesBotaniste("plan_plante_grasse_coloree", ModItems.GRAINE_PLANTE_GRASSE_COLOREE, ModItems.PLANTE_GRASSE_COLOREE2, 2, 2, 2);
    public static final Block PLAN_POIVRON_JAUNE = new BlocPlantesBotaniste("plan_poivron_jaune", ModItems.GRAINE_POIVRON_JAUNE, ModItems.POIVRON_JAUNE_M_CRU, 2, 2, 2);
    public static final Block PLAN_POIVRON_ORANGE = new BlocPlantesBotaniste("plan_poivron_orange", ModItems.GRAINE_POIVRON_ORANGE, ModItems.POIVRON_ORANGE2, 2, 2, 2);
    public static final Block PLAN_POIVRON_ROUGE = new BlocPlantesBotaniste("plan_poivron_rouge", ModItems.GRAINE_POIVRON_ROUGE, ModItems.POIVRON_ROUGE_M_CRU, 2, 2, 2);
    public static final Block PLAN_POIVRON_VERT = new BlocPlantesBotaniste("plan_poivron_vert", ModItems.GRAINE_POIVRON_VERT, ModItems.POIVRON_VERT_M_CRU, 2, 2, 2);
    public static final Block PLAN_ROMARIN = new BlocPlantesBotaniste("plan_romarin", ModItems.GRAINE_ROMARIN, ModItems.ROMARIN2, 2, 2, 2);
    public static final Block PLAN_SALICORNE = new BlocPlantesBotaniste("plan_salicorne", ModItems.GRAINE_SALICORNE, ModItems.SALICORNE2, 2, 2, 2);
    public static final Block PLAN_VERGE_D_OR = new BlocPlantesBotaniste("plan_verge_d_or", ModItems.GRAINE_VERGE_D_OR, ModItems.VERGE_D_OR2, 2, 2, 2);
    public static final Block PLAN_VERVEINE = new BlocPlantesBotaniste("plan_verveine", ModItems.GRAINE_VERVEINE, ModItems.VERVEINE2, 2, 2, 2);
    public static final Block PLAN_VIOLETTES = new BlocPlantesBotaniste("plan_violettes", ModItems.GRAINE_VIOLETTES, ModItems.VIOLETTES2, 2, 2, 2);
    public static final Block PLAN_ESTRAGON = new BlocPlantesBotaniste("plan_estragon", ModItems.GRAINE_ESTRAGON, ModItems.ESTRAGON, 2, 2, 2);
    public static final Block PLAN_PAVOT = new BlocPlantesBotaniste("plan_pavot", ModItems.GRAINE_PAVOT, ModItems.FLEUR_DE_PAVOT, 2, 2, 2);
    public static final Block PLAN_GIROFLIER = new BlocPlantesBotaniste("plan_giroflier", ModItems.GRAINE_GIROFLIER, ModItems.CLOU_DE_GIROFLE, 2, 2, 2);
    public static final Block PLAN_RHUBARBE = new BlocPlantesBotaniste("plan_rhubarbe", ModItems.GRAINE_RHUBARBE, ModItems.RHUBARBE, 2, 2, 2);
    public static final Block PLAN_SAUGE = new BlocPlantesBotaniste("plan_sauge", ModItems.GRAINE_SAUGE, ModItems.SAUGE, 2, 2, 2);
    public static final Block PLAN_SUREAU = new BlocPlantesBotaniste("plan_sureau", ModItems.GRAINE_SUREAU, ModItems.SUREAU, 2, 2, 2);


    //LUMINEUX
    public static final Block LANTERNE_JAUNE_ETEINTE = new BlockLantern("lanterne_jaune", false, Material.GLASS, 0.5F, 3F, SoundType.GLASS);
    public static final Block LANTERNE_JAUNE_ALLUMEE = new BlockLantern("lanterne_jaune", true, Material.GLASS, 0.5F, 3F, SoundType.GLASS);
    //public static final Block LUSTRE_ETEINT = new BlockLustre("lustre_eteint",false,Material.GLASS,0.5F,3F,SoundType.GLASS);
    public static final Block LUSTRE_ALUME = new BlockLustreTest("lustre_alume", Material.GLASS);


    //FLOWER POT \!/ Venir ajouter les plantes ici pour pouvoir les planter dans ces nouveaux pots ! (ctrl+f BASILIC dans le fichier BlockFlowerPot ;) ) + BlockStates et model à ajuster
    // public static final Block FLOWER_POT = new BlockFlowerPot("flower_pot_am");

    //BARIL
    public static final Block FUT_VIDE = new BlockFut("fut_vide", Material.WOOD, 1.5F, 1.5f, SoundType.WOOD);

    //CONTENEUR \!/ Il faut recréer Block, TileEntity, Container, Inventory, GUI, Registry dans util.handlers.RegistryHandler et gérer le GUIid du Block (onBlockActivated) dans le switch case du GUIHandler
    public static final Block ECRIN_A_BIJOUX = new BlockEcrinABijoux("ecrin_a_bijoux", Material.WOOD, 1.5F, 1.5F, SoundType.WOOD);

    // BLOCS CONTENEUR 3D

    //public static final Block BIBLIOTHEQUE = new BlockBase2("bibliotheque", Material.ROCK, 5F, 5F, SoundType.STONE);
    // static final Block ETAGERE_A_ROULEAUX = new BlockBase2("etagere_a_rouleaux", Material.ROCK, 5F, 5F, SoundType.STONE);
    //public static final Block RANGE_BOUTEILLE = new BlockBase2("range_bouteille", Material.ROCK, 5F, 5F, SoundType.STONE);
    //public static final Block RATELIER_DROIT = new BlockBase2("ratelier_droit", Material.ROCK, 5F, 5F, SoundType.STONE);

    // BLOC 3D JEU

    //public static final Block JEU_D_ECHEC = new BlockBase2("jeu_d_echec", Material.ROCK, 5F, 5F, SoundType.STONE);


    //Minerai
    public static final Block BLOC_MINERAI_ARGENT = new BlockBase("bloc_minerai_argent", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block BLOC_MINERAI_FER = new BlockBase("bloc_minerai_fer", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block BLOC_MINERAI_ETAIN = new BlockBase("bloc_minerai_etain", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block BLOC_MINERAI_PLOMB = new BlockBase("bloc_minerai_plomb", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block BLOC_MINERAI_CUIVRE = new BlockBase("bloc_minerai_cuivre", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block BLOC_MINERAI_SEL = new BlockBase("bloc_minerai_sel", Material.ROCK, 5F, 5F, SoundType.STONE);
    public static final Block BLOC_MINERAI_OR = new BlockBase("bloc_minerai_or", Material.ROCK, 5F, 5F, SoundType.STONE);


    // bloc 3d simple

    public static final Block PIEGE_A_LOUP = new BlockContainerPiegeLoup("piege_a_loup", Material.ROCK, 5F, 5F, SoundType.STONE, "am:piege_a_loup", 3, 3, 20, new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.15D, 1.0D), 3, false);
    public static final Block PORTE_MANTEAUX = new BlockContainerPorteManteau("porte_manteaux", Material.WOOD, 0.5F, 0.55F, SoundType.WOOD, "am:porte_manteaux", 12, 6, 1, new AxisAlignedBB(0.25D, 0.0D, 0.25D, 0.75D, 2.0D, 0.75D),4, false);
    // public static final Block AMPHORE = new BlockBase2("amphore", Material.ROCK, 5F, 5F, SoundType.STONE);
    //public static final Block ARMOIRE = new BlockBase2("armoire", Material.WOOD, 5F, 5F, SoundType.WOOD);
    //public static final Block COFFRE_EN_BOIS = new BlockBase2("coffre_en_bois", Material.WOOD, 5F, 5F, SoundType.WOOD);
    //public static final Block COUPE_DE_FRUITS = new BlockBase2("coupe_de_fruits", Material.WOOD, 5F, 5F, SoundType.WOOD);
    //public static final Block MEUBLE_HAUT = new BlockBase2("meuble_haut", Material.WOOD, 5F, 5F, SoundType.WOOD);
    //public static final Block NASSE_A_POISSON = new BlockBase2("nasse_a_poisson", Material.WOOD, 5F, 5F, SoundType.WOOD);
    //public static final Block RIDEAU_SIMPLE = new BlockBase2("rideau_simple", Material.CLOTH, 5F, 5F, SoundType.CLOTH);
    //public static final Block RIDEAUX_DOUBLES = new BlockBase2("rideaux_doubles", Material.CLOTH, 5F, 5F, SoundType.CLOTH);
    //public static final Block SAC_DE_DEBRIS = new BlockBase2("sac_de_debris", Material.ROCK, 5F, 5F, SoundType.STONE);
    //public static final Block TABLE_DE_CHEVET = new BlockBase2("table_de_chevet", Material.WOOD, 5F, 5F, SoundType.WOOD);
    //public static final Block TABOURET_EN_CUIR = new BlockBase2("tabouret_en_cuir", Material.WOOD, 5F, 5F, SoundType.WOOD);
    //public static final Block VASE = new BlockBase2("vase", Material.WOOD, 5F, 5F, SoundType.WOOD);
    //public static final Block BALANCOIRE_A_OISEAU = new BlockBase2("balancoire_a_oiseau", Material.ROCK, 5F, 5F, SoundType.STONE);


    //public static final Block CHAISE = new BlocChaise2("chaise", Material.WOOD, 5F, 5F, SoundType.WOOD);

    //public static final Block FAUTEUIL = new BlockBase2("fauteuil", Material.ROCK, 5F, 5F, SoundType.STONE);


    //public static final Block MIROIR_DROIT = new BlockBase2("miroir_droit", Material.ROCK, 5F, 5F, SoundType.STONE);
    //public static final Block MIROIR_ROND = new BlockBase2("miroir_rond", Material.ROCK, 5F, 5F, SoundType.STONE);
    //public static final Block PIEGE = new BlockBase2("piege", Material.ROCK, 5F, 5F, SoundType.STONE);

    //public static final Block SECHOIR_PLANTES = new BlockBase2("sechoir_plantes", Material.ROCK, 5F, 5F, SoundType.STONE);
    //public static final Block SECHOIR_POISSON = new BlockBase2("sechoir_poisson", Material.ROCK, 5F, 5F, SoundType.STONE);
    //public static final Block SECHOIR_SIMPLE_PAPIER = new BlockBase2("sechoir_simple_papier", Material.ROCK, 5F, 5F, SoundType.STONE);
    //public static final Block SECHOIR_VIANDES = new BlockBase2("sechoir_viandes", Material.ROCK, 5F, 5F, SoundType.STONE);


//GATEAU

    public static final Block BLEU_ENTIER = new Bleu("bleu_entier", 5F, 5F, SoundType.SLIME);
    public static final Block FROMAGE_ENTIER = new Fromage("fromage_entier", 5F, 5F, SoundType.SLIME);
    public static final Block BRIOCHE_ENTIERE = new Brioche("brioche_entiere", 5F, 5F, SoundType.SLIME);
    public static final Block FRAISIER_ENTIER = new Fraisier("fraisier_entier", 5F, 5F, SoundType.SLIME);
    public static final Block GATEAU_ENTIER = new Gateau("gateau_entier", 5F, 5F, SoundType.SLIME);
    //public static final Block JAMBON_ENTIER = new Gateau("jambon_entier", 5F, 5F, SoundType.SLIME);
    public static final Block PAIN_NOIR_ENTIER = new PainNoir("pain_noir_entier", 5F, 5F, SoundType.SLIME);
    public static final Block TARTE_ENTIERE = new Tarte("tarte_entiere", 5F, 5F, SoundType.SLIME);
    public static final Block TARTE_CITRON_ENTIERE = new TarteCitron("tarte_citron_entiere", 5F, 5F, SoundType.SLIME);
    public static final Block TARTE_FRUIT_ROUGE_ENTIERE = new TarteFruitRouge("tarte_fruit_rouge_entiere", 5F, 5F, SoundType.SLIME);
    public static final Block TARTE_MYRTILLE_ENTIERE = new TarteMyrtille("tarte_myrtille_entiere", 5F, 5F, SoundType.SLIME);
    public static final Block TOURTE_ENTIERE = new Tourte("tourte_entiere", 5F, 5F, SoundType.SLIME);

//fours

    //public static final Block SECHOIR_VIANDE = new BlockFourSechoir2("sechoir_viandes");
    //public static final Block SECHOIR_PLANTES = new BlockBase2("sechoir_plantes", Material.ROCK, 5F, 5F, SoundType.STONE);
    //public static final Block SECHOIR_POISSON = new BlockBase2("sechoir_poisson", Material.ROCK, 5F, 5F, SoundType.STONE);
    //public static final Block SECHOIR_SIMPLE_PAPIER = new BlockBase2("sechoir_simple_papier", Material.ROCK, 5F, 5F, SoundType.STONE);
    //public static final Block SECHOIR_VIANDES = new BlockBase2("sechoir_viandes", Material.ROCK, 5F, 5F, SoundType.STONE);


// BLOC Pour CHisel


   /* public static final Block BLOC_VERRE = new BlockBase3("bloc_verre");
    public static final Block BLOC_VERRE_BLANC = new BlockBase3("bloc_verre_blanc");
    public static final Block BLOC_VERRE_ORANGE = new BlockBase3("bloc_verre_orange");
    public static final Block BLOC_VERRE_MAGENTA = new BlockBase3("bloc_verre_magenta");
    public static final Block BLOC_VERRE_BLEU_CLAIR = new BlockBase3("bloc_verre_bleu_clair");
    public static final Block BLOC_VERRE_JAUNE = new BlockBase3("bloc_verre_jaune");
    public static final Block BLOC_VERRE_VERT_CLAIR = new BlockBase3("bloc_verre_vert_clair");
    public static final Block BLOC_VERRE_ROSE = new BlockBase3("bloc_verre_rose");
    public static final Block BLOC_VERRE_GRIS = new BlockBase3("bloc_verre_gris");
    public static final Block BLOC_VERRE_GRIS_CLAIR = new BlockBase3("bloc_verre_gris_clair");
    public static final Block BLOC_VERRE_CYAN = new BlockBase3("bloc_verre_cyan");
    public static final Block BLOC_VERRE_VIOLET = new BlockBase3("bloc_verre_violet");
    public static final Block BLOC_VERRE_BLEU = new BlockBase3("bloc_verre_bleu");
    public static final Block BLOC_VERRE_MARRON = new BlockBase3("bloc_verre_marron");
    public static final Block BLOC_VERRE_VERT = new BlockBase3("bloc_verre_vert");
    public static final Block BLOC_VERRE_ROUGE = new BlockBase3("bloc_verre_rouge");
    public static final Block BLOC_VERRE_NOIR = new BlockBase3("bloc_verre_noir");

    */


    /*public static final Block CHAISE_CHENE = new BlocChaise("chaise_chene", Material.WOOD, SoundType.WOOD);
    /**
     * Init the blocks
     */
    public static void init() {
        //dalles
        // DALLE_LAINE_MAGENTA = new DalleLaineMagenta.Half("dalle_laine_magenta",1F,1F, Material.CLOTH, SoundType.CLOTH);
        //DALLE_LAINE_MAGENTA_DOUBLE_SLAB = new DalleLaineMagenta.Double("dalle_laine_magenta_double_slab",1F,1F, Material.CLOTH, SoundType.CLOTH);
        /*DALLE_LAINE_BLEU = new DalleLaineBleu.Half("dalle_laine_bleu",1F,1F, Material.CLOTH, SoundType.CLOTH);
        DALLE_LAINE_BLEU_DOUBLE_SLAB = new DalleLaineBleu.Double("dalle_laine_bleu_double_slab",1F,1F, Material.CLOTH, SoundType.CLOTH);*/


        //cultures
        ModItems.GRAINE_LIN = new ItemGraine("graine_lin", ModBlocks.PLAN_DE_LIN, Blocks.FARMLAND);
        ModItems.GRAINE_CELERI = new ItemGraine("graine_celeri", ModBlocks.PLAN_CELERI, Blocks.FARMLAND);
        ModItems.GRAINE_FENOUIL = new ItemGraine("graine_fenouil", ModBlocks.PLAN_FENOUIL, Blocks.FARMLAND);
        ModItems.GRAINE_FRAISE = new ItemGraine("graine_fraise", ModBlocks.PLAN_FRAISE, Blocks.FARMLAND);
        ModItems.GRAINE_FRAMBOISE = new ItemGraine("graine_framboise", ModBlocks.PLAN_FRAMBOISE, Blocks.FARMLAND);
        ModItems.GRAINE_MAIS = new ItemGraine("graine_mais", ModBlocks.PLAN_MAIS, Blocks.FARMLAND);
        ModItems.GRAINE_MYRTILLE = new ItemGraine("graine_myrtille", ModBlocks.PLAN_MYRTILLE, Blocks.FARMLAND);
        ModItems.GRAINE_NAVET = new ItemGraine("graine_navet", ModBlocks.PLAN_NAVET, Blocks.FARMLAND);
        ModItems.GRAINE_ORGE = new ItemGraine("graine_orge", ModBlocks.PLAN_ORGE, Blocks.FARMLAND);
        ModItems.GRAINE_POIREAU = new ItemGraine("graine_poireau", ModBlocks.PLAN_POIREAU, Blocks.FARMLAND);
        ModItems.GRAINE_RADIS = new ItemGraine("graine_radis", ModBlocks.PLAN_RADIS, Blocks.FARMLAND);
        ModItems.GRAINE_SALSIFI = new ItemGraine("graine_salsifi", ModBlocks.PLAN_SALSIFI, Blocks.FARMLAND);
        ModItems.GRAINE_TOMATE = new ItemGraine("graine_tomate", ModBlocks.PLAN_TOMATE, Blocks.FARMLAND);
        ModItems.GRAINE_VIGNE_NOIRE = new ItemGraine("graine_vigne_noire", ModBlocks.PLAN_VIGNE_NOIRE, Blocks.FARMLAND);
        ModItems.GRAINE_VIGNE_BLANCHE = new ItemGraine("graine_vigne_blanche", ModBlocks.PLAN_VIGNE_BLANCHE, Blocks.FARMLAND);
        ModItems.GRAINE_CHOU = new ItemGraine("graine_chou", ModBlocks.PLAN_CHOU, Blocks.FARMLAND);
        ModItems.GRAINE_EPINARD = new ItemGraine("graine_epinard", ModBlocks.PLAN_EPINARD, Blocks.FARMLAND);
        ModItems.GRAINE_DE_THE = new ItemGraine("graine_the", ModBlocks.PLAN_THE, Blocks.FARMLAND);
        ModItems.GRAINE_SALADE = new ItemGraine("graine_salade", ModBlocks.PLAN_SALADE, Blocks.FARMLAND);
        ModItems.GRAINE_ARTICHAUT = new ItemGraine("graine_artichaut", ModBlocks.PLAN_ARTICHAUT, Blocks.FARMLAND);
        ModItems.GRAINE_BROCOLIS = new ItemGraine("graine_brocolis", ModBlocks.PLAN_BROCOLIS, Blocks.FARMLAND);
        ModItems.GRAINE_ASPERGE = new ItemGraine("graine_asperge", ModBlocks.PLAN_ASPERGE, Blocks.FARMLAND);
        ModItems.GRAINE_ENDIVE = new ItemGraine("graine_endive", ModBlocks.PLAN_ENDIVE, Blocks.FARMLAND);
        ModItems.GRAINE_RIZ = new ItemGraine("graine_riz", ModBlocks.PLAN_RIZ, Blocks.FARMLAND);
        ModItems.GRAINE_BLE = new ItemGraine("graine_ble", ModBlocks.PLAN_BLE, Blocks.FARMLAND);
        ModItems.GRAINE_THYM = new ItemGraine("graine_thym", ModBlocks.PLAN_THYM, Blocks.FARMLAND);
        ModItems.GRAINE_CHANVRE = new ItemGraine("GRAINE_CHANVRE", ModBlocks.PLAN_CHANVRE, Blocks.FARMLAND);
        ModItems.GRAINE_BASILIC = new ItemGraine("graine_basilic", ModBlocks.PLAN_BASILIC, Blocks.FARMLAND);
        ModItems.GRAINE_ANETH = new ItemGraine("graine_aneth", ModBlocks.PLAN_ANETH, Blocks.FARMLAND);
        ModItems.GRAINE_ANIS = new ItemGraine("graine_anis", ModBlocks.PLAN_ANIS, Blocks.FARMLAND);
        ModItems.GRAINE_BELLE_DE_NUIT = new ItemGraine("graine_belle_de_nuit", ModBlocks.PLAN_BELLE_DE_NUIT, Blocks.FARMLAND);
        ModItems.GRAINE_BLEUETS = new ItemGraine("graine_bleuets", ModBlocks.PLAN_BLEUETS, Blocks.FARMLAND);
        ModItems.GRAINE_BUISSON = new ItemGraine("graine_buisson", ModBlocks.PLAN_BUISSON, Blocks.FARMLAND);
        ModItems.GRAINE_BUISSON_DE_FLEURS_BLANCHES = new ItemGraine("graine_buisson_de_fleurs_blanches", ModBlocks.PLAN_BUISSON_DE_FLEURS_BLANCHES, Blocks.FARMLAND);
        ModItems.GRAINE_BUISSON_ETRANGE = new ItemGraine("graine_buisson_etrange", ModBlocks.PLAN_BUISSON_ETRANGE, Blocks.FARMLAND);
        ModItems.GRAINE_BUISSON_HERBEUX = new ItemGraine("graine_buisson_herbeux", ModBlocks.PLAN_BUISSON_HERBEUX, Blocks.FARMLAND);
        ModItems.GRAINE_CAMOMILLE = new ItemGraine("graine_camomille", ModBlocks.PLAN_CAMOMILLE, Blocks.FARMLAND);
        ModItems.GRAINE_CHARDON = new ItemGraine("graine_chardon", ModBlocks.PLAN_CHARDON, Blocks.FARMLAND);
        ModItems.GRAINE_CIBOULETTE = new ItemGraine("graine_ciboulette", ModBlocks.PLAN_CIBOULETTE, Blocks.FARMLAND);
        ModItems.GRAINE_CLOCHETTES = new ItemGraine("graine_clochettes", ModBlocks.PLAN_CLOCHETTES, Blocks.FARMLAND);
        ModItems.GRAINE_COSMOS = new ItemGraine("graine_cosmos", ModBlocks.PLAN_COSMOS, Blocks.FARMLAND);
        ModItems.GRAINE_ETOILE_DES_GLACIERS = new ItemGraine("graine_etoile_des_glaciers", ModBlocks.PLAN_ETOILE_DES_GLACIERS, Blocks.FARMLAND);
        ModItems.GRAINE_GERANIUM = new ItemGraine("graine_geranium", ModBlocks.PLAN_GERANIUM, Blocks.FARMLAND);
        ModItems.GRAINE_GLYCINE = new ItemGraine("graine_glycine", ModBlocks.PLAN_GLYCINE, Blocks.FARMLAND);
        ModItems.GRAINE_GUI = new ItemGraine("graine_gui", ModBlocks.PLAN_GUI, Blocks.FARMLAND);
        ModItems.GRAINE_GUZMANIAS = new ItemGraine("graine_guzmanias", ModBlocks.PLAN_GUZMANIAS, Blocks.FARMLAND);
        ModItems.GRAINE_HIBISCUS = new ItemGraine("graine_hibiscus", ModBlocks.PLAN_HIBISCUS, Blocks.FARMLAND);
        ModItems.GRAINE_HORTENSIAS = new ItemGraine("graine_hortensias", ModBlocks.PLAN_HORTENSIAS, Blocks.FARMLAND);
        ModItems.GRAINE_HOUX = new ItemGraine("graine_houx", ModBlocks.PLAN_HOUX, Blocks.FARMLAND);
        ModItems.GRAINE_HYDRANGEE = new ItemGraine("graine_hydrangee", ModBlocks.PLAN_HYDRANGEE, Blocks.FARMLAND);
        ModItems.GRAINE_IRIS = new ItemGraine("graine_iris", ModBlocks.PLAN_IRIS, Blocks.FARMLAND);
        ModItems.GRAINE_JACINTHE_DES_BOIS = new ItemGraine("graine_jacinthe_des_bois", ModBlocks.PLAN_JACINTHE_DES_BOIS, Blocks.FARMLAND);
        ModItems.GRAINE_JASMIN = new ItemGraine("graine_jasmin", ModBlocks.PLAN_JASMIN, Blocks.FARMLAND);
        ModItems.GRAINE_JOLI_BUISSON = new ItemGraine("graine_joli_buisson", ModBlocks.PLAN_JOLI_BUISSON, Blocks.FARMLAND);
        ModItems.GRAINE_JONQUILLE = new ItemGraine("graine_jonquille", ModBlocks.PLAN_JONQUILLE, Blocks.FARMLAND);
        ModItems.GRAINE_LAURIER = new ItemGraine("graine_laurier", ModBlocks.PLAN_LAURIER, Blocks.FARMLAND);
        ModItems.GRAINE_LAVANDE = new ItemGraine("graine_lavande", ModBlocks.PLAN_LAVANDE, Blocks.FARMLAND);
        ModItems.GRAINE_LYS = new ItemGraine("graine_lys", ModBlocks.PLAN_LYS, Blocks.FARMLAND);
        ModItems.GRAINE_MANDRAGORE = new ItemGraine("graine_mandragore", ModBlocks.PLAN_MANDRAGORE, Blocks.FARMLAND);
        ModItems.GRAINE_MENTHE = new ItemGraine("graine_menthe", ModBlocks.PLAN_MENTHE, Blocks.FARMLAND);
        ModItems.GRAINE_MUGUET = new ItemGraine("graine_muguet", ModBlocks.PLAN_MUGUET, Blocks.FARMLAND);
        ModItems.GRAINE_MYOSOTIS = new ItemGraine("graine_myosotis", ModBlocks.PLAN_MYOSOTIS, Blocks.FARMLAND);
        ModItems.GRAINE_NARCISSES = new ItemGraine("graine_narcisses", ModBlocks.PLAN_NARCISSES, Blocks.FARMLAND);
        ModItems.GRAINE_OEILLETS = new ItemGraine("graine_oeillets", ModBlocks.PLAN_OEILLETS, Blocks.FARMLAND);
        ModItems.GRAINE_ORCHIDEE_ROSE = new ItemGraine("graine_orchidee_rose", ModBlocks.PLAN_ORCHIDEE_ROSE, Blocks.FARMLAND);
        ModItems.GRAINE_PENSEES = new ItemGraine("graine_pensees", ModBlocks.PLAN_PENSEES, Blocks.FARMLAND);
        ModItems.GRAINE_PERSIL = new ItemGraine("graine_persil", ModBlocks.PLAN_PERSIL, Blocks.FARMLAND);
        ModItems.GRAINE_PIVOINE = new ItemGraine("graine_pivoine", ModBlocks.PLAN_PIVOINE, Blocks.FARMLAND);
        ModItems.GRAINE_PLANTE_ETRANGE = new ItemGraine("graine_plante_etrange", ModBlocks.PLAN_PLANTE_ETRANGE, Blocks.FARMLAND);
        ModItems.GRAINE_PLANTE_GRASSE_COLOREE = new ItemGraine("graine_plante_grasse_coloree", ModBlocks.PLAN_PLANTE_GRASSE_COLOREE, Blocks.FARMLAND);
        ModItems.GRAINE_POIVRON_JAUNE = new ItemGraine("graine_poivron_jaune", ModBlocks.PLAN_POIVRON_JAUNE, Blocks.FARMLAND);
        ModItems.GRAINE_POIVRON_ORANGE = new ItemGraine("graine_poivron_orange", ModBlocks.PLAN_POIVRON_ORANGE, Blocks.FARMLAND);
        ModItems.GRAINE_POIVRON_ROUGE = new ItemGraine("graine_poivron_rouge", ModBlocks.PLAN_POIVRON_ROUGE, Blocks.FARMLAND);
        ModItems.GRAINE_POIVRON_VERT = new ItemGraine("graine_poivron_vert", ModBlocks.PLAN_POIVRON_VERT, Blocks.FARMLAND);
        ModItems.GRAINE_ROMARIN = new ItemGraine("graine_romarin", ModBlocks.PLAN_ROMARIN, Blocks.FARMLAND);
        ModItems.GRAINE_RONCES = new ItemGraine("graine_ronces", ModBlocks.PLAN_RONCES, Blocks.FARMLAND);
        ModItems.GRAINE_SALICORNE = new ItemGraine("graine_salicorne", ModBlocks.PLAN_SALICORNE, Blocks.FARMLAND);
        ModItems.GRAINE_VERGE_D_OR = new ItemGraine("graine_verge_d_or", ModBlocks.PLAN_VERGE_D_OR, Blocks.FARMLAND);
        ModItems.GRAINE_VERVEINE = new ItemGraine("graine_verveine", ModBlocks.PLAN_VERVEINE, Blocks.FARMLAND);
        ModItems.GRAINE_VIOLETTES = new ItemGraine("graine_violettes", ModBlocks.PLAN_VIOLETTES, Blocks.FARMLAND);
        ModItems.GRAINE_ESTRAGON = new ItemGraine("graine_estragon", ModBlocks.PLAN_ESTRAGON, Blocks.FARMLAND);
        ModItems.GRAINE_PAVOT = new ItemGraine("graine_pavot", ModBlocks.PLAN_PAVOT, Blocks.FARMLAND);
        ModItems.GRAINE_GIROFLIER = new ItemGraine("graine_giroflier", ModBlocks.PLAN_GIROFLIER, Blocks.FARMLAND);
        ModItems.GRAINE_RHUBARBE = new ItemGraine("graine_rhubarbe", ModBlocks.PLAN_RHUBARBE, Blocks.FARMLAND);
        ModItems.GRAINE_SAUGE = new ItemGraine("graine_sauge", ModBlocks.PLAN_SAUGE, Blocks.FARMLAND);
        ModItems.GRAINE_SUREAU = new ItemGraine("graine_sureau", ModBlocks.PLAN_SUREAU, Blocks.FARMLAND);
        ModItems.GRAINE_THYM = new ItemGraine("graine_thym", ModBlocks.PLAN_THYM, Blocks.FARMLAND);
        ModItems.GRAINE_MANDRAGORE = new ItemGraine("graine_mandragore", ModBlocks.PLAN_MANDRAGORE, Blocks.FARMLAND);

    }

    /**
     * Register the blocks
     */
    public static void register() {


        //dalles


        //registerBlock(DALLE_LAINE_MAGENTA, new ItemSlab(DALLE_LAINE_MAGENTA,DALLE_LAINE_MAGENTA,DALLE_LAINE_MAGENTA_DOUBLE_SLAB));
        // ForgeRegistries.BLOCKS.register(DALLE_LAINE_MAGENTA_DOUBLE_SLAB);
        //registerBlock(DALLE_LAINE_BLEU, new ItemSlab(DALLE_LAINE_BLEU,DALLE_LAINE_BLEU,DALLE_LAINE_BLEU_DOUBLE_SLAB));
        // ForgeRegistries.BLOCKS.register(DALLE_LAINE_BLEU_DOUBLE_SLAB);

        //cultures


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
        registerItem(ModItems.GRAINE_BLE);

        //registerB(ModBlocks.CHAISE_CHENE, new ItemBlock(ModBlocks.CHAISE_CHENE));

        registerItem(ModItems.GRAINE_DE_THE);

        registerItem(ModItems.GRAINE_BASILIC);
        registerItem(ModItems.GRAINE_ANETH);
        registerItem(ModItems.GRAINE_ANIS);
        registerItem(ModItems.GRAINE_BELLE_DE_NUIT);
        registerItem(ModItems.GRAINE_BLEUETS);
        registerItem(ModItems.GRAINE_BUISSON);
        registerItem(ModItems.GRAINE_BUISSON_DE_FLEURS_BLANCHES);
        registerItem(ModItems.GRAINE_BUISSON_ETRANGE);
        registerItem(ModItems.GRAINE_BUISSON_HERBEUX);
        registerItem(ModItems.GRAINE_CAMOMILLE);
        registerItem(ModItems.GRAINE_CHARDON);
        registerItem(ModItems.GRAINE_CIBOULETTE);
        registerItem(ModItems.GRAINE_CLOCHETTES);
        registerItem(ModItems.GRAINE_COSMOS);
        registerItem(ModItems.GRAINE_ETOILE_DES_GLACIERS);
        registerItem(ModItems.GRAINE_GERANIUM);
        registerItem(ModItems.GRAINE_GLYCINE);
        registerItem(ModItems.GRAINE_GUI);
        registerItem(ModItems.GRAINE_GUZMANIAS);
        registerItem(ModItems.GRAINE_HIBISCUS);
        registerItem(ModItems.GRAINE_HORTENSIAS);
        registerItem(ModItems.GRAINE_HOUX);
        registerItem(ModItems.GRAINE_HYDRANGEE);
        registerItem(ModItems.GRAINE_IRIS);
        registerItem(ModItems.GRAINE_JACINTHE_DES_BOIS);
        registerItem(ModItems.GRAINE_JASMIN);
        registerItem(ModItems.GRAINE_JOLI_BUISSON);
        registerItem(ModItems.GRAINE_JONQUILLE);
        registerItem(ModItems.GRAINE_LAURIER);
        registerItem(ModItems.GRAINE_LAVANDE);
        registerItem(ModItems.GRAINE_LYS);
        registerItem(ModItems.GRAINE_MANDRAGORE);
        registerItem(ModItems.GRAINE_MENTHE);
        registerItem(ModItems.GRAINE_MUGUET);
        registerItem(ModItems.GRAINE_MYOSOTIS);
        registerItem(ModItems.GRAINE_NARCISSES);
        registerItem(ModItems.GRAINE_OEILLETS);
        registerItem(ModItems.GRAINE_ORCHIDEE_ROSE);
        registerItem(ModItems.GRAINE_PENSEES);
        registerItem(ModItems.GRAINE_PERSIL);
        registerItem(ModItems.GRAINE_PIVOINE);
        registerItem(ModItems.GRAINE_PLANTE_ETRANGE);
        registerItem(ModItems.GRAINE_PLANTE_GRASSE_COLOREE);
        registerItem(ModItems.GRAINE_POIVRON_JAUNE);
        registerItem(ModItems.GRAINE_POIVRON_ORANGE);
        registerItem(ModItems.GRAINE_POIVRON_ROUGE);
        registerItem(ModItems.GRAINE_POIVRON_VERT);
        registerItem(ModItems.GRAINE_ROMARIN);
        registerItem(ModItems.GRAINE_RONCES);
        registerItem(ModItems.GRAINE_SALICORNE);
        registerItem(ModItems.GRAINE_VERGE_D_OR);
        registerItem(ModItems.GRAINE_VERVEINE);
        registerItem(ModItems.GRAINE_VIOLETTES);
        registerItem(ModItems.GRAINE_ESTRAGON);
        registerItem(ModItems.GRAINE_PAVOT);
        registerItem(ModItems.GRAINE_GIROFLIER);
        registerItem(ModItems.GRAINE_RHUBARBE);
        registerItem(ModItems.GRAINE_SAUGE);
        registerItem(ModItems.GRAINE_SUREAU);
        registerItem(ModItems.GRAINE_THYM);
        registerItem(ModItems.GRAINE_MANDRAGORE);


    }

    public static void registerBlock(Block block) {
        ForgeRegistries.BLOCKS.register(block);
        block.setCreativeTab(ArcheMod.archeCreativeTabs);
        ItemBlock item = new ItemBlock(block);
        item.setRegistryName(block.getRegistryName());
        ForgeRegistries.ITEMS.register(item);

        ArcheMod.proxy.registerItemRenderer(Item.getItemFromBlock(block), 0, "inventory");
    }

    public static void registerBlock(Block block, ItemBlock itemBlock) {
        ForgeRegistries.BLOCKS.register(block);
        block.setCreativeTab(ArcheMod.archeCreativeTabs);
        itemBlock.setRegistryName(block.getRegistryName());
        ForgeRegistries.ITEMS.register(itemBlock);

        ArcheMod.proxy.registerItemRenderer(Item.getItemFromBlock(block), 0, "inventory");
    }

    public static void registerB(Block block, ItemBlock itemBlock) {
        ForgeRegistries.BLOCKS.register(block);
        block.setCreativeTab(ArcheMod.archeCreativeTabs);
        itemBlock.setRegistryName(block.getRegistryName());
        ForgeRegistries.ITEMS.register(itemBlock);

        ArcheMod.proxy.registerItemRenderer(Item.getItemFromBlock(block), 0, "inventory");
    }


    public static void registerItem(Item item) {
        ForgeRegistries.ITEMS.register(item);
        ArcheMod.proxy.registerItemRenderer(item, 0, "inventory");
    }

}