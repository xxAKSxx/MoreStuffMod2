package morestuffmod.common.block;

import net.minecraft.src.*;
import net.minecraft.src.Block;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.*;
import cpw.mods.fml.common.Mod.*;
import cpw.mods.fml.client.*;
import cpw.mods.fml.client.modloader.*;
import cpw.mods.fml.client.registry.*;
import cpw.mods.fml.common.network.*;
import cpw.mods.fml.common.registry.*;
import cpw.mods.fml.common.event.*;
import morestuffmod.*;
import morestuffmod.client.*;
import morestuffmod.common.*;
import morestuffmod.common.core.*;
import morestuffmod.common.block.*;
import morestuffmod.common.item.*;
import morestuffmod.common.lib.*;
import morestuffmod.common.recipe.*;
import morestuffmod.common.tile.*;

public class MSMBlock extends Block
{

	public MSMBlock(int par1, int par2, Material par3) 
	{ 
		super(par1, par2, par3); 
		//this.setCreativeTab(MoreStuffMod.tabMSMBlock);
		setTextureFile(Reference.SPRITE_SHEET_LOCATION + Reference.BLOCK_SPRITE_SHEET);
	}
	
	/*
	//TODO Use the array for automatic ID generation.
	public static MSMBlock[] blockArray = new MSMBlock[0];
	*/
	
	public static Block oreCopper;
	public static Block oreSilver;
	public static Block orePlatinum;
	public static Block oreOsmium;
	public static Block oreRuby;
	public static Block oreSapphire;
	public static Block oreUranium;
	public static Block oreAdamantium;
	public static Block oreRhodium;
	public static Block oreRhenium;
	public static Block oreRuthenium;
	public static Block oreGermanium;
	public static Block oreBorium;
	public static Block oreBeryllium;
	public static Block oreIridium;
	public static Block oreGallium;
	public static Block orePalladium;

	public static Block marble;
	public static Block copper;
	public static Block silver;
	public static Block platinum;
	public static Block pureObsidian;
	public static Block bronze;
	public static Block osmium;
	public static Block rubyB;
	public static Block sapphireB;
	public static Block adamantium;
	public static Block steel;
	public static Block rhodium;
	public static Block rhenium;
	public static Block ruthenium;
	public static Block germanium;
	public static Block borium;
	public static Block beryllium;
	public static Block iridium;
	public static Block gallium;
	public static Block palladium;
	public static Block bloodstone;
	public static Block refGlowstone;
	
