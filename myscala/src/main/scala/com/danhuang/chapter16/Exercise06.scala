package com.danhuang.chapter16

object Exercise06 {
  def main(args: Array[String]): Unit = {
    println(factorial(3))
  }
  def factorial(n:Int):Int={
    //1 to n
    1 to n reduceLeft(_*_)
  }

}
