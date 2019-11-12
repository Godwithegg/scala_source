package com.danhuang.chapter06.constructor

object ConDemo04 {
  def main(args: Array[String]): Unit = {
    val worker = new Worker("smith")
    worker.name //不能访问inName
    val worker2 = new Worker2("smith2")
    worker2.inName //可以访问inName
    println("hello!")

    val worker3 = new Worker3("jack")
    worker3.inName = "mary"
    println(worker3.inName)
  }
}
//1.如果主构造器Worker（inName:String）,那么inName就是一个局部变量
//2.如果
class Worker(inName:String){
  var name = inName
}
//如果主构造器是Work2（val inName：String）那么 inName就是Worker2的一个私有的只读属性
class Worker2(val inName:String){
  val name = inName
}
// 如果 主构造器是Worker3(var inName: String) ，那么  inName就是Worker3的一个
// 一个private 的可以读写属性
class Worker3(var inName: String) {
  var name = inName
}
