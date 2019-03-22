package com.github.damianreeves.demo.common.config

import com.typesafe.config.Config
import org.springframework.core.env.EnumerablePropertySource

class TypesafeConfigPropertySource(name:String, source:Config) extends EnumerablePropertySource[Config](name,source) {
  override def getPropertyNames: Array[String] = {
    val keys = scala.collection.mutable.ArrayBuffer.empty[String]
    source.entrySet().forEach{ entry =>
      keys += entry.getKey
    }
    keys.toArray
  }

  override def getProperty(path: String): AnyRef = {
    if (path.contains("[") || path.contains(":")) return null
    if (source.hasPath(path)) return source.getAnyRef(path)
    null
  }
}
