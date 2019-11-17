package com.danhuang.chapter10

object ArrayDemo02 {
  def main(args: Array[String]): Unit = {
    //说明
    //1.使用的是object Array的apply
    //2.直接初始化数组 这时因为你给了整数和“”，这个数组的泛型就是Any
    //3.遍历方式一样
    var arr02 = Array(1,3,"xxx")
    arr02(1) = "xx"
    for(i <- arr02){
      println(i)
    }

    //可以使用传统的方式遍历，使用下标的方式遍历
    for(index <- 0 to arr02.length-1){
      println("arr02 "+arr02(index))
    }
  }

}
