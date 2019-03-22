package com.github.damianreeves.demo.controllers

import org.springframework.web.bind.annotation.{RequestMapping, RestController}

@RestController
class HelloController {
  @RequestMapping(Array("/welcome"))
  def welcome:Array[String] = Array(
    "Hello",
    "Hola",
    "Aloha"
  )
}
