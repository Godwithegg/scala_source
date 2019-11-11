package com.danhuang.chapter05.myexception

object ThrowDemo {
  def main(args: Array[String]): Unit = {
//    val res = test
//    println(res)
//    println("ok~~~~~~")
    //如果我们希望test（）抛出异常后，代码可以继续执行，则我们需要处理
    try{
      test
    }catch {
      case ex:Exception=>{
        println("出现了异常")
      }
    }finally {
      println("ok~~~")
    }
    println("Ok~~")
  }
  def test:Nothing={
    throw new Exception("异常出现")
  }

}
