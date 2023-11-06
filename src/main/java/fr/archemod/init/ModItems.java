package fr.archemod.init;

import fr.archemod.items.*;
import fr.archemod.items.agriculture.GraineBle;
import fr.archemod.items.agriculture.GraineOrge;
import fr.archemod.items.peche.*;
import fr.archemod.items.tools.SeauBois;
import fr.archemod.items.tools.ToolAxe;
import fr.archemod.items.tools.ToolSword;
import fr.archemod.util.Reference;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import scala.xml.PrettyPrinter;

import java.util.ArrayList;
import java.util.List;

public class ModItems {
    public static final List<Item> ITEMS = new ArrayList<Item>();

    //Animal
    public static final Item APPAT_CHASSE_CARNIVORE = new ItemBase("appat_chasse_carnivore");
    public static final Item APPAT_CHASSE_HERBIVORE = new ItemBase("appat_chasse_herbivore");
    public static final Item APPAT_PECHE = new ItemBase("appat_peche");
    public static final Item CARAPACE_DE_TORTUE = new ItemBase("carapace_de_tortue");
    public static final Item CARCASSE_RONGEUR = new ItemBase("carcasse_rongeur");
    public static final Item CARCASSE_VOLAILLE = new ItemBase("carcasse_volaille");
    public static final Item CARCASSE_BOVIDE = new ItemBase("carcasse_bovide");
    public static final Item CARCASSE_CERVIDE = new ItemBase("carcasse_cervide");
    public static final Item CARCASSE_URSIDE = new ItemBase("carcasse_urside");
    public static final Item CARCASSE_CANIDE = new ItemBase("carcasse_canide");
    public static final Item CERVEAU = new ItemBase("cerveau");
    public static final Item CIRE = new ItemBase("cire");
    public static final Item COEUR = new ItemBase("coeur");
    public static final Item COQUILLE_D_OEUF = new ItemBase("coquille_d_oeuf");
    public static final Item CORNE = new ItemBase("corne");
    public static final Item CROC = new ItemBase("croc");
    public static final Item CROCHET = new ItemBase("crochet");
    public static final Item CUIR = new ItemBase("cuir");
    public static final Item DENT = new ItemBase("dent");
    public static final Item ECAILLE = new ItemBase("ecaille");
    public static final Item FOURRURE_BLANCHE = new ItemBase("fourrure_blanche");
    public static final Item FOURRURE_BRUNE = new ItemBase("fourrure_brune");
    public static final Item FOURRURE_GRISE = new ItemBase("fourrure_grise");
    public static final Item FOURRURE_MOUCHETEE = new ItemBase("fourrure_mouchetee");
    public static final Item FOURRURE_RAYEE = new ItemBase("fourrure_rayee");
    public static final Item FOURRURE_ROUSSE = new ItemBase("fourrure_rousse");
    public static final Item GRAISSE_ANIMALE = new ItemBase("graisse_animale");
    public static final Item GRIFFE = new ItemBase("griffe");
    public static final Item INSECTE_EN_BOCAL = new ItemInventory("insecte_en_bocal",15);
    public static final Item LAINE_BRUTE = new ItemBase("laine_brute");
    public static final Item LARVE = new ItemBase("larve");
    public static final Item PATTE = new ItemBase("patte");
    public static final Item PATTE_DE_GRENOUILLE = new ItemBase("patte_de_grenouille");
    public static final Item PEAU_DE_REPTILE = new ItemBase("peau_de_reptile");
    public static final Item POILS = new ItemBase("poils");
    public static final Item SERRE = new ItemBase("serre");
    public static final Item TRIPES = new ItemBase("tripes");
    public static final Item VER_A_SOIE = new ItemBase("ver_a_soie");
    public static final Item POCHE_DE_VENIN = new ItemBase("poche_de_venin");
    public static final Item OEUF_A_PLAT_CRU = new ItemBase("oeuf_a_plat_cru");
    public static final Item OEUF = new ItemTransformable("oeuf", new ArrayList(){{ add(COQUILLE_D_OEUF); add(OEUF_A_PLAT_CRU); }});
    public static final Item MEDUSE = new ItemBase("meduse");
    public static final Item CARCASSE_OISEAU = new ItemBase("carcasse_oiseau");
    public static final Item AILE_MEMBRANEUSE = new ItemBase("aile_membraneuse");
    public static final Item IVOIRE = new ItemBase("ivoire");

    // Minerais - Cailloux - matières premières
    public static final Item PEPITE_ACIER = new ItemBase("pepite_acier");
    public static final Item PEPITE_ARGENT = new ItemBase("pepite_argent");
    public static final Item PEPITE_BRONZE = new ItemBase("pepite_bronze");
    public static final Item PEPITE_CUIVRE = new ItemBase("pepite_cuivre");
    public static final Item PEPITE_ETAIN = new ItemBase("pepite_etain");
    public static final Item PEPITE_FER = new ItemBase("pepite_fer");
    public static final Item PEPITE_OR = new ItemBase("pepite_or");
    public static final Item PEPITE_PLOMB = new ItemBase("pepite_plomb");
    public static final Item CAILLOU = new ItemBase("caillou");
    public static final Item CAILLOU_DE_GRES = new ItemBase("caillou_de_gres");
    public static final Item CAILLOU_DE_GRES_ROUGE = new ItemBase("caillou_de_gres_rouge");
    public static final Item CAILLOU_DIORITE = new ItemBase("caillou_diorite");
    public static final Item CAILLOU_D_ANDESITE = new ItemBase("caillou_d_andesite");
    public static final Item CAILLOU_GRANITE = new ItemBase("caillou_granite");
    public static final Item EPONGE = new ItemBase("eponge");

    //DIVERS - MJ
    public static final Item BEBE = new ItemBase("bebe");
    public static final Item CENDRES = new ItemBase("cendres");
    public static final Item ENTRAVES = new ItemBase("entraves");
    public static final Item PAIN_MOISI = new ItemBase("pain_moisi");
    public static final Item PIECE_EN_ARGENT = new ItemBase("piece_en_argent", false);
    public static final Item PIECE_EN_BRONZE = new ItemBase("piece_en_bronze", false);
    public static final Item PIECE_EN_OR = new ItemBase("piece_en_or", false);
    public static final Item POURRITURE = new ItemBase("pourriture");
    public static final Item PRISME = new ItemBase("prisme");
    public static final Item SANG = new ItemBase("sang");
    public static final Item CANARD_LEURRE = new ItemBase("canard_leurre");
    public static final Item CORNE_DE_BRUME = new ItemBase("corne_de_brume");
    public static final Item TREFLE_A_QUATRE_FEUILLES = new ItemBase("trefle_a_quatre_feuilles");
    public static final Item DEBRIS_DE_VERRE = new ItemBase("debris_de_verre");

    public static final Item BOL_SALE = new ItemBase("bol_sale");
    public static final Item CHOPPE_EN_ARGILE_SALE = new ItemBase("choppe_en_argile_sale");
    public static final Item CHOPPE_EN_VERRE_SALE = new ItemBase("choppe_en_verre_sale");

    public static final Item TOKEN_STONE_BLACK = new ItemBase("token_stone_black");
    public static final Item TOKEN_STONE_BLANK = new ItemBase("token_stone_blank");
    public static final Item TOKEN_STONE_BLUE = new ItemBase("token_stone_blue");
    public static final Item TOKEN_STONE_BROWN = new ItemBase("token_stone_brown");
    public static final Item TOKEN_STONE_CYAN = new ItemBase("token_stone_cyan");
    public static final Item TOKEN_STONE_GRAY = new ItemBase("token_stone_gray");
    public static final Item TOKEN_STONE_GREEN = new ItemBase("token_stone_green");
    public static final Item TOKEN_STONE_LIGHT_BLUE = new ItemBase("token_stone_light_blue");
    public static final Item TOKEN_STONE_LIME = new ItemBase("token_stone_lime");
    public static final Item TOKEN_STONE_MAGENTA = new ItemBase("token_stone_magenta");
    public static final Item TOKEN_STONE_ORANGE = new ItemBase("token_stone_orange");
    public static final Item TOKEN_STONE_OVERLAY = new ItemBase("token_stone_overlay");
    public static final Item TOKEN_STONE_PINK = new ItemBase("token_stone_pink");
    public static final Item TOKEN_STONE_PURPLE = new ItemBase("token_stone_purple");
    public static final Item TOKEN_STONE_RED = new ItemBase("token_stone_red");
    public static final Item TOKEN_STONE_SILVER = new ItemBase("token_stone_silver");
    public static final Item TOKEN_STONE_WHITE = new ItemBase("token_stone_white");
    public static final Item TOKEN_STONE_YELLOW = new ItemBase("token_stone_yellow");

    //Couverts fourchette couteau cuilliere louche casseroles

    public static final Item COUTEAU_DE_TABLE_EN_FER = new ItemBase("couteau_de_table_en_fer");
    public static final Item COUTEAU_EN_ARGENT = new ItemBase("couteau_en_argent");
    public static final Item COUTEAU_EN_BOIS = new ItemBase("couteau_en_bois");
    public static final Item COUTEAU_EN_ETAIN = new ItemBase("couteau_en_etain");
    public static final Item COUTEAU_EN_OR = new ItemBase("couteau_en_or");

    public static final Item CUILLERE_EN_ARGENT = new ItemBase("cuillere_en_argent");
    public static final Item CUILLERE_EN_BOIS = new ItemBase("cuilliere_en_bois");
    public static final Item CUILLERE_EN_ETAIN = new ItemBase("cuillere_en_etain");
    public static final Item CUILLERE_EN_FER = new ItemBase("cuillere_en_fer");
    public static final Item CUILLERE_EN_OR = new ItemBase("cuillere_en_or");

    public static final Item FOURCHETTE_EN_ARGENT = new ItemBase("fourchette_en_argent");
    public static final Item FOURCHETTE_EN_BOIS = new ItemBase("fourchette_en_bois");
    public static final Item FOURCHETTE_EN_ETAIN = new ItemBase("fourchette_en_etain");
    public static final Item FOURCHETTE_EN_FER = new ItemBase("fourchette_en_fer");
    public static final Item FOURCHETTE_EN_OR = new ItemBase("fourchette_en_or");

    public static final Item GRANDE_CUILLERE_EN_BOIS = new ItemBase("grande_cuilliere_en_bois");

    public static final Item LOUCHE_EN_BOIS = new ItemBase("louche_en_bois");
    public static final Item LOUCHE_EN_FER = new ItemBase("louche_en_fer");


    public static final Item CASSEROLE = new ItemBase("casserole");
    public static final Item POELE = new ItemBase("poele");

    //OUTILS

    public static final Item FAUX = new ItemBase("faux");
    public static final Item RASOIR = new ItemConsommable("rasoir", 7);
    public static final Item AIGUILLE = new ItemBase("aiguille");
    public static final Item ARROSOIR = new ItemBase("arrosoir");
    public static final Item BALAI = new ItemConsommable("balai", 50);
    public static final Item PLUMEAU = new ItemConsommable("plumeau", 50);
    public static final Item CANNE_A_PECHE_TEST = new CustomFishingRod("canne_a_peche_test");
    public static final Item CANNE_DE_VERRIER = new ItemIngrediant("canne_de_verrier", Reference.DURABILITE_FER);
    public static final Item CISEAUX_A_BOIS = new ItemIngrediant("ciseaux_a_bois", Reference.DURABILITE_FER);
    public static final Item CISEAUX_DE_COUTURE = new ItemIngrediant("ciseaux_de_couture", Reference.DURABILITE_FER);
    public static final Item COUTEAU_ACIER = new ItemIngrediant("couteau_acier", Reference.DURABILITE_ACIER);
    public static final Item COUTEAU_EN_FER = new ItemIngrediant("couteau_en_fer", Reference.DURABILITE_FER);
    public static final Item EPUISETTE = new TestEpuisette3("epuisette");
    public static final Item FILET_INSECTE = new TestEpuisette3("filet_insecte");
    public static final Item FILET = new ItemBase("filet");
    public static final Item FOURCHE_EN_FER = new ItemIngrediant("fourche_en_fer", Reference.DURABILITE_FER);
    public static final Item HACHOIR = new ItemIngrediant("hachoir", Reference.DURABILITE_FER);
    public static final Item LIME_EN_ACIER = new ItemIngrediant("lime_en_acier", Reference.DURABILITE_ACIER);
    public static final Item LIME_EN_FER = new ItemIngrediant("lime_en_fer", Reference.DURABILITE_FER);
    public static final Item LOUPE = new ItemBase("loupe");
    public static final Item MAILLET = new ItemIngrediant("maillet", Reference.DURABILITE_FER);
    public static final Item MARTEAU_BURIN_EN_ACIER = new ItemIngrediant("marteau_burin_en_acier", Reference.DURABILITE_ACIER);
    public static final Item MARTEAU_BURIN_EN_FER = new ItemIngrediant("marteau_burin_en_fer", Reference.DURABILITE_FER);
    public static final Item MARTEAU_EN_ACIER = new ItemIngrediant("marteau_en_acier", Reference.DURABILITE_ACIER);
    public static final Item MARTEAU_EN_FER = new ItemIngrediant("marteau_en_fer", Reference.DURABILITE_FER);
    public static final Item MORTIER_PILON_EN_BOIS = new ItemIngrediant("mortier_pilon_en_bois", Reference.DURABILITE_BRONZE);
    public static final Item MORTIER_PILON_EN_PIERRE = new ItemIngrediant("mortier_pilon_en_pierre", Reference.DURABILITE_FER);
    public static final Item PELLE_A_PAIN = new ItemIngrediant("pelle_a_pain", Reference.DURABILITE_FER);
    public static final Item PINCES = new ItemIngrediant("pinces", Reference.DURABILITE_FER);
    public static final Item PIOLET = new ItemBase("piolet");
    public static final Item SCIE_EN_ACIER = new ItemIngrediant("scie_en_acier", Reference.DURABILITE_ACIER);
    public static final Item SCIE_EN_FER = new ItemIngrediant("scie_en_fer", Reference.DURABILITE_FER);
    public static final Item PETITE_CISAILLE = new ItemIngrediant("petite_cisaille", Reference.DURABILITE_BRONZE);
    public static final Item SERPE_EN_ACIER = new ItemIngrediant("serpe_en_acier", Reference.DURABILITE_ACIER);
    public static final Item SERPE_EN_FER = new ItemIngrediant("serpe_en_fer", Reference.DURABILITE_FER);
    public static final Item SPATULE = new ItemIngrediant("spatule", Reference.DURABILITE_FER);
    public static final Item TROUSSE_D_INGENIEUR_EN_ACIER = new ItemIngrediant("trousse_d_ingenieur_en_acier", Reference.DURABILITE_ACIER);
    public static final Item TROUSSE_D_INGENIEUR_EN_FER = new ItemIngrediant("trousse_d_ingenieur_en_fer", Reference.DURABILITE_FER);
    public static final Item COMPAS = new ItemBase("compas");
    public static final Item CADRE_TANNAGE = new ItemIngrediant("cadre_tannage", Reference.DURABILITE_BRONZE);

    //FOODS

    public static final Item ABRICOT = new ItemFoodBase("abricot", 1, 0.2F, false);
    public static final Item AIL = new ItemFoodBase("ail", 0, 0.2F, false);
    public static final Item AMANDES = new ItemFoodBase("amandes", 1, 0.2F, false);
    public static final Item ANANAS = new ItemFoodBase("ananas", 1, 0.2F, false);
    public static final Item ARTICHAUT = new ItemFoodBase("artichaut", 1, 0.2F, false);
    public static final Item ASPERGE = new ItemFoodBase("asperge", 1, 0.2F, false);
    public static final Item AUBERGINE = new ItemFoodBase("aubergine", 1, 0.2F, false);
    public static final Item AVOCAT = new ItemFoodBase("avocat", 1, 0.2F, false);
    public static final Item BANANE = new ItemFoodBase("banane", 1, 0.2F, false);
    public static final Item BEIGNET = new ItemFoodBase("beignet", 2, 0.2F, false);
    public static final Item BEIGNET_DE_CRABE = new ItemFoodBase("beignet_de_crabe", 2, 0.2F, false);
    public static final Item BEURRE = new ItemBase("beurre");
    public static final Item BISCUIT = new ItemFoodBase("biscuit", 1, 0.2F, false);
    public static final Item BISCUIT_AU_CHOCOLAT = new ItemFoodBase("biscuit_au_chocolat", 1, 0.2F, false);
    public static final Item BLEU = new ItemFoodBase("bleu", 4, 0.2F, false);
    public static final Item BOL_DE_GRUAU = new ItemContainer("bol_de_gruau", 8, 0.2F, false, ModItems.BOL_SALE, 0, true);
    public static final Item BOL_DE_POTAGE = new ItemContainer("bol_de_potage", 8, 0.2F, false, ModItems.BOL_SALE, 0, true);
    public static final Item BOL_DE_POT_AU_FEU = new ItemContainer("bol_de_pot_au_feu", 12, 0.2F, false, ModItems.BOL_SALE, 0, true);
    public static final Item BOL_DE_RAGOUT = new ItemContainer("bol_de_ragout", 12, 0.2F, false, ModItems.BOL_SALE, 0, true);
    public static final Item BOL_DE_RAGOUT_DE_CRUSTACES = new ItemContainer("bol_de_ragout_de_crustaces", 12, 0.2F, false, ModItems.BOL_SALE, 0, true);
    public static final Item BOL_DE_RAGOUT_DE_PATATES = new ItemContainer("bol_de_ragout_de_patates", 8, 0.2F, false, ModItems.BOL_SALE, 0, true);
    public static final Item BOL_DE_RAGOUT_DE_VIANDE = new ItemContainer("bol_de_ragout_de_viande", 12, 0.2F, false, ModItems.BOL_SALE, 0, true);
    public static final Item BOL_DE_RIZ = new ItemContainer("bol_de_riz", 8, 0.2F, false, ModItems.BOL_SALE, 0, true);
    public static final Item BOL_DE_SALADE_DE_FRUITS = new ItemContainer("bol_de_salade_de_fruits", 6, 0.2F, false, ModItems.BOL_SALE, 0, true);
    public static final Item BOL_DE_SOUPE_AVEC_CROUTONS = new ItemContainer("bol_de_soupe_avec_croutons", 12, 0.2F, false, ModItems.BOL_SALE, 0, true);
    public static final Item BOL_DE_SOUPE_DE_CHOUX = new ItemContainer("bol_de_soupe_de_choux", 8, 0.2F, false, ModItems.BOL_SALE, 0, true);
    public static final Item BOL_DE_SOUPE_DE_CITROUILLE = new ItemContainer("bol_de_soupe_de_citrouille", 8, 0.2F, false, ModItems.BOL_SALE, 0, true);
    public static final Item BOL_DE_SOUPE_DE_POIS = new ItemContainer("bol_de_soupe_de_pois", 8, 0.2F, false, ModItems.BOL_SALE, 0, true);
    public static final Item BOL_DE_SOUPE_DE_POISSON = new ItemContainer("bol_de_soupe_de_poisson", 8, 0.2F, false, ModItems.BOL_SALE, 0, true);
    public static final Item BOL_DE_SOUPE_DE_TOMATES = new ItemContainer("bol_de_soupe_de_tomates", 8, 0.2F, false, ModItems.BOL_SALE, 0, true);
    public static final Item BOL_DE_SOUPE_VERTE = new ItemContainer("bol_de_soupe_verte", 8, 0.2F, false, ModItems.BOL_SALE, 0, true);
    public static final Item BOUDIN = new ItemFoodBase("boudin", 4, 0.2F, false);
    public static final Item BRETZEL = new ItemFoodBase("bretzel", 4, 0.2F, false);
    public static final Item BRIOCHE = new ItemFoodBase("brioche", 4, 0.2F, false);
    public static final Item BROCHETTE_DE_VIANDE = new ItemFoodBase("brochette_de_viande", 6, 0.2F, false);
    public static final Item BROCOLI = new ItemFoodBase("brocoli", 1, 0.2F, false);
    public static final Item CAPRES = new ItemFoodBase("capres", 0, 0.2F, false);
    public static final Item CASSIS = new ItemFoodBase("cassis", 1, 0.2F, false);
    public static final Item CELERI_BRANCHE = new ItemFoodBase("celeri_branche", 1, 0.2F, false);
    public static final Item CEPES = new ItemFoodBase("cepes", 1, 0.2F, false);
    public static final Item CERISE = new ItemFoodBase("cerise", 1, 0.2F, false);
    public static final Item CHATAIGNE = new ItemFoodBase("chataigne", 1, 0.2F, false);
    public static final Item CHOCOLAT = new ItemFoodBase("chocolat", 1, 0.2F, false);
    public static final Item CHOU_A_LA_CREME = new ItemFoodBase("chou_a_la_creme", 2, 0.2F, false);
    public static final Item CHOU_FLEUR = new ItemFoodBase("chou_fleur", 1, 0.2F, false);
    public static final Item CITRON = new ItemFoodBase("citron", 1, 0.2F, false);
    public static final Item CLEMENTINE = new ItemFoodBase("clementine", 1, 0.2F, false);
    public static final Item CONCOMBRE = new ItemFoodBase("concombre", 1, 0.2F, false);
    public static final Item CORNICHON = new ItemFoodBase("cornichon", 1, 0.2F, false);
    public static final Item COURGE = new ItemFoodBase("courge", 1, 0.2F, false);
    public static final Item COURGETTE = new ItemFoodBase("courgette", 1, 0.2F, false);
    public static final Item CREME_FRAICHE = new ItemBase("creme_fraiche");
    public static final Item CREPE = new ItemFoodBase("crepe", 2, 0.2F, false);
    public static final Item CROISSANT = new ItemFoodBase("croissant", 2, 0.2F, false);
    public static final Item CUISSE_DE_GRENOUILLE_CUITE = new ItemFoodBase("cuisse_de_grenouille_cuite", 2, 0.2F, false);
    public static final Item DATTES = new ItemFoodBase("dattes", 1, 0.2F, false);
    public static final Item ENDIVE = new ItemFoodBase("endive", 1, 0.2F, false);
    public static final Item EPINARD = new ItemFoodBase("epinard", 1, 0.2F, false);
    public static final Item FENOUIL = new ItemFoodBase("fenouil", 1, 0.2F, false);
    public static final Item FIGUE = new ItemFoodBase("figue", 1, 0.2F, false);
    public static final Item FRAISE = new ItemFoodBase("fraise", 1, 0.2F, false);
    public static final Item FRAISIER = new ItemFoodBase("fraisier", 2, 0.2F, false);
    public static final Item FRAMBOISE = new ItemFoodBase("framboise", 1, 0.2F, false);
    public static final Item FROMAGE = new ItemFoodBase("fromage", 4, 0.2F, false);
    public static final Item GALETTE_DE_MAIS = new ItemFoodBase("galette_de_mais", 2, 0.2F, false);
    public static final Item GAUFFRE = new ItemFoodBase("gauffre", 2, 0.2F, false);
    public static final Item GROSEILLE = new ItemFoodBase("groseille", 1, 0.2F, false);
    public static final Item GROSEILLE_A_MACRO = new ItemFoodBase("groseille_a_macro", 1, 0.2F, false);
    public static final Item GROSSE_VIANDE_CUITE = new ItemFoodBase("grosse_viande_cuite", 6, 0.2F, false);
    public static final Item GROS_RAVIOLI = new ItemFoodBase("gros_ravioli", 6, 0.2F, false);
    public static final Item HARICOT_BLANC = new ItemFoodBase("haricot_blanc", 1, 0.2F, false);
    public static final Item HARICOT_ROUGE = new ItemFoodBase("haricot_rouge", 1, 0.2F, false);
    public static final Item HARICOT_VERT = new ItemFoodBase("haricot_vert", 1, 0.2F, false);
    public static final Item HUITRE_OUVERTE = new ItemFoodBase("huitre_ouverte", 2, 0.2F, false);
    public static final Item JAMBON_SEC = new ItemFoodBase("jambon_sec", 8, 0.2F, false);
    public static final Item KIWI = new ItemFoodBase("kiwi", 1, 0.2F, false);
    public static final Item LAMBEAU_DE_VIANDE_SECHEE = new ItemFoodBase("lambeau_de_viande_sechee", 4, 0.2F, false);
    public static final Item MAIS = new ItemFoodBase("mais", 1, 0.2F, false);
    public static final Item MIEL = new ItemFoodBase("miel", 1, 0.2F, false);
    public static final Item MORCEAU_DE_POISSON_CUIT = new ItemFoodBase("morceau_de_poisson_cuit", 4, 0.2F, false);
    public static final Item MORCEAU_DE_POULPE = new ItemFoodBase("morceau_de_poulpe", 4, 0.2F, false);
    public static final Item MURES = new ItemFoodBase("mures", 1, 0.2F, false);
    public static final Item MYRTILLES = new ItemFoodBase("myrtilles", 1, 0.2F, false);
    public static final Item NAVET = new ItemFoodBase("navet", 1, 0.2F, false);
    public static final Item NOIX = new ItemFoodBase("noix", 1, 0.2F, false);
    public static final Item NOIX_DE_COCO = new ItemFoodBase("noix_de_coco", 1, 0.2F, false);
    public static final Item OEUF_A_LA_COQUE = new ItemFoodBase("oeuf_a_la_coque", 4, 0.2F, false);
    public static final Item OEUF_A_PLAT = new ItemFoodBase("oeuf_a_plat", 4, 0.2F, false);
    public static final Item OEUF_DUR = new ItemFoodBase("oeuf_dur", 4, 0.2F, false);
    public static final Item OIGNON = new ItemFoodBase("oignon", 0, 0.2F, false);
    public static final Item OLIVES = new ItemFoodBase("olives", 1, 0.2F, false);
    public static final Item ORANGE = new ItemFoodBase("orange", 1, 0.2F, false);
    public static final Item PAIN_AU_CHOUX = new ItemFoodBase("pain_au_choux", 8, 0.2F, false);
    public static final Item PAIN_NOIR = new ItemFoodBase("pain_noir", 4, 0.2F, false);
    public static final Item PART_DE_GATEAU = new ItemFoodBase("part_de_gateau", 2, 0.2F, false);
    public static final Item PART_DE_TARTE = new ItemFoodBase("part_de_tarte", 2, 0.2F, false);
    public static final Item PART_DE_TARTE_AUX_FRUITS_ROUGES = new ItemFoodBase("part_de_tarte_aux_fruits_rouges", 2, 0.2F, false);
    public static final Item PART_DE_TARTE_AUX_MYRTILLES = new ItemFoodBase("part_de_tarte_aux_myrtilles", 2, 0.2F, false);
    public static final Item PART_DE_TARTE_AU_CITRON = new ItemFoodBase("part_de_tarte_au_citron", 2, 0.2F, false);
    public static final Item PART_DE_TOURTE = new ItemFoodBase("part_de_tourte", 2, 0.2F, false);
    public static final Item PATISSERIE = new ItemFoodBase("patisserie", 2, 0.2F, false);
    public static final Item PATISSERIES_COLOREES = new ItemFoodBase("patisseries_colorees", 2, 0.2F, false);
    public static final Item PATISSERIE_A_LA_PATE_D_AMANDE = new ItemFoodBase("patisserie_a_la_pate_d_amande", 2, 0.2F, false);
    public static final Item PECHE = new ItemFoodBase("peche", 1, 0.2F, false);
    public static final Item PETITE_VIANDE_CUITE = new ItemFoodBase("petite_viande_cuite", 4, 0.2F, false);
    public static final Item PETITE_VIANDE_DE_GIBIER_CUITE = new ItemFoodBase("petite_viande_de_gibier_cuite", 4, 0.2F, false);
    public static final Item PETITS_POIS = new ItemFoodBase("petits_pois", 1, 0.2F, false);
    public static final Item PETIT_PAIN = new ItemFoodBase("petit_pain", 4, 0.2F, false);
    public static final Item PIMENT = new ItemFoodBase("piment", 0, 0.2F, false);
    public static final Item POIRE = new ItemFoodBase("poire", 1, 0.2F, false);
    public static final Item POIREAU = new ItemFoodBase("poireau", 1, 0.2F, false);
    public static final Item POISSON_GRILLE = new ItemFoodBase("poisson_grille", 6, 0.2F, false);
    public static final Item POIVRON_JAUNE_FARCI = new ItemFoodBase("poivron_jaune_farci", 12, 0.2F, false);
    public static final Item POIVRON_JAUNE_M = new ItemFoodBase("poivron_jaune_m", 1, 0.2F, false);
    public static final Item POIVRON_ROUGE_FARCI = new ItemFoodBase("poivron_rouge_farci", 12, 0.2F, false);
    public static final Item POIVRON_ROUGE_M = new ItemFoodBase("poivron_rouge_m", 1, 0.2F, false);
    public static final Item POIVRON_VERT_FARCI = new ItemFoodBase("poivron_vert_farci", 12, 0.2F, false);
    public static final Item POIVRON_VERT_M = new ItemFoodBase("poivron_vert_m", 1, 0.2F, false);
    public static final Item POMME_DE_TERRE = new ItemFoodBase("pomme_de_terre", 1, 0.2F, false);
    public static final Item POMME_DE_TERRE_FARCIE = new ItemFoodBase("pomme_de_terre_farcie", 12, 0.2F, false);


