package com.danhuang.chapter05.recursive

object Demo01 {
  def main(args: Array[String]): Unit = {
    test(4)
  }

  def test(n:Int):Any={
    if(n>2){
      test(n-1)
    }
    println("n="+n)
  }
}
