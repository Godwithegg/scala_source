package com.danhuang.chapter11

object ReduceDemo01 {
  def main(args: Array[String]): Unit = {
    /**
      * 使用化简的方式来计算list集合的和
      */
    val list = List(1,2,3,4,5)
    val res: Int = list.reduceLeft(sum)
    //执行的流程分析
    //步骤1 （1+2）
    //步骤2 （1+2）+3
    //步骤3 ((1+2)+3)+4
    //步骤5 (((1+2)+3)+4)+5
    println(res)
  }
  def sum(n1:Int,n2:Int):Int={
    println("sum被调用了")
    n1+n2
  }

}
