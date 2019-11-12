package com.danhuang.chapter06.homework

object Exercise05 {
  def main(args: Array[String]): Unit = {
    var res = 1L
    var res2 = 1L
    //这里我们解释
    //1.
    //"Hello".foreach(res*=_.toLong)
    //println("res="+res)
    "Hello".foreach(myCount)
    println(res)
    "Hello".foreach(res2 *= _.toLong)
    println(res2)
    def myCount(char:Char)={
      res *= char.toLong

    }
  }


}
