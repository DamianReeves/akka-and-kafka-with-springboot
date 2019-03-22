package com.github.damianreeves.demo.common.domain.context.processing

trait RequestRefFor[A] {

  def ref(value:A):RequestRef
}

object RequestRefFor extends DefaultRequestKeyForInstances {

  def apply[A](implicit keyFor:RequestRefFor[A]): RequestRefFor[A] = keyFor

  def requestKeyFor[A](fn:A=>RequestRef):RequestRefFor[A] =
    value => fn(value)
}

