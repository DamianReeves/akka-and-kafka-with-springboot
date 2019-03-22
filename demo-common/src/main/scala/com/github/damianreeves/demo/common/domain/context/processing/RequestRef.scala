package com.github.damianreeves.demo.common.domain.context.processing

object RequestRef {

  final case class InsertOrdersRef(id:String) extends RequestRef
  final case class UpdateOrdersRef(id:String) extends RequestRef
  final case class UpdateOrderRef(id:String, parent:UpdateOrdersRef) extends RequestRef

  def insertOrders(id:String):InsertOrdersRef = InsertOrdersRef(id)
  def updateOrders(id:String):UpdateOrdersRef = UpdateOrdersRef(id)
}

sealed trait RequestRef
