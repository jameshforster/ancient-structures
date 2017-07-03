package app

import net.minecraftforge.fml.common.event.{FMLInitializationEvent, FMLPostInitializationEvent, FMLPreInitializationEvent}

/**
  * Created by james-forster on 03/07/17.
  */
trait Proxy {
  def preInit(e: FMLPreInitializationEvent): Unit
  def init(e: FMLInitializationEvent): Unit
  def postInit(e: FMLPostInitializationEvent): Unit
}

class ClientProxy extends Proxy {
  override def preInit(e: FMLPreInitializationEvent): Unit = super.preInit(e)
  override def init(e: FMLInitializationEvent): Unit = super.init(e)
  override def postInit(e: FMLPostInitializationEvent): Unit = super.postInit(e)
}

class ServerProxy extends Proxy {
  override def preInit(e: FMLPreInitializationEvent): Unit = super.preInit(e)
  override def init(e: FMLInitializationEvent): Unit = super.init(e)
  override def postInit(e: FMLPostInitializationEvent): Unit = super.postInit(e)
}
