package com.danhuang.chapter10

import scala.collection.mutable

object MapDemo01 {
  def main(args: Array[String]): Unit = {

    //方式1-构造不可变映射
    //1.默认Map是immutable.Map
    //2.key-val类型支持Any
    //3.在Map的底层，每对key-val是Tuple2
    //4.从输出的结果看到，输出顺序和声明顺序一致
    val map1 = Map("Alice" -> 10, "Bob" -> 20, "Kotlin" -> "北京")
    println(map1)

    //方式2-构造可变映射
    //1.从输出的结果看到，可变的map输出顺序和声明顺序不一致
    val map2 = mutable.Map("Alice" -> 10, "Bob" -> 20, "Kotlin" -> "北京")
    println(map2)

    //方式3-创建空的映射
    val map3 = new mutable.HashMap[String,Int]
    println("map3="+map3)

    //方式4-对偶元祖
    val map4 = Map(("Alice" -> 10), ("Bob" -> 20), ("Kotlin" -> "北京"))
    println("map4="+map4)

    //方式1-使用map(key)
    println(map4("Alice")) //10
//    println(map4("Alice~")) //抛出异常NoSuchElementException

    //方式2-使用contains方法检查是否存在key
    if(map4.contains("Alice~")){
      println("key存在,值为："+map4("Alice~"))
    }else{
      println("Key不存在")
    }
    //方式3-使用map.get(key).get取值
    //1.如果key存在map.get(key)就会返回Some(值),然后Some(值）.get就可以取出
    //2.如果key不存在map.get(key)就会返回None
    println(map4.get("Alice").get)
//    println(map4.get("Alice~").get) //抛出异常

    //方式4-使用map4.getOrElse()取值
    println(map4.getOrElse("Alice","默认的值<。)#)))≦"))
    println(map4.getOrElse("Alice~","默认的值<。)#)))≦"))

    val map5 = mutable.Map(("A", 1), ("B", "北京"), ("C", 3))
    map5("AA")=20 //增加
    println("map5="+map5)

    map5 += ("A"->1)

    map5 -= ("A","B","k")
    println(map5)

    //map的遍历
    val map6 = mutable.Map(("A", 1), ("B", "北京"), ("C", 3))
    println("----(k, v) <- map6--------")
    for ((k, v) <- map6) println(k + " is mapped to " + v)

    println("----v <- map6.keys--------")
    for (v <- map6.keys) println(v)
    println("----v <- map6.values--------")
    for (v <- map6.values) println(v)

    //这样取出方式 v 类型是 Tuple2
    println("----v <- map6--------")
    for (v <- map6) println(v + " key =" + v._1 + " val=" + v._2) //v是Tuple?
  }

}