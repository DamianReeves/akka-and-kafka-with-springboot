package com.github.damianreeves.demo.common.config.features

import com.github.damianreeves.demo.common.util.Values


sealed abstract class ProcessingMode(val name:String)

object ProcessingMode {
  final case object LegacyOnly extends ProcessingMode("legacy-only")
  final case object ModernOnly extends ProcessingMode("modern-only")
  final case object LegacyAndModern extends ProcessingMode("legacy-and-modern")

  val values:Set[ProcessingMode] = Values[ProcessingMode]
}