	// Block Initilization
	public static void initBlocks()
	{
		oreCopper = new MSMBlock(BlockIDs.ID_CopperOre, 0, Material.rock).setStepSound(Block.soundStoneFootstep).setBlockName("oreCopper").setHardness(4.5F).setResistance(5F);
		oreSilver = new MSMBlock(BlockIDs.ID_SilverOre, 1, Material.rock).setStepSound(Block.soundStoneFootstep).setBlockName("oreSilver").setHardness(5.5F).setResistance(5F);
		oreOsmium = new MSMBlock(BlockIDs.ID_OsmiumOre, 3, Material.rock).setStepSound(Block.soundStoneFootstep).setBlockName("oreOsmium").setHardness(6F).setResistance(5F);
		oreRuby = new BlockItemOre(BlockIDs.ID_RubyOre, 4, Material.rock).setStepSound(Block.soundStoneFootstep).setBlockName("oreRuby").setHardness(6F).setResistance(5F);
		oreSapphire = new BlockItemOre(BlockIDs.ID_SapphireOre, 5, Material.rock).setStepSound(Block.soundStoneFootstep).setBlockName("oreSapphire").setHardness(6F).setResistance(5F);
		orePlatinum = new MSMBlock(BlockIDs.ID_PlatinumOre, 2, Material.rock).setStepSound(Block.soundStoneFootstep).setBlockName("orePlatinum").setHardness(7.5F).setResistance(5F);
		oreUranium = new BlockItemOre(BlockIDs.ID_UraniumOre, 6, Material.rock).setStepSound(Block.soundStoneFootstep).setBlockName("oreUranium").setHardness(6.5F).setResistance(5F);
		oreAdamantium = new MSMBlock(BlockIDs.ID_AdamantiumOre, 7, Material.rock).setStepSound(Block.soundStoneFootstep).setBlockName("oreAdamantium").setHardness(7.5F).setResistance(5F);
		oreRhodium = new MSMBlock(BlockIDs.ID_RhodiumOre, 8, Material.rock).setStepSound(Block.soundStoneFootstep).setBlockName("oreRhodium").setHardness(6.5F).setResistance(5F);
		oreRhenium = new MSMBlock(BlockIDs.ID_RheniumOre, 9, Material.rock).setStepSound(Block.soundStoneFootstep).setBlockName("oreRhenium").setHardness(6.5F).setResistance(5F);
		oreRuthenium = new MSMBlock(BlockIDs.ID_RutheniumOre, 10, Material.rock).setStepSound(Block.soundStoneFootstep).setBlockName("oreRuthenium").setHardness(6.5F).setResistance(5F);
		oreGermanium = new MSMBlock(BlockIDs.ID_GermaniumOre, 11, Material.rock).setStepSound(Block.soundStoneFootstep).setBlockName("oreGermanium").setHardness(7.7F).setResistance(5F);
		oreBorium = new MSMBlock(BlockIDs.ID_BoriumOre, 12, Material.rock).setStepSound(Block.soundStoneFootstep).setBlockName("oreBorium").setHardness(4.5F).setResistance(5F);
		oreBeryllium = new MSMBlock(BlockIDs.ID_BerylliumOre, 13, Material.rock).setStepSound(Block.soundStoneFootstep).setBlockName("oreBeryllium").setHardness(6F).setResistance(5F);
		oreIridium = new MSMBlock(BlockIDs.ID_IridiumOre, 14, Material.rock).setStepSound(Block.soundStoneFootstep).setBlockName("oreIridium").setHardness(8F).setResistance(5F);
		oreGallium = new MSMBlock(BlockIDs.ID_GalliumOre, 15, Material.rock).setStepSound(Block.soundStoneFootstep).setBlockName("oreGallium").setHardness(7F).setResistance(5F);
		orePalladium = new MSMBlock(BlockIDs.ID_PalladiumOre, 16, Material.rock).setStepSound(Block.soundStoneFootstep).setBlockName("orePalladium").setHardness(6.1F).setResistance(5F);
		marble = new MSMBlock(BlockIDs.ID_Marble, 16, Material.rock).setStepSound(Block.soundStoneFootstep).setBlockName("marble").setHardness(2F).setResistance(2F);
		copper = new MSMBlock(BlockIDs.ID_Copper, 17, Material.iron).setStepSound(Block.soundMetalFootstep).setBlockName("copper").setHardness(5.9F).setResistance(9F);
		bronze = new MSMBlock(BlockIDs.ID_Bronze, 19, Material.iron).setStepSound(Block.soundMetalFootstep).setBlockName("bronze").setHardness(6F).setResistance(9F);
		silver = new MSMBlock(BlockIDs.ID_Silver, 18, Material.iron).setStepSound(Block.soundMetalFootstep).setBlockName("silver").setHardness(6.2F).setResistance(9F);
		pureObsidian = new MSMBlock(BlockIDs.ID_PureObsidian, 21, Material.iron).setStepSound(Block.soundMetalFootstep).setBlockName("pureObsidian").setHardness(7F).setResistance(6000F);
		platinum = new MSMBlock(BlockIDs.ID_Platinum, 20, Material.iron).setStepSound(Block.soundMetalFootstep).setBlockName("platinum").setHardness(8F).setResistance(6000F);
		osmium = new MSMBlock(BlockIDs.ID_Osmium, 25, Material.iron).setStepSound(Block.soundMetalFootstep).setBlockName("osmium").setHardness(6F).setResistance(9F);
		rubyB = new MSMBlock(BlockIDs.ID_Ruby, 22, Material.iron).setStepSound(Block.soundMetalFootstep).setBlockName("ruby").setHardness(6.2F).setResistance(9F);
		sapphireB = new MSMBlock(BlockIDs.ID_Sapphire, 23, Material.iron).setStepSound(Block.soundMetalFootstep).setBlockName("sapphire").setHardness(6.2F).setResistance(9F);
	    bloodstone = new MSMBlock(BlockIDs.ID_Bloodstone, 26, Material.iron).setStepSound(Block.soundMetalFootstep).setBlockName("bloodstone").setHardness(4.2F).setResistance(200F);
		refGlowstone = new MSMBlock(BlockIDs.ID_RefinedGlowstone, 34, Material.glass).setStepSound(Block.soundGlassFootstep).setBlockName("refGlowstone").setHardness(2F).setResistance(1F).setLightValue(1F);
		adamantium = new MSMBlock(BlockIDs.ID_Adamantium, 35, Material.iron).setStepSound(Block.soundMetalFootstep).setBlockName("adamantium").setHardness(8F).setResistance(200F);
		steel = new MSMBlock(BlockIDs.ID_Steel, 36, Material.iron).setStepSound(Block.soundMetalFootstep).setBlockName("steel").setHardness(8F).setResistance(200F);
		rhodium = new MSMBlock(BlockIDs.ID_Rhodium, 37, Material.iron).setStepSound(Block.soundMetalFootstep).setBlockName("rhodium").setHardness(8F).setResistance(200F);
		ruthenium = new MSMBlock(BlockIDs.ID_Ruthenium, 38, Material.iron).setStepSound(Block.soundMetalFootstep).setBlockName("ruthenium").setHardness(8F).setResistance(200F);
		germanium = new MSMBlock(BlockIDs.ID_Germanium, 39, Material.iron).setStepSound(Block.soundMetalFootstep).setBlockName("germanium").setHardness(8F).setResistance(200F);
		borium = new MSMBlock(BlockIDs.ID_Borium, 40, Material.iron).setStepSound(Block.soundMetalFootstep).setBlockName("borium").setHardness(8F).setResistance(200F);
		beryllium = new MSMBlock(BlockIDs.ID_Beryllium, 41, Material.iron).setStepSound(Block.soundMetalFootstep).setBlockName("beryllium").setHardness(8F).setResistance(200F);
		iridium = new MSMBlock(BlockIDs.ID_Iridium, 42, Material.iron).setStepSound(Block.soundMetalFootstep).setBlockName("iridium").setHardness(8F).setResistance(200F);
		gallium = new MSMBlock(BlockIDs.ID_Gallium, 43, Material.iron).setStepSound(Block.soundMetalFootstep).setBlockName("gallium").setHardness(8F).setResistance(200F);
		palladium = new MSMBlock(BlockIDs.ID_Palladium, 44, Material.iron).setStepSound(Block.soundMetalFootstep).setBlockName("palladium").setHardness(8F).setResistance(200F);
	}
	
