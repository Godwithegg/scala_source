package com.danhuang.akka.actors

import akka.actor.{Actor, ActorRef}

class AActor(actorRef:ActorRef) extends Actor{
  val bActorRef = actorRef
  override def receive: Receive = {
    case "start"=>{
      println("AActor出招了，start ok...")
      self ! "我打" //发给自己
    }
    case "我打"=>{
      //给BActor发出消息
      //这里需要持有BActor的引用（BActorRef）
      println("AActor（黄飞鸿）厉害，看我佛山无影脚")
      Thread.sleep(1000)
      bActorRef ! "我打"
    }
  }
}
