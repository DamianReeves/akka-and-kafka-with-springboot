package com.github.damianreeves.demo.common.messaging

final case class MessageEnvelope[Key,Payload](header:Key, payload:Payload)

trait MessageHandler[Key, Payload, Context] {
  def handle(message:MessageEnvelope[Key,Payload])(implicit context:Context)
}

trait MessageHandlerContext {
  def getState[K,S](key:K):Option[S]
  def forward[K,V,A](key:K, value:V, target:TargetRef[A])
}

final case class TargetRef[A](name:String)
