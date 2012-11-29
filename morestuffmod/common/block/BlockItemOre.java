package morestuffmod.common.block; 

import net.minecraft.src.*;
import morestuffmod.*;
import java.util.Random;

public class BlockItemOre extends Block

{
	public int idDropped(int par1, Random par2Random, int par3)
    {
        return this.blockID == MSMBlock.oreRuby.blockID ? Item.emerald.shiftedIndex : (this.blockID == MSMBlock.oreSapphire.blockID ? Item.emerald.shiftedIndex : this.blockID);
    }

	public BlockItemOre(int par1, int par2, Material par3Material) 
	{
		super(par1, par2, par3Material);
		//this.setCreativeTab(MoreStuffMod.tabMSMBlock);
		
	}

	public int quantityDropped(Random par1Random) 
	
	{ 
		
		return (1 + par1Random.nextInt(2)); 
		
	}
	 
	public int quantityDroppedWithBonus(int par1, Random par2Random)
	    {
	        if (par1 > 0 && this.blockID != this.idDropped(0, par2Random, par1))
	        {
	            int var3 = par2Random.nextInt(par1 + 2) - 1;

	            if (var3 < 0)
	            {
	                var3 = 0;
	            }

	            return this.quantityDropped(par2Random) * (var3 + 1);
	        }
	        else
	        {
	            return this.quantityDropped(par2Random);
	        }
	    }
	
	public String getTextureFile()
	{
		return "/MSM/terrain.png";
	}

}
