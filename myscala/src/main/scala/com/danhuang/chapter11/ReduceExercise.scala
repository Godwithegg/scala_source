package com.danhuang.chapter11

object ReduceExercise {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4,5)
    def minus(num1:Int,num2:Int):Int={
      num1 - num2
    }
    //(((1-2)-3)-4)-5=-13
    println(list.reduceLeft(minus))
    //1-(2-(3-(4-5)))=3
    println(list.reduceRight(minus))
    //底层就是reduceleft=-13
    println(list.reduce(minus))

    val m: Int = list.reduce(min)
    println("最小值:"+m)
  }
  //求出最小值
  def min(n1:Int,n2:Int):Int={
    if(n1<n2)n1 else n2
  }

}
