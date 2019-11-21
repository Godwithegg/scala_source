package com.danhuang.chapter11

object FlodDemo02 {
  def main(args: Array[String]): Unit = {
    val list4 = List(1,9,2,8)
    def minus(n1:Int,n2:Int):Int={
      n1 - n2
    }
    val i6 = (1 /: list4)(minus) //等价=》list4.flodLeft(1)(minus)
    println("i6="+i6)

    val i7 = (list4 :\ 10)(minus) //等价=》list4.flodright(1)(minus)
    println("i6="+i7)

  }

}
