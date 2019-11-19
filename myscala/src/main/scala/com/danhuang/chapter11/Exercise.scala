package com.danhuang.chapter11

object Exercise {
  def main(args: Array[String]): Unit = {
    val names = List("Alice","Bob","Nick")
    val list2: List[String] = names.map(f)
    println(list2)
  }
  def f(s:String):String={
    s.toUpperCase
  }

}
