package com.danhuang.chapter16

object Exercise05 {
  def main(args: Array[String]): Unit = {
    println(values(x => x * x, -5, 5))
  }
  //编写函数values(fun:(Int)=>Int,low:Int,high:Int),
  //该函数输出一个集合，对应给区间内给定函数的输入和输出
  //比如，values(x=>x*x,-5,5)应该产出一个对偶集合（-5,25）,(-4,16),(-3,9),...,(5,25)
  def values(fun:(Int)=>Int,low:Int,high:Int)={
    var list = List[(Int,Int)]() //空集合，放我们的对偶
    for(i <- low to high){
      list = list :+ (i,fun(i))  //加入
    }
    list
  }

}
