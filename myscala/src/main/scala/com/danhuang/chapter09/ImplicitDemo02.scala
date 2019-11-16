package com.danhuang.chapter09

object ImplicitDemo {
  def main(args: Array[String]): Unit = {
    //编写一个隐式函数，丰富mySQL对象的功能
    implicit def addDelete(mysql:MySQL):DB={
      new DB
    }
    //创建一个mysql对象
    val mySQL = new MySQL
    mySQL.insert()
    mySQL.delete()
  }
}
class MySQL{
  def insert()={
    println("insert")
  }
}
class DB{
  def delete()={
    println("delete")
  }
}