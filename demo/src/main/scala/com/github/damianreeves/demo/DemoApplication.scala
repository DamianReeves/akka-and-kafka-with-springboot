package com.github.damianreeves.demo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.{EnableAutoConfiguration, SpringBootApplication}

object DemoApplication {
  def main(args: Array[String]): Unit = {
    val application = new SpringApplication(classOf[DemoApplication])
    application.run(args:_*)
  }
}


@SpringBootApplication
@EnableAutoConfiguration
class DemoApplication() {

}
