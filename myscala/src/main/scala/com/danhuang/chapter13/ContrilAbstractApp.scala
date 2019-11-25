package com.danhuang.chapter13

object ContrilAbstractApp {
  def main(args: Array[String]): Unit = {
    var x = 10
    while(x>0){
      x-=1
      println("x"+x)
    }
    //我们可以使用控制抽象写出until函数，实现类似的效果
    x = 10
    until(x>0){
      x-=1
      println("x="+x)
    }
  }
  def until(condition: => Boolean)(block: => Unit):Unit={
    //类似while循环，递归
    if(condition){
      block
      until(condition)(block)
    }
  }

}
