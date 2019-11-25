package com.danhuang.chapter13

/*
给你一个集合val list = List(1, 2, 3, 4, "abc") ，请完成如下要求:
将集合list中的所有数字+1，并返回一个新的集合
要求忽略掉 非数字 的元素，即返回的 新的集合 形式为 (2, 3, 4, 5)

 */
object PartialFunDemo01 {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4,"abc")
    //思路1 filter + map方式解决
    //先过滤，再map
    println(list.filter(f1).map(f3).map(f2))

    //思路2 模式匹配
    //小结：虽然使用模式匹配比较简洁，但是不够完美
    val list2 = List(1,2,3,4,"hello")
    println(list2.map(addOne2))
  }

  def addOne2(n:Any):Any={
    n match{
      case x:Int => x+1
      case _ =>
    }
  }

  def f1(n:Any):Boolean={
    n.isInstanceOf[Int]
  }
  def f2(n:Int):Int=n+1
  //将Any->Int[Map]
  def f3(n:Any):Int=n.asInstanceOf[Int]

}
