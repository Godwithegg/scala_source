package com.danhuang.chapter05.mylazy

object LazyDemo01 {
  def main(args: Array[String]): Unit = {
    lazy val res = sum(10,20)
    println("--------------------------")
    //println("res="+res)//要在使用res前，才执行
  }
  def sum(n1:Int,n2:Int):Int={
    println("sum() 执行了...")
    n1+n2
  }
}
