package com.danhuang.chapter13

object FunParameter {
  def main(args: Array[String]): Unit = {
    def plus(x:Int):Int=3+x
    //说明
    val result1 = Array(1,2,3,4).map(plus(_))
    println(result1.mkString(","))

    //说明
    //1.在scala中，函数也是有类型，比如plus就是<function1>
    println("plus函数类型"+(plus _))
  }

}
