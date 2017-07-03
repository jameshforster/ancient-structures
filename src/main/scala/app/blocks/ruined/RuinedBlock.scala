package app.blocks.ruined

import app.blocks.ModBlock
import net.minecraft.block.material.Material

/**
  * Created by james-forster on 03/07/17.
  */
class RuinedBlock(name: String) extends ModBlock(Material.ROCK) {
  setHardness(2F)
  setResistance(10F)
  setUnlocalizedName(name)
}
