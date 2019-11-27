package com.danhuang.chapter14

object RecursiveFatoria {
  def main(args: Array[String]): Unit = {
    println(factorial(10))
  }
  //阶乘
  def factorial(n:Int):Int={
    if(n==1)
      1
    else
      n*factorial(n-1)
  }

}
