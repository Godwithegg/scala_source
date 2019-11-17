package com.danhuang.chapter09

object ImplicitClassDemo {
  def main(args: Array[String]): Unit = {
    //DB1会对应生成隐式类
    //DB1是一个隐式类,当我们在隐式类的作用域范围，创建MySQL1实例
    //该隐式类就会生效，这个工作仍然编译器完成
    //看底层...
    implicit class DB1(val m:MySQL1){//ImplicitClassDemo$DB1$2
      def addSuffix():String={
        m + " scala"
      }
    }
    var m = new MySQL1
    m.sayOk()
    println(m.addSuffix()) //研究如何关联到

    def test1(n1:Int)={
      println("ok")
    }
    implicit def f1(n:Double):Int={
      n.toInt
    }
    test1(10.1)
  }
}
class MySQL1{
  def sayOk()={
    println("say ok")
  }
}
