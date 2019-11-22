package com.danhuang.chapter12

object MatchObject {
  def main(args: Array[String]): Unit = {
    //模式匹配的使用：
    val number :Double = Square(6.0)
//    val number :Double = 36.0
    number match{
        //说明 case Square(n)的运行机制
        //1.当匹配到case Square(n)
        //2.调用Square的unapply方法，z的值就是number
        //3.如果对象提取器unapply返回的是Some(6)，则表示匹配成功，同时
        // 将6赋给Square(n)
      case Square(n)=>println(n)
      case _ => println("nothing matched")
    }
  }

}
//说明如下
//1.
object Square{
  //说明
  //1.unapply方法是对象提取器
  //2.接收z:Double类型
  //3.返回类型是Option[Double]
  //4.返回的值是Some(math.sqrt(z)) 返回z的开平方的值并放入到Some(x)
  def unapply(z:Double): Option[Double] ={
//    Some(math.sqrt(z))  //匹配成功
    None //匹配失败
  }

  def apply(z:Double): Double = z*z
}