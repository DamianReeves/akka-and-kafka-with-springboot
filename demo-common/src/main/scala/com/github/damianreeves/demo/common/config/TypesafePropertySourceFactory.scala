package com.github.damianreeves.demo.common.config

import org.springframework.core.env.PropertySource
import org.springframework.core.io.support.{EncodedResource, PropertySourceFactory}

class TypesafePropertySourceFactory extends PropertySourceFactory {
  override def createPropertySource(name: String, resource: EncodedResource): PropertySource[_] = {
    import com.typesafe.config.{ConfigFactory, ConfigParseOptions, ConfigResolveOptions}
    val config = ConfigFactory.load(
      resource.getResource.getFilename,
      ConfigParseOptions.defaults.setAllowMissing(false),
      ConfigResolveOptions.noSystem).resolve

    val safeName = if (name == null) "typeSafe" else name
    new TypesafeConfigPropertySource(safeName, config)
  }
}
