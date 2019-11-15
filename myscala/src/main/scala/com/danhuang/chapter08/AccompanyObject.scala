package com.danhuang.chapter08

object AccompanyObject {
  def main(args: Array[String]): Unit = {
    println(ScalaPerson.sex)//true 在底层等价于ScalaPerson$.MODULE$.sex()
    ScalaPerson.sayHi()//在底层等价于ScalaPerson$.MODULE$.sayHi()
  }
}
//说明
//1.当在同一个文件中，有class ScalaPerson 和object ScalaPerson
//2.class ScalaPerson成为伴生类，将非静态的内容写到该类中
//3.object scalaPerson 称为伴生对象，将静态的内容写入到该类中（类）
//4.class ScalaPerson编译后底层生成ScalaPerson类，ScalaPerson.class
//5.object ScalaPerson编译后底层生成ScalaPerson$类ScalaPerson$.class
//6.对于伴生对象的内容，我们可以直接通过ScalaPerson.属性 或者方法
//类
class ScalaPerson{
  var name:String=_
}
//伴生对象
object ScalaPerson {
  var sex: Boolean = true
  def sayHi()={
    println("")
  }
}