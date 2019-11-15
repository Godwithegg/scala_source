package com.danhuang.chapter07.myextends

object ScalaFieldOverride {
  def main(args: Array[String]): Unit = {
    val obj1:AAA= new BBB
    val obj2:BBB=new BBB
    println("obj1.age="+obj1.age + "\t obj2.age="+obj2.age)
  }
}
class AAA{
  val age : Int = 10  //会生成 public age()

}
class BBB extends AAA{
  override val age :Int = 20//会生成 public age()
}