    public static final Item POT_DE_CONFITURE_DE_FRUITS_ROUGES = new ItemIngrediant("pot_de_confiture_de_fruits_rouges", 7);
    public static final Item POT_DE_CONFITURE_DE_MYRTILLES = new ItemIngrediant("pot_de_confiture_de_myrtilles", 7);
    public static final Item POT_DE_CONFITURE_D_AGRUMES = new ItemIngrediant("pot_de_confiture_d_agrumes", 7);
    public static final Item POT_DE_MIEL = new ItemIngrediant("pot_de_miel", 7);
    public static final Item POULET_ROTI = new ItemFoodBase("poulet_roti", 8, 0.2F, false);
    public static final Item PRUNEAU = new ItemFoodBase("pruneau", 1, 0.2F, false);
    public static final Item RADIS = new ItemFoodBase("radis", 1, 0.2F, false);
    public static final Item RAISIN_BLANC = new ItemFoodBase("raisin_blanc", 1, 0.2F, false);
    public static final Item RAISIN_NOIR = new ItemFoodBase("raisin_noir", 1, 0.2F, false);
    public static final Item RELIGIEUSE_AU_CHOCOLAT = new ItemFoodBase("religieuse_au_chocolat", 2, 0.2F, false);
    public static final Item RIZ = new ItemFoodBase("riz", 1, 0.2F, false);
    public static final Item SALADE = new ItemFoodBase("salade", 1, 0.2F, false);
    public static final Item SALSIFI = new ItemFoodBase("salsifi", 1, 0.2F, false);
    public static final Item SAUCISSE = new ItemFoodBase("saucisse", 4, 0.2F, false);
    public static final Item TARTINE_DE_CONFITURE = new ItemFoodBase("tartine_de_confiture", 2, 0.2F, false);
    public static final Item TOMATE = new ItemFoodBase("tomate", 1, 0.2F, false);
    public static final Item TRANCHE_DE_BLEU = new ItemFoodBase("tranche_de_bleu", 2, 0.2F, false);
    public static final Item TRANCHE_DE_BRIOCHE = new ItemFoodBase("tranche_de_brioche", 4, 0.2F, false);
    public static final Item TRANCHE_DE_FROMAGE = new ItemFoodBase("tranche_de_fromage", 4, 0.2F, false);
    public static final Item TRANCHE_DE_MELON = new ItemFoodBase("tranche_de_melon", 1, 0.2F, false);
    public static final Item TRANCHE_DE_PASTEQUE = new ItemFoodBase("tranche_de_pasteque", 1, 0.2F, false);
    public static final Item VIANDE_CUITE = new ItemFoodBase("viande_cuite", 4, 0.2F, false);
    public static final Item VIANDE_DE_CETACE = new ItemFoodBase("viande_de_cetace", 4, 0.2F, false);
    public static final Item VIANDE_DE_GIBIER_CUITE = new ItemFoodBase("viande_de_gibier_cuite", 4, 0.2F, false);
    public static final Item VIANDE_DE_RAT_CUITE = new ItemFoodBase("viande_de_rat_cuite", 4, 0.2F, false);
    public static final Item VIANDE_DE_VOLAILLE_CUITE = new ItemFoodBase("viande_de_volaille_cuite", 4, 0.2F, false);
    public static final Item CREVETTE_GRISE_CUITE = new ItemFoodBase("crevette_grise_cuite", 2, 0.2F, false);
    public static final Item CREVETTE_ROSE_CUITE = new ItemFoodBase("crevette_rose_cuite", 2, 0.2F, false);
    public static final Item ECREVISSE_CUITE = new ItemFoodBase("ecrevisse_cuite", 2, 0.2F, false);
    public static final Item ECREVISSE_ORANGE_CUITE = new ItemFoodBase("ecrevisse_orange_cuite", 2, 0.2F, false);
    public static final Item COQUILLE_SAINT_JACQUES_CUITE = new ItemFoodBase("coquille_saint_jacques_cuite", 2, 0.2F, false);
    public static final Item CRABE_CUIT = new ItemFoodBase("crabe_cuit", 6, 0.2F, false);
    public static final Item HOMARD_CUIT = new ItemFoodBase("homard_cuit", 6, 0.2F, false);
    public static final Item PALOURDE_CUITE = new ItemFoodBase("palourde_cuite", 2, 0.2F, false);

    public static final Item ANGUILLE_CUITE = new ItemFoodBase("anguille_cuite", 4, 0.2F, false);
    public static final Item BROCHETTE_CALAMAR_CUITE = new ItemFoodBase("brochette_calamar_cuite", 6, 0.2F, false);
    public static final Item MOULE_MARINIERE_CUITE = new ItemFoodBase("moule_mariniere_cuite", 12, 0.2F, false);
    public static final Item OEUF_MIMOSA = new ItemFoodBase("oeuf_mimosa", 4, 0.2F, false);
    public static final Item TEMPURA_CUIT = new ItemFoodBase("tempura_cuit", 2, 0.2F, false);

    //FOODS CRU
    //public static final Item PART_DE_TOURTE_CRU = new ItemBase("part_de_tourte_cru");
    //public static final Item PETIT_PAIN_CRU = new ItemBase("petit_pain_cru");
    public static final Item ARTICHAUT_CRU = new ItemBase("artichaut_cru");
    public static final Item ASPERGE_CRU = new ItemBase("asperge_cru");
    public static final Item AUBERGINE_CRU = new ItemBase("aubergine_cru");
    public static final Item BEIGNET_CRU = new ItemBase("beignet_cru");
    public static final Item BEIGNET_DE_CRABE_CRU = new ItemBase("beignet_de_crabe_cru");
    public static final Item BISCUIT_AU_CHOCOLAT_CRU = new ItemBase("biscuit_au_chocolat_cru");
    public static final Item BISCUIT_CRU = new ItemBase("biscuit_cru");
    public static final Item BOL_DE_GRUAU_CRU = new ItemBase("bol_de_gruau_cru");
    public static final Item BOL_DE_POTAGE_CRU = new ItemBase("bol_de_potage_cru");
    public static final Item BOL_DE_POT_AU_FEU_CRU = new ItemBase("bol_de_pot_au_feu_cru");
    public static final Item BOL_DE_RAGOUT_CRU = new ItemBase("bol_de_ragout_cru");
    public static final Item BOL_DE_RAGOUT_DE_CRUSTACES_CRU = new ItemBase("bol_de_ragout_de_crustaces_cru");
    public static final Item BOL_DE_RAGOUT_DE_PATATES_CRU = new ItemBase("bol_de_ragout_de_patates_cru");
    public static final Item BOL_DE_RAGOUT_DE_VIANDE_CRU = new ItemBase("bol_de_ragout_de_viande_cru");
    public static final Item BOL_DE_RIZ_CRU = new ItemBase("bol_de_riz_cru");
    public static final Item BOL_DE_SOUPE_AVEC_CROUTONS_CRU = new ItemBase("bol_de_soupe_avec_croutons_cru");
    public static final Item BOL_DE_SOUPE_DE_CHOUX_CRU = new ItemBase("bol_de_soupe_de_choux_cru");
    public static final Item BOL_DE_SOUPE_DE_CITROUILLE_CRU = new ItemBase("bol_de_soupe_de_citrouille_cru");
    public static final Item BOL_DE_SOUPE_DE_POISSON_CRU = new ItemBase("bol_de_soupe_de_poisson_cru");
    public static final Item BOL_DE_SOUPE_DE_POIS_CRU = new ItemBase("bol_de_soupe_de_pois_cru");
    public static final Item BOL_DE_SOUPE_DE_TOMATES_CRU = new ItemBase("bol_de_soupe_de_tomates_cru");
    public static final Item BOL_DE_SOUPE_VERTE_CRU = new ItemBase("bol_de_soupe_verte_cru");
    public static final Item BOUDIN_CRU = new ItemBase("boudin_cru");
    public static final Item BRETZEL_CRU = new ItemBase("bretzel_cru");
    public static final Item BRIOCHE_CRU = new ItemBase("brioche_cru");
    public static final Item BROCHETTE_DE_VIANDE_CRU = new ItemBase("brochette_de_viande_cru");
    public static final Item BROCOLI_CRU = new ItemBase("brocoli_cru");
    public static final Item CELERI_BRANCHE_CRU = new ItemBase("celeri_branche_cru");
    public static final Item CHATAIGNE_CRU = new ItemBase("chataigne_cru");
    public static final Item CHOU_FLEUR_CRU = new ItemBase("chou_fleur_cru");
    public static final Item CHOU_VERT_CRU = new ItemBase("chou_vert_cru");
    public static final Item COURGETTE_CRU = new ItemBase("courgette_cru");
    public static final Item COURGE_CRU = new ItemBase("courge_cru");
    public static final Item CREPE_CRU = new ItemBase("crepe_cru");
    public static final Item CROISSANT_CRU = new ItemBase("croissant_cru");
    public static final Item CUISSE_DE_GRENOUILLE_CRU = new ItemBase("cuisse_de_grenouille_cru");
    public static final Item ENDIVE_CRU = new ItemBase("endive_cru");
    public static final Item EPINARD_CRU = new ItemBase("epinard_cru");
    public static final Item FENOUIL_CRU = new ItemBase("fenouil_cru");
    public static final Item GALETTE_DE_MAIS_CRU = new ItemBase("galette_de_mais_cru");
    public static final Item GAUFFRE_CRU = new ItemBase("gauffre_cru");
    public static final Item GROSSE_VIANDE_CRUE = new ItemBase("grosse_viande_crue");
    public static final Item GROS_RAVIOLI_CRU = new ItemBase("gros_ravioli_cru");
    public static final Item HARICOT_BLANC_CRU = new ItemBase("haricot_blanc_cru");
    public static final Item HARICOT_ROUGE_CRU = new ItemBase("haricot_rouge_cru");
    public static final Item HARICOT_VERT_CRU = new ItemBase("haricot_vert_cru");
    public static final Item LAMBEAU_DE_VIANDE_CRUE = new ItemBase("lambeau_de_viande_crue");
    public static final Item MAIS_CRU = new ItemBase("mais_cru");
    public static final Item MORCEAU_DE_POISSON_CRU = new ItemBase("morceau_de_poisson_cru");
    public static final Item CARCASSE_DE_POISSON = new ItemBase("carcasse_de_poisson");
    public static final Item MORCEAU_DE_POISSON = new ItemTransformable("morceau_de_poisson", new ArrayList() {{ add(CARCASSE_DE_POISSON); add(MORCEAU_DE_POISSON_CRU); }});
    public static final Item MORCEAU_DE_POULPE_CRU = new ItemBase("morceau_de_poulpe_cru");
    public static final Item NAVET_CRU = new ItemBase("navet_cru");
    public static final Item OEUF_A_LA_COQUE_CRU = new ItemBase("oeuf_a_la_coque_cru");
    public static final Item OEUF_DUR_CRU = new ItemBase("oeuf_dur_cru");
    public static final Item PAIN_AU_CHOUX_CRU = new ItemBase("pain_au_choux_cru");
    public static final Item PAIN_NOIR_CRU = new ItemBase("pain_noir_cru");
    public static final Item PATE_A_PAIN = new ItemBase("pate_a_pain");
    public static final Item PATISSERIES_COLOREES_CRU = new ItemBase("patisseries_colorees_cru");
    public static final Item PATISSERIE_A_LA_PATE_D_AMANDE_CRU = new ItemBase("patisserie_a_la_pate_d_amande_cru");
    public static final Item PATISSERIE_CRU = new ItemBase("patisserie_cru");
    public static final Item PETITE_VIANDE_CRUE = new ItemBase("petite_viande_crue");
    public static final Item PETITE_VIANDE_DE_GIBIER_CRUE = new ItemBase("petite_viande_de_gibier_crue");
    public static final Item PETITS_POIS_CRU = new ItemBase("petits_pois_cru");
    public static final Item POIREAU_CRU = new ItemBase("poireau_cru");

    public static final Item POIVRON_ORANGE_CRU =  new ItemBase("poivron_orange_cru");
    public static final Item POIVRON_JAUNE_FARCI_CRU = new ItemBase("poivron_jaune_farci_cru");
    public static final Item POIVRON_JAUNE_CRU = new ItemBase("poivron_jaune_m_cru");
    public static final Item POIVRON_ROUGE_FARCI_CRU = new ItemBase("poivron_rouge_farci_cru");
    public static final Item POIVRON_ROUGE_CRU = new ItemBase("poivron_rouge_m_cru");
    public static final Item POIVRON_VERT_FARCI_CRU = new ItemBase("poivron_vert_farci_cru");
    public static final Item POIVRON_VERT_CRU = new ItemBase("poivron_vert_m_cru");
    public static final Item POMME_DE_TERRE_CRU = new ItemBase("pomme_de_terre_cru");
    public static final Item POMME_DE_TERRE_FARCIE_CRU = new ItemBase("pomme_de_terre_farcie_cru");
    public static final Item POULET_CRU = new ItemBase("poulet_cru");
    public static final Item RIZ_CRU = new ItemBase("riz_cru");
    public static final Item SALSIFI_CRU = new ItemBase("salsifi_cru");
    public static final Item SAUCISSE_CRU = new ItemBase("saucisse_cru");
    public static final Item TOMATE_CRU = new ItemBase("tomate_cru");
    public static final Item VIANDE_CRUE = new ItemBase("viande_crue");
    public static final Item VIANDE_DE_GIBIER_CRUE = new ItemBase("viande_de_gibier_crue");
    public static final Item VIANDE_DE_RAT = new ItemBase("viande_de_rat");
    public static final Item VIANDE_DE_VOLAILLE_CRUE = new ItemBase("viande_de_volaille_crue");


    public static final Item TEMPURA_CRU = new ItemBase("tempura_cru");
    public static final Item MOULE_MARINIERE = new ItemBase("moule_mariniere");
    public static final Item BROCHETTE_CALAMAR = new ItemBase("brochette_calamar");

    //Champignons
    public static final Item CEPES_CRU = new ItemBase("cepes_cru");
    public static final Item AMANITE = new ItemBase("amanite");
    public static final Item BOLET_SATAN = new ItemBase("bolet_satan");
    public static final Item CORTINAIRE = new ItemBase("cortinaire");
    public static final Item GIROLLE = new ItemBase("girolle");
    public static final Item HELVELLE = new ItemBase("helvelle");
    public static final Item LEPIOTE = new ItemBase("lepiote");
    public static final Item MORILLE = new ItemBase("morille");
    public static final Item PLEUROTE = new ItemBase("pleurote");
    public static final Item REISHI = new ItemBase("reishi");
    public static final Item SHITAKE = new ItemBase("shitake");
    public static final Item TROMPETTE_MORT = new ItemBase("trompette_mort");
    public static final Item TRUFFE = new ItemBase("truffe");
    public static final Item VESSE_LOUP = new ItemBase("vesse_loup");
    public static final Item CHAMPIGNON_BRUN = new ItemBase("champignon_brun");
    public static final Item AGARIC_CHAMPETRE = new ItemBase("agaric_champetre");

    //Armes - TOOLS
    //public static final Item BATON_DE_MARCHE = new ToolSword("baton_de_marche",Item.ToolMaterial.IRON);
    public static final Item ARAKH_EN_ACIER = new ToolSword("arakh_en_acier", Item.ToolMaterial.IRON);
    public static final Item ARAKH_EN_FER = new ToolSword("arakh_en_fer", Item.ToolMaterial.IRON);
    public static final Item LANCE_FOUDRE = new ToolSword("lance_foudre", Item.ToolMaterial.IRON);
    public static final Item BATON_DE_COMBAT = new ToolSword("baton_de_combat", Item.ToolMaterial.IRON);
    public static final Item DAGUE_A_ROUELLES = new ItemBase("dague_a_rouelles");
    public static final Item DAGUE_A_ROUELLES_EN_ACIER = new ItemBase("dague_a_rouelles_en_acier");
    public static final Item DAGUE_EN_ACIER = new ToolSword("dague_en_acier", Item.ToolMaterial.IRON);
    public static final Item DAGUE_EN_BOIS = new ItemBase("dague_en_bois");
    public static final Item DAGUE_EN_FER = new ToolSword("dague_en_fer", Item.ToolMaterial.IRON);
    public static final Item EPEE_BATARDE_EN_ACIER = new ToolSword("epee_batarde_en_acier", Item.ToolMaterial.IRON);
    public static final Item EPEE_BATARDE_EN_FER = new ToolSword("epee_batarde_en_fer", Item.ToolMaterial.IRON);
    public static final Item EPEE_DEUX_MAINS_EN_ACIER = new ToolSword("epee_deux_mains_en_acier", Item.ToolMaterial.IRON);
    public static final Item EPEE_DEUX_MAINS_EN_FER = new ToolSword("epee_deux_mains_en_fer", Item.ToolMaterial.IRON);
    public static final Item EPEE_LONGUE_EN_BOIS = new ItemBase("epee_longue_en_bois");
    public static final Item FLAMEBERGE_EN_ACIER = new ToolSword("flamberge_en_acier", Item.ToolMaterial.IRON);
    public static final Item FLAMEBERGE_EN_FER = new ToolSword("flamberge_en_fer", Item.ToolMaterial.IRON);
    public static final Item FOUET = new ItemBase("fouet");
    public static final Item GLAIVE = new ItemBase("glaive");
    public static final Item GOURDIN_EN_BOIS = new ItemBase("gourdin_en_bois");
    public static final Item HACHE_D_ARMES_EN_FER = new ItemBase("hache_d_armes_en_fer");
    public static final Item HALLEBARDE_EN_ACIER = new ToolSword("hallebarde_en_acier", Item.ToolMaterial.IRON);
    public static final Item HALLEBARDE_EN_FER = new ToolSword("hallebarde_en_fer", Item.ToolMaterial.IRON);
    public static final Item JAVELOT_EN_ACIER = new ToolSword("javelot_en_acier", Item.ToolMaterial.IRON);
    public static final Item JAVELOT_EN_BOIS = new ToolSword("javelot_en_bois", Item.ToolMaterial.IRON);
    public static final Item JAVELOT_EN_FER = new ToolSword("javelot_en_fer", Item.ToolMaterial.IRON);
    public static final Item LANCE_CAILLOU = new ItemBase("lance_caillou");
    public static final Item LANCE_EN_ACIER = new ToolSword("lance_en_acier", Item.ToolMaterial.IRON);
    public static final Item LANCE_EN_FER = new ToolSword("lance_en_fer", Item.ToolMaterial.IRON);
    public static final Item LONG_BATON = new ItemBase("long_baton");
    public static final Item RAPIERE_EN_ACIER = new ToolSword("rapiere_en_acier", Item.ToolMaterial.IRON);
    public static final Item RAPIERE_EN_FER = new ToolSword("rapiere_en_fer", Item.ToolMaterial.IRON);
    public static final Item SABRE_EN_ACIER = new ToolSword("sabre_en_acier", Item.ToolMaterial.IRON);
    public static final Item SABRE_EN_BOIS = new ItemBase("sabre_en_bois");
    public static final Item SABRE_EN_FER = new ToolSword("sabre_en_fer", Item.ToolMaterial.IRON);
    public static final Item SCEPTRE_EN_OS = new ItemBase("sceptre_en_os");
    public static final Item STYLET_EN_ARGENT = new ItemIngrediant("stylet_en_argent", 7);
    public static final Item STYLET_EN_BRONZE = new ItemIngrediant("stylet_en_bronze", 7);
    public static final Item STYLET_EN_OR = new ItemIngrediant("stylet_en_or", 7);
    public static final ItemAxe HACHE_D_ARMES_EN_ACIER = new ToolAxe("hache_d_armes_en_acier", Item.ToolMaterial.IRON);

    // Graines Plantes

    public static Item GRAINE_PLANTE_GRASSE;
    public static Item GRAINE_BUIS;
    public static Item GRAINE_LIERRE_TERRESTRE;
    public static Item GRAINE_COQUELICOT;
    public static Item GRAINE_BOUTON_D_OR;
    public static Item GRAINE_TULIPE_ROUGE;
    public static Item GRAINE_TULIPE_ORANGE;
    public static Item GRAINE_TULIPE_ROSE;
    public static Item GRAINE_TULIPE_BLANCHE;
    public static Item GRAINE_AIL;
    public static Item GRAINE_OIGNON;
    public static Item GRAINE_ORCHIDEE_BLEUE;
    public static Item GRAINE_ROSIER;
    public static Item GRAINE_LIERRE_FLEURI;
    public static Item GRAINE_HAIE;
    //public static Item BUISSON_VER_A_SOIE;
    public static Item GRAINE_PISSENLIT;
    public static Item GRAINE_LILAS;
    public static Item GRAINE_TOURNESOL;
    public static Item GRAINE_ALLIUM;
    public static Item GRAINE_HOUSTONIE_BLEUE;

    public static Item GRAINE_CAPRE;

    // /\Ajouts/\
    public static Item GRAINE_ANETH;
    public static Item GRAINE_ANIS;
    public static Item GRAINE_BASILIC;
    public static Item GRAINE_BELLE_DE_NUIT;
    public static Item GRAINE_BLEUETS;
    public static Item GRAINE_BUISSON;
    public static Item GRAINE_BUISSON_DE_FLEURS_BLANCHES;
    public static Item GRAINE_BUISSON_ETRANGE;
    public static Item GRAINE_BUISSON_HERBEUX;
    public static Item GRAINE_CAMOMILLE;
    public static Item GRAINE_CHARDON;
    public static Item GRAINE_CIBOULETTE;
    public static Item GRAINE_CLOCHETTES;
    public static Item GRAINE_COSMOS;
    public static Item GRAINE_DE_THE;
    public static Item GRAINE_ESTRAGON;
    public static Item GRAINE_ETOILE_DES_GLACIERS;
    public static Item GRAINE_GERANIUM;
    public static Item GRAINE_GIROFLIER;
    public static Item GRAINE_GLYCINE;
    public static Item GRAINE_GUI;
    public static Item GRAINE_GUZMANIAS;
    public static Item GRAINE_HIBISCUS;
    public static Item GRAINE_HORTENSIAS;
    public static Item GRAINE_HOUX;
    public static Item GRAINE_HYDRANGEE;
    public static Item GRAINE_IRIS;
    public static Item GRAINE_JACINTHE_DES_BOIS;
    public static Item GRAINE_JASMIN;
    public static Item GRAINE_JOLI_BUISSON;
    public static Item GRAINE_JONQUILLE;
    public static Item GRAINE_LAURIER;
    public static Item GRAINE_LAVANDE;
    public static Item GRAINE_LYS;
    public static Item GRAINE_MANDRAGORE;
    public static Item GRAINE_MENTHE;
    public static Item GRAINE_MUGUET;
    public static Item GRAINE_MYOSOTIS;
    public static Item GRAINE_NARCISSES;
    public static Item GRAINE_OEILLETS;
    public static Item GRAINE_ORCHIDEE_ROSE;
    public static Item GRAINE_PAVOT;
    public static Item GRAINE_PENSEES;
    public static Item GRAINE_PERSIL;
    public static Item GRAINE_PIVOINE;
    public static Item GRAINE_PLANTE_ETRANGE;
    public static Item GRAINE_PLANTE_GRASSE_COLOREE;
    public static Item GRAINE_RHUBARBE;
    public static Item GRAINE_ROMARIN;
    public static Item GRAINE_RONCES;
    public static Item GRAINE_SALICORNE;
    public static Item GRAINE_SAUGE;
    public static Item GRAINE_SUREAU;
    public static Item GRAINE_THYM;
    public static Item GRAINE_VERGE_D_OR;
    public static Item GRAINE_VERVEINE;
    public static Item GRAINE_VIOLETTES;
    public static final Item GRAINE_DE_PAVOT = new ItemBase("graine_de_pavot");


    // Graines Plantes agriculture
    public static Item GRAINE_ARTICHAUT;
    public static Item GRAINE_ASPERGE;
    public static Item GRAINE_AUBERGINE;
    public static Item GRAINE_BLE;
    public static Item GRAINE_BROCOLIS;
    public static Item GRAINE_CELERI;
    public static Item GRAINE_CHANVRE;
    public static Item GRAINE_CHOU;
    public static Item GRAINE_ENDIVE;
    public static Item GRAINE_EPINARD;
    public static Item GRAINE_FENOUIL;
    public static Item GRAINE_FRAISE;
    public static Item GRAINE_FRAMBOISE;
    public static Item GRAINE_LIN;
    public static Item GRAINE_MAIS;
    public static Item GRAINE_MYRTILLE;
    public static Item GRAINE_NAVET;
    public static Item GRAINE_ORANGE;
    public static Item GRAINE_ORGE;
    public static Item GRAINE_POIREAU;
    public static Item GRAINE_POIVRON_JAUNE;
    public static Item GRAINE_POIVRON_ORANGE;
    public static Item GRAINE_POIVRON_ROUGE;
    public static Item GRAINE_POIVRON_VERT;
    public static Item GRAINE_RADIS;
    public static Item GRAINE_RIZ;
    public static Item GRAINE_SALADE;
    public static Item GRAINE_SALSIFI;
    public static Item GRAINE_TOMATE;
    public static Item GRAINE_VIGNE_BLANCHE;
    public static Item GRAINE_VIGNE_NOIRE;

    //champignons
    public static Item GRAINE_AMANITE;
    public static Item GRAINE_BOLET_SATAN;
    public static Item GRAINE_CEPE;
    public static Item GRAINE_CORTINAIRE;
    public static Item GRAINE_GIROLLE;
    public static Item GRAINE_HELVELLE;
    public static Item GRAINE_LEPIOTE;
    public static Item GRAINE_MORILLE;
    public static Item GRAINE_PLEUROTE;
    public static Item GRAINE_REISHI;
    public static Item GRAINE_SHITAKE;
    public static Item GRAINE_TROMPETTE_MORT;
    public static Item GRAINE_TRUFFE;
    public static Item GRAINE_VESSE_LOUP;
    public static Item GRAINE_CHAMPIGNON_BRUN;
    public static Item GRAINE_AGARIC_CHAMPETRE;

    // Ingé - rouages - serrures - mécanique

    public static final Item SABLIER_EN_CUIVRE = new ItemBase("sablier_en_cuivre");
    public static final Item SERRURE_ACIER = new ItemBase("serrure_acier");
    public static final Item SERRURE_BRONZE = new ItemBase("serrure_bronze");
    public static final Item SERRURE_FER = new ItemBase("serrure_fer");
    public static final Item ROUAGE = new ItemBase("rouage");
    public static final Item ROUAGE_COMPLEXE = new ItemBase("rouage_complexe");
    public static final Item ROUAGE_SOPHISTIQUE = new ItemBase("rouage_sophistique");
    public static final Item PALE_DE_MOULIN = new ItemBase("pale_de_moulin");
    public static final Item LONGUE_VUE = new ItemBase("longue_vue");
    public static final Item BALANCE_EN_CUIVRE = new ItemBase("balance_en_cuivre");
    public static final Item CLE_EN_ARGENT = new ItemBase("cle_en_argent");
    public static final Item SEXTAN = new ItemBase("sextan");
    public static final Item MONOCLE = new ItemBase("monocle");

    // Pierres taillées - Géodes
    public static final Item POUSSIERE_MINERALE = new ItemBase("poussiere_minerale");

    public static final Item GEODE_AIGUE_MARINE = new ItemBase("geode_aigue_marine");
    public static final Item GEODE_AMETHYSTE = new ItemBase("geode_amethyste");
    public static final Item GEODE_CORNALINE = new ItemBase("geode_cornaline");
    public static final Item GEODE_DIAMANT = new ItemBase("geode_diamant");
    public static final Item GEODE_EMERAUDE = new ItemBase("geode_emeraude");
    public static final Item GEODE_FLUORINE = new ItemBase("geode_fluorine");
    public static final Item GEODE_HEMATITE = new ItemBase("geode_hematite");
    public static final Item GEODE_JADE = new ItemBase("geode_jade");
    public static final Item GEODE_OEIL_DE_TIGRE = new ItemBase("geode_oeil_de_tigre");
    public static final Item GEODE_ONYX = new ItemBase("geode_onyx");
    public static final Item GEODE_OPALE = new ItemBase("geode_opale");
    public static final Item GEODE_RUBIS = new ItemBase("geode_rubis");
    public static final Item GEODE_SAPHIR = new ItemBase("geode_saphir");
    public static final Item GEODE_SPINELLE = new ItemBase("geode_spinelle");
    public static final Item GEODE_TURQUOISE = new ItemBase("geode_turquoise");

    public static final Item GEMME_INCONNUE = new ItemTransformableProbability("gemme_inconnue", new ArrayList() {{ add(POUSSIERE_MINERALE); }} , new ArrayList() {{
        add(GEODE_AMETHYSTE);
        add(GEODE_CORNALINE);
        add(GEODE_EMERAUDE);
        add(GEODE_FLUORINE);
        add(GEODE_HEMATITE);
        add(GEODE_JADE);
        add(GEODE_OPALE);
        add(GEODE_SPINELLE);
        add(GEODE_TURQUOISE);
        add(GEODE_AIGUE_MARINE);
        add(GEODE_OEIL_DE_TIGRE);
        add(GEODE_DIAMANT);
        add(GEODE_ONYX);
        add(GEODE_SAPHIR);
        add(GEODE_RUBIS); }});

