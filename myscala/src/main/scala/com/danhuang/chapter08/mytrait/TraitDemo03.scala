package com.danhuang.chapter08.mytrait

object TraitDemo03 {
  def main(args: Array[String]): Unit = {
    println("~~~~~~~~~~~")
    //创建sheep
    val sheep = new Sheep
    sheep.sayHi()
//    sheep.sayHello
  }
}

//当一个trait有抽象方法和非抽象方法时
//1.一个trait在底层对应两个类 Trait03.class 接口
//2.还对应Trait03$class.class抽象类
trait Trait03{
  //抽象方法
  def sayHi()
  //实现普通方法
//  def sayHello={
//    println("say Hello")
//  }
}
//当trait有接口和抽象类时
//class sheep extends Trait03在底层对应
//class sheep implements Trait03
//当在sheep类中要使用 Trait03的实现的方法，就通过Trait03$class
class Sheep extends Trait03{
  override def sayHi(): Unit = {
    println("小羊say hi~~")
  }
}