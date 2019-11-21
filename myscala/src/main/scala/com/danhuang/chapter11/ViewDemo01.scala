package com.danhuang.chapter11

import scala.collection.{SeqView, immutable}

object ViewDemo01 {
  def main(args: Array[String]): Unit = {
    def multiple(n:Int):Int={
      n
    }
    //如果这个数，逆序后和原来的数相等，就返回true，否则返回false
    def eq(i:Int):Boolean={
      println("eq被调用")
      i.toString.equals(i.toString.reverse)
    }
    //说明：没有使用view
//    val viewSquares1 = (1 to 100).map(multiple).filter(eq)
//    println(viewSquares1)

    //使用view，来完成这个问题，懒加载
    //程序中，对集合进行map、filter、reducce，fold..
    //你并不希望立即执行，而是在使用到结果才执行，则可以用view来进行优化
    val viewSquares2: SeqView[Int, immutable.IndexedSeq[Int]] = (1 to 100).view.filter(eq)
    println(viewSquares2)
    //遍历
//    for(item <- viewSquares2){
//      println("item="+item)
//    }
  }
}
