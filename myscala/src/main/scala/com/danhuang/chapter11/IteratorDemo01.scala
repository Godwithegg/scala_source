package com.danhuang.chapter11

object IteratorDemo01 {
  def main(args: Array[String]): Unit = {
    val iterator = List(1,2,3,4,5).iterator //得到迭代器
    /**
      * 这里我们看看迭代器的继承关系
      */
    //遍历方式1.while
//    while(iterator.hasNext){
//      println(iterator.next)
//    }
    //遍历方式2 for
    for(enum <- iterator){
      println(enum)
    }

  }

}
