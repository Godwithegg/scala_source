package com.danhuang.chapter16

import scala.math._
object Exercise04 {
  def main(args: Array[String]): Unit = {
    val h = compose(f,g)
    println(h(2))
    println(h(1)+" "+h(0))
  }
  def f(x:Double)=if(x>0)Some(sqrt(x)) else None
  def g(x:Double) = if(x!=1)Some(1/(x-1)) else None
  //根据需求合并成一个函数
  //形式val h = compose(f,g）
  //案例： h(2)将得到Some(1)[走的g],而h(1)和h(0)将得到None
  def compose(f:Double=>Option[Double],g:Double=>Option[Double])={
        //返回了一个匿名函数
    (x:Double)=>{
      //合并
      //1.如果其中一个函数返回None，则组合函数也应返回None
      if(f(x)==None || g(x)==None) None
        //2.h(2)将得到Some(1)
      else g(x)
    }
  }
}