    public static final Item GROSSE_GEODE_AIGUE_MARINE = new ItemBase("grosse_geode_aigue_marine");
    public static final Item GROSSE_GEODE_AMETHYSTE = new ItemBase("grosse_geode_amethyste");
    public static final Item GROSSE_GEODE_CORNALINE = new ItemBase("grosse_geode_cornaline");
    public static final Item GROSSE_GEODE_DIAMANT = new ItemBase("grosse_geode_diamant");
    public static final Item GROSSE_GEODE_EMERAUDE = new ItemBase("grosse_geode_emeraude");
    public static final Item GROSSE_GEODE_FLUORINE = new ItemBase("grosse_geode_fluorine");
    public static final Item GROSSE_GEODE_HEMATITE = new ItemBase("grosse_geode_hematite");
    public static final Item GROSSE_GEODE_JADE = new ItemBase("grosse_geode_jade");
    public static final Item GROSSE_GEODE_OEIL_DE_TIGRE = new ItemBase("grosse_geode_oeil_de_tigre");
    public static final Item GROSSE_GEODE_ONYX = new ItemBase("grosse_geode_onyx");
    public static final Item GROSSE_GEODE_OPALE = new ItemBase("grosse_geode_opale");
    public static final Item GROSSE_GEODE_RUBIS = new ItemBase("grosse_geode_rubis");
    public static final Item GROSSE_GEODE_SAPHIR = new ItemBase("grosse_geode_saphir");
    public static final Item GROSSE_GEODE_SPINELLE = new ItemBase("grosse_geode_spinelle");
    public static final Item GROSSE_GEODE_TURQUOISE = new ItemBase("grosse_geode_turquoise");

    public static final Item GROSSE_GEMME_INCONNUE = new ItemTransformableProbability("grosse_gemme_inconnue", new ArrayList() {{ add(POUSSIERE_MINERALE); }} , new ArrayList() {{
        add(GROSSE_GEODE_AMETHYSTE);
        add(GROSSE_GEODE_CORNALINE);
        add(GROSSE_GEODE_EMERAUDE);
        add(GROSSE_GEODE_FLUORINE);
        add(GROSSE_GEODE_HEMATITE);
        add(GROSSE_GEODE_JADE);
        add(GROSSE_GEODE_OPALE);
        add(GROSSE_GEODE_SPINELLE);
        add(GROSSE_GEODE_TURQUOISE);
        add(GROSSE_GEODE_AIGUE_MARINE);
        add(GROSSE_GEODE_OEIL_DE_TIGRE);
        add(GROSSE_GEODE_DIAMANT);
        add(GROSSE_GEODE_ONYX);
        add(GROSSE_GEODE_SAPHIR);
        add(GROSSE_GEODE_RUBIS); }});

    public static final Item PETITE_GEODE_AIGUE_MARINE = new ItemBase("petite_geode_aigue_marine");
    public static final Item PETITE_GEODE_AMETHYSTE = new ItemBase("petite_geode_amethyste");
    public static final Item PETITE_GEODE_CORNALINE = new ItemBase("petite_geode_cornaline");
    public static final Item PETITE_GEODE_DIAMANT = new ItemBase("petite_geode_diamant");
    public static final Item PETITE_GEODE_EMERAUDE = new ItemBase("petite_geode_emeraude");
    public static final Item PETITE_GEODE_FLUORINE = new ItemBase("petite_geode_fluorine");
    public static final Item PETITE_GEODE_HEMATITE = new ItemBase("petite_geode_hematite");
    public static final Item PETITE_GEODE_JADE = new ItemBase("petite_geode_jade");
    public static final Item PETITE_GEODE_OEIL_DE_TIGRE = new ItemBase("petite_geode_oeil_de_tigre");
    public static final Item PETITE_GEODE_ONYX = new ItemBase("petite_geode_onyx");
    public static final Item PETITE_GEODE_OPALE = new ItemBase("petite_geode_opale");
    public static final Item PETITE_GEODE_RUBIS = new ItemBase("petite_geode_rubis");
    public static final Item PETITE_GEODE_SAPHIR = new ItemBase("petite_geode_saphir");
    public static final Item PETITE_GEODE_SPINELLE = new ItemBase("petite_geode_spinelle");
    public static final Item PETITE_GEODE_TURQUOISE = new ItemBase("petite_geode_turquoise");

    public static final Item PETITE_GEMME_INCONNUE = new ItemTransformableProbability("petite_gemme_inconnue", new ArrayList() {{ add(POUSSIERE_MINERALE); }} , new ArrayList() {{
        add(PETITE_GEODE_AMETHYSTE);
        add(PETITE_GEODE_CORNALINE);
        add(PETITE_GEODE_EMERAUDE);
        add(PETITE_GEODE_FLUORINE);
        add(PETITE_GEODE_HEMATITE);
        add(PETITE_GEODE_JADE);
        add(PETITE_GEODE_OPALE);
        add(PETITE_GEODE_SPINELLE);
        add(PETITE_GEODE_TURQUOISE);
        add(PETITE_GEODE_AIGUE_MARINE);
        add(PETITE_GEODE_OEIL_DE_TIGRE);
        add(PETITE_GEODE_DIAMANT);
        add(PETITE_GEODE_ONYX);
        add(PETITE_GEODE_SAPHIR);
        add(PETITE_GEODE_RUBIS); }});

    public static final Item AIGUE_MARINE_TAILLE_ASSCHER = new ItemBase("aigue_marine_taille_asscher");
    public static final Item AIGUE_MARINE_TAILLE_BAGUETTE = new ItemBase("aigue_marine_taille_baguette");
    public static final Item AIGUE_MARINE_TAILLE_BRILLANT = new ItemBase("aigue_marine_taille_brillant");
    public static final Item AIGUE_MARINE_TAILLE_BRIOLETTE = new ItemBase("aigue_marine_taille_briolette");
    public static final Item AIGUE_MARINE_TAILLE_CABOCHON = new ItemBase("aigue_marine_taille_cabochon");
    public static final Item AIGUE_MARINE_TAILLE_CEYLAN = new ItemBase("aigue_marine_taille_ceylan");
    public static final Item AIGUE_MARINE_TAILLE_COEUR = new ItemBase("aigue_marine_taille_coeur");
    public static final Item AIGUE_MARINE_TAILLE_EMERAUDE = new ItemBase("aigue_marine_taille_emeraude");
    public static final Item AIGUE_MARINE_TAILLE_EN_ROSE = new ItemBase("aigue_marine_taille_en_rose");
    public static final Item AIGUE_MARINE_TAILLE_MARQUISE = new ItemBase("aigue_marine_taille_marquise");
    public static final Item AIGUE_MARINE_TAILLE_OVALE = new ItemBase("aigue_marine_taille_ovale");
    public static final Item AIGUE_MARINE_TAILLE_POIRE = new ItemBase("aigue_marine_taille_poire");
    public static final Item AIGUE_MARINE_TAILLE_PRINCESSE = new ItemBase("aigue_marine_taille_princesse");
    public static final Item AIGUE_MARINE_TAILLE_RADIANT = new ItemBase("aigue_marine_taille_radiant");
    public static final Item AIGUE_MARINE_TAILLE_TRIANGLE = new ItemBase("aigue_marine_taille_triangle");
    public static final Item AIGUE_MARINE_TAILLE_TRILLION = new ItemBase("aigue_marine_taille_trillion");

    public static final Item AMETHYSTE_TAILLE_ASSCHER = new ItemBase("amethyste_taille_asscher");
    public static final Item AMETHYSTE_TAILLE_BAGUETTE = new ItemBase("amethyste_taille_baguette");
    public static final Item AMETHYSTE_TAILLE_BRILLANT = new ItemBase("amethyste_taille_brillant");
    public static final Item AMETHYSTE_TAILLE_BRIOLETTE = new ItemBase("amethyste_taille_briolette");
    public static final Item AMETHYSTE_TAILLE_CABOCHON = new ItemBase("amethyste_taille_cabochon");
    public static final Item AMETHYSTE_TAILLE_CEYLAN = new ItemBase("amethyste_taille_ceylan");
    public static final Item AMETHYSTE_TAILLE_COEUR = new ItemBase("amethyste_taille_coeur");
    public static final Item AMETHYSTE_TAILLE_EMERAUDE = new ItemBase("amethyste_taille_emeraude");
    public static final Item AMETHYSTE_TAILLE_EN_ROSE = new ItemBase("amethyste_taille_en_rose");
    public static final Item AMETHYSTE_TAILLE_MARQUISE = new ItemBase("amethyste_taille_marquise");
    public static final Item AMETHYSTE_TAILLE_OVALE = new ItemBase("amethyste_taille_ovale");
    public static final Item AMETHYSTE_TAILLE_POIRE = new ItemBase("amethyste_taille_poire");
    public static final Item AMETHYSTE_TAILLE_PRINCESSE = new ItemBase("amethyste_taille_princesse");
    public static final Item AMETHYSTE_TAILLE_RADIANT = new ItemBase("amethyste_taille_radiant");
    public static final Item AMETHYSTE_TAILLE_TRIANGLE = new ItemBase("amethyste_taille_triangle");
    public static final Item AMETHYSTE_TAILLE_TRILLION = new ItemBase("amethyste_taille_trillion");

    public static final Item CORNALINE_TAILLE_ASSCHER = new ItemBase("cornaline_taille_asscher");
    public static final Item CORNALINE_TAILLE_BAGUETTE = new ItemBase("cornaline_taille_baguette");
    public static final Item CORNALINE_TAILLE_BRILLANT = new ItemBase("cornaline_taille_brillant");
    public static final Item CORNALINE_TAILLE_BRIOLETTE = new ItemBase("cornaline_taille_briolette");
    public static final Item CORNALINE_TAILLE_CABOCHON = new ItemBase("cornaline_taille_cabochon");
    public static final Item CORNALINE_TAILLE_CEYLAN = new ItemBase("cornaline_taille_ceylan");
    public static final Item CORNALINE_TAILLE_COEUR = new ItemBase("cornaline_taille_coeur");
    public static final Item CORNALINE_TAILLE_EMERAUDE = new ItemBase("cornaline_taille_emeraude");
    public static final Item CORNALINE_TAILLE_EN_ROSE = new ItemBase("cornaline_taille_en_rose");
    public static final Item CORNALINE_TAILLE_MARQUISE = new ItemBase("cornaline_taille_marquise");
    public static final Item CORNALINE_TAILLE_OVALE = new ItemBase("cornaline_taille_ovale");
    public static final Item CORNALINE_TAILLE_POIRE = new ItemBase("cornaline_taille_poire");
    public static final Item CORNALINE_TAILLE_PRINCESSE = new ItemBase("cornaline_taille_princesse");
    public static final Item CORNALINE_TAILLE_RADIANT = new ItemBase("cornaline_taille_radiant");
    public static final Item CORNALINE_TAILLE_TRIANGLE = new ItemBase("cornaline_taille_triangle");
    public static final Item CORNALINE_TAILLE_TRILLION = new ItemBase("cornaline_taille_trillion");

    public static final Item DIAMANT_TAILLE_ASSCHER = new ItemBase("diamant_taille_asscher");
    public static final Item DIAMANT_TAILLE_BAGUETTE = new ItemBase("diamant_taille_baguette");
    public static final Item DIAMANT_TAILLE_BRILLANT = new ItemBase("diamant_taille_brillant");
    public static final Item DIAMANT_TAILLE_BRIOLETTE = new ItemBase("diamant_taille_briolette");
    public static final Item DIAMANT_TAILLE_CABOCHON = new ItemBase("diamant_taille_cabochon");
    public static final Item DIAMANT_TAILLE_CEYLAN = new ItemBase("diamant_taille_ceylan");
    public static final Item DIAMANT_TAILLE_COEUR = new ItemBase("diamant_taille_coeur");
    public static final Item DIAMANT_TAILLE_EMERAUDE = new ItemBase("diamant_taille_emeraude");
    public static final Item DIAMANT_TAILLE_MARQUISE = new ItemBase("diamant_taille_marquise");
    public static final Item DIAMANT_TAILLE_OVALE = new ItemBase("diamant_taille_ovale");
    public static final Item DIAMANT_TAILLE_POIRE = new ItemBase("diamant_taille_poire");
    public static final Item DIAMANT_TAILLE_PRINCESSE = new ItemBase("diamant_taille_princesse");
    public static final Item DIAMANT_TAILLE_RADIANT = new ItemBase("diamant_taille_radiant");
    public static final Item DIAMANT_TAILLE_ROSE = new ItemBase("diamant_taille_rose");
    public static final Item DIAMANT_TAILLE_TRIANGLE = new ItemBase("diamant_taille_triangle");
    public static final Item DIAMANT_TAILLE_TRILLION = new ItemBase("diamant_taille_trillion");

    public static final Item EMERAUDE_TAILLE_ASSCHER = new ItemBase("emeraude_taille_asscher");
    public static final Item EMERAUDE_TAILLE_BAGUETTE = new ItemBase("emeraude_taille_baguette");
    public static final Item EMERAUDE_TAILLE_BRILLANT = new ItemBase("emeraude_taille_brillant");
    public static final Item EMERAUDE_TAILLE_BRIOLETTE = new ItemBase("emeraude_taille_briolette");
    public static final Item EMERAUDE_TAILLE_CABOCHON = new ItemBase("emeraude_taille_cabochon");
    public static final Item EMERAUDE_TAILLE_CEYLAN = new ItemBase("emeraude_taille_ceylan");
    public static final Item EMERAUDE_TAILLE_COEUR = new ItemBase("emeraude_taille_coeur");
    public static final Item EMERAUDE_TAILLE_EMERAUDE = new ItemBase("emeraude_taille_emeraude");
    public static final Item EMERAUDE_TAILLE_EN_ROSE = new ItemBase("emeraude_taille_en_rose");
    public static final Item EMERAUDE_TAILLE_MARQUISE = new ItemBase("emeraude_taille_marquise");
    public static final Item EMERAUDE_TAILLE_OVALE = new ItemBase("emeraude_taille_ovale");
    public static final Item EMERAUDE_TAILLE_POIRE = new ItemBase("emeraude_taille_poire");
    public static final Item EMERAUDE_TAILLE_PRINCESSE = new ItemBase("emeraude_taille_princesse");
    public static final Item EMERAUDE_TAILLE_RADIANT = new ItemBase("emeraude_taille_radiant");
    public static final Item EMERAUDE_TAILLE_TRIANGLE = new ItemBase("emeraude_taille_triangle");
    public static final Item EMERAUDE_TAILLE_TRILLION = new ItemBase("emeraude_taille_trillion");

    public static final Item FLUORINE_TAILLE_ASSCHER = new ItemBase("fluorine_taille_asscher");
    public static final Item FLUORINE_TAILLE_BAGUETTE = new ItemBase("fluorine_taille_baguette");
    public static final Item FLUORINE_TAILLE_BRILLANT = new ItemBase("fluorine_taille_brillant");
    public static final Item FLUORINE_TAILLE_BRIOLETTE = new ItemBase("fluorine_taille_briolette");
    public static final Item FLUORINE_TAILLE_CABOCHON = new ItemBase("fluorine_taille_cabochon");
    public static final Item FLUORINE_TAILLE_CEYLAN = new ItemBase("fluorine_taille_ceylan");
    public static final Item FLUORINE_TAILLE_COEUR = new ItemBase("fluorine_taille_coeur");
    public static final Item FLUORINE_TAILLE_EMERAUDE = new ItemBase("fluorine_taille_emeraude");
    public static final Item FLUORINE_TAILLE_EN_ROSE = new ItemBase("fluorine_taille_en_rose");
    public static final Item FLUORINE_TAILLE_MARQUISE = new ItemBase("fluorine_taille_marquise");
    public static final Item FLUORINE_TAILLE_OVALE = new ItemBase("fluorine_taille_ovale");
    public static final Item FLUORINE_TAILLE_POIRE = new ItemBase("fluorine_taille_poire");
    public static final Item FLUORINE_TAILLE_PRINCESSE = new ItemBase("fluorine_taille_princesse");
    public static final Item FLUORINE_TAILLE_RADIANT = new ItemBase("fluorine_taille_radiant");
    public static final Item FLUORINE_TAILLE_TRIANGLE = new ItemBase("fluorine_taille_triangle");
    public static final Item FLUORINE_TAILLE_TRILLION = new ItemBase("fluorine_taille_trillion");

    public static final Item HEMATITE_TAILLE_ASSCHER = new ItemBase("hematite_taille_asscher");
    public static final Item HEMATITE_TAILLE_BAGUETTE = new ItemBase("hematite_taille_baguette");
    public static final Item HEMATITE_TAILLE_BRILLANT = new ItemBase("hematite_taille_brillant");
    public static final Item HEMATITE_TAILLE_BRIOLETTE = new ItemBase("hematite_taille_briolette");
    public static final Item HEMATITE_TAILLE_CABOCHON = new ItemBase("hematite_taille_cabochon");
    public static final Item HEMATITE_TAILLE_CEYLAN = new ItemBase("hematite_taille_ceylan");
    public static final Item HEMATITE_TAILLE_COEUR = new ItemBase("hematite_taille_coeur");
    public static final Item HEMATITE_TAILLE_EMERAUDE = new ItemBase("hematite_taille_emeraude");
    public static final Item HEMATITE_TAILLE_EN_ROSE = new ItemBase("hematite_taille_en_rose");
    public static final Item HEMATITE_TAILLE_MARQUISE = new ItemBase("hematite_taille_marquise");
    public static final Item HEMATITE_TAILLE_OVALE = new ItemBase("hematite_taille_ovale");
    public static final Item HEMATITE_TAILLE_POIRE = new ItemBase("hematite_taille_poire");
    public static final Item HEMATITE_TAILLE_PRINCESSE = new ItemBase("hematite_taille_princesse");
    public static final Item HEMATITE_TAILLE_RADIANT = new ItemBase("hematite_taille_radiant");
    public static final Item HEMATITE_TAILLE_TRIANGLE = new ItemBase("hematite_taille_triangle");
    public static final Item HEMATITE_TAILLE_TRILLION = new ItemBase("hematite_taille_trillion");
    public static final Item HEMATITE_TAILLE__EN_ROSE = new ItemBase("hematite_taille__en_rose");

    public static final Item JADE_TAILLE_ASSCHER = new ItemBase("jade_taille_asscher");
    public static final Item JADE_TAILLE_BAGUETTE = new ItemBase("jade_taille_baguette");
    public static final Item JADE_TAILLE_BRILLANT = new ItemBase("jade_taille_brillant");
    public static final Item JADE_TAILLE_BRIOLETTE = new ItemBase("jade_taille_briolette");
    public static final Item JADE_TAILLE_CABOCHON = new ItemBase("jade_taille_cabochon");
    public static final Item JADE_TAILLE_CEYLAN = new ItemBase("jade_taille_ceylan");
    public static final Item JADE_TAILLE_COEUR = new ItemBase("jade_taille_coeur");
    public static final Item JADE_TAILLE_EMERAUDE = new ItemBase("jade_taille_emeraude");
    public static final Item JADE_TAILLE_EN_ROSE = new ItemBase("jade_taille_en_rose");
    public static final Item JADE_TAILLE_MARQUISE = new ItemBase("jade_taille_marquise");
    public static final Item JADE_TAILLE_OVALE = new ItemBase("jade_taille_ovale");
    public static final Item JADE_TAILLE_POIRE = new ItemBase("jade_taille_poire");
    public static final Item JADE_TAILLE_PRINCESSE = new ItemBase("jade_taille_princesse");
    public static final Item JADE_TAILLE_RADIANT = new ItemBase("jade_taille_radiant");
    public static final Item JADE_TAILLE_TRIANGLE = new ItemBase("jade_taille_triangle");
    public static final Item JADE_TAILLE_TRILLION = new ItemBase("jade_taille_trillion");

    public static final Item OEIL_DE_TIGRE_TAILLE_ASSCHER = new ItemBase("oeil_de_tigre_taille_asscher");
    public static final Item OEIL_DE_TIGRE_TAILLE_BAGUETTE = new ItemBase("oeil_de_tigre_taille_baguette");
    public static final Item OEIL_DE_TIGRE_TAILLE_BRILLANT = new ItemBase("oeil_de_tigre_taille_brillant");
    public static final Item OEIL_DE_TIGRE_TAILLE_BRIOLETTE = new ItemBase("oeil_de_tigre_taille_briolette");
    public static final Item OEIL_DE_TIGRE_TAILLE_CABOCHON = new ItemBase("oeil_de_tigre_taille_cabochon");
    public static final Item OEIL_DE_TIGRE_TAILLE_CEYLAN = new ItemBase("oeil_de_tigre_taille_ceylan");
    public static final Item OEIL_DE_TIGRE_TAILLE_COEUR = new ItemBase("oeil_de_tigre_taille_coeur");
    public static final Item OEIL_DE_TIGRE_TAILLE_EMERAUDE = new ItemBase("oeil_de_tigre_taille_emeraude");
    public static final Item OEIL_DE_TIGRE_TAILLE_EN_ROSE = new ItemBase("oeil_de_tigre_taille_en_rose");
    public static final Item OEIL_DE_TIGRE_TAILLE_MARQUISE = new ItemBase("oeil_de_tigre_taille_marquise");
    public static final Item OEIL_DE_TIGRE_TAILLE_OVALE = new ItemBase("oeil_de_tigre_taille_ovale");
    public static final Item OEIL_DE_TIGRE_TAILLE_POIRE = new ItemBase("oeil_de_tigre_taille_poire");
    public static final Item OEIL_DE_TIGRE_TAILLE_PRINCESSE = new ItemBase("oeil_de_tigre_taille_princesse");
    public static final Item OEIL_DE_TIGRE_TAILLE_RADIANT = new ItemBase("oeil_de_tigre_taille_radiant");
    public static final Item OEIL_DE_TIGRE_TAILLE_TRIANGLE = new ItemBase("oeil_de_tigre_taille_triangle");
    public static final Item OEIL_DE_TIGRE_TAILLE_TRILLION = new ItemBase("oeil_de_tigre_taille_trillion");

    public static final Item ONYX_TAILLE_ASSCHER = new ItemBase("onyx_taille_asscher");
    public static final Item ONYX_TAILLE_BAGUETTE = new ItemBase("onyx_taille_baguette");
    public static final Item ONYX_TAILLE_BRILLANT = new ItemBase("onyx_taille_brillant");
    public static final Item ONYX_TAILLE_BRIOLETTE = new ItemBase("onyx_taille_briolette");
    public static final Item ONYX_TAILLE_CABOCHON = new ItemBase("onyx_taille_cabochon");
    public static final Item ONYX_TAILLE_CEYLAN = new ItemBase("onyx_taille_ceylan");
    public static final Item ONYX_TAILLE_COEUR = new ItemBase("onyx_taille_coeur");
    public static final Item ONYX_TAILLE_EMERAUDE = new ItemBase("onyx_taille_emeraude");
    public static final Item ONYX_TAILLE_EN_ROSE = new ItemBase("onyx_taille_en_rose");
    public static final Item ONYX_TAILLE_MARQUISE = new ItemBase("onyx_taille_marquise");
    public static final Item ONYX_TAILLE_OVALE = new ItemBase("onyx_taille_ovale");
    public static final Item ONYX_TAILLE_POIRE = new ItemBase("onyx_taille_poire");
    public static final Item ONYX_TAILLE_PRINCESSE = new ItemBase("onyx_taille_princesse");
    public static final Item ONYX_TAILLE_RADIANT = new ItemBase("onyx_taille_radiant");
    public static final Item ONYX_TAILLE_TRIANGLE = new ItemBase("onyx_taille_triangle");
    public static final Item ONYX_TAILLE_TRILLION = new ItemBase("onyx_taille_trillion");

    public static final Item OPALE_TAILLE_ASSCHER = new ItemBase("opale_taille_asscher");
    public static final Item OPALE_TAILLE_BAGUETTE = new ItemBase("opale_taille_baguette");
    public static final Item OPALE_TAILLE_BRILLANT = new ItemBase("opale_taille_brillant");
    public static final Item OPALE_TAILLE_BRIOLETTE = new ItemBase("opale_taille_briolette");
    public static final Item OPALE_TAILLE_CABOCHON = new ItemBase("opale_taille_cabochon");
    public static final Item OPALE_TAILLE_CEYLAN = new ItemBase("opale_taille_ceylan");
    public static final Item OPALE_TAILLE_COEUR = new ItemBase("opale_taille_coeur");
    public static final Item OPALE_TAILLE_EMERAUDE = new ItemBase("opale_taille_emeraude");
    public static final Item OPALE_TAILLE_EN_ROSE = new ItemBase("opale_taille_en_rose");
    public static final Item OPALE_TAILLE_MARQUISE = new ItemBase("opale_taille_marquise");
    public static final Item OPALE_TAILLE_OVALE = new ItemBase("opale_taille_ovale");
    public static final Item OPALE_TAILLE_POIRE = new ItemBase("opale_taille_poire");
    public static final Item OPALE_TAILLE_PRINCESSE = new ItemBase("opale_taille_princesse");
    public static final Item OPALE_TAILLE_RADIANT = new ItemBase("opale_taille_radiant");
    public static final Item OPALE_TAILLE_TRIANGLE = new ItemBase("opale_taille_triangle");
    public static final Item OPALE_TAILLE_TRILLION = new ItemBase("opale_taille_trillion");

    public static final Item RUBIS_TAILLE_ASSCHER = new ItemBase("rubis_taille_asscher");
    public static final Item RUBIS_TAILLE_BAGUETTE = new ItemBase("rubis_taille_baguette");
    public static final Item RUBIS_TAILLE_BRILLANT = new ItemBase("rubis_taille_brillant");
    public static final Item RUBIS_TAILLE_BRIOLETTE = new ItemBase("rubis_taille_briolette");
    public static final Item RUBIS_TAILLE_CABOCHON = new ItemBase("rubis_taille_cabochon");
    public static final Item RUBIS_TAILLE_CEYLAN = new ItemBase("rubis_taille_ceylan");
    public static final Item RUBIS_TAILLE_COEUR = new ItemBase("rubis_taille_coeur");
    public static final Item RUBIS_TAILLE_EMERAUDE = new ItemBase("rubis_taille_emeraude");
    public static final Item RUBIS_TAILLE_EN_ROSE = new ItemBase("rubis_taille_en_rose");
    public static final Item RUBIS_TAILLE_MARQUISE = new ItemBase("rubis_taille_marquise");
    public static final Item RUBIS_TAILLE_OVALE = new ItemBase("rubis_taille_ovale");
    public static final Item RUBIS_TAILLE_POIRE = new ItemBase("rubis_taille_poire");
    public static final Item RUBIS_TAILLE_PRINCESSE = new ItemBase("rubis_taille_princesse");
    public static final Item RUBIS_TAILLE_RADIANT = new ItemBase("rubis_taille_radiant");
    public static final Item RUBIS_TAILLE_TRIANGLE = new ItemBase("rubis_taille_triangle");
    public static final Item RUBIS_TAILLE_TRILLION = new ItemBase("rubis_taille_trillion");

    public static final Item SAPHIR_TAILLE_ASSCHER = new ItemBase("saphir_taille_asscher");
    public static final Item SAPHIR_TAILLE_BAGUETTE = new ItemBase("saphir_taille_baguette");
    public static final Item SAPHIR_TAILLE_BRILLANT = new ItemBase("saphir_taille_brillant");
    public static final Item SAPHIR_TAILLE_BRIOLETTE = new ItemBase("saphir_taille_briolette");
    public static final Item SAPHIR_TAILLE_CABOCHON = new ItemBase("saphir_taille_cabochon");
    public static final Item SAPHIR_TAILLE_CEYLAN = new ItemBase("saphir_taille_ceylan");
    public static final Item SAPHIR_TAILLE_COEUR = new ItemBase("saphir_taille_coeur");
    public static final Item SAPHIR_TAILLE_EMERAUDE = new ItemBase("saphir_taille_emeraude");
    public static final Item SAPHIR_TAILLE_EN_ROSE = new ItemBase("saphir_taille_en_rose");
    public static final Item SAPHIR_TAILLE_MARQUISE = new ItemBase("saphir_taille_marquise");
    public static final Item SAPHIR_TAILLE_OVALE = new ItemBase("saphir_taille_ovale");
    public static final Item SAPHIR_TAILLE_POIRE = new ItemBase("saphir_taille_poire");
    public static final Item SAPHIR_TAILLE_PRINCESSE = new ItemBase("saphir_taille_princesse");
    public static final Item SAPHIR_TAILLE_RADIANT = new ItemBase("saphir_taille_radiant");
    public static final Item SAPHIR_TAILLE_TRIANGLE = new ItemBase("saphir_taille_triangle");
    public static final Item SAPHIR_TAILLE_TRILLION = new ItemBase("saphir_taille_trillion");

