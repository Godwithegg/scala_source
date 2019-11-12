package com.danhuang.chapter06.homework

object Exercise04 {
  def main(args: Array[String]): Unit = {
    val n = 3

    val res1 = (0 to n).reverse
    println(res1)
    //foreach 函数 (f:Int=>U),即接受一个输入参数为1个int，输出为unit的函数
    //说明
    //1.将res1的每个元素依次遍历出来，传递给println(x)
//    res1.foreach(println)
//    res1.foreach(myShow)
//    (0 to n).reverse.foreach(println)


  }

  //自己写一个myshow
  def myShow(n:Int)={
    print(n+" ")
  }

}
