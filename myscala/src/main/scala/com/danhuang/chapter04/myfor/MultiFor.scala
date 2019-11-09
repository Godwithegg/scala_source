package com.danhuang.chapter04.myfor

object MultiFor {
  def main(args: Array[String]): Unit = {
    for(i <- 1 to 3;j <- 1 to 3){
      println("i="+i+",j="+j) //输出9句
    }

    println("----------------------")

    //上面的写法也可以写成
    for(i <- 1 to 3){
      for(j <- 1 to 3){
        println("i="+i+",j="+j) //输出9句
      }
    }
  }

}