	// Block Registry
	public static void registerBlocks()
	{
		GameRegistry.registerBlock(oreCopper);
		GameRegistry.registerBlock(oreSilver);
		GameRegistry.registerBlock(orePlatinum);
		GameRegistry.registerBlock(oreOsmium);
		GameRegistry.registerBlock(oreRuby);
		GameRegistry.registerBlock(oreSapphire);
		GameRegistry.registerBlock(oreUranium);
		GameRegistry.registerBlock(oreAdamantium);
		GameRegistry.registerBlock(oreRhodium);
		GameRegistry.registerBlock(oreRhenium);
		GameRegistry.registerBlock(oreRuthenium);
		GameRegistry.registerBlock(oreGermanium);
		GameRegistry.registerBlock(oreBorium);
		GameRegistry.registerBlock(oreBeryllium);
		GameRegistry.registerBlock(oreIridium);
		GameRegistry.registerBlock(oreGallium);
		GameRegistry.registerBlock(orePalladium);
		GameRegistry.registerBlock(marble);
		GameRegistry.registerBlock(copper);
		GameRegistry.registerBlock(silver);
		GameRegistry.registerBlock(platinum);
		GameRegistry.registerBlock(rubyB);
		GameRegistry.registerBlock(sapphireB);
		GameRegistry.registerBlock(adamantium);
		GameRegistry.registerBlock(steel);
		GameRegistry.registerBlock(rhodium);
		GameRegistry.registerBlock(ruthenium);
		GameRegistry.registerBlock(germanium);
		GameRegistry.registerBlock(borium);
		GameRegistry.registerBlock(beryllium);
		GameRegistry.registerBlock(iridium);
		GameRegistry.registerBlock(gallium);
		GameRegistry.registerBlock(palladium);
		GameRegistry.registerBlock(bloodstone);
		GameRegistry.registerBlock(refGlowstone);
		GameRegistry.registerBlock(pureObsidian);
	}

}
