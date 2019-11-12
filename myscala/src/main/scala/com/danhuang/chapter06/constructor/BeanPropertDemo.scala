package com.danhuang.chapter06.constructor

import scala.beans.BeanProperty

object BeanPropertDemo {
  def main(args: Array[String]): Unit = {
    val car = new Car
    car.setName("plane")
    println(car.getName)
  }
}
class Car{
  @BeanProperty var name:String = _
}
