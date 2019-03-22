package com.github.damianreeves.demo.common.domain.context.processing

import com.github.damianreeves.demo.common.domain.context.processing.OrderInfo.InsertOrderInfo

sealed trait RequestProcessingEvent

object RequestProcessingEvent {
  final case class InsertOrdersRequestReceived(id:String, orders:List[InsertOrderInfo]) extends RequestProcessingEvent
  final case class InsertOrdersRequestAssigned(id:String, serviceInstanceRef: ServiceInstanceRef) extends RequestProcessingEvent
}


