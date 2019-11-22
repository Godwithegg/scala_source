package com.danhuang.chapter12

object MatchIfDemo01 {
  def main(args: Array[String]): Unit = {
    for(ch <- "+-3!"){//是对"+-3!"的遍历
      var sign = 0
      var digit = 0
      ch match{
        case '+' => sign = 1
        case '-' => sign = -1
          //说明..
          //如果case后有条件守卫即if，那么这时的_不是表示默认匹配
          //_后面如果有if表示忽略传入的ch
        case _ if ch.toString.equals("3")=>digit = 3
        case _ if ch>1000 =>println("ch>1000")
        case _ => sign = 2
      }
      //分析
      //+ 1 0
      //- -1 0
      //3 0 3
      //! 2 0
      println(ch +" "+sign+" "+digit)
    }
  }

}
