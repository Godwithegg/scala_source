package com.danhuang.chapter04.myfor

object ForDemo01 {
  def main(args: Array[String]): Unit = {
    //输出10句“hello world”
    val start = 1
    val end = 10
    //说明
    //1.start从哪个数开始循环
    //2.to是关键字
    //3.end循环结束的值
    //4.start to end表示前后闭合
    for(i <- start to end){
      println("hello world")
    }

    //说明for 这种推导时，也可以直接对集合进行遍历
    var list = List("hello",10,30,"tom")
    for(item <- list){
      println(item)
    }
  }

}