    public static final Item SPINELLE_TAILLE_ASSCHER = new ItemBase("spinelle_taille_asscher");
    public static final Item SPINELLE_TAILLE_BAGUETTE = new ItemBase("spinelle_taille_baguette");
    public static final Item SPINELLE_TAILLE_BRILLANT = new ItemBase("spinelle_taille_brillant");
    public static final Item SPINELLE_TAILLE_BRIOLETTE = new ItemBase("spinelle_taille_briolette");
    public static final Item SPINELLE_TAILLE_CABOCHON = new ItemBase("spinelle_taille_cabochon");
    public static final Item SPINELLE_TAILLE_CEYLAN = new ItemBase("spinelle_taille_ceylan");
    public static final Item SPINELLE_TAILLE_COEUR = new ItemBase("spinelle_taille_coeur");
    public static final Item SPINELLE_TAILLE_EMERAUDE = new ItemBase("spinelle_taille_emeraude");
    public static final Item SPINELLE_TAILLE_EN_ROSE = new ItemBase("spinelle_taille_en_rose");
    public static final Item SPINELLE_TAILLE_MARQUISE = new ItemBase("spinelle_taille_marquise");
    public static final Item SPINELLE_TAILLE_OVALE = new ItemBase("spinelle_taille_ovale");
    public static final Item SPINELLE_TAILLE_POIRE = new ItemBase("spinelle_taille_poire");
    public static final Item SPINELLE_TAILLE_PRINCESSE = new ItemBase("spinelle_taille_princesse");
    public static final Item SPINELLE_TAILLE_RADIANT = new ItemBase("spinelle_taille_radiant");
    public static final Item SPINELLE_TAILLE_TRIANGLE = new ItemBase("spinelle_taille_triangle");
    public static final Item SPINELLE_TAILLE_TRILLION = new ItemBase("spinelle_taille_trillion");

    public static final Item TURQUOISE_TAILLE_ASSCHER = new ItemBase("turquoise_taille_asscher");
    public static final Item TURQUOISE_TAILLE_BAGUETTE = new ItemBase("turquoise_taille_baguette");
    public static final Item TURQUOISE_TAILLE_BRILLANT = new ItemBase("turquoise_taille_brillant");
    public static final Item TURQUOISE_TAILLE_BRIOLETTE = new ItemBase("turquoise_taille_briolette");
    public static final Item TURQUOISE_TAILLE_CABOCHON = new ItemBase("turquoise_taille_cabochon");
    public static final Item TURQUOISE_TAILLE_CEYLAN = new ItemBase("turquoise_taille_ceylan");
    public static final Item TURQUOISE_TAILLE_COEUR = new ItemBase("turquoise_taille_coeur");
    public static final Item TURQUOISE_TAILLE_EMERAUDE = new ItemBase("turquoise_taille_emeraude");
    public static final Item TURQUOISE_TAILLE_EN_ROSE = new ItemBase("turquoise_taille_en_rose");
    public static final Item TURQUOISE_TAILLE_MARQUISE = new ItemBase("turquoise_taille_marquise");
    public static final Item TURQUOISE_TAILLE_OVALE = new ItemBase("turquoise_taille_ovale");
    public static final Item TURQUOISE_TAILLE_POIRE = new ItemBase("turquoise_taille_poire");
    public static final Item TURQUOISE_TAILLE_PRINCESSE = new ItemBase("turquoise_taille_princesse");
    public static final Item TURQUOISE_TAILLE_RADIANT = new ItemBase("turquoise_taille_radiant");
    public static final Item TURQUOISE_TAILLE_TRIANGLE = new ItemBase("turquoise_taille_triangle");
    public static final Item TURQUOISE_TAILLE_TRILLION = new ItemBase("turquoise_taille_trillion");

    //Papier - livres - plumes - papetier - peinture

    public static final Item AFFICHE = new ItemBase("affiche");
    public static final Item CARNET_EN_CUIR_BLANC = new ItemBase("carnet_en_cuir_blanc");
    public static final Item CARNET_EN_CUIR_BLEU = new ItemBase("carnet_en_cuir_bleu");
    public static final Item CARNET_EN_CUIR_BLEU_CIEL = new ItemBase("carnet_en_cuir_bleu_ciel");
    public static final Item CARNET_EN_CUIR_BRUN = new ItemBase("carnet_en_cuir_brun");
    public static final Item CARNET_EN_CUIR_GRIS = new ItemBase("carnet_en_cuir_gris");
    public static final Item CARNET_EN_CUIR_MAGENTA = new ItemBase("carnet_en_cuir_magenta");
    public static final Item CARNET_EN_CUIR_NOIR = new ItemBase("carnet_en_cuir_noir");
    public static final Item CARNET_EN_CUIR_ORANGE = new ItemBase("carnet_en_cuir_orange");
    public static final Item CARNET_EN_CUIR_ROUGE = new ItemBase("carnet_en_cuir_rouge");
    public static final Item CARNET_EN_CUIR_VERT = new ItemBase("carnet_en_cuir_vert");
    public static final Item CARNET_EN_CUIR_VERT_CLAIR = new ItemBase("carnet_en_cuir_vert_clair");
    public static final Item CARNET_EN_CUIR_VIOLET = new ItemBase("carnet_en_cuir_violet");

    public static final Item ENCRIER_ET_PLUME = new ItemIngrediant("encrier_et_plume", 45);
    public static final Item FUSAIN = new ItemIngrediant("fusain", 7);
    public static final Item GOUACHE_BLANCHE = new ItemBase("gouache_blanche");
    public static final Item GOUACHE_CYAN = new ItemBase("gouache_cyan");
    public static final Item GOUACHE_JAUNE = new ItemBase("gouache_jaune");
    public static final Item GOUACHE_MAGENTA = new ItemBase("gouache_magenta");
    public static final Item GOUACHE_NOIRE = new ItemBase("gouache_noire");
    public static final Item PLUME_D_ECRITURE_EN_ARGENT = new ItemBase("plume_d_ecriture_en_argent");
    public static final Item PLUME_D_ECRITURE_EN_BRONZE = new ItemBase("plume_d_ecriture_en_bronze");
    public static final Item PLUME_D_ECRITURE_EN_FER = new ItemBase("plume_d_ecriture_en_fer");
    public static final Item PLUME_D_ECRITURE_EN_OR = new ItemBase("plume_d_ecriture_en_or");

    public static final Item ENVELOPPE = new ItemInventory("enveloppe", 14);
    public static final Item GRIMOIRE = new ItemBase("grimoire");
    public static final Item LOT_DE_PAPIERS = new ItemBase("lot_de_papiers");
    public static final Item PALETTE_DE_PEINTURE = new ItemIngrediant("palette_de_peinture", 7);
    public static final Item PAPIER_A_PLAN = new ItemBase("papier_a_plan");
    public static final Item PAPIER_ECRIT = new ItemBase("papier_ecrit");
    public static final Item PAPIER_HUMIDE = new ItemBase("papier_humide");
    public static final Item PARCHEMIN_DESCELLE = new ItemBase("parchemin_descelle");
    public static final Item PARCHEMIN = new ItemTransformable("parchemin", new ArrayList() {{ add(PARCHEMIN_DESCELLE); }});
    public static final Item PATE_A_PAPIER = new ItemBase("pate_a_papier");
    public static final Item PINCEAU = new ItemIngrediant("pinceau", 7);
    public static final Item PINCEAU_BROSSE = new ItemBase("pinceau_brosse");
    public static final Item TICKET = new ItemBase("ticket");
    public static final Item JEU_DE_CARTES = new ItemBase("jeu_de_cartes");
    public static final Item EVENTAIL = new ItemBase("eventail");

    //Métaux fondus - lingots - barres - plaques - clous

    public static final Item ANCRE_MARINE = new ItemBase("ancre_marine");

    public static final Item FER_FONDU = new ItemBase("fer_fondu");
    public static final Item BARRE_FER = new ItemBase("barre_fer");
    public static final Item PLAQUE_DE_FER = new ItemBase("plaque_de_fer");
    public static final Item BOBINE_DE_FER = new ItemIngrediant("bobine_de_fer", 7);

    public static final Item CUIVRE_FONDU = new ItemBase("cuivre_fondu");
    public static final Item BARRE_CUIVRE = new ItemBase("barre_cuivre");
    public static final Item PLAQUE_DE_CUIVRE = new ItemBase("plaque_de_cuivre");
    public static final Item LINGOT_CUIVRE = new ItemBase("lingot_cuivre");
    public static final Item BOBINE_DE_CUIVRE = new ItemIngrediant("bobine_de_cuivre", 7);

    public static final Item PLOMB_FONDU = new ItemBase("plomb_fondu");
    public static final Item BARRE_PLOMB = new ItemBase("barre_plomb");
    public static final Item PLAQUE_DE_PLOMB = new ItemBase("plaque_de_plomb");
    public static final Item LINGOT_PLOMB = new ItemBase("lingot_plomb");

    public static final Item ETAIN_FONDU = new ItemBase("etain_fondu");
    public static final Item BARRE_ETAIN = new ItemBase("barre_etain");
    public static final Item PLAQUE_D_ETAIN = new ItemBase("plaque_d_etain");
    public static final Item LINGOT_ETAIN = new ItemBase("lingot_etain");

    public static final Item BRONZE_FONDU = new ItemBase("bronze_fondu");
    public static final Item BARRE_BRONZE = new ItemBase("barre_bronze");
    public static final Item PLAQUE_DE_BRONZE = new ItemBase("plaque_de_bronze");
    public static final Item LINGOT_BRONZE = new ItemBase("lingot_bronze");
    public static final Item BOBINE_DE_BRONZE = new ItemIngrediant("bobine_de_bronze", 7);

    public static final Item ACIER_FONDU = new ItemBase("acier_fondu");
    public static final Item BARRE_ACIER = new ItemBase("barre_acier");
    public static final Item PLAQUE_D_ACIER = new ItemBase("plaque_d_acier");
    public static final Item LINGOT_ACIER = new ItemBase("lingot_acier");
    public static final Item BOBINE_D_ACIER = new ItemIngrediant("bobine_d_acier", 7);

    public static final Item ARGENT_FONDU = new ItemBase("argent_fondu");
    public static final Item BARRE_ARGENT = new ItemBase("barre_argent");
    public static final Item PLAQUE_D_ARGENT = new ItemBase("plaque_d_argent");
    public static final Item LINGOT_ARGENT = new ItemBase("lingot_argent");
    public static final Item BOBINE_D_ARGENT = new ItemIngrediant("bobine_d_argent", 7);

    public static final Item OR_FONDU = new ItemBase("or_fondu");
    public static final Item BARRE_OR = new ItemBase("barre_or");
    public static final Item PLAQUE_D_OR = new ItemBase("plaque_d_or");
    public static final Item BOBINE_D_OR = new ItemIngrediant("bobine_d_or", 7);

    public static final Item CLOUS = new ItemBase("clous");
    public static final Item SIFFLET = new ItemSound("sifflet", ModSounds.SIFFLET);
    public static final Item SIFFLET_METAL = new ItemSound("sifflet_metal", ModSounds.SIFFLET);

    //Têtes d'outils

    public static final Item POINTE_DE_FLECHE = new ItemBase("pointe_de_fleche");
    public static final Item POINTE_DE_FLECHE_LONGUE = new ItemBase("pointe_de_fleche_longue");

    public static final Item TETE_ARACK_ACIER = new ItemBase("tete_arack_acier");
    public static final Item TETE_ARACK_FER = new ItemBase("tete_arack_fer");

    public static final Item TETE_EPEE_BATARDE_FER = new ItemBase("tete_epee_batarde_fer");
    public static final Item TETE_EPEE_BATARDE_ACIER = new ItemBase("tete_epee_batarde_acier");

    public static final Item TETE_EPEE_A_DEUX_MAIN_ACIER = new ItemBase("tete_epee_a_deux_main_acier");
    public static final Item TETE_EPEE_A_DEUX_MAIN_FER = new ItemBase("tete_epee_a_deux_main_fer");

    public static final Item TETE_FLAMEBERGE_ACIER = new ItemBase("tete_flameberge_acier");
    public static final Item TETE_FLAMEBERGE_FER = new ItemBase("tete_flameberge_fer");

    public static final Item TETE_BURIN_ACIER = new ItemBase("tete_burin_acier");
    public static final Item TETE_BURIN_FER = new ItemBase("tete_burin_fer");

    public static final Item TETE_COUTEAU_ACIER = new ItemBase("tete_couteau_acier");
    public static final Item TETE_COUTEAU_FER = new ItemBase("tete_couteau_fer");
    public static final Item TETE_COUTEAU_OR = new ItemBase("tete_couteau_or");
    public static final Item TETE_COUTEAU_ARGENT = new ItemBase("tete_couteau_argent");
    public static final Item TETE_COUTEAU_ETAIN = new ItemBase("tete_couteau_etain");

    public static final Item TETE_DAGUE_ACIER = new ItemBase("tete_dague_acier");
    public static final Item TETE_DAGUE_FER = new ItemBase("tete_dague_fer");
    public static final Item TETE_DAGUE_OR = new ItemBase("tete_dague_or");

    public static final Item TETE_EPEE_ACIER = new ItemBase("tete_epee_acier");
    public static final Item TETE_EPEE_FER = new ItemBase("tete_epee_fer");
    public static final Item TETE_EPEE_OR = new ItemBase("tete_epee_or");

    public static final Item TETE_EPEE_LONGUE_ACIER = new ItemBase("tete_epee_longue_acier");
    public static final Item TETE_EPEE_LONGUE_FER = new ItemBase("tete_epee_longue_fer");
    public static final Item TETE_EPEE_LONGUE_OR = new ItemBase("tete_epee_longue_or");

    public static final Item TETE_FAUX_ACIER = new ItemBase("tete_faux_acier");
    public static final Item TETE_FAUX_FER = new ItemBase("tete_faux_fer");
    public static final Item TETE_FAUX_OR = new ItemBase("tete_faux_or");

    public static final Item TETE_FOURCHE_FER = new ItemBase("tete_fourche_fer");

    public static final Item TETE_HACHE_ARMES_ACIER = new ItemBase("tete_hache_armes_acier");
    public static final Item TETE_HACHE_ARMES_FER = new ItemBase("tete_hache_armes_fer");
    public static final Item TETE_HACHE_ARMES_OR = new ItemBase("tete_hache_armes_or");

    public static final Item TETE_HACHE_ACIER = new ItemBase("tete_hache_acier");
    public static final Item TETE_HACHE_FER = new ItemBase("tete_hache_fer");
    public static final Item TETE_HACHE_OR = new ItemBase("tete_hache_or");

    public static final Item TETE_HACHOIR_FER = new ItemBase("tete_hachoir_fer");

    public static final Item TETE_HALLEBARDE_ACIER = new ItemBase("tete_hallebarde_acier");
    public static final Item TETE_HALLEBARDE_FER = new ItemBase("tete_hallebarde_fer");

    public static final Item TETE_HOUE_ACIER = new ItemBase("tete_houe_acier");
    public static final Item TETE_HOUE_FER = new ItemBase("tete_houe_fer");
    public static final Item TETE_HOUE_OR = new ItemBase("tete_houe_or");

    public static final Item TETE_LANCE_ACIER = new ItemBase("tete_lance_acier");
    public static final Item TETE_LANCE_FER = new ItemBase("tete_lance_fer");
    public static final Item TETE_LANCE_OR = new ItemBase("tete_lance_or");

    public static final Item TETE_LIME_ACIER = new ItemBase("tete_lime_acier");
    public static final Item TETE_LIME_FER = new ItemBase("tete_lime_fer");

    public static final Item TETE_MARTEAU_ACIER = new ItemBase("tete_marteau_acier");
    public static final Item TETE_MARTEAU_FER = new ItemBase("tete_marteau_fer");
    public static final Item TETE_MARTEAU_OR = new ItemBase("tete_marteau_or");

    public static final Item TETE_MARTEAU_GUERRE_OR = new ItemBase("tete_marteau_guerre_or");

    public static final Item TETE_MASSE_ACIER = new ItemBase("tete_masse_acier");
    public static final Item TETE_MASSE_FER = new ItemBase("tete_masse_fer");
    public static final Item TETE_MASSE_OR = new ItemBase("tete_masse_or");

    public static final Item TETE_PELLE_ACIER = new ItemBase("tete_pelle_acier");
    public static final Item TETE_PELLE_FER = new ItemBase("tete_pelle_fer");
    public static final Item TETE_PELLE_OR = new ItemBase("tete_pelle_or");

    public static final Item TETE_PIOCHE_ACIER = new ItemBase("tete_pioche_acier");
    public static final Item TETE_PIOCHE_FER = new ItemBase("tete_pioche_fer");
    public static final Item TETE_PIOCHE_OR = new ItemBase("tete_pioche_or");

    public static final Item TETE_SABRE_ACIER = new ItemBase("tete_sabre_acier");
    public static final Item TETE_SABRE_FER = new ItemBase("tete_sabre_fer");
    public static final Item TETE_SABRE_OR = new ItemBase("tete_sabre_or");

    public static final Item TETE_SCIE_ACIER = new ItemBase("tete_scie_acier");
    public static final Item TETE_SCIE_FER = new ItemBase("tete_scie_fer");

    public static final Item TETE_SERPE_ACIER = new ItemBase("tete_serpe_acier");
    public static final Item TETE_SERPE_FER = new ItemBase("tete_serpe_fer");

    public static final Item TETE_RAPIERE_ACIER = new ItemBase("tete_rapiere_acier");
    public static final Item TETE_RAPIERE_FER = new ItemBase("tete_rapiere_fer");

    public static final Item GARDE_RAPIERE = new ItemBase("garde_rapiere");


    //Bois ébénisterie

    public static final Item MANCHE = new ItemBase("manche");
    public static final Item PLANCHE = new ItemBase("planche");

    public static final Item BATON_ACACIA = new ItemBase("baton_acacia");
    public static final Item BATON_ACAJOU = new ItemBase("baton_acajou");
    public static final Item BATON_BOULEAU = new ItemBase("baton_bouleau");
    public static final Item BATON_CHENE_NOIR = new ItemBase("baton_chene_noir");
    public static final Item BATON_SAPIN = new ItemBase("baton_sapin");

    public static final Item SCIURE = new ItemBase("sciure");
    public static final Item PLANCHE_ACACIA = new ItemBase("planche_acacia");
    public static final Item PLANCHE_SCIURE_ACACIA = new ItemTransformable("planche_sciure_acacia", new ArrayList() {{ add(PLANCHE_ACACIA); add(SCIURE); }});
    public static final Item PLANCHE_ACAJOU = new ItemBase("planche_acajou");
    public static final Item PLANCHE_SCIURE_ACAJOU = new ItemTransformable("planche_sciure_acajou", new ArrayList() {{ add(PLANCHE_ACAJOU); add(SCIURE); }});
    public static final Item PLANCHE_BOULEAU = new ItemBase("planche_bouleau");
    public static final Item PLANCHE_SCIURE_BOULEAU = new ItemTransformable("planche_sciure_bouleau", new ArrayList() {{ add(PLANCHE_BOULEAU); add(SCIURE); }});
    public static final Item PLANCHE_CHENE = new ItemBase("planche_chene");
    public static final Item PLANCHE_SCIURE_CHENE = new ItemTransformable("planche_sciure_chene", new ArrayList() {{ add(PLANCHE_CHENE); add(SCIURE); }});
    public static final Item PLANCHE_CHENE_NOIR = new ItemBase("planche_chene_noir");
    public static final Item PLANCHE_SCIURE_CHENE_NOIR = new ItemTransformable("planche_sciure_chene_noir", new ArrayList() {{ add(PLANCHE_CHENE_NOIR); add(SCIURE); }});
    public static final Item PLANCHE_SAPIN = new ItemBase("planche_sapin");
    public static final Item PLANCHE_SCIURE_SAPIN = new ItemTransformable("planche_sciure_sapin", new ArrayList() {{ add(PLANCHE_SAPIN); add(SCIURE); }});

    public static final Item PIPE = new ItemBase("pipe");
    public static final Item PIPE_DROITE = new ItemBase("pipe_droite");

    public static final Item BALLE_EN_BOIS = new ItemBase("balle_en_bois");
    public static final Item BOBINE_EN_BOIS = new ItemBase("bobine_en_bois");
    public static final Item BOITE = new ItemBase("boite");
    public static final Item BOITE_A_POUDRE = new ItemBase("boite_a_poudre");
    public static final Item BROSSE_A_CHEVEUX_EN_BOIS = new ItemBase("brosse_a_cheveux_en_bois");
    public static final Item BROSSE_A_CHEVEUX_EN_BOIS_BLANC = new ItemBase("brosse_a_cheveux_en_bois_blanc");
    public static final Item BROSSE_A_CHEVEUX_EN_BOIS_NOIR = new ItemBase("brosse_a_cheveux_en_bois_noir");
    public static final Item CADRE_EN_BOIS = new ItemBase("cadre_en_bois");
    public static final Item FLECHE_ENTRAINEMENT = new ItemBase("fleche_entrainement");
    public static final Item FLECHE_POINTE_LONGUE = new ItemBase("fleche_pointe_longue");
    public static final Item PETIT_CHEVAL_EN_BOIS = new ItemBase("petit_cheval_en_bois");
    public static final Item RAME = new ItemBase("rame");
    public static final Item ROULEAU_A_PATISSERIE = new ItemIngrediant("rouleau_a_patisserie", Reference.DURABILITE_BRONZE);
    public static final Item STATUETTE_EN_BOIS = new ItemBase("statuette_en_bois");
    public static final Item PEIGNE_EN_BOULEAU = new ItemBase("peigne_en_bouleau");
    public static final Item PEIGNE_EN_BOULEAU_LONG = new ItemBase("peigne_en_bouleau_long");
    public static final Item PEIGNE_EN_CHENE = new ItemBase("peigne_en_chene");
    public static final Item PEIGNE_EN_CHENE_LONG = new ItemBase("peigne_en_chene_long");
    public static final Item CHOPPE_VIDE = new ItemBase("choppe_vide");
    public static final Item GOUVERNAIL = new ItemBase("gouvernail");

    public static final Item DE = new ItemBase("de");

    //Armures

    public static final Item AVENTAIL = new ItemBase("aventail");
    public static final Item AVENTAIL_ACIER = new ItemBase("aventail_acier");
    public static final Item CASQUE = new ItemBase("casque");
    public static final Item CASQUE_ACIER = new ItemBase("casque_acier");
    public static final Item CASQUE_COIFFE = new ItemBase("casque_coiffe");
    public static final Item CASQUE_COIFFE_ACIER = new ItemBase("casque_coiffe_acier");
    public static final Item CERVELIERE = new ItemBase("cerveliere");
    public static final Item CERVELIERE_ACIER = new ItemBase("cerveliere_acier");
    public static final Item COIFFE_REMBOUREE = new ItemBase("coiffe_rembouree");
    public static final Item FER_A_CHEVAL = new ItemBase("fer_a_cheval");
    public static final Item GANTELETS = new ItemBase("gantelets");
    public static final Item GANTELETS_ACIER = new ItemBase("gantelets_acier");
    public static final Item GRAND_HEAUME = new ItemBase("grand_heaume");
    public static final Item JUPE_DE_MAILLES = new ItemBase("jupe_de_mailles");
    public static final Item JUPE_EN_MAILLE_DE_FER = new ItemBase("jupe_en_maille_de_fer");
    public static final Item MAILLE_DE_FER = new ItemBase("maille_de_fer");
    public static final Item MAILLE_D_ACIER = new ItemBase("maille_d_acier");
    public static final Item PLASTRON = new ItemBase("plastron");
    public static final Item PLASTRON_ACIER = new ItemBase("plastron_acier");
    public static final Item POURPOINT = new ItemBase("pourpoint");
    public static final Item POURPOINT_ARMANT = new ItemBase("pourpoint_armant");
    public static final Item SPALIERES = new ItemBase("spalieres");
    public static final Item SPALIERES_ACIER = new ItemBase("spalieres_acier");
    public static final Item SPALIERES_CUIR = new ItemBase("spalieres_cuir");

    //Echequier

    public static final Item CAVALIER_BLANC = new ItemBase("cavalier_blanc");
    public static final Item CAVALIER_NOIR = new ItemBase("cavalier_noir");

    public static final Item FOU_BLANC = new ItemBase("fou_blanc");
    public static final Item FOU_NOIR = new ItemBase("fou_noir");

    public static final Item PION_BLANC = new ItemBase("pion_blanc");
    public static final Item PION_NOIR = new ItemBase("pion_noir");

    public static final Item REINE_BLANCHE = new ItemBase("reine_blanche");
    public static final Item REINE_NOIRE = new ItemBase("reine_noire");

    public static final Item ROI_BLANC = new ItemBase("roi_blanc");
    public static final Item ROI_NOIR = new ItemBase("roi_noir");

    public static final Item TOUR_BLANCHE = new ItemBase("tour_blanche");
    public static final Item TOUR_NOIRE = new ItemBase("tour_noire");

    //Poissons-pêche-coquillages

    // public static final Item fishing_rod_reinforced = new FishingRodReinforced("fishing_rod_reinforced");
    // public static final Item filet_de_poisson = new FoodBase("filet_de_poisson", 1, 1.0F, true);
    public static final Item ANGUILLE = new ItemBase("anguille");
    public static final Item ANGE_ROYAL = new ItemBase("ange_royal");
    public static final Item POCHE_D_ENCRE = new ItemBase("poche_d_encre");
    public static final Item CALAMAR_MORT = new ItemBase("calamar_mort");
    public static final Item CALAMAR = new ItemTransformable("calamar", new ArrayList() {{ add(CALAMAR_MORT); add(POCHE_D_ENCRE); add(POCHE_D_ENCRE); }});
    public static final Item CARPE = new ItemBase("carpe");
    public static final Item CARPE_KOI = new ItemBase("carpe_koi");
    public static final Item CHIRURGIEN_BLEU = new ItemBase("chirurgien_bleu");
    public static final Item CHIRURGIEN_NOIR = new ItemBase("chirurgien_noir");
    public static final Item COMBATTANT_NOIR = new ItemBase("combattant_noir");
    public static final Item COMBATTANT_ROUGE = new ItemBase("combattant_rouge");
    public static final Item COQUILLAGE = new ItemBase("coquillage");
    public static final Item COQUILLAGE_BLANC = new ItemBase("coquillage_blanc");
    public static final Item COQUILLAGE_ROSE = new ItemBase("coquillage_rose");
    public static final Item COQUILLE = new ItemBase("coquille");
    public static final Item COQUILLE_SAINT_JACQUES = new ItemBase("coquille_saint_jacques");
    public static final Item CORAIL = new ItemBase("corail");
    public static final Item CRABE = new ItemBase("crabe");
    public static final Item CREVETTE_GRISE = new ItemBase("crevette_grise");
    public static final Item CREVETTE_ROSE = new ItemBase("crevette_rose");
    public static final Item CRISTAL_DE_SEL = new ItemBase("cristal_de_sel");
    public static final Item CROISSANT_A_QUEUE_JAUNE = new ItemBase("croissant_a_queue_jaune");
    public static final Item CHROMIS_VIRIDIS = new ItemBase("chromis_viridis");
    public static final Item DEMOISELLE_RAYEE = new ItemBase("demoiselle_rayee");
    public static final Item DORADE = new ItemBase("dorade");
    public static final Item DORE_JAUNE = new ItemBase("dore_jaune");
    public static final Item ECREVISSE = new ItemBase("ecrevisse");
    public static final Item ECREVISSE_ORANGE = new ItemBase("ecrevisse_orange");
    public static final Item GOURAMI_MIEL = new ItemBase("gourami_miel");
    public static final Item GRAMMA_LORETO = new ItemBase("gramma_loreto");
    public static final Item GUPPY = new ItemBase("guppy");
    public static final Item HIPPOCAMPE = new ItemBase("hippocampe");
    public static final Item HOMARD = new ItemBase("homard");
    public static final Item PERLE_NATURELLE = new ItemBase("perle_naturelle");
    public static final Item HUITRE = new ItemTransformableProbability("huitre", new ArrayList() {{ add(HUITRE_OUVERTE); }}, new ArrayList() {{ add(PERLE_NATURELLE); }}, 5);
    public static final Item LABIDO_JAUNE = new ItemBase("labido_jaune");
    public static final Item MEROU = new ItemBase("merou");
    public static final Item NAPOLEON = new ItemBase("napoleon");
    public static final Item NAUTILE = new ItemBase("nautile");
    public static final Item ORMEAUX = new ItemBase("ormeaux");
    public static final Item PALOURDE = new ItemBase("palourde");
    public static final Item POISSON_CHAT = new ItemBase("poisson_chat");
    public static final Item POISSON_CHIRURGIEN = new ItemBase("poisson_chirurgien");
    public static final Item POISSON_CLOWN_NOIR = new ItemBase("poisson_clown_noir");
    public static final Item POISSON_LUNE = new ItemBase("poisson_lune");
    public static final Item POISSON_PERROQUET = new ItemBase("poisson_perroquet");
    public static final Item POULPE_MORT = new ItemBase("poulpe_mort");
    public static final Item POULPE = new ItemTransformable("poulpe", new ArrayList() {{ add(POULPE_MORT); add(POCHE_D_ENCRE); add(POCHE_D_ENCRE); }});
    public static final Item ROUGET = new ItemBase("rouget");
    public static final Item SARDINE = new ItemBase("sardine");
    public static final Item SEL = new ItemBase("sel");
    public static final Item THON = new ItemBase("thon");
    public static final Item ZANCLUS_CORNUTUS = new ItemBase("zanclus_cornutus");


