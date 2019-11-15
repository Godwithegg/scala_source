package com.danhuang.chapter07.myextends

object FieldOverrideDetail {
  def main(args: Array[String]): Unit = {
    println("xxx")
    val bbbb = new BBBB
//    bbbb.name = "jack"//相当于调用了父类的name_$eq()
    //println(bbbb.name) 相当于调用了子类的name()
    //这样出现数据的设置和数据的获取不一致
  }

}
class AAAA{
//  var name:String="" //底层会生成public name()和public name_$eq()
  val name:String="" //底层会生成public name()
}
class BBBB extends AAAA{
  override val name:String="jj" //底层会生成public name()
}
