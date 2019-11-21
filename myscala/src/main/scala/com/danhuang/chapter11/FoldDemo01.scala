package com.danhuang.chapter11

object FoldDemo01 {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4)
    def minus(n1:Int,n2:Int):Int={
      n1 - n2
    }

    //说明
    //1.折叠的理解和化简的运行机制几乎和reduce一样
    //步骤1 list.foldleft(5)(minus)理解成list(5,1,2,3,4).reduceleft(minus)
    //步骤(5-1)
    //步骤(5-1)-2
    //步骤((5-1)-2)-3
    //步骤(((5-1)-2)-3)-4 30=CBD
    println(list.foldLeft(5)(minus))//函数的科里化
    //步骤1 list.foldright(5)(minus)理解成list(1,2,3,4,5).reduceright(minus)
    //步骤(4-5)
    //步骤(3-(4-5))
    //步骤2-(3-(4-5))
    //步骤1-(2-(3-(4-5)))
    println(list.foldRight(5)(minus))//函数的科里化

  }

}
