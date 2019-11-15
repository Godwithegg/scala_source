package com.danhuang.chapter08

object Apply {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,5)
    val pig = new Pig("校花")
    //使用apply方法来创建对象
    val pig2 = Pig("小黑猪")
    val pig3 = Pig()
    println("pig2.name="+pig2.name)
    println("pig3.name="+pig3.name)

  }
}
//案例演示apply方法
class Pig(pName:String){
  var name:String = pName
}
object Pig{
  //编写一个apply方法
  def apply(pName: String): Pig = new Pig(pName)

  def apply(): Pig = new Pig("匿名猪")
}
