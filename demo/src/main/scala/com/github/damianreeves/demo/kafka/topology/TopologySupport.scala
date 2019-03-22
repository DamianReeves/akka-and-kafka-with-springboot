package com.github.damianreeves.demo.kafka.topology

import org.apache.kafka.streams.Topology

trait TopologySupport {
  def configureTopology(topology:Topology):Topology = {
    topology addNode ProcessingNodeInfo.RequestInboxSource

  }

  implicit class TopologyOps(val self: Topology) {
    def addNode(node:ProcessingNodeInfo):Topology = node match {
      case node:SourceProcessingNodeInfo =>
        self.addSource(node.name, node.topics:_*)
      case node:ProcessorNodeInfo =>
        self.addProcessor(node.name, ???)
    }
  }
}

object TopologySupport {


}


