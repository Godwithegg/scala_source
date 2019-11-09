package com.danhuang.chapter05

object Method2Function {

  def main(args: Array[String]): Unit = {

    //使用方法
    //先创建一个对象
    var dog = new Dog()
    println(dog.sum(2, 3))

    //方法转成函数
    val f1 = dog.sum _
    println("f1="+f1)
    println("f1="+f1(1,2))

    //函数,求两个数的和
    val f2 = (n1:Int,n2:Int)=>{
      n1+n2//函数体
    }
    println("f2="+f2)
    println("f2="+f2(3,4))

  }


}

class Dog{
  //方法
  def sum(n1:Int,n2:Int):Int={
    n1 + n2
  }
}
