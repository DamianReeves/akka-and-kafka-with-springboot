package com.github.damianreeves.demo.common.config

import org.springframework.boot.SpringApplication
import org.springframework.boot.env.EnvironmentPostProcessor
import org.springframework.core.env.ConfigurableEnvironment

class DemoEnvironmentPostProcessor extends EnvironmentPostProcessor {
  override def postProcessEnvironment(environment: ConfigurableEnvironment, application: SpringApplication): Unit = {
  }
}