    public static final Item MOULE_CRUSTACE = new ItemBase("moule_crustace");
    

    // Bijoux

    public static final Item NACRE = new ItemBase("nacre");
    public static final Item PERLE = new ItemBase("perle");
    public static final Item PERLE_NOIRE = new ItemBase("perle_noire");


    public static final Item BAGUE_EN_ACIER = new ItemBase("bague_en_acier");
    public static final Item BAGUE_EN_ARGENT = new ItemBase("bague_en_argent");
    public static final Item BAGUE_EN_BRONZE = new ItemBase("bague_en_bronze");
    public static final Item BAGUE_EN_CUIVRE = new ItemBase("bague_en_cuivre");
    public static final Item BAGUE_EN_ETAIN = new ItemBase("bague_en_etain");
    public static final Item BAGUE_EN_FER = new ItemBase("bague_en_fer");
    public static final Item BAGUE_EN_OR = new ItemBase("bague_en_or");


    public static final Item BOUCLES_OREILLES_EN_ACIER = new ItemBase("boucles_oreilles_en_acier");
    public static final Item BOUCLES_OREILLES_EN_ARGENT = new ItemBase("boucles_oreilles_en_argent");
    public static final Item BOUCLES_OREILLES_EN_BRONZE = new ItemBase("boucles_oreilles_en_bronze");
    public static final Item BOUCLES_OREILLES_EN_CUIVRE = new ItemBase("boucles_oreilles_en_cuivre");
    public static final Item BOUCLES_OREILLES_EN_ETAIN = new ItemBase("boucles_oreilles_en_etain");
    public static final Item BOUCLES_OREILLES_EN_FER = new ItemBase("boucles_oreilles_en_fer");
    public static final Item BOUCLES_OREILLES_EN_OR = new ItemBase("boucles_oreilles_en_or");


    public static final Item BRACELET_EN_ACIER = new ItemBase("bracelet_en_acier");
    public static final Item BRACELET_EN_ARGENT = new ItemBase("bracelet_en_argent");
    public static final Item BRACELET_EN_BRONZE = new ItemBase("bracelet_en_bronze");
    public static final Item BRACELET_EN_CUIVRE = new ItemBase("bracelet_en_cuivre");
    public static final Item BRACELET_EN_ETAIN = new ItemBase("bracelet_en_etain");
    public static final Item BRACELET_EN_FER = new ItemBase("bracelet_en_fer");
    public static final Item BRACELET_EN_OR = new ItemBase("bracelet_en_or");


    public static final Item COLLIER_DE_PERLES = new ItemBase("collier_de_perles");
    public static final Item COLLIER_EN_ACIER = new ItemBase("collier_en_acier");
    public static final Item COLLIER_EN_ARGENT = new ItemBase("collier_en_argent");
    public static final Item COLLIER_EN_BRONZE = new ItemBase("collier_en_bronze");
    public static final Item COLLIER_EN_CUIR_ET_GRIFFE = new ItemBase("collier_en_cuir_et_griffe");
    public static final Item COLLIER_EN_CUIR_ET_PERLE_DE_VERRE = new ItemBase("collier_en_cuir_et_perle_de_verre");
    public static final Item COLLIER_EN_CUIVRE = new ItemBase("collier_en_cuivre");
    public static final Item COLLIER_EN_ETAIN = new ItemBase("collier_en_etain");
    public static final Item COLLIER_EN_FER = new ItemBase("collier_en_fer");
    public static final Item COLLIER_EN_OR = new ItemBase("collier_en_or");

    public static final Item COURONNE = new ItemBase("couronne");
    public static final Item COURONNE_DE_FLEURS = new ItemBase("couronne_de_fleurs");


    public static final Item MANCHETTE_EN_ACIER = new ItemBase("manchette_en_acier");
    public static final Item MANCHETTE_EN_ARGENT = new ItemBase("manchette_en_argent");
    public static final Item MANCHETTE_EN_BRONZE = new ItemBase("manchette_en_bronze");
    public static final Item MANCHETTE_EN_CUIVRE = new ItemBase("manchette_en_cuivre");
    public static final Item MANCHETTE_EN_ETAIN = new ItemBase("manchette_en_etain");
    public static final Item MANCHETTE_EN_FER = new ItemBase("manchette_en_fer");
    public static final Item MANCHETTE_EN_OR = new ItemBase("manchette_en_or");


    public static final Item PEIGNE_EN_ACIER = new ItemBase("peigne_en_acier");
    public static final Item PEIGNE_EN_ARGENT = new ItemBase("peigne_en_argent");
    public static final Item PEIGNE_EN_BRONZE = new ItemBase("peigne_en_bronze");
    public static final Item PEIGNE_EN_ETAIN = new ItemBase("peigne_en_etain");
    public static final Item PEIGNE_EN_FER = new ItemBase("peigne_en_fer");
    public static final Item PEIGNE_EN_OR = new ItemBase("peigne_en_or");


    /*
    public static final Item TORQUE_OR=new ItemBase("torque_or");
    public static final Item TORQUE_ARGENT=new ItemBase("torque_argent");
    public static final Item TORQUE_ACIER=new ItemBase("torque_acier");
    public static final Item TORQUE_ETAIN=new ItemBase("torque_etain");
    public static final Item TORQUE_CUIVRE=new ItemBase("torque_cuivre");
    public static final Item TORQUE_BRONZE=new ItemBase("torque_bronze");
    public static final Item TORQUE_FER=new ItemBase("torque_fer");

    public static final Item BROCHE_OR=new ItemBase("broche_or");
    public static final Item BROCHE_ARGENT=new ItemBase("broche_argent");
    public static final Item BROCHE_CUIVRE=new ItemBase("broche_cuivre");
    public static final Item BROCHE_ACIER=new ItemBase("broche_acier");
    public static final Item BROCHE_ETAIN=new ItemBase("broche_etain");
    public static final Item BROCHE_BRONZE=new ItemBase("broche_bronze");
    public static final Item BROCHE_FER=new ItemBase("broche_fer");
    public static final Item BROCHE_IVOIRE=new ItemBase("broche_ivoire");

    public static final Item CHEVALIERE_OR=new ItemBase("chevaliere_or");
    public static final Item CHEVALIERE_ARGENT=new ItemBase("chevaliere_argent");
    public static final Item CHEVALIERE_ACIER=new ItemBase("chevaliere_acier");
    public static final Item CHEVALIERE_BRONZE=new ItemBase("chevaliere_bronze");
    public static final Item CHEVALIERE_CUIVRE=new ItemBase("chevaliere_cuivre");
    public static final Item CHEVALIERE_ACIER=new ItemBase("chevaliere_acier");
    public static final Item CHEVALIERE_ETAIN=new ItemBase("chevaliere_etain");
    public static final Item CHEVALIERE_FER=new ItemBase("chevaliere_fer");

    public static final Item DIADEME_OR=new ItemBase("diademe_or");
    public static final Item DIADEME_ARGENT=new ItemBase("diademe_argent");
    public static final Item DIADEME_CUIVRE=new ItemBase("diademe_cuivre");
    public static final Item DIADEME_ACIER=new ItemBase("diademe_acier");
    public static final Item DIADEME_ETAIN=new ItemBase("diademe_etain");
    public static final Item DIADEME_BRONZE=new ItemBase("diademe_bronze");
    public static final Item DIADEME_FER=new ItemBase("diademe_fer");

    public static final Item BRACELET_PERLE=new ItemBase("bracelet_perle");

    public static final Item FIL_OR=new ItemBase("fil_or");
    public static final Item FIL_ARGENT=new ItemBase("fil_argent");

    public static final Item ANNEAU_BOIS=new ItemBase("anneau_bois");
    public static final Item BRACELET_CUIR=new ItemBase("bracelet_cuir");
    public static final Item GRIFFE_DE_SERTISSAGE=new ItemBase("griffe_de_sertissage");
    public static final Item FERMOIR=new ItemBase("fermoir");
    public static final Item FEUILLE_OR=new ItemBase("feuille_or");
    public static final Item FEUILLE_ARGENT=new ItemBase("feuille_argent");
    public static final Item POINTE_OR=new ItemBase("pointe_or");
    public static final Item POINTE_ARGENT=new ItemBase("pointe_argent");
    */

    // Bijoux SERTIS

    //Torque ajouté pour test
    public static final Item TORQUE_OR_SERTIE = new ItemInventory("torque_or_sertie", 12);
    /*
    public static final Item TORQUE_ARGENT_SERTIE=new BijouSerti("torque_argent_sertie");
    public static final Item TORQUE_ACIER_SERTIE=new BijouSerti("torque_acier_sertie");
    public static final Item TORQUE_ETAIN_SERTIE=new BijouSerti("torque_etain_sertie");
    public static final Item TORQUE_CUIVRE_SERTIE=new BijouSerti("torque_cuivre_sertie");
    public static final Item TORQUE_BRONZE_SERTIE=new BijouSerti("torque_bronze_sertie");
    public static final Item TORQUE_FER_SERTIE=new BijouSerti("torque_fer_sertie");

    public static final Item BROCHE_OR_SERTIE=new BijouSerti("broche_or_sertie");
    public static final Item BROCHE_ARGENT_SERTIE=new BijouSerti("broche_argent_sertie");
    public static final Item BROCHE_ACIER_SERTIE=new BijouSerti("broche_acier_sertie");
    public static final Item BROCHE_ETAIN_SERTIE=new BijouSerti("broche_etain_sertie");
    public static final Item BROCHE_CUIVRE_SERTIE=new BijouSerti("broche_cuivre_sertie");
    public static final Item BROCHE_BRONZE_SERTIE=new BijouSerti("broche_bronze_sertie");
    public static final Item BROCHE_FER_SERTIE=new BijouSerti("broche_fer_sertie");

    public static final Item BROCHE_IVOIRE_SERTIE=new BijouSerti("broche_ivoire_sertie");

    public static final Item CHEVALIERE_OR_SERTIE=new BijouSerti("chevaliere_or_sertie");
    public static final Item CHEVALIERE_ARGENT_SERTIE=new BijouSerti("chevaliere_argent_sertie");
    public static final Item CHEVALIERE_ACIER_SERTIE=new BijouSerti("chevaliere_acier_sertie");
    public static final Item CHEVALIERE_ETAIN_SERTIE=new BijouSerti("chevaliere_etain_sertie");
    public static final Item CHEVALIERE_CUIVRE_SERTIE=new BijouSerti("chevaliere_cuivre_sertie");
    public static final Item CHEVALIERE_BRONZE_SERTIE=new BijouSerti("chevaliere_bronze_sertie");
    public static final Item CHEVALIERE_FER_SERTIE=new BijouSerti("chevaliere_fer_sertie");

    public static final Item DIADEME_OR_SERTI=new BijouSerti("diademe_or_serti");
    public static final Item DIADEME_ARGENT_SERTI=new BijouSerti("diademe_argent_serti");
    public static final Item DIADEME_ACIER_SERTI=new BijouSerti("diademe_acier_serti");
    public static final Item DIADEME_ETAIN_SERTI=new BijouSerti("diademe_etain_serti");
    public static final Item DIADEME_CUIVRE_SERTI=new BijouSerti("diademe_cuivre_serti");
    public static final Item DIADEME_BRONZE_SERTI=new BijouSerti("diademe_bronze_serti");
    public static final Item DIADEME_FER_SERTI=new BijouSerti("diademe_fer_serti");

    public static final Item BAGUE_OR_SERTIE=new BijouSerti("bague_or_sertie");
    public static final Item BAGUE_ARGENT_SERTIE=new BijouSerti("bague_argent_sertie");
    public static final Item BAGUE_ACIER_SERTIE=new BijouSerti("bague_acier_sertie");
    public static final Item BAGUE_ETAIN_SERTIE=new BijouSerti("bague_etain_sertie");
    public static final Item BAGUE_CUIVRE_SERTIE=new BijouSerti("bague_cuivre_sertie");
    public static final Item BAGUE_BRONZE_SERTIE=new BijouSerti("bague_bronze_sertie");
    public static final Item BAGUE_FER_SERTIE=new BijouSerti("bague_fer_sertie");

    public static final Item COLLIER_OR_SERTIE=new BijouSerti("collier_or_sertie");
    public static final Item COLLIER_ARGENT_SERTIE=new BijouSerti("collier_argent_sertie");
    public static final Item COLLIER_ACIER_SERTI=new BijouSerti("collier_acier_serti");
    public static final Item COLLIER_ETAIN_SERTI=new BijouSerti("collier_etain_serti");
    public static final Item COLLIER_CUIVRE_SERTI=new BijouSerti("collier_cuivre_serti");
    public static final Item COLLIER_BRONZE_SERTI=new BijouSerti("collier_bronze_serti");
    public static final Item COLLIER_FER_SERTI=new BijouSerti("collier_fer_serti");

    public static final Item BOUCLES_OREILLES_OR_SERTIE=new BijouSerti("boucles_oreilles_or_sertie");
    public static final Item BOUCLES_OREILLES_ARGENT_SERTIE=new BijouSerti("boucles_oreilles_argent_sertie");
    public static final Item BOUCLES_OREILLES_ACIER_SERTIE=new BijouSerti("boucles_oreilles_acier_sertie");
    public static final Item BOUCLES_OREILLES_ETAIN_SERTIE=new BijouSerti("boucles_oreilles_etain_sertie");
    public static final Item BOUCLES_OREILLES_CUIVRE_SERTIE=new BijouSerti("boucles_oreilles_cuivre_sertie");
    public static final Item BOUCLES_OREILLES_BRONZE_SERTIE=new BijouSerti("boucles_oreilles_bronze_sertie");
    public static final Item BOUCLES_OREILLES_FER_SERTIE=new BijouSerti("boucles_oreilles_fer_sertie");

    public static final Item BRACELET_OR_SERTI=new BijouSerti("bracelet_or_serti");
    public static final Item BRACELET_ARGENT_SERTI=new BijouSerti("bracelet_argent_serti");
    public static final Item BRACELET_ACIER_SERTI=new BijouSerti("bracelet_acier_serti");
    public static final Item BRACELET_ETAIN_SERTI=new BijouSerti("bracelet_etain_serti");
    public static final Item BRACELET_CUIVRE_SERTI=new BijouSerti("bracelet_cuivre_serti");
    public static final Item BRACELET_BRONZE_SERTI=new BijouSerti("bracelet_bronze_serti");
    public static final Item BRACELET_FER_SERTI=new BijouSerti("bracelet_fer_serti");

    public static final Item MANCHETTE_OR_SERTIE=new BijouSerti("manchette_or_sertie");
    public static final Item MANCHETTE_ARGENT_SERTIE=new BijouSerti("manchette_argent_sertie");
    public static final Item MANCHETTE_ACIER_SERTIE=new BijouSerti("manchette_acier_sertie");
    public static final Item MANCHETTE_ETAIN_SERTIE=new BijouSerti("manchette_etain_sertie");
    public static final Item MANCHETTE_CUIVRE_SERTIE=new BijouSerti("manchette_cuivre_sertie");
    public static final Item MANCHETTE_BRONZE_SERTIE=new BijouSerti("manchette_bronze_sertie");
    public static final Item MANCHETTE_FER_SERTIE=new BijouSerti("manchette_fer_sertie");
    */

    public static final Item BOUCLE_CEINTURE_ETAIN = new ItemBase("boucle_ceinture_etain");
    public static final Item BOUCLE_CEINTURE_CUIVRE = new ItemBase("boucle_ceinture_cuivre");
    public static final Item BOUCLE_CEINTURE_BRONZE = new ItemBase("boucle_ceinture_bronze");
    public static final Item BOUCLE_CEINTURE_FER = new ItemBase("boucle_ceinture_fer");

    //Potier - Tailleur pierre

    public static final Item BOL_EN_ARGILE = new ItemBase("bol_en_argile");
    public static final Item BOL_EN_ARGILE_CRUE = new ItemBase("bol_en_argile_crue");
    public static final Item BONHOMME_EN_GLAISE = new ItemBase("bonhomme_en_glaise");
    public static final Item CHEVAL_EN_GLAISE = new ItemBase("cheval_en_glaise");
    public static final Item CHOPPE_EN_ARGILE = new ItemBase("choppe_en_argile");
    public static final Item CHOPPE_EN_ARGILE_CRUE = new ItemBase("choppe_en_argile_crue");
    public static final Item GRAND_POT_EN_ARGILE = new ItemBase("grand_pot_en_argile");
    public static final Item GRAND_POT_EN_ARGILE_CRUE = new ItemBase("grand_pot_en_argile_crue");
    public static final Item JARRE_EN_ARGILE = new ItemBase("jarre_en_argile");
    public static final Item JARRE_EN_ARGILE_CRUE = new ItemBase("jarre_en_argile_crue");
    public static final Item MORTIER = new ItemBase("mortier");
    public static final Item MOULE = new ItemBase("moule");
    public static final Item POT_DE_FLEUR_CRU = new ItemBase("pot_de_fleur_cru");
    public static final Item ROUE_EN_PIERRE = new ItemBase("roue_en_pierre");
    public static final Item THEIERE = new ItemBase("theiere");
    public static final Item THEIERE_CRUE = new ItemBase("theiere_crue");
    public static final Item TUILE_ARDOISE = new ItemBase("tuile_ardoise");
    public static final Item TUILE_SIMPLE = new ItemBase("tuile_simple");
    public static final Item TUILE_SIMPLE_CRU = new ItemBase("tuile_simple_cru");

    public static final Item BRIQUE_DE_DIORITE = new ItemBase("brique_de_diorite");
    public static final Item BRIQUE_DE_GRANITE = new ItemBase("brique_de_granite");
    public static final Item BRIQUE_DE_GRES = new ItemBase("brique_de_gres");
    public static final Item BRIQUE_DE_GRES_ROUGE = new ItemBase("brique_de_gres_rouge");
    public static final Item BRIQUE_DE_MARBRE = new ItemBase("brique_de_marbre");
    public static final Item BRIQUE_DE_PIERRE = new ItemBase("brique_de_pierre");
    public static final Item BRIQUE_D_ANDESITE = new ItemBase("brique_d_andesite");

    public static final Item STATUETTE_MARBRE = new ItemBase("statuette_marbre");
    public static final Item STATUETTE_PIERRE = new ItemBase("statuette_pierre");
    public static final Item MOULE_FROMAGE = new ItemBase("moule_fromage");

    //seaux et verres pleins

    public static final Item SEAU_D_EAU_EN_BOIS = new SeauBois(Blocks.FLOWING_WATER, "seau_d_eau_en_bois");
    public static final Item SEAU_EN_BOIS = new SeauBois(Blocks.AIR, "seau_en_bois");

    public static final Item BOCAL = new ItemBase("bocal");
    public static final Item BOUTEILLE_VIDE = new ItemBase("bouteille_vide");
    public static final Item BOUTEILLE_SALE = new ItemBase("bouteille_sale");
    public static final Item CHOPPE_EN_VERRE = new ItemBase("choppe_en_verre");
    public static final Item VERRE_A_PIED = new ItemBase("verre_a_pied");

    public static final Item VERRE_A_PIED_EAU = new ItemContainer("verre_a_pied_eau", 0, 0.2F, false, VERRE_A_PIED, 0);
    public static final Item CHOPPE_EN_VERRE_EAU = new ItemContainer("choppe_en_verre_eau", 0, 0.2F, false, CHOPPE_EN_VERRE_SALE, 0);
    public static final Item CHOPPE_EN_ARGILE_EAU = new ItemContainer("choppe_en_argile_eau", 0, 0.2F, false, CHOPPE_EN_ARGILE_SALE, 0);
    public static final Item BOUTEILLE_D_EAU = new ItemContainer("bouteille_d_eau", 0, 0.2F, false, BOUTEILLE_SALE, 4);
    public static final Item BOCAL_D_EAU = new ItemContainer("bocal_d_eau", 0, 0.2F, false, ItemStack.EMPTY.getItem(), 1);

    public static final Item SEAU_DE_LAIT_EN_BOIS = new ItemBase("seau_de_lait_en_bois");
    public static final Item VERRE_A_PIED_LAIT = new ItemContainer("verre_a_pied_lait", 0, 0.2F, false, VERRE_A_PIED, 0);
    public static final Item CHOPPE_EN_VERRE_LAIT = new ItemContainer("choppe_en_verre_lait", 0, 0.2F, false, CHOPPE_EN_VERRE_SALE, 0);
    public static final Item CHOPPE_EN_ARGILE_LAIT = new ItemContainer("choppe_en_argile_lait", 0, 0.2F, false, CHOPPE_EN_ARGILE_SALE, 0);
    public static final Item BOUTEILLE_DE_LAIT = new ItemContainer("bouteille_de_lait", 0, 0.2F, false, BOUTEILLE_SALE, 4);
    public static final Item BOCAL_DE_LAIT = new ItemContainer("bocal_de_lait", 0, 0.2F, false, ItemStack.EMPTY.getItem(), 1);

    public static final Item SEAU_DE_BIERRE_BLONDE = new ItemBase("seau_de_bierre_blonde");
    public static final Item SEAU_DE_BIERRE_BLONDE_EN_BOIS = new ItemBase("seau_de_bierre_blonde_en_bois");
    public static final Item VERRE_A_PIED_BIERRE_BLONDE = new ItemContainer("verre_a_pied_bierre_blonde", 0, 0.2F, false, VERRE_A_PIED, 0);
    public static final Item CHOPPE_EN_VERRE_BIERRE_BLONDE = new ItemContainer("choppe_en_verre_bierre_blonde", 0, 0.2F, false, CHOPPE_EN_VERRE_SALE, 0);
    public static final Item CHOPPE_EN_ARGILE_BIERRE_BLONDE = new ItemContainer("choppe_en_argile_bierre_blonde", 0, 0.2F, false, CHOPPE_EN_ARGILE_SALE, 0);
    public static final Item BOUTEILLE_DE_BIERRE_BLONDE = new ItemContainer("bouteille_de_bierre_blonde", 0, 0.2F, false, BOUTEILLE_SALE, 4);
    public static final Item BOCAL_DE_BIERRE_BLONDE = new ItemContainer("bocal_de_bierre_blonde", 0, 0.2F, false, ItemStack.EMPTY.getItem(), 1);

    public static final Item SEAU_DE_BIERE_BRUNE = new ItemBase("seau_de_biere_brune");
    public static final Item SEAU_DE_BIERE_BRUNE_EN_BOIS = new ItemBase("seau_de_biere_brune_en_bois");
    public static final Item VERRE_A_PIED_BIERE_BRUNE = new ItemContainer("verre_a_pied_biere_brune", 0, 0.2F, false, VERRE_A_PIED, 0);
    public static final Item CHOPPE_EN_VERRE_BIERE_BRUNE = new ItemContainer("choppe_en_verre_biere_brune", 0, 0.2F, false, CHOPPE_EN_VERRE_SALE, 0);
    public static final Item CHOPPE_EN_ARGILE_BIERE_BRUNE = new ItemContainer("choppe_en_argile_biere_brune", 0, 0.2F, false, CHOPPE_EN_ARGILE_SALE, 0);
    public static final Item BOUTEILLE_DE_BIERE_BRUNE = new ItemContainer("bouteille_de_biere_brune", 0, 0.2F, false, BOUTEILLE_SALE, 4);
    public static final Item BOCAL_DE_BIERE_BRUNE = new ItemContainer("bocal_de_biere_brune", 0, 0.2F, false, ItemStack.EMPTY.getItem(), 1);

    public static final Item SEAU_DE_BIERE_ROUSSE = new ItemBase("seau_de_biere_rousse");
    public static final Item SEAU_DE_BIERE_ROUSSE_EN_BOIS = new ItemBase("seau_de_biere_rousse_en_bois");
    public static final Item VERRE_A_PIED_BIERE_ROUSSE = new ItemContainer("verre_a_pied_biere_rousse", 0, 0.2F, false, VERRE_A_PIED, 0);
    public static final Item CHOPPE_EN_VERRE_BIERE_ROUSSE = new ItemContainer("choppe_en_verre_biere_rousse", 0, 0.2F, false, CHOPPE_EN_VERRE_SALE, 0);
    public static final Item CHOPPE_EN_ARGILE_BIERE_ROUSSE = new ItemContainer("choppe_en_argile_biere_rousse", 0, 0.2F, false, CHOPPE_EN_ARGILE_SALE, 0);
    public static final Item BOUTEILLE_DE_BIERE_ROUSSE = new ItemContainer("bouteille_de_biere_rousse", 0, 0.2F, false, BOUTEILLE_SALE, 4);
    public static final Item BOCAL_DE_BIERE_ROUSSE = new ItemContainer("bocal_de_biere_rousse", 0, 0.2F, false, ItemStack.EMPTY.getItem(), 1);

    public static final Item SEAU_DE_VIN_BLANC = new ItemBase("seau_de_vin_blanc");
    public static final Item SEAU_DE_VIN_BLANC_EN_BOIS = new ItemBase("seau_de_vin_blanc_en_bois");
    public static final Item VERRE_A_PIED_VIN_BLANC = new ItemContainer("verre_a_pied_vin_blanc", 0, 0.2F, false, VERRE_A_PIED, 0);
    public static final Item CHOPPE_EN_VERRE_VIN_BLANC = new ItemContainer("choppe_en_verre_vin_blanc", 0, 0.2F, false, CHOPPE_EN_VERRE_SALE, 0);
    public static final Item CHOPPE_EN_ARGILE_VIN_BLANC = new ItemContainer("choppe_en_argile_vin_blanc", 0, 0.2F, false, CHOPPE_EN_ARGILE_SALE, 0);
    public static final Item BOUTEILLE_DE_VIN_BLANC = new ItemContainer("bouteille_de_vin_blanc", 0, 0.2F, false, BOUTEILLE_SALE, 4);
    public static final Item BOCAL_DE_VIN_BLANC = new ItemContainer("bocal_de_vin_blanc", 0, 0.2F, false, ItemStack.EMPTY.getItem(), 1);

    public static final Item SEAU_DE_VIN_ROUGE = new ItemBase("seau_de_vin_rouge");
    public static final Item SEAU_DE_VIN_ROUGE_EN_BOIS = new ItemBase("seau_de_vin_rouge_en_bois");
    public static final Item VERRE_A_PIED_VIN_ROUGE = new ItemContainer("verre_a_pied_vin_rouge", 0, 0.2F, false, VERRE_A_PIED, 0);
    public static final Item CHOPPE_EN_VERRE_VIN_ROUGE = new ItemContainer("choppe_en_verre_vin_rouge", 0, 0.2F, false, CHOPPE_EN_VERRE_SALE, 0);
    public static final Item CHOPPE_EN_ARGILE_VIN_ROUGE = new ItemContainer("choppe_en_argile_vin_rouge", 0, 0.2F, false, CHOPPE_EN_ARGILE_SALE, 0);
    public static final Item BOUTEILLE_DE_VIN_ROUGE = new ItemContainer("bouteille_de_vin_rouge", 0, 0.2F, false, BOUTEILLE_SALE, 4);
    public static final Item BOCAL_DE_VIN_ROUGE = new ItemContainer("bocal_de_vin_rouge", 0, 0.2F, false, ItemStack.EMPTY.getItem(), 1);

    public static final Item SEAU_DE_RHUM = new ItemBase("seau_de_rhum");
    public static final Item SEAU_DE_RHUM_EN_BOIS = new ItemBase("seau_de_rhum_en_bois");
    public static final Item VERRE_A_PIED_RHUM = new ItemContainer("verre_a_pied_rhum", 0, 0.2F, false, VERRE_A_PIED, 0);
    public static final Item CHOPPE_EN_VERRE_RHUM = new ItemContainer("choppe_en_verre_rhum", 0, 0.2F, false, CHOPPE_EN_VERRE_SALE, 0);
    public static final Item CHOPPE_EN_ARGILE_RHUM = new ItemContainer("choppe_en_argile_rhum", 0, 0.2F, false, CHOPPE_EN_ARGILE_SALE, 0);
    public static final Item BOUTEILLE_DE_RHUM = new ItemContainer("bouteille_de_rhum", 0, 0.2F, false, BOUTEILLE_SALE, 4);
    public static final Item BOCAL_DE_RHUM = new ItemContainer("bocal_de_rhum", 0, 0.2F, false, ItemStack.EMPTY.getItem(), 1);

    public static final Item SEAU_DE_HYDROMEL = new ItemBase("seau_de_hydromel");
    public static final Item SEAU_DE_HYDROMEL_EN_BOIS = new ItemBase("seau_de_hydromel_en_bois");
    public static final Item VERRE_A_PIED_HYDROMEL = new ItemContainer("verre_a_pied_hydromel", 0, 0.2F, false, VERRE_A_PIED, 0);
    public static final Item CHOPPE_EN_VERRE_HYDROMEL = new ItemContainer("choppe_en_verre_hydromel", 0, 0.2F, false, CHOPPE_EN_VERRE_SALE, 0);
    public static final Item CHOPPE_EN_ARGILE_HYDROMEL = new ItemContainer("choppe_en_argile_hydromel", 0, 0.2F, false, CHOPPE_EN_ARGILE_SALE, 0);
    public static final Item BOUTEILLE_DE_HYDROMEL = new ItemContainer("bouteille_de_hydromel", 0, 0.2F, false, BOUTEILLE_SALE, 4);
    public static final Item BOCAL_DE_HYDROMEL = new ItemContainer("bocal_de_hydromel", 0, 0.2F, false, ItemStack.EMPTY.getItem(), 1);

