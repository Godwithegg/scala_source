package com.danhuang.chapter13

object HigherOrderFunction {
  def main(args: Array[String]): Unit = {
    def test(f:Double=>Double,f1:Double=>Int,n1:Double)={
      f(f1(n1))
    }
    //sum是接收一个Double，返回一个Double
    def sum(d:Double):Double={
      d+d
    }
    def mod(d:Double):Int={
      d.toInt % 2
    }
    val res = test(sum,mod,6.0)
    println("res="+res)
  }

}
