package com.danhuang.chapter04.myfor

object UserFor2 {
  def main(args: Array[String]): Unit = {
    for(i <- 1 to 3;j = i*2){
      println("i="+i+"j="+j)
    }

    //等价
    println("------------------")
    for{
      i <- 1 to 3
      j = i * 2}{
      println("i="+i+"j="+j)
    }
  }

}