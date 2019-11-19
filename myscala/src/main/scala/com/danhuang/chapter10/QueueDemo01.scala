package com.danhuang.chapter10

import scala.collection.mutable.Queue
object QueueDemo01 {
  def main(args: Array[String]): Unit = {
    val q1 = new Queue[Any]
    println(q1)

    //给队列增加元素
    q1 += 9
    println("q1= "+q1)
    q1 ++= List(4,5,7) //默认是直接加在队列的后面
    println("q1= "+q1)

//    q1 += List(10,0) //表示将list(10,0)作为一个元素加入到队列中,要求类型是Any
//    println("q1="+q1)

    //q1=(9,4,5,7)
    val queueElement = q1.dequeue()//从队列的头部取出元素，q1本身会变化
    println("queueElement:"+queueElement+" q1:"+q1)

    //enQueue 入队列，默认是从队列的尾部加入.Redis
    q1.enqueue(100,10,100,888)
    println("q1="+q1) //Queue(4,5,7,100,10,10,888)

    //队列Queue-返回队列的元素

    //1.获取队列的第一个元素
    println(q1.head)
    //2.获取队列的最后一个元素
    println(q1.last)
    //3.取出队尾的数据
    println(q1.tail)
  }

}
