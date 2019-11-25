package com.danhuang.chapter13

object PartialFunDemo03 {
  def main(args: Array[String]): Unit = {
    //可以将前面的案例的偏函数编写
    def partialFun : PartialFunction[Any,Int]= {
      //简写成case语句
      case i:Int=>i+1
      case j:Double=>(j*2).toInt
    }
    val list = List(1,2,3,4,1.2,1.4,"hello")
    val list2 = list.collect(partialFun)
    println(list2)

    //第二种简写形式
    val list3 = list.collect{case i:Int=>i+1}
    println(list3)
  }

}
