package morestuffmod;

import net.minecraft.src.*;
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

@Mod(modid="Reference.MOD_ID", name="Reference.MOD_NAME", version="Reference.VERSION")
public class MoreStuffMod 
{
	@Instance(Reference.MOD_ID)
    public static MoreStuffMod instance;
	
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	
	@PreInit
	public void preLoad(FMLPreInitializationEvent event)
	{
		
	}
	
	@Init
	public void moreStuffMod(FMLInitializationEvent event)
	{	
		//Init Blocks
		MSMBlock.initBlocks();
	}
	
	@PostInit
	public void afterLoad(FMLPostInitializationEvent event)
	{
		
	}

}
