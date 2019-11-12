//代码说明
//1.package com.danhuang.chapter07{}表示我们创建了包 com.danhuang.chapter07
//我们可以继续写它的子包scala //com.danhuang.chapter07.scala,还可以写类，还可以写特质trait，还可以写object
//2.即scala支持，在一个文件中，可以同时创建多个包，以及给各个包创建类，trait和object
package com.danhuang.chapter07{ //包com.danhuang.chapter07
  package scala{ //包 com.danhuang.chapter07.scala
    class Person3{ //表示在 com.danhuang.chapter07.scala下创建了类Person3
      val name ="Nick";
      def play(message:String)={
        println(this.name+" "+message)
      }
    }
    object Test3{
      def main(args: Array[String]): Unit = {
        println("ok~~")
      }
    }
  }
}
