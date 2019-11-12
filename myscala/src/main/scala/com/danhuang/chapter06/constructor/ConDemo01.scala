package com.danhuang.chapter06.constructor

object ConDemo01 {
  def main(args: Array[String]): Unit = {
    val p1 = new Person("jack",20)
    println(p1)

    val p2 = new Person("tom")
    println(p2)
  }

}

//构造器的快速入门
//创建Person对象的同时初始化对象的age属性和name属性值
class Person(inName:String,inAge:Int){
  var name:String = inName
  var age:Int = inAge

  age += 10
  println("~~~~~~~~~~~")

  //重写了tostring，便于输出对象的信息
  override def toString: String = {
    "信息如下 name="+this.name +" age="+this.age
  }
  println("ok~~~")
  def this(name:String){
    //辅助构造器，必须在第一行显式调用主构造器
    this("jack",12)
    this.name = name
  }
}
