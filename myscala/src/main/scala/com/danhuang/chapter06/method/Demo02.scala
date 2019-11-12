package com.danhuang.chapter06.method

object Demo02 {
  def main(args: Array[String]): Unit = {

    /**
      * 编写一个类，编写一个方法，方法不需要参数，在方法中打印一个10*8的矩阵
      * 在main中调用该方法
      */
    val exec = new MethodExec
    exec.printRect()

    exec.width = 2.1
    exec.len = 4.1
    println(exec.area())
  }

}
class MethodExec{

  //属性
  var len = 0.0
  var width = 0.0

  def printRect()={
    for(i <- 0 until 10){
      for(j <- 1 to 8){
        print("* ")
      }
      println()
    }
  }
  //计算面积的方法
  def area()={
    (this.len * this.width).formatted("%.2f")
  }
}