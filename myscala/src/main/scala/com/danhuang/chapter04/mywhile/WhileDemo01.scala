package com.danhuang.chapter04.mywhile

object WhileDemo01 {
  def main(args: Array[String]): Unit = {
    //输出10句hello world
    //1.定义循环变量
    var i = 0
    while(i < 10){
      println("hello world"+i)
      //循环变量迭代
      i+=1
    }


  }

}
