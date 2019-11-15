package com.danhuang.chapter08.homework

object Exercise02 {
  def main(args: Array[String]): Unit = {
    val point = Point(3,4)
    println(point.x1)
  }
}
class Point(x:Int,y:Int){
  val x1 = x
  val y1 = y
}
object Point{
  def apply(a:Int,b:Int): Point = new Point(a:Int,b:Int)
}