package com.danhuang.chapter07.scalapackage.importdetails

import scala.beans._
import scala.collection.mutable //_表示该包的所有内容引入，等价*
object TestImport {
  def main(args: Array[String]): Unit = {

  }
}

class User{
  import scala.beans.BeanProperty //在需要时才引入的特点，作用域就在{}中
  @BeanProperty var name:String=""

  def test():Unit={
    //可以使用选择器，选择引入包的内容，这里，我们只引入HashMap，HashSet
    import scala.collection.mutable.{HashMap,HashSet}
    var map = new HashMap
    var set = new HashSet

  }
}
class Dog{
  @BeanProperty var name:String=""//
}
