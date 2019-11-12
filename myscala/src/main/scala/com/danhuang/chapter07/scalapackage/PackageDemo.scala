//代码说明
//1.package com.danhuang.chapter07{}表示我们创建了包 com.danhuang.chapter07
//我们可以继续写它的子包scala //com.danhuang.chapter07.scala,还可以写类，还可以写特质trait，还可以写object
//2.即scala支持，在一个文件中，可以同时创建多个包，以及给各个包创建类，trait和object
package com.danhuang.chapter07{ //包com.danhuang.chapter07

  class User{//在com.danhuang.chapter07下创建个User类
    def sayHello:Unit={
      //想使用com.danhuang.chapter07.scala2包下的Monster,需要导包
      import com.danhuang.chapter07.scala2._
      val monster = new Monster
    }
  }
  package scala2{//创建包 com.danhuang.chapter07.scala2
    class User{
    }
    class Monster{//在com.danhuang.scala2包下创建个User类
    }
  }
  package object scala{
    val name = "king"
    def sayHi={
      println("package object scala sayHi~")
    }
  }
  package scala{ //包 com.danhuang.chapter07.scala
    //1.在包中直接写方法，或者定义变量，就错误 => 使用包对象技术来解决
    //2.package object scala表示创建一个包对象，他是com.danhuang.chapter07.scala的包对象
    //3.每一个包都可以有且只有一个包对象
    //4.包对象的名称需要和子包一样
    //5.在包对象中可以定义变量，方法
    //6.在包对象中定义的变量和方法，就可以在对应的包中使用

    class User{
      def testUser()={
        println("name="+name)
        sayHi
      }
    }

    class Person3{ //表示在 com.danhuang.chapter07.scala下创建了类Person3
      val name ="Nick";
      def play(message:String)={
        println(this.name+" "+message)
      }
    }
    object Test3{
      def main(args: Array[String]): Unit = {

        println("使用name="+name)
        sayHi
        println("ok~~")
        //这里我们可以直接使用父包的内容
        //1.如果有同名的类，则采用就近原则来使用内容（比如包）
        //2.如果就是要使用父包的类，则指定路径即可
        val user = new User
        println("user="+user)
      }
    }
  }
}
