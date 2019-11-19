package com.danhuang.chapter11

object HighOrderFunDemo02 {
  def main(args: Array[String]): Unit = {
    test2(sayOk)
  }
  //说明test2是一个高阶函数，可以接受一个没有输入，返回Unit的函数
  def test2(f:()=>Unit)={
    f()
  }
  def sayOk()={
    println("say ok")
  }
  def sub(n1:Int)={

  }

}
