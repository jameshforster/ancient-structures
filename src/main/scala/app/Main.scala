package app

import net.minecraftforge.fml.common.{Mod, SidedProxy}
import net.minecraftforge.fml.common.Mod.EventHandler
import net.minecraftforge.fml.common.event.{FMLInitializationEvent, FMLPostInitializationEvent, FMLPreInitializationEvent}

/**
  * Created by james-forster on 03/07/17.
  */
@Mod(modid = Main.modId, name = Main.modName, version = Main.version)
object Main {

  val modId = "Ancient-Structures"
  val modName = "Ancient-Structures"
  val version = "0.1.0"

  @SidedProxy(clientSide = "app.ClientProxy", serverSide = "app.ServerProxy")
  var proxy: Proxy = _

  @EventHandler
  def preInit(e: FMLPreInitializationEvent): Unit = proxy.preInit(e)

  @EventHandler
  def init(e: FMLInitializationEvent): Unit = proxy.init(e)

  @EventHandler
  def postInit(e: FMLPostInitializationEvent): Unit = proxy.postInit(e)
}
