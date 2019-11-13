package com.danhuang.chapter07.homework

object Exercise02 {
  def main(args: Array[String]): Unit = {
    println("ok~")
  }

}
class Student{
  import scala.beans.BeanProperty
  //读写属性
  @BeanProperty var name:String = _
  @BeanProperty var id:Long = _

}
