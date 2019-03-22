package com.github.damianreeves.demo.kafka.processors

import com.github.damianreeves.demo.common.domain.context.processing.RequestProcessingEvent.{InsertOrdersRequestAssigned, InsertOrdersRequestReceived}
import com.github.damianreeves.demo.common.domain.context.processing.{RequestProcessingEvent, RequestRef}
import org.apache.kafka.streams.processor.AbstractProcessor
import com.typesafe.scalalogging.LazyLogging

class RequestProcessor extends AbstractProcessor[RequestRef,RequestProcessingEvent] with LazyLogging {

  override def process(requestRef: RequestRef, event: RequestProcessingEvent): Unit = event match {
    case InsertOrdersRequestReceived(id, orders) =>
      logger.info(s"Received: $event")
    case InsertOrdersRequestAssigned(id, serviceInstanceRef) =>
      logger.info(s"Received: $event")
  }
}
