package com.danhuang.chapter06.constructor

object ConDemo02 {
  def main(args: Array[String]): Unit = {
    val a = new A
    //输出顺序是
    //1.b~~~父类
    //2.AA() 主构造器
    //3.A this(name:String) 辅助构造器

  }
}
class B{
  println("b~~~~~")
}
class A extends B{
  def this(name:String){
    this//调用A的主构造器
    println("A this(name:String)")
  }
}
