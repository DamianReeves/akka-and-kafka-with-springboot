package com.github.damianreeves.demo.config

case class AppSettings(endpoints:Map[String,EndpointSettings])
case class EndpointSettings(port:Int)
