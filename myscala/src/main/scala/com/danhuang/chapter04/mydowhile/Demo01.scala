package com.danhuang.chapter04.mydowhile

object Demo01 {
  def main(args: Array[String]): Unit = {
    var i = 0
    do{
      println("hello"+i)
      i+=1
    }while(i<5)
  }
}
