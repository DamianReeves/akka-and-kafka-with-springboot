package com.github.damianreeves.demo.common.config.features

import com.sksamuel.avro4s.SchemaFor
import com.typesafe.scalalogging.LazyLogging
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{FlatSpec, Matchers}


@RunWith(classOf[JUnitRunner])
class ProcessingModeSpecs extends FlatSpec with Matchers with LazyLogging {
  behavior of "ProcessingMode"

  it should "be limited to three modes (legacy-only, modern-only, and legacy-and-modern)" in {
    val actual = ProcessingMode.values

    actual shouldBe Set(ProcessingMode.LegacyOnly, ProcessingMode.ModernOnly, ProcessingMode.LegacyAndModern)
  }

  behavior of "ProcessingMode's Avro integration"

  it should "support avro shchema generation" in {
    val schema = SchemaFor[ProcessingMode].schema

    schema should not be null

    logger.info(s"Schema:${System.lineSeparator()}${schema.toString(true)}")
  }

}
