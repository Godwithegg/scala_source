package com.danhuang.chapter04.myfor

import util.control.Breaks._
object ForGuard {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 3 if i != 2) {
      println(i + "")
    }
    println()
  }

}
