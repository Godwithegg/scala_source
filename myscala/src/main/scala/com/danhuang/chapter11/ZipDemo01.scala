package com.danhuang.chapter11

object ZipDemo01 {
  def main(args: Array[String]): Unit = {
    //拉链,如果数据量不一致会产生数据丢失
//    val list1= List(1,2)
    val list1= List(1,2,3)
    val list2= List(4,5,6)
    val list3 = list1.zip(list2) //(1,4),(2,5),(3,6)
    println("list3="+list3)
  }

}
