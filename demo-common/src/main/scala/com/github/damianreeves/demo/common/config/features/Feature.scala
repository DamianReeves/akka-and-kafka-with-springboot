package com.github.damianreeves.demo.common.config.features

import cats.data.NonEmptyList
import com.sksamuel.avro4s.{Decoder, Encoder}

abstract class Feature[A:Encoder:Decoder](key:Feature.Key, value:A)

object Feature {

  type Key = NonEmptyList[String]

  object Key {

  }

}

