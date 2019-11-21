package com.danhuang.chapter11

object ScanDemo01 {
  def main(args: Array[String]): Unit = {
    //普通函数
    def minus(n1:Int,n2:Int):Int={
      n1 - n2
    }
    //5 (1,2,3,4,5)=>(5,4,2,-1,-5,-10)
    val i8 = (1 to 5).scanLeft(5)(minus) //IndexedSeq[Int]
    println(i8)
    //普通函数
    def add(n1:Int,n2:Int):Int={
      n1 + n2
    }
    //5 (1,2,3,4,5)=>(5,6,8,11,15,20)
    val i9 = (1 to 5).scanLeft(5)(add)
    println(i9)

    //(1,2,3,4,5) 5=>(20,19,17,14,10,5)
    val i10 = (1 to 5).scanRight(5)(add)
    println(i10)

  }
}
