package app.blocks.ruined

import app.blocks.ModBlock

/**
  * Created by james-forster on 03/07/17.
  */
object SealedRuinedBlocks {

  class SealedRuinedBlock(name: String) extends RuinedBlock(name) {
    setBlockUnbreakable()
  }

  class SealedRuinedStone extends SealedRuinedBlock("sealed_ruined_block")

  class SealedRuinedColumn extends SealedRuinedBlock("sealed_ruined_column")

  class SealedRuinedGlass extends SealedRuinedBlock("sealed_ruined_glass")

  class SealedRuinedFrame extends SealedRuinedBlock("sealed_ruined_frame")

  class SealedRuinedStair extends SealedRuinedBlock("sealed_ruined_stair")

  class SealedRuinedSlab extends SealedRuinedBlock("sealed_ruined_slab")

  class SealedRuinedFence extends SealedRuinedBlock("sealed_ruined_fence")

  def sealedRuinedBlocks: Seq[ModBlock] = Seq(
    new SealedRuinedStone,
    new SealedRuinedColumn,
    new SealedRuinedGlass,
    new SealedRuinedFrame,
    new SealedRuinedStair,
    new SealedRuinedSlab,
    new SealedRuinedFence)
}
