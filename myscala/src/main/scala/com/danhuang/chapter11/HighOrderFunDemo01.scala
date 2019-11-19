package com.danhuang.chapter11

object HighOrderFunDemo01 {
  def main(args: Array[String]): Unit = {
    //使用高阶函数
    val res: Double = test(sum2,3.5)
    println("res="+res)

    //在scala中，可以把一个函数直接赋给一个变量,但是不执行函数
    val f1 = myPrint _ //_先不执行
    f1() //执行
  }
  //说明
  //1.test就是一个高阶函数
  //2.f:Double=>Double表示一个函数的声明,该函数可以接受一个double，返回double
  //3.n1:DOuble普通参数
  //4.f(n1)在test函数中，执行你传入的函数
  def test(f:Double => Double,n1:Double)={
    f(n1)
  }

  def myPrint():Unit={
    println("hello,world!")
  }

  //普通的函数
  def sum2(d:Double):Double={
    println("sum2被调用")
    d + d
  }
}
