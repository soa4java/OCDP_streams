package com.asiainfo.ocdp.streaming.common

import scala.collection.mutable.Map

/**
 * Created by leo on 8/12/15.
 */
trait CacheManager {
  def getHashCacheList(key: String): List[String]

  def getHashCacheMap(key: String): Map[String, String]

  def getHashCacheString(key: String): String

  def setHashCacheList(key: String, value: List[String])

  def setHashCacheMap(key: String, value: Map[String, String])

  def setHashCacheString(key: String, value: String)

  def getCommonCacheMap(key: String): Map[String, String]

  def getCommonCacheList(key: String): List[String]

  def getCommonCacheValue(cacheName: String, key: String): String

  def setByteCacheString(key: String, value: Any)

  def getByteCacheString(key: String): Any

  def setMultiCache(keysvalues: Map[String, Any])

  def getMultiCacheByKeys(keys: List[String]): Map[String, Any]

  def setCommonCacheValue(cacheName: String, key: String, value: String)

  def hgetall(keys: List[String]): Map[String, Map[String, String]]

  def hmset(keyValues: Map[String, Map[String, String]])
}
