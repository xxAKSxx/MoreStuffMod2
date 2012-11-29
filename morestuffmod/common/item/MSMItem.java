package morestuffmod.common.item;

import net.minecraft.src.*;
import net.minecraft.src.Item;
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

public class MSMItem extends Item
{
	public MSMItem(int i)
    {
            super(i);
            setTextureFile(Reference.SPRITE_SHEET_LOCATION + Reference.ITEM_SPRITE_SHEET);
    }
	
	public static Item ingotCopper;
	public static Item ingotSilver;
	public static Item ingotPlatinum;
	public static Item ingotObsidian;
	public static Item ingotBronze;
	public static Item ingotSteel;
	public static Item ingotAdamantium;
	public static Item ingotRhodium;
	public static Item ingotRhutenium;
	public static Item ingotGermanium;
	public static Item ingotBorium;
	public static Item ingotBeryllium;
	public static Item ingotIridium;
	public static Item ingotGallium;
	public static Item ingotPalladium;
	public static Item ingotBlood;
	public static Item castOsmium;
	public static Item castRhenium;
	public static Item dustCopper;
	public static Item dustIron;
	public static Item dustBronze;
	public static Item dustSilver;
	public static Item dustGold;
	public static Item dustObsidian;
	public static Item dustSteel;
	public static Item dustAdamantium;
	public static Item dustRhodium;
	public static Item dustRhutenium;
	public static Item dustGermanium;
	public static Item dustBorium;
	public static Item dustBeryllium;
	public static Item dustIridium;
	public static Item dustGallium;
	public static Item dustPalladium;
	public static Item plateCopper;
	public static Item plateIron;
	public static Item plateBronze;
	public static Item plateSilver;
	public static Item plateGold;
	public static Item plateObsidian;
	public static Item plateSteel;
	public static Item ruby;
	public static Item sapphire;
	
	
	// Item Initilization
	public static void initItems()
	{
		//TODO Add Creative Tabs
		
		ingotCopper = new MSMItem(ItemIDs.ID_CopperIngot).setItemName("ingotCopper").setIconCoord(0, 0);
		ingotSilver = new MSMItem(ItemIDs.ID_SilverIngot).setItemName("ingotSilver").setIconCoord(1, 0);
		ingotPlatinum = new MSMItem(ItemIDs.ID_PlatinumIngot).setItemName("ingotPlatinum").setIconCoord(2, 0);
		ingotObsidian = new MSMItem(ItemIDs.ID_ObsidianIngot).setItemName("ingotObsidian").setIconCoord(3, 0);
		ingotBronze = new MSMItem(ItemIDs.ID_BronzeIngot).setItemName("ingotBronze").setIconCoord(4, 0);
		ingotSteel = new MSMItem(ItemIDs.ID_SteelIngot).setItemName("ingotSteel").setIconCoord(5, 0);
		ingotAdamantium = new MSMItem(ItemIDs.ID_AdamantiumIngot).setItemName("ingotAdamantium").setIconCoord(6, 0);
		ingotRhodium = new MSMItem(ItemIDs.ID_RhodiumIngot).setItemName("ingotRhodium").setIconCoord(7, 0);
		ingotRhutenium = new MSMItem(ItemIDs.ID_RhuteniumIngot).setItemName("ingotRhutenium").setIconCoord(8, 0);
		ingotGermanium = new MSMItem(ItemIDs.ID_GermaniumIngot).setItemName("ingotGermanium").setIconCoord(9, 0);
		ingotBorium = new MSMItem(ItemIDs.ID_BoriumIngot).setItemName("ingotBorium").setIconCoord(10, 0);
		ingotBeryllium = new MSMItem(ItemIDs.ID_BerylliumIngot).setItemName("ingotBeryllium").setIconCoord(11, 0);
		ingotIridium = new MSMItem(ItemIDs.ID_IridiumIngot).setItemName("ingotIridium").setIconCoord(12, 0);
		ingotGallium = new MSMItem(ItemIDs.ID_GalliumIngot).setItemName("ingotGallium").setIconCoord(13, 0);
		ingotPalladium = new MSMItem(ItemIDs.ID_PalladiumIngot).setItemName("ingotPalladium").setIconCoord(14, 0);
		ingotBlood = new MSMItem(ItemIDs.ID_BloodIngot).setItemName("ingotBlood").setIconCoord(15, 0);
	}
	
	// Name Registrations
	public static void nameItems()
	{
		//TODO Add Localization for Langs
		
		LanguageRegistry.addName(ingotCopper, "Copper Ingot");
		LanguageRegistry.addName(ingotSilver, "Silver Ingot");
		LanguageRegistry.addName(ingotPlatinum, "Platinum Ingot");
		LanguageRegistry.addName(ingotObsidian, "Obsidian Bar");
		LanguageRegistry.addName(ingotBronze, "Bronze Ingot");
		LanguageRegistry.addName(ingotSteel, "Steel Ingot");
		LanguageRegistry.addName(ingotAdamantium, "Adamantium Ingot");
		LanguageRegistry.addName(ingotRhodium, "Rhodium Ingot");
		LanguageRegistry.addName(ingotRhutenium, "Rhutenium Ingot");
		LanguageRegistry.addName(ingotGermanium, "Germanium Ingot");
		LanguageRegistry.addName(ingotBorium, "Borium Ingot");
		LanguageRegistry.addName(ingotBeryllium, "Beryllium Ingot");
		LanguageRegistry.addName(ingotIridium, "Iridium Ingot");
		LanguageRegistry.addName(ingotGallium, "Gallium Ingot");
		LanguageRegistry.addName(ingotPalladium, "Palladium Ingot");
		LanguageRegistry.addName(ingotBlood, "Bloodstone Ingot");
	}
	

}
