package app.blocks

import app.blocks.ruined.SealedRuinedBlocks
import net.minecraft.block.Block
import net.minecraft.block.material.Material
import net.minecraftforge.fml.common.registry.GameRegistry

/**
  * Created by james-forster on 03/07/17.
  */

object ModBlocks {
  def createBlocks(): Unit = {
    val allBlocks: Seq[ModBlock] = SealedRuinedBlocks.sealedRuinedBlocks

    allBlocks.foreach(GameRegistry.register)
  }
}

class ModBlock(material: Material) extends Block(material)
