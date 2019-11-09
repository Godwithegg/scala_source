package com.danhuang.chapter04.ifelse

import scala.io.StdIn

object Demo01 {
  def main(args: Array[String]): Unit = {
    println("输入年龄")
    val age = StdIn.readInt()
    if(age>18){
      println("age>18")
    }else{
      println("age<=18")
    }

    //小技巧，如何查看某个包下包含的内容
    //1.比如我们想看Scala.io包含什么内容
    //2.将光标放在io上即可，输入ctrl+b
    //3.将光标放在StdIn上即可，输入ctrl+b，看的是StdIn源码
    scala.io.StdIn
  }

}
