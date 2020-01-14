package com.danhuang.chapter18.project

/**
  * 统计出每一个省份广告被点击次数的TOP3
  * 时间戳，省份，城市，用户，广告，中间字段使用
  * 1516609143867 6 7 64 16
  * 1516609143869 9 4 75 18
  * 1516609143869 1 7 87 12
  */
import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}
object Operator {
  def main(args: Array[String]): Unit = {
    //1.初始化spark配置信息并建立与spark的连接
    val sparkConf = new SparkConf().setMaster("local[*]")
      .setAppName("Operator")
    val sc = new SparkContext(sparkConf)
    //2.读取数据生成RDD
    val line = sc.textFile("E:\\github\\scala_source\\myscala\\src\\main\\scala\\com\\danhuang\\chapter18\\project\\agent.log")

    //3.按照最小粒度聚合
    val provinceAdToOne = line.map{x=>
      val fileds:Array[String] = x.split(" ")
      ((fileds(1),fileds(4)),1)
    }

    //4.计算每个省中每个广告被点击的总数：
    val provinceAdToSum = provinceAdToOne.reduceByKey(_+_)

    //5.将省份作为key，广告加点击数为value
    val provinceToAdSum = provinceAdToOne.map(x=>(x._1._1,(x._1._2,x._2)))

    //6.将同一个省份的所有广告进行聚合
    val provinceGroup = provinceToAdSum.groupByKey()

    //7.对同一个省份所有广告的集合进行排序并取得前三条
    val provinceAdTop3 = provinceGroup.mapValues(x=>x.toList.sortWith((x,y)=>x._2>y._2))

    //8.将数据拉取到Driver端并打印
    provinceAdTop3.collect().foreach(println)

    //9.关闭与spark的连接
    sc.stop()
  }
}
