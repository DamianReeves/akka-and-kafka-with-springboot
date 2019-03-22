package com.github.damianreeves.demo.common.messaging

trait KVStore[K,V] {
  def get(key:K)
}
