package com.danhuang.chapter11

object StreamDemo01 {
  def main(args: Array[String]): Unit = {
    //创建stream
    def numsForm(n:BigInt) : Stream[BigInt]=n #:: numsForm(n+1)
    val stream1 = numsForm(1)
    println(stream1)
    //取出第一个元素
    println("head="+stream1.head)
    println(stream1.tail)
    println(stream1)

    //看一个应用案例
    def multi(x:BigInt):BigInt={
      x*x
    }
    println(numsForm(5).map(multi)) //(25,?)
  }

}
