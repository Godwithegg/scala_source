package com.danhuang.chapter11

object FilterDemo01 {
  def main(args: Array[String]): Unit = {
    /**
      * 选出首字母为A的元素
      */
    val names = List("Alice","Bob","Nick")
    val names2: List[String] = names.filter(startA)
    println(names2)
  }
  def startA(str:String):Boolean={
    str.startsWith("A")
  }
}