    public static final Item GROSSE_BOUTEILLE_VIDE = new ItemBase("grosse_bouteille_vide");
    public static final Item BOUTEILLE_HUILE_OLIVE = new ItemContainer("bouteille_huile_olive", 0, 0.2F, false, GROSSE_BOUTEILLE_VIDE, 6);
    public static final Item BOUTEILLE_HUILE_TOURNESOL = new ItemContainer("bouteille_huile_tournesol", 0, 0.2F, false, GROSSE_BOUTEILLE_VIDE, 6);
    public static final Item BOUTEILLE_HUILE_NOIX = new ItemContainer("bouteille_huile_noix", 0, 0.2F, false, GROSSE_BOUTEILLE_VIDE, 6);
    public static final Item BOUTEILLE_VINAIGRE = new ItemContainer("bouteille_vinaigre", 0, 0.2F, false, GROSSE_BOUTEILLE_VIDE, 6);

    public static final Item BOUTEILLE_DE_JUS_DE_FRUIT_VERT = new ItemContainer("bouteille_de_jus_de_fruit_vert", 0, 0.2F, false, BOUTEILLE_SALE, 4);
    public static final Item BOUTEILLE_DE_JUS_DE_FRUIT_ROUGE = new ItemContainer("bouteille_de_jus_de_fruit_rouge", 0, 0.2F, false, BOUTEILLE_SALE, 4);
    public static final Item BOUTEILLE_DE_JUS_DE_FRUIT_BLANC = new ItemContainer("bouteille_de_jus_de_fruit_blanc", 0, 0.2F, false, BOUTEILLE_SALE, 4);
    public static final Item BOUTEILLE_DE_JUS_DE_FRUIT_ORANGE = new ItemContainer("bouteille_de_jus_de_fruit_orange", 0, 0.2F, false, BOUTEILLE_SALE, 4);
    public static final Item BOUTEILLE_DE_JUS_DE_FRUIT_JAUNE = new ItemContainer("bouteille_de_jus_de_fruit_jaune", 0, 0.2F, false, BOUTEILLE_SALE, 4);

    // AJOUT BRASSEURS juillet 23
    public static final Item ALAMBIC = new ItemIngrediant("alambic", Reference.DURABILITE_BRONZE);

    public static final Item SEAU_ALCOOL_PUR = new ItemBase("seau_alcool_pur");
    public static final Item SEAU_ALCOOL_PUR_EN_BOIS = new ItemBase("seau_alcool_pur_en_bois");
    public static final Item BOCAL_ALCOOL_PUR = new ItemContainer("bocal_alcool_pur",0,0.2F,false, BOCAL, 2);

    public static final Item VESOU = new ItemBase("vesou");
    public static final Item MOUT_RAISIN_BLANC = new ItemBase("mout_raisin_blanc");
    public static final Item MOUT_RAISIN_NOIR = new ItemBase("mout_raisin_noir");

    public static final Item CHOPPE_EN_ARGILE_JUS_DE_FRUIT_VERT = new ItemContainer("choppe_en_argile_jus_de_fruit_vert", 0, 0.2F, false, CHOPPE_EN_ARGILE_SALE, 0);
    public static final Item CHOPPE_EN_VERRE_JUS_DE_FRUIT_VERT = new ItemContainer("choppe_en_verre_jus_de_fruit_vert", 0, 0.2F, false, CHOPPE_EN_VERRE_SALE, 0);
    public static final Item MOUT_FRUIT_VERT = new ItemBase("mout_fruit_vert");
    public static final Item SEAU_JUS_DE_FRUIT_VERT = new ItemBase("seau_jus_de_fruit_vert");
    public static final Item SEAU_JUS_DE_FRUIT_VERT_EN_BOIS = new ItemBase("seau_jus_de_fruit_vert_en_bois");
    public static final Item VERRE_A_PIED_JUS_DE_FRUIT_VERT = new ItemContainer("verre_a_pied_jus_de_fruit_vert", 0, 0.2F, false, VERRE_A_PIED, 0);

    public static final Item CHOPPE_EN_ARGILE_JUS_DE_FRUIT_ROUGE = new ItemContainer("choppe_en_argile_jus_de_fruit_rouge", 0, 0.2F, false, CHOPPE_EN_ARGILE_SALE, 0);
    public static final Item CHOPPE_EN_VERRE_JUS_DE_FRUIT_ROUGE = new ItemContainer("choppe_en_verre_jus_de_fruit_rouge", 0, 0.2F, false, CHOPPE_EN_VERRE_SALE, 0);
    public static final Item MOUT_FRUIT_ROUGE = new ItemBase("mout_fruit_rouge");
    public static final Item SEAU_JUS_DE_FRUIT_ROUGE = new ItemBase("seau_jus_de_fruit_rouge");
    public static final Item SEAU_JUS_DE_FRUIT_ROUGE_EN_BOIS = new ItemBase("seau_jus_de_fruit_rouge_en_bois");
    public static final Item VERRE_A_PIED_JUS_DE_FRUIT_ROUGE = new ItemContainer("verre_a_pied_jus_de_fruit_rouge", 0, 0.2F, false, VERRE_A_PIED, 0);

    public static final Item CHOPPE_EN_ARGILE_JUS_DE_FRUIT_BLANC = new ItemContainer("choppe_en_argile_jus_de_fruit_blanc", 0, 0.2F, false, CHOPPE_EN_ARGILE_SALE, 0);
    public static final Item CHOPPE_EN_VERRE_JUS_DE_FRUIT_BLANC = new ItemContainer("choppe_en_verre_jus_de_fruit_blanc", 0, 0.2F, false, CHOPPE_EN_VERRE_SALE, 0);
    public static final Item MOUT_FRUIT_BLANC = new ItemBase("mout_fruit_blanc");
    public static final Item SEAU_JUS_DE_FRUIT_BLANC = new ItemBase("seau_jus_de_fruit_blanc");
    public static final Item SEAU_JUS_DE_FRUIT_BLANC_EN_BOIS = new ItemBase("seau_jus_de_fruit_blanc_en_bois");
    public static final Item VERRE_A_PIED_JUS_DE_FRUIT_BLANC = new ItemContainer("verre_a_pied_jus_de_fruit_blanc", 0, 0.2F, false, VERRE_A_PIED, 0);

    public static final Item CHOPPE_EN_ARGILE_JUS_DE_FRUIT_ORANGE = new ItemContainer("choppe_en_argile_jus_de_fruit_orange", 0, 0.2F, false, CHOPPE_EN_ARGILE_SALE, 0);
    public static final Item CHOPPE_EN_VERRE_JUS_DE_FRUIT_ORANGE = new ItemContainer("choppe_en_verre_jus_de_fruit_orange", 0, 0.2F, false, CHOPPE_EN_VERRE_SALE, 0);
    public static final Item MOUT_FRUIT_ORANGE = new ItemBase("mout_fruit_orange");
    public static final Item SEAU_JUS_DE_FRUIT_ORANGE = new ItemBase("seau_jus_de_fruit_orange");
    public static final Item SEAU_JUS_DE_FRUIT_ORANGE_EN_BOIS = new ItemBase("seau_jus_de_fruit_orange_en_bois");
    public static final Item VERRE_A_PIED_JUS_DE_FRUIT_ORANGE = new ItemContainer("verre_a_pied_jus_de_fruit_orange", 0, 0.2F, false, VERRE_A_PIED, 0);

    public static final Item CHOPPE_EN_ARGILE_JUS_DE_FRUIT_JAUNE = new ItemContainer("choppe_en_argile_jus_de_fruit_jaune", 0, 0.2F, false, CHOPPE_EN_ARGILE_SALE, 0);
    public static final Item CHOPPE_EN_VERRE_JUS_DE_FRUIT_JAUNE = new ItemContainer("choppe_en_verre_jus_de_fruit_jaune", 0, 0.2F, false, CHOPPE_EN_VERRE_SALE, 0);
    public static final Item MOUT_FRUIT_JAUNE = new ItemBase("mout_fruit_jaune");
    public static final Item SEAU_JUS_DE_FRUIT_JAUNE = new ItemBase("seau_jus_de_fruit_jaune");
    public static final Item SEAU_JUS_DE_FRUIT_JAUNE_EN_BOIS = new ItemBase("seau_jus_de_fruit_jaune_en_bois");
    public static final Item VERRE_A_PIED_JUS_DE_FRUIT_JAUNE = new ItemContainer("verre_a_pied_jus_de_fruit_jaune", 0, 0.2F, false, VERRE_A_PIED, 0);

    public static final Item BOUTEILLE_HYPOCRAS = new ItemContainer("bouteille_hypocras", 0, 0.2F, false, BOUTEILLE_SALE, 4);
    public static final Item CHOPPE_EN_ARGILE_HYPOCRAS = new ItemContainer("choppe_en_argile_hypocras", 0, 0.2F, false, CHOPPE_EN_ARGILE_SALE, 0);
    public static final Item CHOPPE_EN_VERRE_HYPOCRAS = new ItemContainer("choppe_en_verre_hypocras", 0, 0.2F, false, CHOPPE_EN_VERRE_SALE, 0);
    public static final Item SEAU_HYPOCRAS = new ItemBase("seau_hypocras");
    public static final Item SEAU_HYPOCRAS_EN_BOIS = new ItemBase("seau_hypocras_en_bois");
    public static final Item VERRE_A_PIED_HYPOCRAS = new ItemContainer("verre_a_pied_hypocras", 0, 0.2F, false, VERRE_A_PIED, 0);

    public static final Item BOUTEILLE_LIQUEUR_FRUIT = new ItemContainer("bouteille_liqueur_fruit", 0, 0.2F, false, BOUTEILLE_SALE, 4);
    public static final Item CHOPPE_EN_ARGILE_LIQUEUR_FRUIT = new ItemContainer("choppe_en_argile_liqueur_fruit", 0, 0.2F, false, CHOPPE_EN_ARGILE_SALE, 0);
    public static final Item CHOPPE_EN_VERRE_LIQUEUR_FRUIT = new ItemContainer("choppe_en_verre_liqueur_fruit", 0, 0.2F, false, CHOPPE_EN_VERRE_SALE, 0);
    public static final Item SEAU_LIQUEUR_FRUIT = new ItemBase("seau_liqueur_fruit");
    public static final Item SEAU_LIQUEUR_FRUIT_EN_BOIS = new ItemBase("seau_liqueur_fruit_en_bois");
    public static final Item VERRE_A_PIED_LIQUEUR_FRUIT = new ItemContainer("verre_a_pied_liqueur_fruit", 0, 0.2F, false, VERRE_A_PIED, 0);

    public static final Item BOUTEILLE_JAGERMEISTER = new ItemContainer("bouteille_jagermeister", 0, 0.2F, false, BOUTEILLE_SALE, 4);
    public static final Item CHOPPE_EN_ARGILE_JAGERMEISTER = new ItemContainer("choppe_en_argile_jagermeister", 0, 0.2F, false, CHOPPE_EN_ARGILE_SALE, 0);
    public static final Item CHOPPE_EN_VERRE_JAGERMEISTER = new ItemContainer("choppe_en_verre_jagermeister", 0, 0.2F, false, CHOPPE_EN_VERRE_SALE, 0);
    public static final Item SEAU_JAGERMEISTER = new ItemBase("seau_jagermeister");
    public static final Item SEAU_JAGERMEISTER_EN_BOIS = new ItemBase("seau_jagermeister_en_bois");
    public static final Item VERRE_A_PIED_JAGERMEISTER = new ItemContainer("verre_a_pied_jagermeister", 0, 0.2F, false, VERRE_A_PIED, 0);

    public static final Item BOUTEILLE_VIPERINE = new ItemContainer("bouteille_viperine", 0, 0.2F, false, BOUTEILLE_SALE, 4);
    public static final Item CHOPPE_EN_ARGILE_VIPERINE = new ItemContainer("choppe_en_argile_viperine", 0, 0.2F, false, CHOPPE_EN_ARGILE_SALE, 0);
    public static final Item CHOPPE_EN_VERRE_VIPERINE = new ItemContainer("choppe_en_verre_viperine", 0, 0.2F, false, CHOPPE_EN_VERRE_SALE, 0);
    public static final Item SEAU_VIPERINE = new ItemBase("seau_viperine");
    public static final Item SEAU_VIPERINE_EN_BOIS = new ItemBase("seau_viperine_en_bois");
    public static final Item VERRE_A_PIED_VIPERINE = new ItemContainer("verre_a_pied_viperine", 0, 0.2F, false, VERRE_A_PIED, 0);

    public static final Item BOUTEILLE_NIGORIZAKE = new ItemContainer("bouteille_nigorizake", 0, 0.2F, false, BOUTEILLE_SALE, 4);
    public static final Item CHOPPE_EN_ARGILE_NIGORIZAKE = new ItemContainer("choppe_en_argile_nigorizake", 0, 0.2F, false, CHOPPE_EN_ARGILE_SALE, 0);
    public static final Item CHOPPE_EN_VERRE_NIGORIZAKE = new ItemContainer("choppe_en_verre_nigorizake", 0, 0.2F, false, CHOPPE_EN_VERRE_SALE, 0);
    public static final Item SEAU_NIGORIZAKE = new ItemBase("seau_nigorizake");
    public static final Item SEAU_NIGORIZAKE_EN_BOIS = new ItemBase("seau_nigorizake_en_bois");
    public static final Item VERRE_A_PIED_NIGORIZAKE = new ItemContainer("verre_a_pied_nigorizake", 0, 0.2F, false, VERRE_A_PIED, 0);

    public static final Item BOUTEILLE_RYE = new ItemContainer("bouteille_rye", 0, 0.2F, false, BOUTEILLE_SALE, 4);
    public static final Item CHOPPE_EN_ARGILE_RYE = new ItemContainer("choppe_en_argile_rye", 0, 0.2F, false, CHOPPE_EN_ARGILE_SALE, 0);
    public static final Item CHOPPE_EN_VERRE_RYE = new ItemContainer("choppe_en_verre_rye", 0, 0.2F, false, CHOPPE_EN_VERRE_SALE, 0);
    public static final Item SEAU_RYE = new ItemBase("seau_rye");
    public static final Item SEAU_RYE_EN_BOIS = new ItemBase("seau_rye_en_bois");
    public static final Item VERRE_A_PIED_RYE = new ItemContainer("verre_a_pied_rye", 0, 0.2F, false, VERRE_A_PIED, 0);


    //Contenants : sacs, bourses, saccoches, panier

    public static final Item PANIER_EN_OSIER = new ItemInventory("panier_en_osier", 1);

    public static final Item Grand_Sac = new ItemInventory("grand_sac", 9);

    public static final Item BOURSE_EN_CUIR = new ItemInventory("bourse_en_cuir", 0);
    public static final Item BOURSE_NOIRE = new ItemInventory("bourse_noire", 0);
    public static final Item BOURSE_MARRON = new ItemInventory("bourse_marron", 0);
    public static final Item BOURSE_CYAN = new ItemInventory("bourse_cyan", 0);
    public static final Item BOURSE_GRISE = new ItemInventory("bourse_grise", 0);
    public static final Item BOURSE_BLEU_CLAIR = new ItemInventory("bourse_bleu_clair", 0);
    public static final Item BOURSE_VERTE = new ItemInventory("bourse_verte", 0);
    public static final Item BOURSE_ROSE = new ItemInventory("bourse_rose", 0);
    public static final Item BOURSE_MAGENTA = new ItemInventory("bourse_magenta", 0);
    public static final Item BOURSE_ORANGE = new ItemInventory("bourse_orange", 0);
    public static final Item BOURSE_VIOLETTE = new ItemInventory("bourse_violette", 0);
    public static final Item BOURSE_ROUGE = new ItemInventory("bourse_rouge", 0);
    public static final Item BOURSE_BLANCHE = new ItemInventory("bourse_blanche", 0);
    public static final Item BOURSE_GRISE_CLAIR = new ItemInventory("bourse_grise_clair", 0);

    public static final Item SACOCHE_EN_CUIR = new ItemInventory("sacoche_en_cuir", 8);
    public static final Item SACOCHE_EN_CUIR_NOIR = new ItemInventory("sacoche_en_cuir_noir", 8);
    public static final Item SACOCHE_EN_CUIR_BLEU = new ItemInventory("sacoche_en_cuir_bleu", 8);
    public static final Item SACOCHE_EN_CUIR_MARRON = new ItemInventory("sacoche_en_cuir_marron", 8);
    public static final Item SACOCHE_EN_CUIR_CYAN = new ItemInventory("sacoche_en_cuir_cyan", 8);
    public static final Item SACOCHE_EN_CUIR_GRISE = new ItemInventory("sacoche_en_cuir_grise", 8);
    public static final Item SACOCHE_EN_CUIR_BLEU_CLAIR = new ItemInventory("sacoche_en_cuir_bleu_clair", 8);
    public static final Item SACOCHE_EN_CUIR_VERTE = new ItemInventory("sacoche_en_cuir_verte", 8);
    public static final Item SACOCHE_EN_CUIR_MAGENTA = new ItemInventory("sacoche_en_cuir_magenta", 8);
    public static final Item SACOCHE_EN_CUIR_ORANGE = new ItemInventory("sacoche_en_cuir_orange", 8);
    public static final Item SACOCHE_EN_CUIR_ROSE = new ItemInventory("sacoche_en_cuir_rose", 8);
    public static final Item SACOCHE_EN_CUIR_ROUGE = new ItemInventory("sacoche_en_cuir_rouge", 8);
    public static final Item SACOCHE_EN_CUIR_BLANCHE = new ItemInventory("sacoche_en_cuir_blanche", 8);
    public static final Item SACOCHE_EN_CUIR_JAUNE = new ItemInventory("sacoche_en_cuir_jaune", 8);
    public static final Item SACOCHE_EN_CUIR_GRISE_CLAIR = new ItemInventory("sacoche_en_cuir_gris_clair", 8);

    //Couturier

    public static final Item LANIERE_DE_CUIR = new ItemBase("laniere_de_cuir");
    public static final Item CUIR_TANNE = new ItemBase("cuir_tanne");

    public static final Item ETOFFE = new ItemBase("etoffe");
    public static final Item ETOFFE_BLEUE = new ItemBase("etoffe_bleue");
    public static final Item ETOFFE_BLEU_CIEL = new ItemBase("etoffe_bleu_ciel");
    public static final Item ETOFFE_CYAN = new ItemBase("etoffe_cyan");
    public static final Item ETOFFE_GRISE = new ItemBase("etoffe_grise");
    public static final Item ETOFFE_GRIS_CLAIR = new ItemBase("etoffe_gris_clair");
    public static final Item ETOFFE_JAUNE = new ItemBase("etoffe_jaune");
    public static final Item ETOFFE_MAGENTA = new ItemBase("etoffe_magenta");
    public static final Item ETOFFE_MARRON = new ItemBase("etoffe_marron");
    public static final Item ETOFFE_NOIRE = new ItemBase("etoffe_noire");
    public static final Item ETOFFE_ORANGE = new ItemBase("etoffe_orange");
    public static final Item ETOFFE_ROSE = new ItemBase("etoffe_rose");
    public static final Item ETOFFE_ROUGE = new ItemBase("etoffe_rouge");
    public static final Item ETOFFE_VERTE = new ItemBase("etoffe_verte");
    public static final Item ETOFFE_VERT_CLAIR = new ItemBase("etoffe_vert_clair");
    public static final Item ETOFFE_VIOLETTE = new ItemBase("etoffe_violette");

    public static final Item BOBINE_DE_CHANVRE = new ItemBase("bobine_de_chanvre");
    public static final Item BOBINE_DE_FIL = new ItemBase("bobine_de_fil");
    public static final Item BOBINE_DE_LAINE = new ItemBase("bobine_de_laine");
    public static final Item BOBINE_DE_LIN = new ItemBase("bobine_de_lin");
    public static final Item BOBINE_DE_SOIE = new ItemBase("bobine_de_soie");

    public static final Item FOURREAU = new ItemBase("fourreau");
    public static final Item FOURREAU_COURT = new ItemBase("fourreau_court");

    public static final Item BOTTES = new ItemBase("bottes");
    public static final Item BOTTES_APICULTEUR = new ItemBase("bottes_apiculteur");
    public static final Item BOTTES_FOURREES = new ItemBase("bottes_fourrees");
    public static final Item BOTTINES_EN_TISSU = new ItemBase("bottines_en_tissu");
    public static final Item CAPE = new ItemBase("cape");
    public static final Item CAPELINE = new ItemBase("capeline");
    public static final Item CARQUOIS = new ItemBase("carquois");
    public static final Item CEINTURE_EN_CUIR = new ItemBase("ceinture_en_cuir");
    public static final Item CHAPEAU_APICULTEUR = new ItemBase("chapeau_apiculteur");
    public static final Item CHAT_GRIS_EN_PELUCHE = new ItemBase("chat_gris_en_peluche");
    public static final Item CHAUSSURES_BASSES = new ItemBase("chaussures_basses");
    public static final Item CHAUSSURES_EN_CUIR = new ItemBase("chaussures_en_cuir");
    public static final Item CHAUSSURE_D_APICULTEUR = new ItemBase("chaussure_d_apiculteur");
    public static final Item CORDE = new ItemBase("corde");
    public static final Item COUSSIN = new ItemBase("coussin");
    public static final Item COUVERTURE = new ItemBase("couverture");
    public static final Item DRAP = new ItemBase("drap");
    public static final Item DRAPEAU_BLANC = new ItemBase("drapeau_blanc");
    public static final Item ECHARPE = new ItemBase("echarpe");
    public static final Item FIL_DE_CHANVRE = new ItemBase("fil_de_chanvre");
    public static final Item GANTS = new ItemBase("gants");
    public static final Item GANTS_EN_CUIR = new ItemBase("gants_en_cuir");
    public static final Item JUPE = new ItemBase("jupe");
    public static final Item LAPIN_ROSE_EN_PELUCHE = new ItemBase("lapin_rose_en_peluche");
    public static final Item MANTEAU = new ItemBase("manteau");
    public static final Item MANTEAU_COURT_FOURRE = new ItemBase("manteau_court_fourre");
    public static final Item MASQUE = new ItemBase("masque");
    public static final Item MOUCHOIR = new ItemBase("mouchoir");
    public static final Item OURSON_EN_PELUCHE = new ItemBase("ourson_en_peluche");
    public static final Item OURS_BRUN_EN_PELUCHE = new ItemBase("ours_brun_en_peluche");
    public static final Item OUTRE_VIDE = new ItemBase("outre_vide");
    public static final Item PANTALON = new ItemBase("pantalon");
    public static final Item PANTALON_APICULTEUR = new ItemBase("pantalon_apiculteur");
    public static final Item PELUCHE_POULPE = new ItemBase("peluche_poulpe");
    public static final Item PELUCHE_SOURIS = new ItemBase("peluche_souris");
    public static final Item PELUCHE_OISEAU_FEU = new ItemBase("peluche_oiseau_feu");
    public static final Item POUPEE = new ItemBase("poupee");
    public static final Item ROBE = new ItemBase("robe");
    public static final Item SAC_DE_COUCHAGE = new ItemBase("sac_de_couchage");
    public static final Item SOUS_VETEMENT_FEMININS = new ItemBase("sous_vetement_feminins");
    public static final Item SOUS_VETEMENT_MASCULIN = new ItemBase("sous_vetement_masculin");
    public static final Item TABLIER_EN_CUIR = new ItemBase("tablier_en_cuir");
    public static final Item TABLIER_EN_TISSU = new ItemBase("tablier_en_tissu");
    public static final Item TOGE = new ItemBase("toge");
    public static final Item TUNIQUE = new ItemBase("tunique");
    public static final Item TUNIQUE_APICULTEUR = new ItemBase("tunique_apiculteur");
    public static final Item VESTE = new ItemBase("veste");
    public static final Item BOUTON = new ItemBase("bouton");

    public static final Item PELUCHE_FLAMANT_ROSE = new ItemBase("peluche_flamant_rose");
    public static final Item PELUCHE_CORGI = new ItemBase("peluche_corgi");
    public static final Item PELUCHE_CHEVRE = new ItemBase("peluche_chevre");
    public static final Item PELUCHE_RAIE_MANTA = new ItemBase("peluche_raie_manta");

    // Vetements colorées

    public static final Item BOTTE_EN_CUIR_NOIR = new ItemBase("botte_en_cuir_noir");
    public static final Item BOTTE_EN_CUIR_BLEU = new ItemBase("botte_en_cuir_bleu");
    public static final Item BOTTE_EN_CUIR_CYAN = new ItemBase("botte_en_cuir_cyan");
    public static final Item BOTTE_EN_CUIR_GRIS = new ItemBase("botte_en_cuir_gris");
    public static final Item BOTTE_EN_CUIR_BLEU_CLAIR = new ItemBase("botte_en_cuir_bleu_clair");
    public static final Item BOTTE_EN_CUIR_VERT = new ItemBase("botte_en_cuir_vert");
    public static final Item BOTTE_EN_CUIR_MAGENTA = new ItemBase("botte_en_cuir_magenta");
    public static final Item BOTTE_EN_CUIR_ORANGE = new ItemBase("botte_en_cuir_orange");
    public static final Item BOTTE_EN_CUIR_ROSE = new ItemBase("botte_en_cuir_rose");
    public static final Item BOTTE_EN_CUIR_ROUGE = new ItemBase("botte_en_cuir_rouge");
    public static final Item BOTTE_EN_CUIR_BLANC = new ItemBase("botte_en_cuir_blanc");
    public static final Item BOTTE_EN_CUIR_JAUNE = new ItemBase("botte_en_cuir_jaune");
    public static final Item BOTTE_EN_CUIR_GRIS_CLAIR = new ItemBase("botte_en_cuir_gris_clair");
    public static final Item BOTTE_EN_CUIR_VERT_CLAIR = new ItemBase("botte_en_cuir_vert_clair");
    public static final Item BOTTE_EN_CUIR_VIOLET = new ItemBase("botte_en_cuir_violet");


    public static final Item CAPE_NOIR = new ItemBase("cape_noir");
    public static final Item CAPE_BLEU = new ItemBase("cape_bleu");
    public static final Item CAPE_MARRON = new ItemBase("cape_marron");
    public static final Item CAPE_CYAN = new ItemBase("cape_cyan");
    public static final Item CAPE_GRIS = new ItemBase("cape_gris");
    public static final Item CAPE_BLEU_CLAIR = new ItemBase("cape_bleu_clair");
    public static final Item CAPE_VERT = new ItemBase("cape_vert");
    public static final Item CAPE_MAGENTA = new ItemBase("cape_magenta");
    public static final Item CAPE_ORANGE = new ItemBase("cape_orange");
    public static final Item CAPE_ROSE = new ItemBase("cape_rose");
    public static final Item CAPE_ROUGE = new ItemBase("cape_rouge");
    public static final Item CAPE_BLANC = new ItemBase("cape_blanc");
    public static final Item CAPE_JAUNE = new ItemBase("cape_jaune");
    public static final Item CAPE_VIOLET = new ItemBase("cape_violet");
    public static final Item CAPE_VERT_CLAIR = new ItemBase("cape_vert_clair");


    public static final Item CHAPEAU_EN_CUIR_NOIR = new ItemBase("chapeau_en_cuir_noir");
    public static final Item CHAPEAU_EN_CUIR_BLEU = new ItemBase("chapeau_en_cuir_bleu");
    public static final Item CHAPEAU_EN_CUIR = new ItemBase("chapeau_en_cuir");
    public static final Item CHAPEAU_EN_CUIR_CYAN = new ItemBase("chapeau_en_cuir_cyan");
    public static final Item CHAPEAU_EN_CUIR_GRIS = new ItemBase("chapeau_en_cuir_gris");
    public static final Item CHAPEAU_EN_CUIR_BLEU_CLAIR = new ItemBase("chapeau_en_cuir_bleu_clair");
    public static final Item CHAPEAU_EN_CUIR_VERT = new ItemBase("chapeau_en_cuir_vert");
    public static final Item CHAPEAU_EN_CUIR_MAGENTA = new ItemBase("chapeau_en_cuir_magenta");
    public static final Item CHAPEAU_EN_CUIR_ORANGE = new ItemBase("chapeau_en_cuir_orange");
    public static final Item CHAPEAU_EN_CUIR_ROSE = new ItemBase("chapeau_en_cuir_rose");
    public static final Item CHAPEAU_EN_CUIR_ROUGE = new ItemBase("chapeau_en_cuir_rouge");
    public static final Item CHAPEAU_EN_CUIR_BLANC = new ItemBase("chapeau_en_cuir_blanc");
    public static final Item CHAPEAU_EN_CUIR_JAUNE = new ItemBase("chapeau_en_cuir_jaune");
    public static final Item CHAPEAU_EN_CUIR_VIOLET = new ItemBase("chapeau_en_cuir_violet");
    public static final Item CHAPEAU_EN_CUIR_VERT_CLAIR = new ItemBase("chapeau_en_cuir_vert_clair");

