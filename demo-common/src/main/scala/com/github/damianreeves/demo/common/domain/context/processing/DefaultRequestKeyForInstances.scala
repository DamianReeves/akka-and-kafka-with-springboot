package com.github.damianreeves.demo.common.domain.context.processing

import com.github.damianreeves.demo.common.domain.context.processing.Request.{UpdateOrder, UpdateOrders}
import com.github.damianreeves.demo.common.domain.context.processing.RequestRef.{UpdateOrderRef, UpdateOrdersRef}

trait DefaultRequestKeyForInstances {

  implicit val defaultRequestKeyForUpdateOrders:RequestRefFor[UpdateOrders] =
    value => UpdateOrdersRef(value.id)

  implicit val defaultRequestKeyForUpdateOrder:RequestRefFor[UpdateOrder] =
    value => UpdateOrderRef(value.id, value.parent)
}
