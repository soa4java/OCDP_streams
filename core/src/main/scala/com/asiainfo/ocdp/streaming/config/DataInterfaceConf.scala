package com.asiainfo.ocdp.streaming.config

import org.apache.spark.sql.types.StructType

import scala.beans.BeanProperty

/**
 * Created by leo on 8/13/15.
 */
class DataInterfaceConf extends BaseConf {
  @BeanProperty var diid: String = ""
  @BeanProperty var name: String = ""
  @BeanProperty var diType: Int = 0
  @BeanProperty var delim: String = ""
  @BeanProperty var dsConf: DataSourceConf = null
  @BeanProperty var baseSchema: StructType = null
  @BeanProperty var UDFSchema: StructType = null

  @BeanProperty var interval: Int = 1
}
