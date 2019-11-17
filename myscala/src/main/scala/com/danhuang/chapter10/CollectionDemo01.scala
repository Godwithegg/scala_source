package com.danhuang.chapter10

object CollectionDemo01 {
  def main(args: Array[String]): Unit = {
    val str = "hello"
    for(item <- str){
      println(item)
    }
    println(str(2)) //l
  }

}
