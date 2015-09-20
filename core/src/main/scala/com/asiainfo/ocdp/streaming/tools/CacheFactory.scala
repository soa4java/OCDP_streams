package com.asiainfo.ocdp.streaming.tools

import com.asiainfo.ocdp.streaming.common.{JodisCacheManager, CodisCacheManager, CacheManager}
import com.asiainfo.ocdp.streaming.config.MainFrameConf

/**
 * Created by tsingfu on 15/8/18.
 */
object CacheFactory {
  val getManager:CacheManager = {
    val manager = MainFrameConf.systemProps.get("cacheManager")
    manager match {
//      case "TextCacheManager" => new TextCacheManager
      case "CodisCacheManager" => new CodisCacheManager
      case "JodisCacheManager" => new JodisCacheManager
      case _ => throw new Exception("cacheManager is not set!")
    }
  }
}
