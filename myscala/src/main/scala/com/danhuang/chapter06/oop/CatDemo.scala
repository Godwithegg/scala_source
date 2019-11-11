package com.danhuang.chapter06.oop

object CatDemo {
  def main(args: Array[String]): Unit = {
    //创建一只猫
    val cat = new Cat
    //给猫的属性赋初值
    cat.name = "小白"
    cat.age = 10
    cat.color = "白色"
    println("ok~")
  }

}

//定义一个类Cat
class Cat{
  //声明/定义三个属性
  //说明
  //1.当我们声明了var name:String时，在底层对应private name
  //2.同时会生成两个public方法 name()<=>类似于getter name_$eq() <-> setter
  var name:String = "" //给初始值
  var age:Int = _ //_表示给age一个默认值，如果是Int默认是0
  var color:String = _ //_给color一个默认值，如果是String，默认就是""
}
