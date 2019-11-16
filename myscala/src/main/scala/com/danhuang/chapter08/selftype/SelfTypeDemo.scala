package com.danhuang.chapter08.selftype

object SelfTypeDemo {
  def main(args: Array[String]): Unit = {

  }
}
//logger就是自身类型特质,当这里做了自身类型后，那么就相当于trait Logger extends Exception,
//要求混入该特质的对象也是Exception的子类
trait Logger{
  //明确告诉编译器，我就是Exception，如果没有这句话，下面dgetMessage不能调用
  this:Exception=>
  def log()={
    //既然我就是Exception，那么我就可以调用其中的方法
    println(getMessage)
  }
}
//class Console extends Logger{}  //错误
class Console extends Exception with Logger{}  //正确