package com.danhuang.chapter14

object RecursiveReverseString {
  def main(args: Array[String]): Unit = {
    var s:String = "nihao"
    println(reverse(s))
  }
  //使用递归完成字符串翻转
  def reverse(xs:String):String={
    if(xs.size==1)
      xs
    else
      reverse(xs.tail)+xs.head
  }

}
