package com.danhuang.chapter13

object AnonymouseFunction {
  def main(args: Array[String]): Unit = {
    //对匿名函数的声明
    //1.不需要写def函数名
    //2.不需要写返回类型，使用类型推导
    //3. =变成=>
    //4.如果有多行则使用｛｝包括
    val tripe = (x:Double) => {
      println("x"+x)
      3*x
    }
    println("triple"+tripe)
  }

}
