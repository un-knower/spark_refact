package com.iiot.stream.base

class MetricSample4DN {
  var ts: Long = 0L
  var k: String = ""
  var v: String = ""
  var dn:String = ""


  def getTs: Long = ts
  def setTs(value: Long): Unit = {
    ts = value
  }


  def getK: String = k
  def setK(key: String): Unit = {
    k = key
  }


  def getV: String = v
  def setV(value: String): Unit = {
    v = value
  }

  def getDn: String = dn
  def setDn(Dn: String): Unit = {
    dn = Dn
  }

}
