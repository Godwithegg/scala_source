package com.danhuang.akka.actors

import akka.actor.{ActorRef, ActorSystem, Props}

object ActorGame extends App {
  //创建ActorSystem
  val actorfactory = ActorSystem("actorfactory")
  //先创建BActor的引用/代理
  val bActor: ActorRef = actorfactory.actorOf(Props[BActor],"bActor")
  //创建BActor的引用
  val aActor: ActorRef = actorfactory.actorOf(Props(new AActor(bActor)),"aActor")

  //aActor出招
  aActor ! "start"

}
