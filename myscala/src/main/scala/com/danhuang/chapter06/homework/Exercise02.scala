package com.danhuang.chapter06.homework

import scala.io.StdIn

object Exercise02 {
  def main(args: Array[String]): Unit = {
    val n: Int = StdIn.readInt()
//    println(judge(n))
    countdown(n)
  }

  /**
    * 一个数字如果为正数，则它的signum为1;
    * 如果是负数,则signum为-1;
    * 如果为0,则signum为0.编写一个函数来计算这个值
    */
  def judge(n:Int):Int={
    if(n>0){
      1
    }else if(n<0){
      -1
    }else{
      0
    }
  }

  /**
    * 编写一个过程countdown(n:Int)，打印从n到0的数字
    */
  def countdown(n:Int)={
    for(i <- 1 to n reverse){
      print(i+" ")
    }
  }

}
