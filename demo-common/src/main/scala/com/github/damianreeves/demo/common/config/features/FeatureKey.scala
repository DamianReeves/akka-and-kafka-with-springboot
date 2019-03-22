package com.github.damianreeves.demo.common.config.features

import cats.data.NonEmptyList

sealed abstract class FeatureKey(head:String, tail:String*) {
  val segments:NonEmptyList[String] = NonEmptyList.of(head, tail:_*)
  val value:String = segments.tail.foldLeft(segments.head){(acc,curr) => s"$acc/$curr"}
}

object FeatureKey {

  final case object ProcessingModeKey extends FeatureKey("processing-mode")
}
