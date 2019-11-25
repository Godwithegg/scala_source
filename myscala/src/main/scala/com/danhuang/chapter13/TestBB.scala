package com.danhuang.chapter13

object TestBB {
  def main(args: Array[String]): Unit = {
    def f1 = makeSuffix(".jpg")
    println(f1("cat.jpg"))
    println(f1("cat"))
  }
  def makeSuffix(suffix:String)={
    (filename:String)=>{
      if(filename.endsWith(suffix)){
        filename
      }else{
        filename + ".jpg"
      }
    }
  }

}
