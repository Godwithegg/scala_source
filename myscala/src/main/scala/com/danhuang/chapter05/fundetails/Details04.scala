package com.danhuang.chapter05.fundetails

object Details04 {
  def main(args: Array[String]): Unit = {

    println(sayOk("mary"))
    println(sayOk())
    println(sayOk(name="tom "))
  }

  //name形参的默认值为jack
  def sayOk(name:String="jack"): String ={
    return name+" ok!"
  }
}
