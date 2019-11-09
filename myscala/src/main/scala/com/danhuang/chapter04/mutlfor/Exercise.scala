package com.danhuang.chapter04.mutlfor

import scala.io.StdIn

object Exercise {
  /*
   应用实例：

  1.统计三个班成绩情况，每个班有5名同学，求出各个班的平均分和所有班级的平均分[学生的成绩从键盘输入]。
   分析思路
   (1) classNum 表示 班级个数 , stuNum 表示学生个数
   (2) classScore 表示各个班级总分 totalScore 表示所有班级总分
   (3) score 表示各个学生成绩
   (4) 使用循环的方式输入成绩
  2.统计三个班及格人数，每个班有5名同学。
  3.打印出九九乘法表
  */
  def main(args: Array[String]): Unit = {
    var score = 0.0
    var classScore = 0.0
    var totalScore = 0.0
    for(j <- 1 to 3){
      println("输入第"+j+"个班成绩")
      for(i <- 1 to 5){
        score = StdIn.readDouble()
        classScore += score
      }
      println("平均分是："+classScore/5)
      println("总分是："+classScore)
      totalScore += classScore
      classScore = 0.0
    }
    println("总成绩为"+totalScore)
  }

}
