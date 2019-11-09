package com.danhuang.chapter04.myfor

object ForUntilDemo02 {
  def main(args: Array[String]): Unit = {
    //输出10句，“hello，world”
    val start = 1
    val end = 11
    //循环的范围是[1,11)
    for(i <- start until end){
      println("hello,world"+i)
    }
  }
}