    public static final Item CHAPEAU_EN_TISSU_NOIR = new ItemBase("chapeau_en_tissu_noir");
    public static final Item CHAPEAU_EN_TISSU_BLEU = new ItemBase("chapeau_en_tissu_bleu");
    public static final Item CHAPEAU_EN_TISSU_MARRON = new ItemBase("chapeau_en_tissu_marron");
    public static final Item CHAPEAU_EN_TISSU_CYAN = new ItemBase("chapeau_en_tissu_cyan");
    public static final Item CHAPEAU_EN_TISSU_GRIS = new ItemBase("chapeau_en_tissu_gris");
    public static final Item CHAPEAU_EN_TISSU_BLEU_CLAIR = new ItemBase("chapeau_en_tissu_bleu_clair");
    public static final Item CHAPEAU_EN_TISSU_VERT = new ItemBase("chapeau_en_tissu_vert");
    public static final Item CHAPEAU_EN_TISSU_MAGENTA = new ItemBase("chapeau_en_tissu_magenta");
    public static final Item CHAPEAU_EN_TISSU_ORANGE = new ItemBase("chapeau_en_tissu_orange");
    public static final Item CHAPEAU_EN_TISSU_ROSE = new ItemBase("chapeau_en_tissu_rose");
    public static final Item CHAPEAU_EN_TISSU_ROUGE = new ItemBase("chapeau_en_tissu_rouge");
    public static final Item CHAPEAU_EN_TISSU_BLANC = new ItemBase("chapeau_en_tissu_blanc");
    public static final Item CHAPEAU_EN_TISSU_JAUNE = new ItemBase("chapeau_en_tissu_jaune");
    public static final Item CHAPEAU_EN_TISSU_VIOLET = new ItemBase("chapeau_en_tissu_violet");
    public static final Item CHAPEAU_EN_TISSU_VERT_CLAIR = new ItemBase("chapeau_en_tissu_vert_clair");
    public static final Item CHAPEAU_EN_TISSU = new ItemBase("chapeau_en_tissu");
    public static final Item CHAPEAU_FLEURI = new ItemBase("chapeau_fleuri");


    public static final Item CHAUSSURES_NOIR = new ItemBase("chaussures_noir");
    public static final Item CHAUSSURES_BLEU = new ItemBase("chaussures_bleu");
    public static final Item CHAUSSURES_MARRON = new ItemBase("chaussures_marron");
    public static final Item CHAUSSURES_CYAN = new ItemBase("chaussures_cyan");
    public static final Item CHAUSSURES_GRIS = new ItemBase("chaussures_gris");
    public static final Item CHAUSSURES_BLEU_CLAIR = new ItemBase("chaussures_bleu_clair");
    public static final Item CHAUSSURES_VERT = new ItemBase("chaussures_vert");
    public static final Item CHAUSSURES_MAGENTA = new ItemBase("chaussures_magenta");
    public static final Item CHAUSSURES_ORANGE = new ItemBase("chaussures_orange");
    public static final Item CHAUSSURES_ROSE = new ItemBase("chaussures_rose");
    public static final Item CHAUSSURES_ROUGE = new ItemBase("chaussures_rouge");
    public static final Item CHAUSSURES_BLANC = new ItemBase("chaussures_blanc");
    public static final Item CHAUSSURES_JAUNE = new ItemBase("chaussures_jaune");
    public static final Item CHAUSSURES_VIOLET = new ItemBase("chaussures_violet");

    public static final Item COUVERTURE_NOIR = new ItemBase("couverture_noir");
    public static final Item COUVERTURE_BLEU = new ItemBase("couverture_bleu");
    public static final Item COUVERTURE_MARRON = new ItemBase("couverture_marron");
    public static final Item COUVERTURE_CYAN = new ItemBase("couverture_cyan");
    public static final Item COUVERTURE_GRIS = new ItemBase("couverture_gris");
    public static final Item COUVERTURE_BLEU_CLAIR = new ItemBase("couverture_bleu_clair");
    public static final Item COUVERTURE_VERT = new ItemBase("couverture_vert");
    public static final Item COUVERTURE_MAGENTA = new ItemBase("couverture_magenta");
    public static final Item COUVERTURE_ORANGE = new ItemBase("couverture_orange");
    public static final Item COUVERTURE_ROSE = new ItemBase("couverture_rose");
    public static final Item COUVERTURE_ROUGE = new ItemBase("couverture_rouge");
    public static final Item COUVERTURE_BLANC = new ItemBase("couverture_blanc");
    public static final Item COUVERTURE_JAUNE = new ItemBase("couverture_jaune");
    public static final Item COUVERTURE_VIOLET = new ItemBase("couverture_violet");
    public static final Item COUVERTURE_VERT_CLAIR = new ItemBase("couverture_vert_clair");

    public static final Item RUBAN_NOIR = new ItemBase("ruban_noir");
    public static final Item RUBAN_BLEU = new ItemBase("ruban_bleu");
    public static final Item RUBAN_MARRON = new ItemBase("ruban_marron");
    public static final Item RUBAN_CYAN = new ItemBase("ruban_cyan");
    public static final Item RUBAN_GRIS = new ItemBase("ruban_gris");
    public static final Item RUBAN_BLEU_CLAIR = new ItemBase("ruban_bleu_clair");
    public static final Item RUBAN_VERT = new ItemBase("ruban_vert");
    public static final Item RUBAN_MAGENTA = new ItemBase("ruban_magenta");
    public static final Item RUBAN_ORANGE = new ItemBase("ruban_orange");
    public static final Item RUBAN_ROSE = new ItemBase("ruban_rose");
    public static final Item RUBAN_ROUGE = new ItemBase("ruban_rouge");
    public static final Item RUBAN_BLANC = new ItemBase("ruban_blanc");
    public static final Item RUBAN_JAUNE = new ItemBase("ruban_jaune");
    public static final Item RUBAN_VIOLET = new ItemBase("ruban_violet");
    public static final Item RUBAN_VERT_CLAIR = new ItemBase("ruban_vert_clair");

    public static final Item DRAP_NOIR = new ItemBase("drap_noir");
    public static final Item DRAP_BLEU = new ItemBase("drap_bleu");
    public static final Item DRAP_MARRON = new ItemBase("drap_marron");
    public static final Item DRAP_CYAN = new ItemBase("drap_cyan");
    public static final Item DRAP_GRIS = new ItemBase("drap_gris");
    public static final Item DRAP_BLEU_CLAIR = new ItemBase("drap_bleu_clair");
    public static final Item DRAP_VERT = new ItemBase("drap_vert");
    public static final Item DRAP_MAGENTA = new ItemBase("drap_magenta");
    public static final Item DRAP_ORANGE = new ItemBase("drap_orange");
    public static final Item DRAP_ROSE = new ItemBase("drap_rose");
    public static final Item DRAP_ROUGE = new ItemBase("drap_rouge");
    public static final Item DRAP_JAUNE = new ItemBase("drap_jaune");
    public static final Item DRAP_GRIS_CLAIR = new ItemBase("drap_gris_clair");
    public static final Item DRAP_VIOLET = new ItemBase("drap_violet");
    public static final Item DRAP_VERT_CLAIR = new ItemBase("drap_vert_clair");

    public static final Item ECHARPE_NOIR = new ItemBase("echarpe_noir");
    public static final Item ECHARPE_BLEU = new ItemBase("echarpe_bleu");
    public static final Item ECHARPE_MARRON = new ItemBase("echarpe_marron");
    public static final Item ECHARPE_CYAN = new ItemBase("echarpe_cyan");
    public static final Item ECHARPE_GRIS = new ItemBase("echarpe_gris");
    public static final Item ECHARPE_BLEU_CLAIR = new ItemBase("echarpe_bleu_clair");
    public static final Item ECHARPE_VERT = new ItemBase("echarpe_vert");
    public static final Item ECHARPE_MAGENTA = new ItemBase("echarpe_magenta");
    public static final Item ECHARPE_ORANGE = new ItemBase("echarpe_orange");
    public static final Item ECHARPE_ROSE = new ItemBase("echarpe_rose");
    public static final Item ECHARPE_ROUGE = new ItemBase("echarpe_rouge");
    public static final Item ECHARPE_BLANC = new ItemBase("echarpe_blanc");
    public static final Item ECHARPE_JAUNE = new ItemBase("echarpe_jaune");
    public static final Item ECHARPE_VIOLET = new ItemBase("echarpe_violet");
    public static final Item ECHARPE_VERT_CLAIR = new ItemBase("echarpe_vert_clair");

    public static final Item GANTS_NOIR = new ItemBase("gants_noir");
    public static final Item GANTS_BLEU = new ItemBase("gants_bleu");
    public static final Item GANTS_MARRON = new ItemBase("gants_marron");
    public static final Item GANTS_CYAN = new ItemBase("gants_cyan");
    public static final Item GANTS_GRIS = new ItemBase("gants_gris");
    public static final Item GANTS_BLEU_CLAIR = new ItemBase("gants_bleu_clair");
    public static final Item GANTS_VERT = new ItemBase("gants_vert");
    public static final Item GANTS_MAGENTA = new ItemBase("gants_magenta");
    public static final Item GANTS_ORANGE = new ItemBase("gants_orange");
    public static final Item GANTS_ROSE = new ItemBase("gants_rose");
    public static final Item GANTS_ROUGE = new ItemBase("gants_rouge");
    public static final Item GANTS_JAUNE = new ItemBase("gants_jaune");
    public static final Item GANTS_GRIS_CLAIR = new ItemBase("gants_gris_clair");
    public static final Item GANTS_VIOLET = new ItemBase("gants_violet");
    public static final Item GANTS_VERT_CLAIR = new ItemBase("gants_vert_clair");

    public static final Item GANTS_EN_CUIR_NOIR = new ItemBase("gants_en_cuir_noir");
    public static final Item GANTS_EN_CUIR_BLEU = new ItemBase("gants_en_cuir_bleu");
    public static final Item GANTS_EN_CUIR_CYAN = new ItemBase("gants_en_cuir_cyan");
    public static final Item GANTS_EN_CUIR_GRIS = new ItemBase("gants_en_cuir_gris");
    public static final Item GANTS_EN_CUIR_BLEU_CLAIR = new ItemBase("gants_en_cuir_bleu_clair");
    public static final Item GANTS_EN_CUIR_VERT = new ItemBase("gants_en_cuir_vert");
    public static final Item GANTS_EN_CUIR_MAGENTA = new ItemBase("gants_en_cuir_magenta");
    public static final Item GANTS_EN_CUIR_ORANGE = new ItemBase("gants_en_cuir_orange");
    public static final Item GANTS_EN_CUIR_ROSE = new ItemBase("gants_en_cuir_rose");
    public static final Item GANTS_EN_CUIR_ROUGE = new ItemBase("gants_en_cuir_rouge");
    public static final Item GANTS_EN_CUIR_BLANC = new ItemBase("gants_en_cuir_blanc");
    public static final Item GANTS_EN_CUIR_JAUNE = new ItemBase("gants_en_cuir_jaune");
    public static final Item GANTS_EN_CUIR_GRIS_CLAIR = new ItemBase("gants_en_cuir_gris_clair");
    public static final Item GANTS_EN_CUIR_VIOLET = new ItemBase("gants_en_cuir_violet");
    public static final Item GANTS_EN_CUIR_VERT_CLAIR = new ItemBase("gants_en_cuir_vert_clair");


    public static final Item MANTEAU_NOIR = new ItemBase("manteau_noir");
    public static final Item MANTEAU_BLEU = new ItemBase("manteau_bleu");
    public static final Item MANTEAU_MARRON = new ItemBase("manteau_marron");
    public static final Item MANTEAU_CYAN = new ItemBase("manteau_cyan");
    public static final Item MANTEAU_GRIS = new ItemBase("manteau_gris");
    public static final Item MANTEAU_BLEU_CLAIR = new ItemBase("manteau_bleu_clair");
    public static final Item MANTEAU_VERT = new ItemBase("manteau_vert");
    public static final Item MANTEAU_MAGENTA = new ItemBase("manteau_magenta");
    public static final Item MANTEAU_ORANGE = new ItemBase("manteau_orange");
    public static final Item MANTEAU_ROSE = new ItemBase("manteau_rose");
    public static final Item MANTEAU_ROUGE = new ItemBase("manteau_rouge");
    public static final Item MANTEAU_BLANC = new ItemBase("manteau_blanc");
    public static final Item MANTEAU_JAUNE = new ItemBase("manteau_jaune");
    public static final Item MANTEAU_GRIS_CLAIR = new ItemBase("manteau_gris_clair");
    public static final Item MANTEAU_VIOLET = new ItemBase("manteau_violet");
    public static final Item MANTEAU_VERT_CLAIR = new ItemBase("manteau_vert_clair");

    public static final Item MASQUE_NOIR = new ItemBase("masque_noir");
    public static final Item MASQUE_BLEU = new ItemBase("masque_bleu");
    public static final Item MASQUE_MARRON = new ItemBase("masque_marron");
    public static final Item MASQUE_CYAN = new ItemBase("masque_cyan");
    public static final Item MASQUE_GRIS = new ItemBase("masque_gris");
    public static final Item MASQUE_BLEU_CLAIR = new ItemBase("masque_bleu_clair");
    public static final Item MASQUE_VERT = new ItemBase("masque_vert");
    public static final Item MASQUE_MAGENTA = new ItemBase("masque_magenta");
    public static final Item MASQUE_ORANGE = new ItemBase("masque_orange");
    public static final Item MASQUE_ROSE = new ItemBase("masque_rose");
    public static final Item MASQUE_ROUGE = new ItemBase("masque_rouge");
    public static final Item MASQUE_BLANC = new ItemBase("masque_blanc");
    public static final Item MASQUE_JAUNE = new ItemBase("masque_jaune");
    public static final Item MASQUE_GRIS_CLAIR = new ItemBase("masque_gris_clair");
    public static final Item MASQUE_VIOLET = new ItemBase("masque_violet");
    public static final Item MASQUE_VERT_CLAIR = new ItemBase("masque_vert_clair");

    public static final Item MOUCHOIR_NOIR = new ItemBase("mouchoir_noir");
    public static final Item MOUCHOIR_BLEU = new ItemBase("mouchoir_bleu");
    public static final Item MOUCHOIR_MARRON = new ItemBase("mouchoir_marron");
    public static final Item MOUCHOIR_CYAN = new ItemBase("mouchoir_cyan");
    public static final Item MOUCHOIR_GRIS = new ItemBase("mouchoir_gris");
    public static final Item MOUCHOIR_BLEU_CLAIR = new ItemBase("mouchoir_bleu_clair");
    public static final Item MOUCHOIR_VERT = new ItemBase("mouchoir_vert");
    public static final Item MOUCHOIR_MAGENTA = new ItemBase("mouchoir_magenta");
    public static final Item MOUCHOIR_ORANGE = new ItemBase("mouchoir_orange");
    public static final Item MOUCHOIR_ROSE = new ItemBase("mouchoir_rose");
    public static final Item MOUCHOIR_ROUGE = new ItemBase("mouchoir_rouge");
    public static final Item MOUCHOIR_BLANC = new ItemBase("mouchoir_blanc");
    public static final Item MOUCHOIR_JAUNE = new ItemBase("mouchoir_jaune");
    public static final Item MOUCHOIR_GRIS_CLAIR = new ItemBase("mouchoir_gris_clair");
    public static final Item MOUCHOIR_VIOLET = new ItemBase("mouchoir_violet");
    public static final Item MOUCHOIR_VERT_CLAIR = new ItemBase("mouchoir_vert_clair");


    public static final Item PANTALON_NOIR = new ItemBase("pantalon_noir");
    public static final Item PANTALON_BLEU = new ItemBase("pantalon_bleu");
    public static final Item PANTALON_MARRON = new ItemBase("pantalon_marron");
    public static final Item PANTALON_CYAN = new ItemBase("pantalon_cyan");
    public static final Item PANTALON_GRIS = new ItemBase("pantalon_gris");
    public static final Item PANTALON_BLEU_CLAIR = new ItemBase("pantalon_bleu_clair");
    public static final Item PANTALON_VERT = new ItemBase("pantalon_vert");
    public static final Item PANTALON_MAGENTA = new ItemBase("pantalon_magenta");
    public static final Item PANTALON_ORANGE = new ItemBase("pantalon_orange");
    public static final Item PANTALON_ROSE = new ItemBase("pantalon_rose");
    public static final Item PANTALON_ROUGE = new ItemBase("pantalon_rouge");
    public static final Item PANTALON_BLANC = new ItemBase("pantalon_blanc");
    public static final Item PANTALON_JAUNE = new ItemBase("pantalon_jaune");
    public static final Item PANTALON_GRIS_CLAIR = new ItemBase("pantalon_gris_clair");
    public static final Item PANTALON_VIOLET = new ItemBase("pantalon_violet");
    public static final Item PANTALON_VERT_CLAIR = new ItemBase("pantalon_vert_clair");

    public static final Item PETITE_SERVIETTE = new ItemConsommable("petite_serviette", 30);
    public static final Item PETITE_SERVIETTE_NOIR = new ItemConsommable("petite_serviette_noir", 30);
    public static final Item PETITE_SERVIETTE_BLEU = new ItemConsommable("petite_serviette_bleu", 30);
    public static final Item PETITE_SERVIETTE_MARRON = new ItemConsommable("petite_serviette_marron", 30);
    public static final Item PETITE_SERVIETTE_CYAN = new ItemConsommable("petite_serviette_cyan", 30);
    public static final Item PETITE_SERVIETTE_GRIS = new ItemConsommable("petite_serviette_gris", 30);
    public static final Item PETITE_SERVIETTE_BLEU_CLAIR = new ItemConsommable("petite_serviette_bleu_clair", 30);
    public static final Item PETITE_SERVIETTE_VERT = new ItemConsommable("petite_serviette_vert", 30);
    public static final Item PETITE_SERVIETTE_MAGENTA = new ItemConsommable("petite_serviette_magenta", 30);
    public static final Item PETITE_SERVIETTE_ORANGE = new ItemConsommable("petite_serviette_orange", 30);
    public static final Item PETITE_SERVIETTE_ROSE = new ItemConsommable("petite_serviette_rose", 30);
    public static final Item PETITE_SERVIETTE_ROUGE = new ItemConsommable("petite_serviette_rouge", 30);
    public static final Item PETITE_SERVIETTE_JAUNE = new ItemConsommable("petite_serviette_jaune", 30);
    public static final Item PETITE_SERVIETTE_GRIS_CLAIR = new ItemConsommable("petite_serviette_gris_clair", 30);
    public static final Item PETITE_SERVIETTE_VIOLET = new ItemConsommable("petite_serviette_violet", 30);
    public static final Item PETITE_SERVIETTE_VERT_CLAIR = new ItemConsommable("petite_serviette_vert_clair", 30);

    public static final Item ROBE_NOIR = new ItemBase("robe_noir");
    public static final Item ROBE_BLEU = new ItemBase("robe_bleu");
    public static final Item ROBE_MARRON = new ItemBase("robe_marron");
    public static final Item ROBE_CYAN = new ItemBase("robe_cyan");
    public static final Item ROBE_GRIS = new ItemBase("robe_gris");
    public static final Item ROBE_BLEU_CLAIR = new ItemBase("robe_bleu_clair");
    public static final Item ROBE_VERT = new ItemBase("robe_vert");
    public static final Item ROBE_MAGENTA = new ItemBase("robe_magenta");
    public static final Item ROBE_ORANGE = new ItemBase("robe_orange");
    public static final Item ROBE_ROSE = new ItemBase("robe_rose");
    public static final Item ROBE_ROUGE = new ItemBase("robe_rouge");
    public static final Item ROBE_BLANC = new ItemBase("robe_blanc");
    public static final Item ROBE_JAUNE = new ItemBase("robe_jaune");
    public static final Item ROBE_GRIS_CLAIR = new ItemBase("robe_gris_clair");
    public static final Item ROBE_VIOLET = new ItemBase("robe_violet");
    public static final Item ROBE_VERT_CLAIR = new ItemBase("robe_vert_clair");

    public static final Item SAC_DE_COUCHAGE_NOIR = new ItemBase("sac_de_couchage_noir");
    public static final Item SAC_DE_COUCHAGE_BLEU = new ItemBase("sac_de_couchage_bleu");
    public static final Item SAC_DE_COUCHAGE_MARRON = new ItemBase("sac_de_couchage_marron");
    public static final Item SAC_DE_COUCHAGE_CYAN = new ItemBase("sac_de_couchage_cyan");
    public static final Item SAC_DE_COUCHAGE_GRIS = new ItemBase("sac_de_couchage_gris");
    public static final Item SAC_DE_COUCHAGE_BLEU_CLAIR = new ItemBase("sac_de_couchage_bleu_clair");
    public static final Item SAC_DE_COUCHAGE_VERT = new ItemBase("sac_de_couchage_vert");
    public static final Item SAC_DE_COUCHAGE_MAGENTA = new ItemBase("sac_de_couchage_magenta");
    public static final Item SAC_DE_COUCHAGE_ORANGE = new ItemBase("sac_de_couchage_orange");
    public static final Item SAC_DE_COUCHAGE_ROSE = new ItemBase("sac_de_couchage_rose");
    public static final Item SAC_DE_COUCHAGE_ROUGE = new ItemBase("sac_de_couchage_rouge");
    public static final Item SAC_DE_COUCHAGE_BLANC = new ItemBase("sac_de_couchage_blanc");
    public static final Item SAC_DE_COUCHAGE_JAUNE = new ItemBase("sac_de_couchage_jaune");
    public static final Item SAC_DE_COUCHAGE_GRIS_CLAIR = new ItemBase("sac_de_couchage_gris_clair");
    public static final Item SAC_DE_COUCHAGE_VIOLET = new ItemBase("sac_de_couchage_violet");
    public static final Item SAC_DE_COUCHAGE_VERT_CLAIR = new ItemBase("sac_de_couchage_vert_clair");


    public static final Item JUPE_NOIR = new ItemBase("jupe_noir");
    public static final Item JUPE_BLEU = new ItemBase("jupe_bleu");
    public static final Item JUPE_MARRON = new ItemBase("jupe_marron");
    public static final Item JUPE_CYAN = new ItemBase("jupe_cyan");
    public static final Item JUPE_GRIS = new ItemBase("jupe_gris");
    public static final Item JUPE_BLEU_CLAIR = new ItemBase("jupe_bleu_clair");
    public static final Item JUPE_VERT = new ItemBase("jupe_vert");
    public static final Item JUPE_MAGENTA = new ItemBase("jupe_magenta");
    public static final Item JUPE_ORANGE = new ItemBase("jupe_orange");
    public static final Item JUPE_ROSE = new ItemBase("jupe_rose");
    public static final Item JUPE_ROUGE = new ItemBase("jupe_rouge");
    public static final Item JUPE_BLANC = new ItemBase("jupe_blanc");
    public static final Item JUPE_JAUNE = new ItemBase("jupe_jaune");
    public static final Item JUPE_GRIS_CLAIR = new ItemBase("jupe_gris_clair");
    public static final Item JUPE_VIOLET = new ItemBase("jupe_violet");
    public static final Item JUPE_VERT_CLAIR = new ItemBase("jupe_vert_clair");

    public static final Item SERVIETTE = new ItemConsommable("serviette", 50);
    public static final Item SERVIETTE_NOIR = new ItemConsommable("serviette_noir", 50);
    public static final Item SERVIETTE_BLEU = new ItemConsommable("serviette_bleu", 50);
    public static final Item SERVIETTE_MARRON = new ItemConsommable("serviette_marron", 50);
    public static final Item SERVIETTE_CYAN = new ItemConsommable("serviette_cyan", 50);
    public static final Item SERVIETTE_GRIS = new ItemConsommable("serviette_gris", 50);
    public static final Item SERVIETTE_BLEU_CLAIR = new ItemConsommable("serviette_bleu_clair", 50);
    public static final Item SERVIETTE_VERT = new ItemConsommable("serviette_vert", 50);
    public static final Item SERVIETTE_MAGENTA = new ItemConsommable("serviette_magenta", 50);
    public static final Item SERVIETTE_ORANGE = new ItemConsommable("serviette_orange", 50);
    public static final Item SERVIETTE_ROSE = new ItemConsommable("serviette_rose", 50);
    public static final Item SERVIETTE_ROUGE = new ItemConsommable("serviette_rouge", 50);
    public static final Item SERVIETTE_BLANC = new ItemConsommable("serviette_blanc", 50);
    public static final Item SERVIETTE_JAUNE = new ItemConsommable("serviette_jaune", 50);
    public static final Item SERVIETTE_GRIS_CLAIR = new ItemConsommable("serviette_gris_clair", 50);
    public static final Item SERVIETTE_VIOLET = new ItemConsommable("serviette_violet", 50);
    public static final Item SERVIETTE_VERT_CLAIR = new ItemConsommable("serviette_vert_clair", 50);

    public static final Item SOUS_VETEMENT_FEMININ_NOIR = new ItemBase("sous_vetement_feminin_noir");
    public static final Item SOUS_VETEMENT_FEMININ_BLEU = new ItemBase("sous_vetement_feminin_bleu");
    public static final Item SOUS_VETEMENT_FEMININ_MARRON = new ItemBase("sous_vetement_feminin_marron");
    public static final Item SOUS_VETEMENT_FEMININ_CYAN = new ItemBase("sous_vetement_feminin_cyan");
    public static final Item SOUS_VETEMENT_FEMININ_GRIS = new ItemBase("sous_vetement_feminin_gris");
    public static final Item SOUS_VETEMENT_FEMININ_BLEU_CLAIR = new ItemBase("sous_vetement_feminin_bleu_clair");
    public static final Item SOUS_VETEMENT_FEMININ_VERT = new ItemBase("sous_vetement_feminin_vert");
    public static final Item SOUS_VETEMENT_FEMININ_MAGENTA = new ItemBase("sous_vetement_feminin_magenta");
    public static final Item SOUS_VETEMENT_FEMININ_ORANGE = new ItemBase("sous_vetement_feminin_orange");
    public static final Item SOUS_VETEMENT_FEMININ_ROSE = new ItemBase("sous_vetement_feminin_rose");
    public static final Item SOUS_VETEMENT_FEMININ_ROUGE = new ItemBase("sous_vetement_feminin_rouge");
    public static final Item SOUS_VETEMENT_FEMININ_BLANC = new ItemBase("sous_vetement_feminin_blanc");
    public static final Item SOUS_VETEMENT_FEMININ_JAUNE = new ItemBase("sous_vetement_feminin_jaune");
    public static final Item SOUS_VETEMENT_FEMININ_GRIS_CLAIR = new ItemBase("sous_vetement_feminin_gris_clair");
    public static final Item SOUS_VETEMENT_FEMININ_VIOLET = new ItemBase("sous_vetement_feminin_violet");
    public static final Item SOUS_VETEMENT_FEMININ_VERT_CLAIR = new ItemBase("sous_vetement_feminin_vert_clair");

    public static final Item SOUS_VETEMENT_MASCULIN_NOIR = new ItemBase("sous_vetement_masculin_noir");
    public static final Item SOUS_VETEMENT_MASCULIN_BLEU = new ItemBase("sous_vetement_masculin_bleu");
    public static final Item SOUS_VETEMENT_MASCULIN_MARRON = new ItemBase("sous_vetement_masculin_marron");
    public static final Item SOUS_VETEMENT_MASCULIN_CYAN = new ItemBase("sous_vetement_masculin_cyan");
    public static final Item SOUS_VETEMENT_MASCULIN_GRIS = new ItemBase("sous_vetement_masculin_gris");
    public static final Item SOUS_VETEMENT_MASCULIN_BLEU_CLAIR = new ItemBase("sous_vetement_masculin_bleu_clair");
    public static final Item SOUS_VETEMENT_MASCULIN_VERT = new ItemBase("sous_vetement_masculin_vert");
    public static final Item SOUS_VETEMENT_MASCULIN_MAGENTA = new ItemBase("sous_vetement_masculin_magenta");
    public static final Item SOUS_VETEMENT_MASCULIN_ORANGE = new ItemBase("sous_vetement_masculin_orange");
    public static final Item SOUS_VETEMENT_MASCULIN_ROSE = new ItemBase("sous_vetement_masculin_rose");
    public static final Item SOUS_VETEMENT_MASCULIN_ROUGE = new ItemBase("sous_vetement_masculin_rouge");
    public static final Item SOUS_VETEMENT_MASCULIN_BLANC = new ItemBase("sous_vetement_masculin_blanc");
    public static final Item SOUS_VETEMENT_MASCULIN_JAUNE = new ItemBase("sous_vetement_masculin_jaune");
    public static final Item SOUS_VETEMENT_MASCULIN_GRIS_CLAIR = new ItemBase("sous_vetement_masculin_gris_clair");
    public static final Item SOUS_VETEMENT_MASCULIN_VIOLET = new ItemBase("sous_vetement_masculin_violet");
    public static final Item SOUS_VETEMENT_MASCULIN_VERT_CLAIR = new ItemBase("sous_vetement_masculin_vert_clair");


