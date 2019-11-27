package com.danhuang.chapter14

object RecursiveFnb {
  def main(args: Array[String]): Unit = {
    var count = BigInt(0)
    println(fbn(10))
    println("递归的次数是="+count)
    def fbn(n:BigInt):BigInt={
      count += 1
      if(n==1||n==2)1
      else fbn(n-1)+fbn(n-2)  //重复计算，改递归->迭代
    }
  }


}
