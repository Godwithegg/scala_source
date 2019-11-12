package com.danhuang.chapter06.oop

object MemState {
  def main(args: Array[String]): Unit = {
    val p1 = new Person2
    p1.name = "jack"
    p1.age = 10

    val p2 = p1
    println(p1 == p2)

    p1.name = "tom"
    println(p2.name)
  }
}

class Person2{
  var name = ""
  var age:Int = _ //如果是用 _方式给默认值，则默认必须制定类型
  
}
