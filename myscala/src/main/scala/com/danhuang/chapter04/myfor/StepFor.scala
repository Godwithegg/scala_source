package com.danhuang.chapter04.myfor

object StepFor {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 10) {
      println("i=" + i)
    }
    //步长控制为2
    println("------------------")
    //Range(1,10,2)的对应的构建方法是
    //def apply(start: Int, end: Int, step: Int): Range = new Range(start, end, step)
    for (i <- Range(1, 10, 2)) {
      for (i <- Range(1, 10, 2)) {
        println("i=" + i)
      }
    }

    println("========================")
    //控制步长的第二种方式 for循环守卫
    for (i <- 1 to 10 if i % 2 != 0) {
      println("i=" + i)
    }

  }
}