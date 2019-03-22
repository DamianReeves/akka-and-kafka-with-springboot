package com.github.damianreeves.demo.kafka.topology

sealed abstract class ProcessingNodeInfo(val name:String)

sealed abstract class SourceProcessingNodeInfo(name:String, val topics:String*)
  extends ProcessingNodeInfo(name)

sealed abstract class ProcessorNodeInfo[K,V](name:String,  val topics:String*)
  extends ProcessingNodeInfo(name)

object ProcessingNodeInfo {
  final case object RequestInboxSource extends SourceProcessingNodeInfo("source.demo.request_source_node", "push.demo.request_processing_events")
  final case object RequestProcessor extends ProcessingNodeInfo("processor.demo.request_processor_node")
}


trait SupplierFor[A,P] {
  def supplier(instance:A):P
}
