package net.linkle.valley.Registry.Initializers;

import net.linkle.valley.Registry.WeaponsAndTools.Hatchets.*;
import net.linkle.valley.Registry.WeaponsAndTools.Knives.*;
import net.linkle.valley.Registry.WeaponsAndTools.OneOffs.*;
import net.linkle.valley.Registry.WeaponsAndTools.RGRest.*;
import net.linkle.valley.Registry.WeaponsAndTools.Sickles.*;
import net.linkle.valley.Registry.WeaponsAndTools.Viking.*;

import static net.linkle.valley.Registry.Utils.Util.registerItem;

public class WeaponsAndTools {
    
    

    public static void initialize() {

        //Branch
        registerItem("tree_branch", () -> new BranchBase(new BranchMaterial()));

        //Sharp Flint Rock
        registerItem("flint_rock", () -> new FlintBaseRock(new FlintToolMaterialRock()));

        //Bone Knife
        registerItem("bone_knife", () -> new BoneBaseKnife(new BoneToolMaterialKnife()));

        //Climbing Axe
        registerItem("climbing_axe", () -> new ClimbingAxeBase(new ClimingAxeToolMaterial()));

        //Rock Pick
        //register("rock_pick", new RockPickBase(new RockPickToolMaterial()));

        //Ice Tongs
        registerItem("tongs", () -> new TongsBase(new TongsToolMaterial()));

        //Lumber Axe
        registerItem("lumber_axe", () -> new LumberAxeBase(new LumberAxeToolMaterial()));

        //Sieve
        //register("hand_sieve", new SieveBase(new SieveToolMaterial()));

        //Rock Breaker
        //register("rock_breaker", new RockBreakerBase(new RockBreakerToolMaterial()));

        //Ladle
        //register("soup_ladle", new LadleBase(new LadleMaterial()));

        //Traveler's Sword
        //register("travelers_sword", new TravelerSwordBase(new TravelerToolMaterialSword()));

        //Viking Tools
        //register("viking_great_axe", new VikingGreatAxeBase(new VikingToolMaterial()));
        registerItem("viking_hatchet", () -> new VikingHatchetBase(new VikingToolMaterial()));
        registerItem("viking_knife", () -> new VikingKnifeBase(new VikingToolMaterial()));
        //register("viking_war_axe", new VikingWarAxeBase(new VikingToolMaterial()));
        registerItem("viking_hoe", () -> new VikingHoeBase(new VikingToolMaterial()));
        registerItem("viking_shovel", () -> new VikingShovelBase(new VikingToolMaterial()));
        registerItem("viking_hammer", () -> new VikingHammerBase(new VikingToolMaterial()));
        registerItem("viking_pickaxe", () -> new VikingPickBase(new VikingToolMaterial()));
        registerItem("viking_sword", () -> new VikingSwordBase(new VikingToolMaterial()));
        registerItem("viking_spear", () -> new VikingSpearBase(new VikingToolMaterial()));

        //Witch's Tools
        //register("witch_wand", new WitchWandBase(new WitchToolMaterialKnife()));
        //register("witch_staff", new WitchStaffBase(new WitchToolMaterialKnife()));
        //register("witch_dagger", new WitchKnifeBase(new WitchToolMaterialKnife()));

        //Druid Staff
        registerItem("druid_staff", () -> new DruidStaffBase(new DruidToolMaterialStaff()));

        //Knives
        registerItem("wood_knife", () -> new WoodKnifeBase(new WoodToolMaterialKnife()));
        registerItem("stone_knife", () -> new StoneKnifeBase(new StoneToolMaterialKnife()));
        registerItem("golden_knife", () -> new GoldKnifeBase(new GoldenToolMaterialKnife()));
        registerItem("iron_knife", () -> new IronKnifeBase(new IronToolMaterialKnife()));
        registerItem("rg_knife", () -> new RGKnifeBase(new RGToolMaterialKnife()));
        registerItem("diamond_knife", () -> new DiamondKnifeBase(new DiamondToolMaterialKnife()));
        registerItem("netherite_knife", () -> new NetheriteKnifeBase(new NetheriteToolMaterialKnife()));
        //Sickles
        registerItem("wood_sickle", () -> new WoodSickleBase(new WoodToolMaterialSickle()));
        registerItem("stone_sickle", () -> new StoneSickleBase(new StoneToolMaterialSickle()));
        registerItem("golden_sickle", () -> new GoldSickleBase(new GoldenToolMaterialSickle()));
        registerItem("iron_sickle", () -> new IronSickleBase(new IronToolMaterialSickle()));
        registerItem("rg_sickle", () -> new RGSickleBase(new RGToolMaterialSickle()));
        registerItem("diamond_sickle", () -> new DiamondSickleBase(new DiamondToolMaterialSickle()));
        registerItem("netherite_sickle", () -> new NetheriteSickleBase(new NetheriteToolMaterialSickle()));
        //Hatchets
        registerItem("wood_hatchet", () -> new WoodHatchetBase(new WoodToolMaterialHatchet()));
        registerItem("stone_hatchet", () -> new StoneHatchetBase(new StoneToolMaterialHatchet()));
        registerItem("golden_hatchet", () -> new GoldHatchetBase(new GoldenToolMaterialHatchet()));
        registerItem("iron_hatchet", () -> new IronHatchetBase(new IronToolMaterialHatchet()));
        registerItem("rg_hatchet", () -> new RGHatchetBase(new RGToolMaterialHatchet()));
        registerItem("diamond_hatchet", () -> new DiamondHatchetBase(new DiamondToolMaterialHatchet()));
        registerItem("netherite_hatchet", () -> new NetheriteHatchetBase(new NetheriteToolMaterialHatchet()));
        //Rose Gold Tools
        registerItem("rg_shovel", () -> new RGShovelBase(new RGToolMaterialShovel()));
        registerItem("rg_pickaxe", () -> new RGPickaxeBase(new RGToolMaterialPickaxe()));
        registerItem("rg_axe", () -> new RGAxeBase(new RGToolMaterialAxe()));
        registerItem("rg_hoe", () -> new RGHoeBase(new RGToolMaterialHoe()));
        registerItem("rg_sword", () -> new RGSwordBase(new RGToolMaterialSword()));

        //Artifacts
        //register("royal_sword", new RoyalSwordBase(new ToolMaterialSoldiersSpear()));
        //register("soldiers_spear", new SoldiersSpearBase(new ToolMaterialSoldiersSpear()));
        //register("diamond_cutlass", new DiamondCutlassBase(new DiamondToolMaterialCutlass()));
        //register("rusty_sword", new RustySwordBase(new ToolMaterialSoldiersSpear()));
    }
}
