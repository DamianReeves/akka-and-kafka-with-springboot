package com.github.damianreeves.demo.common.domain.context.processing

import com.sksamuel.avro4s.SchemaFor
import com.sksamuel.avro4s.kafka.GenericSerde
import com.typesafe.scalalogging.LazyLogging
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{FlatSpec, Matchers}

@RunWith(classOf[JUnitRunner])
class RequestRefSpecs extends FlatSpec with Matchers with LazyLogging {
  "A RequestRef" should "support avro schema generation" in {
    val schema = SchemaFor[RequestRef].schema
    println(s"Schema: ${schema.toString(true)}")
    schema should not be null
  }

  it should "support serialization and deserialization with a Serde" in {
    val serde = new GenericSerde[RequestRef]()
    val sut = RequestRef.insertOrders("ORDER-123-456")

    val serialized: Array[Byte] = serde.serialize("Foo", sut)
    println(s"Serialized: $serialized")
    val actual: RequestRef = serde.deserialize("Foo", serialized)

    actual shouldBe sut
  }
}
