package com.github.damianreeves.demo.common.domain.context.processing

import com.github.damianreeves.demo.common.domain.context.common.Quantity
import com.github.damianreeves.demo.common.domain.context.processing.OrderInfo.{InsertOrderInfo, UpdateOrderInfo}
import com.github.damianreeves.demo.common.domain.context.processing.RequestRef.{InsertOrdersRef, UpdateOrdersRef}

sealed trait Request

object Request {

  final case class UpdateOrders(id:String, orders:List[UpdateOrderInfo]) extends Request

  final case class UpdateOrder(
    id:String,
    parent: UpdateOrdersRef
  ) extends Request

  final case class InsertOrders(id:String, orders:List[InsertOrderInfo])

  final case class InsertOrder(
    id:String,
    parent: InsertOrdersRef,
    productId: ProductId,
    quantity: Quantity,
  ) extends Request

}






