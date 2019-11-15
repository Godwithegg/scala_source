package com.danhuang.chapter07.myextends

object AbstractClassDetails01 {
  def main(args: Array[String]): Unit = {
    //默认情况下，一个抽象类是不能实例化的，但是你实例化时，动态的实现了抽象类的所有抽象方法也可以
    val animal = new Animal03 {
      override def sayHello(): Unit = {}

      override var food: String = _
    }
    animal.sayHello()
  }
}
abstract class Anima02{
  //在抽象类中可以有实现方法
  def sayHi()={
    println("xxx")
  }
}
abstract class Animal03{
  def sayHello()
  var food:String
}
class Cat extends Animal03{
  override def sayHello(): Unit = {
    println("小狗汪汪叫！")
  }
  override var food: String = _
}