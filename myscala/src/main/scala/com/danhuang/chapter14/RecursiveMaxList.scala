package com.danhuang.chapter14

object RecursiveMaxList {
  def main(args: Array[String]): Unit = {
    println(myMax(List(1)))
    println(myMax(List(1,-1,9,3)))
  }
  //使用递归求List中的最大元素
  def  myMax(xs:List[Int]):Int={
    //如果为empty，抛出异常
    if(xs.isEmpty)
      throw new java.util.NoSuchElementException
    if(xs.size==1)//如果有一个元素，就是他
      xs.head
      //递归是告诉计算机做什么，而不是怎么做
    else if(xs.head > myMax(xs.tail))xs.head else myMax(xs.tail)
  }

}
