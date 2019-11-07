package com.danhuang.chapter01.vars

object VarDemo01 {

  def main(args:Array[String]):Unit = {
    //编译器，动态的（逃逸分析）
    var age:Int = 10
    var sal:Double = 10.9
    var name:String = "tom"
    var isPass:Boolean = true
    //在scala中小数默认为double类型，整数默认为int类型
    var score:Float = 70.8f
    println(s"$age $isPass")
  }
}
