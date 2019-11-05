package com.danhuang.chapter01

object PrintDemo {
  def main(args: Array[String]): Unit = {
    var str1:String = "hello"
    var str2:String = "world"
    println(str1+str2)
    var name:String = "danhuang"
    var age:Int = 10
    var sal:Float = 10.67f
    var height:Double = 180.15
    //格式化输出
    printf("名字=%s 年龄是%d 薪资是%f 身高%f",name,age,sal,height)

    //scala支持使用$输出内容
    println(s"个人信息如下:\n名字$name\n名字$age\n薪水$sal\n身高$height")
    //如果在字符串中出现了类似${sal*10},{}内是表达式
    println(s"个人信息如下2:\n名字${name}\n名字${age}\n薪水${sal*10}\n身高${height}")
  }
}
