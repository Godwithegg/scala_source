package com.danhuang.chapter13

object AbstractControl {
  def main(args: Array[String]): Unit = {
    //myRunInThread 就是一个抽象控制
    //是没有输入， 也没有输出的函数 f1: () => Unit
//    def myRunInThread(f1:()=>Unit)={
//      new Thread{
//        override def run(): Unit = {
//          f1()//只写了f1
//        }
//      }.start()
//    }
//    myRunInThread(()=>{
//      println("干活了！5s")
//      Thread.sleep(5000)
//      println("干完了")
//    })

    def myRunInThread2(f1: =>Unit)={
      new Thread{
        override def run(): Unit = {
          f1 //只写了f1
        }
      }.start()
    }

    //对于没有输入，也没有返回值的函数可以简写成如下形式
    myRunInThread2{
      println("干活了！5s")
      Thread.sleep(5000)
      println("干完了")
    }

  }

}
