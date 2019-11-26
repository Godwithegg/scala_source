package com.danhuang.akka.actor

import akka.actor.{Actor, ActorRef, ActorSystem, Props}

//说明
//1.当我们继承了actor后，就是一个actor，核心方法receive方法重写
class SayHelloActor extends Actor{
  //说明
  //1.receive方法，会被该actor的mailbox（实现了runnable接口）调用
  //2.当该actor的mailbox接收到消息，就会调用receive
  //3.type Receive = PartialFunction[Any,Unit]
  override def receive: Receive = {
    case "hello"=>println("收到hello,回应hello too")
    case "ok"=>println("收到ok，回应ok too")
    case "exit"=>{
      println("接收到exit指令，退出系统")
      context.stop(self) //停止当前actorRef
      context.system.terminate() //退出ActionSystem
    }
    case _ => println("匹配不到")
  }
}
object SayHelloActorDemo{
  //1.先创建一个ActorSystem,专门用于创建Actor
  private val actorFactory = ActorSystem("actorFactory")
  //2.创建一个actor的同时返回Actor的ActorRef
  //说明
  // 1)Props[SysHelloAcotr]创建了一个SayHelloActor实例，使用反射
  // 2)“SysHelloActor”给actor取名
  // 3)sayHelloActorRef:ActorRef就是Props[SysHelloActor]的actorRef
  // 4)创建的SayHelloActor实例被ActorSystem接管
  private val sayHelloActorRef: ActorRef = actorFactory.actorOf(Props[SayHelloActor],"sayHelloActor")
  def main(args: Array[String]): Unit = {
    //给sayHelloActor发消息（邮箱）
    sayHelloActorRef ! "hello"
    sayHelloActorRef ! "ok"
    sayHelloActorRef ! "ok~"
    sayHelloActorRef ! "exit"
  }
}