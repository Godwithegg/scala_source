package com.danhuang.chapter16

object Exercise03 {
  def main(args: Array[String]): Unit = {
    val lists = List(Some(1),Some(3),None,Some(4))
    println(mySum(lists))
  }
  //返回非None的和
  def mySum(list:List[Option[Int]])={
    list.map(_.getOrElse(0)).sum
  }

}
