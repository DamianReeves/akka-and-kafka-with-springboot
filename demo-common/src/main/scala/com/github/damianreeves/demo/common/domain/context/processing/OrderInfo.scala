package com.github.damianreeves.demo.common.domain.context.processing

import com.github.damianreeves.demo.common.domain.context.common.Quantity

sealed trait OrderInfo {
  def id:String
}

object OrderInfo {

  final case class InsertOrderInfo(id:String, productId: ProductId, quantity:Quantity) extends OrderInfo
  final case class UpdateOrderInfo(id:String) extends OrderInfo
}
