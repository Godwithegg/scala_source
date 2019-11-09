package com.danhuang.chapter04.myfor

object ForExercise01 {

  def main(args: Array[String]): Unit = {
    /*
    for循环练习题
    打印1~100之间所有是9的倍数的整数的个数及总和.
    完成下面的表达式输出
   */

    var cnt:Int = 0
    var sum:Int = 0
    for(i <- 1 to 100 if i%9==0){
      cnt+=1
      sum+=i
    }
    println("9的倍数的个数是:"+cnt)
    println("9的倍数的总和是:"+sum)


    //输出加法的循环表达式
    for(i <- 0 to 6){
      printf("%d+%d=%d\n",i,(6-i),i)
    }
  }

}
