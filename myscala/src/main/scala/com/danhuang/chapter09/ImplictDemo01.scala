package com.danhuang.chapter09

object ImplictDemo01 {
  def main(args: Array[String]): Unit = {
    //编写一个隐式函数转成 Double->Int转换
    //隐式函数应当在作用域才能生效
    implicit def f1(d:Double):Int={ //底层 生成f1$1
      d.toInt
    }
    implicit def f2(f:Float):Int={ //底层 生成f1$1
      f.toInt
    }
    //这里我们必须保证隐式函数的匹配只能是唯一的
//    implicit def f3(x:Float):Int={ //底层 生成f1$1
//      x.toInt
//    }
    val num :Int = 3.5  //底层编译f1$1(3.5)
    val num2:Int = 4.5f
    val num1:Int = 6.7
    println("num="+num)

  }

}
