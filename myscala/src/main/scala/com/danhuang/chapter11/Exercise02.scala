package com.danhuang.chapter11

import scala.collection.mutable.ArrayBuffer

object Exercise02 {
  def main(args: Array[String]): Unit = {
    val sentence = "AAAAAAABBBBBBCCCCCCC"
    val arrayBuffer = new ArrayBuffer[Char]()
    sentence.foldLeft(arrayBuffer)(putArray)
    println(arrayBuffer)
  }
  def putArray(arr: ArrayBuffer[Char],c:Char)={
    //将c放入到ArrayBuffer中
    arr.append(c)
    arr
  }
}
