package com.danhuang.chapter12

object MatchVarDemo {
  def main(args: Array[String]): Unit = {
    val (x,y) = (1,2)
    println(x+" "+y)
    val (q,r) = BigInt(10) /% 3 //说明q=BigInt(10)/3 r=BigInt(10)%3
    val arr = Array(1,2,3,4)
    val Array(first,second,_*)=arr //提出arr的前两个元素
    println(first+" "+second)
  }

}
