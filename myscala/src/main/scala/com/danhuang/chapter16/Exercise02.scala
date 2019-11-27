package com.danhuang.chapter16

object Exercise02 {
  def main(args: Array[String]): Unit = {
    println(swap(Array(1,2,3,4)).toBuffer)
    println(swap(Array(1)).toBuffer)
  }
  //利用模式匹配，编写一个swap函数，交换数组中的前两个元素的位置，前提条件是数组的长度至少为2
  def swap(arr:Array[Any]) ={
    arr match{
      case Array(first,second,rest @_*)=> Array(second,first)++rest
      case _=>arr
    }
  }

}
