package com.danhuang.chapter05.myexception

object ScalaExceptionDemo {
  def main(args: Array[String]): Unit = {
    try{
      val r = 10/0
    }catch {
      //说明
      //1.在scala中只有一个catch
      //2.在catch中有多个case，每个case可以匹配一种异常
      //3.=>关键符号，表示后面是对该异常的处理代码
      //4.finally最终要执行的代码
      case ex:ArithmeticException=>{
        println("捕获了除数为0的异常")
      }
      case ex:Exception=>println("捕获了异常")
    }finally {
      //最终要执行的代码
      println("scala finally...")
    }
    println("ok~继续执行")
  }

}
