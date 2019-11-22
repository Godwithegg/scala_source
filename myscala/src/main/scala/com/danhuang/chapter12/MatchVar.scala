package com.danhuang.chapter12

object MatchVar {
  def main(args: Array[String]): Unit = {
    val ch = 'V'
    ch match{
      case '+' => println("ok")
        //下面case mychar含义是mychar = ch
      case mychar => println("ok~"+mychar)
      case _ => println("ok~~")
    }

    val ch1 = '+'
    //match是一个表达式，一次可以有返回值
    //返回值就是匹配到的代码块的最后一句话的值
    val res = ch1 match{
      case '+'=>ch1+"hello"
        //下面case mychar含义是match=ch
      case _ => println("ok~~")
    }
    println("res="+res)
  }

}
