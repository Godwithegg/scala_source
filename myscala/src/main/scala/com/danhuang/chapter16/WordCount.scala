package com.danhuang.chapter16

object WordCount {
  def main(args: Array[String]): Unit = {
    /**
      * val lines = List("dan huang hello ","dan huang aa cc aa")
      * 使用映射集合，list中，各个单词出现的次数，并按出现次数排序（从大到小）
      */
      //先分部完成，在组合
      //1.步骤
    val lines = List("dan huang hello ","dan huang aa cc aa")
//    val res1: List[String] = lines.flatMap((s:String)=>s.split(" "))
    val res1: List[String] = lines.flatMap(_.split(" "))
    println("res1="+res1)
    //2.步骤=》做成一个对偶List=》才能分组并统计
//    val res2: List[(String, Int)] = res1.map((s: String) => (s, 1))
    val res2: List[(String, Int)] = res1.map((_, 1))
    println("res2="+res2)
    //3.步骤=》分组，把不同的单词归属到不同的组（以前没说明）
//    val res3: Map[String, List[(String, Int)]] = res2.groupBy((x:(String,Int))=>x._1)
    val res3: Map[String, List[(String, Int)]] = res2.groupBy(_._1)
    println("res3="+res3)
    //4.对上面的各个元组进行统计
//    val res4: Map[String, Int] = res3.map((x:(String,List[(String,Int)]))=>(x._1,x._2.size))
    val res4: Map[String, Int] = res3.map(x=>(x._1,x._2.size))
    println("res4="+res4)
    ///5.排序
//    res4.toList.sortBy((x:(String,Int))=>x._2)
    val res5: List[(String, Int)] = res4.toList.sortBy(_._2)
    println("res5="+res5)

    //ok
    //合并
    println(lines.flatMap(_.split(" ")).map((_,1)).groupBy(_._1).map(x=>(x._1,x._2.size)).toList.sortBy(_._2))
  }

}
