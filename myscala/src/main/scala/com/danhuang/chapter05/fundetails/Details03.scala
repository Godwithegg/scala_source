package com.danhuang.chapter05.fundetails

object Details03 {
  def main(args: Array[String]): Unit = {

    def f1():Unit={  //private final sayOk$1
      println("f1")
    }
    println("ok")

    def sayOk():Unit={
      println("main sayOk")
      def sayOk():Unit={
        println("sayok sayok")
      }
    }
  }
  def sayOk():Unit={//成员
    println("Main say ok")
  }

}
