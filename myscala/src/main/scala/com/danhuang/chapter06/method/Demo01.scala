package com.danhuang.chapter06.method

object Demo01 {
  def main(args: Array[String]): Unit = {
    //使用一把
    val dog = new Dog

  }

}
class Dog{
  private var sal:Double = _
  var food:String = _

  def cal(n1:Int,n2:Int):Int={
    n1 + n2
  }
}