    public static final Item TUNIQUE_NOIR = new ItemBase("tunique_noir");
    public static final Item TUNIQUE_BLEU = new ItemBase("tunique_bleu");
    public static final Item TUNIQUE_MARRON = new ItemBase("tunique_marron");
    public static final Item TUNIQUE_CYAN = new ItemBase("tunique_cyan");
    public static final Item TUNIQUE_GRIS = new ItemBase("tunique_gris");
    public static final Item TUNIQUE_BLEU_CLAIR = new ItemBase("tunique_bleu_clair");
    public static final Item TUNIQUE_VERT = new ItemBase("tunique_vert");
    public static final Item TUNIQUE_MAGENTA = new ItemBase("tunique_magenta");
    public static final Item TUNIQUE_ORANGE = new ItemBase("tunique_orange");
    public static final Item TUNIQUE_ROSE = new ItemBase("tunique_rose");
    public static final Item TUNIQUE_ROUGE = new ItemBase("tunique_rouge");
    public static final Item TUNIQUE_BLANC = new ItemBase("tunique_blanc");
    public static final Item TUNIQUE_JAUNE = new ItemBase("tunique_jaune");
    public static final Item TUNIQUE_GRIS_CLAIR = new ItemBase("tunique_gris_clair");
    public static final Item TUNIQUE_VIOLET = new ItemBase("tunique_violet");
    public static final Item TUNIQUE_VERT_CLAIR = new ItemBase("tunique_vert_clair");


    public static final Item VESTE_NOIR = new ItemBase("veste_noir");
    public static final Item VESTE_BLEU = new ItemBase("veste_bleu");
    public static final Item VESTE_MARRON = new ItemBase("veste_marron");
    public static final Item VESTE_CYAN = new ItemBase("veste_cyan");
    public static final Item VESTE_GRIS = new ItemBase("veste_gris");
    public static final Item VESTE_BLEU_CLAIR = new ItemBase("veste_bleu_clair");
    public static final Item VESTE_VERT = new ItemBase("veste_vert");
    public static final Item VESTE_MAGENTA = new ItemBase("veste_magenta");
    public static final Item VESTE_ORANGE = new ItemBase("veste_orange");
    public static final Item VESTE_ROSE = new ItemBase("veste_rose");
    public static final Item VESTE_ROUGE = new ItemBase("veste_rouge");
    public static final Item VESTE_BLANC = new ItemBase("veste_blanc");
    public static final Item VESTE_JAUNE = new ItemBase("veste_jaune");
    public static final Item VESTE_GRIS_CLAIR = new ItemBase("veste_gris_clair");
    public static final Item VESTE_VIOLET = new ItemBase("veste_violet");
    public static final Item VESTE_VERT_CLAIR = new ItemBase("veste_vert_clair");


    public static final Item CEINTURE_EN_TISSU_NOIR = new ItemBase("ceinture_en_tissu_noir");
    public static final Item CEINTURE_EN_TISSU_BLEU = new ItemBase("ceinture_en_tissu_bleu");
    public static final Item CEINTURE_EN_TISSU_MARRON = new ItemBase("ceinture_en_tissu_marron");
    public static final Item CEINTURE_EN_TISSU_CYAN = new ItemBase("ceinture_en_tissu_cyan");
    public static final Item CEINTURE_EN_TISSU_GRIS = new ItemBase("ceinture_en_tissu_gris");
    public static final Item CEINTURE_EN_TISSU_BLEU_CLAIR = new ItemBase("ceinture_en_tissu_bleu_clair");
    public static final Item CEINTURE_EN_TISSU_VERT = new ItemBase("ceinture_en_tissu_vert");
    public static final Item CEINTURE_EN_TISSU_MAGENTA = new ItemBase("ceinture_en_tissu_magenta");
    public static final Item CEINTURE_EN_TISSU_ORANGE = new ItemBase("ceinture_en_tissu_orange");
    public static final Item CEINTURE_EN_TISSU_ROSE = new ItemBase("ceinture_en_tissu_rose");
    public static final Item CEINTURE_EN_TISSU_ROUGE = new ItemBase("ceinture_en_tissu_rouge");
    public static final Item CEINTURE_EN_TISSU_BLANC = new ItemBase("ceinture_en_tissu_blanc");
    public static final Item CEINTURE_EN_TISSU_JAUNE = new ItemBase("ceinture_en_tissu_jaune");
    public static final Item CEINTURE_EN_TISSU_GRIS_CLAIR = new ItemBase("ceinture_en_tissu");
    public static final Item CEINTURE_EN_TISSU_VIOLET = new ItemBase("ceinture_en_tissu_violet");
    public static final Item CEINTURE_EN_TISSU_VERT_CLAIR = new ItemBase("ceinture_en_tissu_vert_clair");

    public static final Item CORSAGE = new ItemBase("corsage");

    // BOCAUX Dispensaire
    public static final Item ANTIPARASITAIRE = new ItemContainer("antiparasitaire", 0, 0.2F, false, BOCAL, 2);
    public static final Item CATAPLASME_FEBRIFUGE = new ItemContainer("cataplasme_febrifuge", 0, 0.2F, false, BOCAL, 2);
    public static final Item CONTREPOISON_LEGER = new ItemContainer("contrepoison_leger", 0, 0.2F, false, BOCAL, 2);
    public static final Item FILTRAT_CONTRE_LES_MAUX_ESTOMAC = new ItemContainer("filtrat_contre_les_maux_estomac", 0, 0.2F, false, BOCAL, 2);
    public static final Item HUILE_DE_LIN = new ItemContainer("huile_de_lin", 0, 0.2F, false, BOCAL, 2);
    public static final Item LAIT_DE_PAVOT = new ItemContainer("lait_de_pavot", 0, 0.2F, false, BOCAL, 2);
    public static final Item SIROP_POUR_LA_TOUX = new ItemContainer("sirop_pour_la_toux", 0, 0.2F, false, BOCAL, 2);
    public static final Item SOIN_DES_MUQUEUSES = new ItemContainer("soin_des_muqueuses", 0, 0.2F, false, BOCAL, 2);
    public static final Item SOIN_REPARATEUR_INTERNE = new ItemContainer("soin_reparateur_interne", 0, 0.2F, false, BOCAL, 2);
    public static final Item TEINTURE_MERE_DE_PAVOT = new ItemContainer("teinture_mere_de_pavot", 0, 0.2F, false, BOCAL, 2);

    // Apothicaire - médecin - beauté

    public static final Item BANDAGE = new ItemBase("bandage");
    public static final Item BANDAGE_ENSANGLANTE = new ItemBase("bandage_ensanglante");
    public static final Item BAUME_A_LA_CAMOMILLE = new ItemConsommable("baume_a_la_camomille", 7);
    public static final Item BAUME_EXFOLIANT = new ItemConsommable("baume_exfoliant", 7);
    public static final Item BOUGIE = new ItemBase("candle");
    public static final Item BOUTEILLE_ALCOOL_PUR = new ItemContainer("bouteille_alcool_pur", 0, 0.2F, false, BOUTEILLE_SALE, 4);
    public static final Item BOUTEILLE_DE_PARFUM = new ItemConsommable("bouteille_de_parfum", 7);
    public static final Item CANNE_BEQUILLE = new ItemBase("canne_bequille");
    public static final Item COLLE = new ItemBase("colle");
    public static final Item EMPLATRE = new ItemBase("emplatre");
    public static final Item EMPLATRE_A_BRULURE = new ItemBase("emplatre_a_brulure");
    public static final Item EMPLATRE_CONTRE_LA_GRATTE = new ItemBase("emplatre_contre_la_gratte");
    public static final Item EMPLATRE_DE_LYS = new ItemBase("emplatre_de_lys");
    public static final Item ENCENS = new ItemIngrediant("encens", 7);
    public static final Item EXTRAIT_DE_PAVOT_CONCENTRE = new ItemBase("extrait_de_pavot_concentre");
    public static final Item FARD_A_JOUE = new ItemConsommable("fard_a_joue", 7);
    public static final Item HUILE_ESSENTIELLE = new ItemIngrediant("huile_essentielle", 7);
    public static final Item LEVURE = new ItemBase("levure");
    public static final Item MASQUE_ARGILE = new ItemConsommable("masque_argile", 7);
    public static final Item MASQUE_CHEVEUX = new ItemConsommable("masque_cheveux", 7);
    public static final Item NOIR_CHARBON = new ItemConsommable("noir_charbon", 7);
    public static final Item ONCE_DE_POISON_LEGER = new ItemBase("once_de_poison_leger");
    public static final Item ONCE_D_HERBORISTE = new ItemBase("once_d_herboriste");
    public static final Item OPIUM_A_FUMER = new ItemConsommable("opium_a_fumer", 7);
    public static final Item PATE_A_DENT = new ItemConsommable("pate_a_dent", 7);
    public static final Item PATE_DIVERSE = new ItemBase("pate_diverse");
    public static final Item POUDRE_DE_TEINT = new ItemConsommable("poudre_de_teint", 7);
    public static final Item POUDRE_QUELCONQUE = new ItemConsommable("poudre_quelconque", 7);
    public static final Item ROUGE_A_LEVRES = new ItemConsommable("rouge_a_levres", 7);
    public static final Item SAVON = new Savon("savon", 7);
    public static final Item SEAU_DE_COLLE = new ItemBase("seau_de_colle");
    public static final Item SOUDE = new ItemBase("soude");
    public static final Item TABAC = new ItemConsommable("tabac", 7);
    public static final Item VERNIS = new ItemIngrediant("vernis", 7);

    // Porcelaine
    public static final Item PORCELAINE = new ItemBase("porcelaine");
    public static final Item TASSE_EN_PORCELAINE = new ItemBase("tasse_en_porcelaine");
    public static final Item TASSE_EN_PORCELAINE_CRU = new ItemBase("tasse_en_porcelaine_cru");
    public static final Item TASSE_EN_PORCELAINE_BLEU = new ItemBase("tasse_en_porcelaine_bleu");
    public static final Item TASSE_EN_PORCELAINE_ROSE = new ItemBase("tasse_en_porcelaine_rose");
    public static final Item TASSE_EN_PORCELAINE_VERTE = new ItemBase("tasse_en_porcelaine_verte");
    public static final Item TASSE_EN_PORCELAINE_VIOLETTE = new ItemBase("tasse_en_porcelaine_violette");
    public static final Item ASSIETTE_EN_PORCELAINE = new ItemBase("assiette_en_porcelaine");
    public static final Item ASSIETTE_EN_PORCELAINE_CRUE = new ItemBase("assiette_en_porcelaine_crue");
    public static final Item SALADIER_EN_PORCELAINE = new ItemBase("saladier_en_porcelaine");
    public static final Item SALADIER_EN_PORCELAINE_CRU = new ItemBase("saladier_en_porcelaine_cru");

    // verrerie

    //public static final Item MOLTEN_GLASS = new ItemBase("molten_glass");
    public static final Item VERRE_EN_FUSION = new ItemBase("verre_en_fusion");

    public static final Item BOUTEILLE_A_MESSAGE = new ItemBase("bouteille_a_message");
    public static final Item BOUTEILLE_DE_PARFUM_VIDE = new ItemBase("bouteille_de_parfum_vide");
    public static final Item ENCRIER_EN_VERRE = new ItemBase("encrier_en_verre");
    public static final Item ETUI_EN_VERRE = new ItemBase("etui_en_verre");
    public static final Item FLACON = new ItemBase("flacon");
    public static final Item GRAND_MIROIR = new ItemBase("grand_miroir");
    public static final Item MIROIR_A_MAIN_EN_ETAIN = new ItemBase("miroir_a_main_en_etain");
    public static final Item MIROIR_DECORE = new ItemBase("miroir_decore");
    public static final Item MIROIR_EN_ETAIN = new ItemBase("miroir_en_etain");
    public static final Item PETIT_MIROIR = new ItemBase("petit_miroir");

    public static final Item PERLE_EN_VERRE_BLANC = new ItemBase("perle_en_verre_blanc");
    public static final Item PERLE_EN_VERRE_BLEU = new ItemBase("perle_en_verre_bleu");
    public static final Item PERLE_EN_VERRE_BLEU_CLAIR = new ItemBase("perle_en_verre_bleu_clair");
    public static final Item PERLE_EN_VERRE_CYAN = new ItemBase("perle_en_verre_cyan");
    public static final Item PERLE_EN_VERRE_GRIS = new ItemBase("perle_en_verre_gris");
    public static final Item PERLE_EN_VERRE_GRIS_CLAIR = new ItemBase("perle_en_verre_gris_clair");
    public static final Item PERLE_EN_VERRE_JAUNE = new ItemBase("perle_en_verre_jaune");
    public static final Item PERLE_EN_VERRE_MAGENTA = new ItemBase("perle_en_verre_magenta");
    public static final Item PERLE_EN_VERRE_MARRON = new ItemBase("perle_en_verre_marron");
    public static final Item PERLE_EN_VERRE_NOIR = new ItemBase("perle_en_verre_noir");
    public static final Item PERLE_EN_VERRE_ORANGE = new ItemBase("perle_en_verre_orange");
    public static final Item PERLE_EN_VERRE_ROSE = new ItemBase("perle_en_verre_rose");
    public static final Item PERLE_EN_VERRE_ROUGE = new ItemBase("perle_en_verre_rouge");
    public static final Item PERLE_EN_VERRE_VERT = new ItemBase("perle_en_verre_vert");
    public static final Item PERLE_EN_VERRE_VERT_CLAIR = new ItemBase("perle_en_verre_vert_clair");
    public static final Item PERLE_EN_VERRE_VIOLET = new ItemBase("perle_en_verre_violet");
    // public static final Item PERLE_EN_VERRE = new ItemBase("perle_en_verre");

    //plantes2
    public static final Item ANETH2 =  new ItemBase("aneth2");
    public static final Item ANIS2 =  new ItemBase("anis2");
    public static final Item BASILIC2 =  new ItemBase("basilic2");
    public static final Item BELLE_DE_NUIT2 =  new ItemBase("belle_de_nuit2");
    public static final Item BLEUETS2 =  new ItemBase("bleuets2");
    public static final Item BUISSON2 =  new ItemBase("buisson2");
    public static final Item BUISSON_DE_FLEURS_BLANCHES2 =  new ItemBase("buisson_de_fleurs_blanches2");
    public static final Item BUISSON_ETRANGE2 =  new ItemBase("buisson_etrange2");
    public static final Item BUISSON_HERBEUX2 =  new ItemBase("buisson_herbeux2");
    public static final Item CAMOMILLE2 =  new ItemBase("camomille2");
    public static final Item CHARDON2 =  new ItemBase("chardon2");
    public static final Item CIBOULETTE2 =  new ItemBase("ciboulette2");
    public static final Item CLOCHETTES2 =  new ItemBase("clochettes2");
    public static final Item COSMOS2 =  new ItemBase("cosmos2");
    public static final Item ETOILE_DES_GLACIERS2 =  new ItemBase("etoile_des_glaciers2");
    public static final Item FLEUR_DE_PAVOT2 = new ItemBase("fleur_de_pavot2");
    public static final Item GERANIUM2 =  new ItemBase("geranium2");
    public static final Item GLYCINE2 =  new ItemBase("glycine2");
    public static final Item GUI2 =  new ItemBase("gui2");
    public static final Item GUZMANIAS2 =  new ItemBase("guzmanias2");
    public static final Item HIBISCUS2 =  new ItemBase("hibiscus2");
    public static final Item HORTENSIAS2 =  new ItemBase("hortensias2");
    public static final Item HOUX2 =  new ItemBase("houx2");
    public static final Item HYDRANGEE2 =  new ItemBase("hydrangee2");
    public static final Item IRIS2 =  new ItemBase("iris2");
    public static final Item JACINTHE_DES_BOIS2 =  new ItemBase("jacinthe_des_bois2");
    public static final Item JASMIN2 =  new ItemBase("jasmin2");
    public static final Item JOLI_BUISSON2 =  new ItemBase("joli_buisson2");
    public static final Item JONQUILLE2 =  new ItemBase("jonquille2");
    public static final Item LAURIER2 =  new ItemBase("laurier2");
    public static final Item LAVANDE2 =  new ItemBase("lavande2");
    public static final Item LYS2 =  new ItemBase("lys2");
    public static final Item MANDRAGORE2 =  new ItemBase("mandragore2");
    public static final Item MENTHE2 =  new ItemBase("menthe2");
    public static final Item MUGUET2 =  new ItemBase("muguet2");
    public static final Item MYOSOTIS2 =  new ItemBase("myosotis2");
    public static final Item NARCISSES2 =  new ItemBase("narcisses2");
    public static final Item OEILLETS2 =  new ItemBase("oeillets2");
    public static final Item ORCHIDEE_ROSE2 =  new ItemBase("orchidee_rose2");
    public static final Item PENSEES2 =  new ItemBase("pensees2");
    public static final Item PERSIL2 =  new ItemBase("persil2");
    public static final Item PIVOINE2 =  new ItemBase("pivoine2");
    public static final Item PLANTE_ETRANGE2 =  new ItemBase("plante_etrange2");
    public static final Item PLANTE_GRASSE2 =  new ItemBase("plante_grasse2");
    public static final Item PLANTE_GRASSE_COLOREE2 =  new ItemBase("plante_grasse_coloree2");
    public static final Item POIVRON_ORANGE2 =  new ItemBase("poivron_orange2");
    public static final Item ROMARIN2 =  new ItemBase("romarin2");
    public static final Item RONCES2 =  new ItemBase("ronces2");
    public static final Item SALICORNE2 =  new ItemBase("salicorne2");
    public static final Item VERGE_D_OR2 =  new ItemBase("verge_d_or2");
    public static final Item VERVEINE2 =  new ItemBase("verveine2");
    public static final Item VIOLETTES2 =  new ItemBase("violettes2");

    //plantes

    public static final Item PLANTE_PLANTE_GRASSE = new ItemBase("plante_plante_grasse");
    public static final Item PLANTE_BUIS = new ItemBase("plante_buis");
    public static final Item PLANTE_LIERRE_TERRESTRE = new ItemBase("plante_lierre_terrestre");
    public static final Item PLANTE_COQUELICOT = new ItemBase("plante_coquelicot");
    public static final Item PLANTE_BOUTON_D_OR = new ItemBase("plante_bouton_d_or");
    public static final Item PLANTE_TULIPE_ROUGE = new ItemBase("plante_tulipe_rouge");
    public static final Item PLANTE_TULIPE_ORANGE = new ItemBase("plante_tulipe_orange");
    public static final Item PLANTE_TULIPE_ROSE = new ItemBase("plante_tulipe_rose");
    public static final Item PLANTE_TULIPE_BLANCHE = new ItemBase("plante_tulipe_blanche");
    //public static final Item PLANTE_OIGNON = new ItemBase("plante_oignon");
    //public static final Item PLANTE_AIL = new ItemBase("plante_ail");
    public static final Item PLANTE_ORCHIDEE_BLEUE = new ItemBase("plante_orchidee_bleue");
    public static final Item PLANTE_ROSIER = new ItemBase("plante_rosier");
    public static final Item PLANTE_LIERRE_FLEURI = new ItemBase("plante_lierre_fleuri");
    public static final Item PLANTE_HAIE = new ItemBase("plante_haie");
    //public static final Item PLANTE_BUISSON_VER_A_SOIE = new ItemBase("plante_buisson_ver_a_soie");
    public static final Item PLANTE_PISSENLIT = new ItemBase("plante_pissenlit");
    public static final Item PLANTE_LILAS = new ItemBase("plante_lilas");
    public static final Item PLANTE_TOURNESOL = new ItemBase("plante_tournesol");
    public static final Item PLANTE_ALLIUM = new ItemBase("plante_allium");
    public static final Item PLANTE_HOUSTONIE_BLEUE = new ItemBase("plante_houstonie_bleue");

    // /\Ajouts/\

    public static final Item PLANTE_ANETH =  new ItemBase("plante_aneth");
    public static final Item PLANTE_ANIS =  new ItemBase("plante_anis");
    public static final Item PLANTE_BASILIC =  new ItemBase("plante_basilic");
    public static final Item PLANTE_BELLE_DE_NUIT =  new ItemBase("plante_belle_de_nuit");
    public static final Item PLANTE_BLEUETS =  new ItemBase("plante_bleuets");
    public static final Item PLANTE_BUISSON =  new ItemBase("plante_buisson");
    public static final Item PLANTE_BUISSON_DE_FLEURS_BLANCHES =  new ItemBase("plante_buisson_de_fleurs_blanches");
    public static final Item PLANTE_BUISSON_ETRANGE =  new ItemBase("plante_buisson_etrange");
    public static final Item PLANTE_BUISSON_HERBEUX =  new ItemBase("plante_buisson_herbeux");
    public static final Item PLANTE_CAMOMILLE =  new ItemBase("plante_camomille");
    public static final Item PLANTE_CHARDON =  new ItemBase("plante_chardon");
    public static final Item PLANTE_CIBOULETTE =  new ItemBase("plante_ciboulette");
    public static final Item PLANTE_CLOCHETTES =  new ItemBase("plante_clochettes");
    public static final Item CLOU_DE_GIROFLE = new ItemBase("clou_de_girofle");
    public static final Item PLANTE_COSMOS =  new ItemBase("plante_cosmos");
    public static final Item PLANTE_ESTRAGON = new ItemBase("plante_estragon");
    public static final Item PLANTE_ETOILE_DES_GLACIERS =  new ItemBase("plante_etoile_des_glaciers");
    public static final Item PLANTE_FLEUR_DE_PAVOT = new ItemBase("plante_fleur_de_pavot");
    public static final Item PLANTE_GERANIUM =  new ItemBase("plante_geranium");
    public static final Item PLANTE_GLYCINE =  new ItemBase("plante_glycine");
    public static final Item PLANTE_GUI =  new ItemBase("plante_gui");
    public static final Item PLANTE_GUZMANIAS =  new ItemBase("plante_guzmanias");
    public static final Item PLANTE_HIBISCUS =  new ItemBase("plante_hibiscus");
    public static final Item PLANTE_HORTENSIAS =  new ItemBase("plante_hortensias");
    public static final Item PLANTE_HOUX =  new ItemBase("plante_houx");
    public static final Item PLANTE_HYDRANGEE =  new ItemBase("plante_hydrangee");
    public static final Item PLANTE_IRIS =  new ItemBase("plante_iris");
    public static final Item PLANTE_JACINTHE_DES_BOIS =  new ItemBase("plante_jacinthe_des_bois");
    public static final Item PLANTE_JASMIN =  new ItemBase("plante_jasmin");
    public static final Item PLANTE_JOLI_BUISSON =  new ItemBase("plante_joli_buisson");
    public static final Item PLANTE_JONQUILLE =  new ItemBase("plante_jonquille");
    public static final Item PLANTE_LAURIER =  new ItemBase("plante_laurier");
    public static final Item PLANTE_LAVANDE =  new ItemBase("plante_lavande");
    public static final Item PLANTE_LYS =  new ItemBase("plante_lys");
    public static final Item PLANTE_MANDRAGORE =  new ItemBase("plante_mandragore");
    public static final Item PLANTE_MENTHE =  new ItemBase("plante_menthe");
    public static final Item PLANTE_MUGUET =  new ItemBase("plante_muguet");
    public static final Item PLANTE_MYOSOTIS =  new ItemBase("plante_myosotis");
    public static final Item PLANTE_NARCISSES =  new ItemBase("plante_narcisses");
    public static final Item PLANTE_OEILLETS =  new ItemBase("plante_oeillets");
    public static final Item PLANTE_ORCHIDEE_ROSE =  new ItemBase("plante_orchidee_rose");
    public static final Item PLANTE_PENSEES =  new ItemBase("plante_pensees");
    public static final Item PLANTE_PERSIL =  new ItemBase("plante_persil");
    public static final Item PLANTE_PIVOINE =  new ItemBase("plante_pivoine");
    public static final Item PLANTE_PLANTE_ETRANGE =  new ItemBase("plante_plante_etrange");
    public static final Item PLANTE_PLANTE_GRASSE_COLOREE =  new ItemBase("plante_plante_grasse_coloree");
    public static final Item PLANTE_RHUBARBE = new ItemBase("plante_rhubarbe");
    public static final Item PLANTE_ROMARIN =  new ItemBase("plante_romarin");
    public static final Item PLANTE_RONCES =  new ItemBase("plante_ronces");
    public static final Item PLANTE_SALICORNE =  new ItemBase("plante_salicorne");
    public static final Item PLANTE_SAUGE = new ItemBase("plante_sauge");
    public static final Item PLANTE_SUREAU = new ItemBase("plante_sureau");
    public static final Item PLANTE_THYM = new ItemBase("plante_thym");
    public static final Item PLANTE_VERGE_D_OR =  new ItemBase("plante_verge_d_or");
    public static final Item PLANTE_VERVEINE =  new ItemBase("plante_verveine");
    public static final Item PLANTE_VIOLETTES =  new ItemBase("plante_violettes");

    public static final Item BLE = new GraineBle("ble");
    public static final Item CANNELLE = new ItemBase("cannelle");
    public static final Item CHANVRE = new ItemBase("chanvre");
    public static final Item CHOU_VERT = new ItemBase("chou_vert");

    public static final Item GINGEMBRE = new ItemBase("gingembre");
    public static final Item LIN = new ItemBase("lin");
    public static final Item ORGE = new GraineOrge("orge");
    public static final Item RACINE_DE_GARANCE = new ItemBase("racine_de_garance");


    // Divers - Plantes
    public static final Item BOUQUET_DE_FLEURS = new ItemInventory("bouquet_de_fleurs", 0);
    public static final Item BOUQUET_GARNI = new ItemBase("bouquet_garni");
    public static final Item ECORCE = new ItemBase("ecorce");
    public static final Item FARINE = new ItemBase("farine");
    public static final Item FEUILLES_SECHEES = new ItemBase("feuilles_sechees");
    public static final Item FEUILLE_DE_THE = new ItemBase("feuille_de_the");
    public static final Item FEUILLE_DE_VERVEINE = new ItemBase("feuille_de_verveine");
    public static final Item FIBRE_VEGETALE = new ItemBase("fibre_vegetale");
    public static final Item GLAND = new ItemBase("gland");
    public static final Item MALT_BLE = new ItemBase("malt_ble");
    public static final Item MALT_ORGE = new ItemBase("malt_orge");
    public static final Item PAILLE = new ItemBase("paille");
    public static final Item PEDONCULE = new ItemBase("pedoncule");
    public static final Item PLANTES_SECHEES = new ItemBase("plantes_sechees");
    public static final Item POMME_DE_PIN = new ItemBase("pomme_de_pin");
    public static final Item POMME_DE_TERRE_GERMEE = new ItemBase("pomme_de_terre_germee");
    public static final Item SEVE = new ItemBase("seve");

    // Cadenas
    public static final Item CADENAS_BRONZE = new Cadenas("cadenas_bronze");
    public static final Item CADENAS_FER = new Cadenas("cadenas_fer");
    public static final Item CADENAS_ACIER = new Cadenas("cadenas_acier");
    public static final Item CLEF = new Clef("clef");
    public static final Item PORTE_CLEF = new PorteClef("porte_clef");

    //Insectes - ITEMS
    public static final Item INSECTE_ABEILLE = new ItemBase("insecte_abeille");
    public static final Item INSECTE_ARAIGNEE = new ItemBase("insecte_araignee");
    public static final Item INSECTE_ASTICOT = new ItemBase("insecte_asticot");
    public static final Item INSECTE_CHENILLE = new ItemBase("insecte_chenille");
    public static final Item INSECTE_COCCINELLE = new ItemBase("insecte_coccinelle");
    public static final Item INSECTE_COCHENILLE = new ItemBase("insecte_cochenille");
    public static final Item INSECTE_ESCARGOT = new ItemBase("insecte_escargot");
    public static final Item INSECTE_FOURMI = new ItemBase("insecte_fourmi");
    public static final Item INSECTE_GALLE = new ItemBase("insecte_galle");
    public static final Item INSECTE_GUEPE = new ItemBase("insecte_guepe");
    public static final Item INSECTE_LARVE = new ItemBase("insecte_larve");
    public static final Item INSECTE_MITE = new ItemBase("insecte_mite");
    public static final Item INSECTE_MORPION = new ItemBase("insecte_morpion");
    public static final Item INSECTE_MOUCHE = new ItemBase("insecte_mouche");
    public static final Item INSECTE_PAPILLON_COMMUN = new ItemBase("insecte_papillon_commun");
    public static final Item INSECTE_PAPILLON_RARE = new ItemBase("insecte_papillon_rare");
    public static final Item INSECTE_PUCERON = new ItemBase("insecte_puceron");
    public static final Item INSECTE_SCARABEE = new ItemBase("insecte_scarabee");
    public static final Item INSECTE_SCORPION = new ItemBase("insecte_scorpion");
    public static final Item INSECTE_TIQUE = new ItemBase("insecte_tique");
    public static final Item INSECTE_VER_DE_FARINE = new ItemBase("insecte_ver_de_farine");
    public static final Item INSECTE_VER_DE_TERRE = new ItemBase("insecte_ver_de_terre");



}
