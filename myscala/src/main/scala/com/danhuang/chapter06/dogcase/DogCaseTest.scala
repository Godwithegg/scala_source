package com.danhuang.chapter06.dogcase

object DogCaseTest {
  def main(args: Array[String]): Unit = {
    val dog = new Dog
    dog.name = "tomcat"
    dog.age = 2
    dog.weight = 6
    println(dog.say)
  }

}

/**
  * 小狗案例
  * 编写一个dog类，包含name、age、weight
  * 类中声明一个say方法，返回String类型，方法返回信息中心包含所有属性值
  * 在另一个TestDog类中的main方法中，创建dog对象，并访问say方法和所有属性，
  * 将调用结果打印输出
  */
class Dog{
  var name = ""
  var age = 0
  var weight = 0.0
  def say={
    "小狗的信息如下：name = "+this.name + "\t age="+this.age+"\t weight="
    +this.weight
  }
}
