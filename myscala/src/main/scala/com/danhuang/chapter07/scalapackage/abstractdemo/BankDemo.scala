package com.danhuang.chapter07.scalapackage.abstractdemo

object BankDemo {
  def main(args: Array[String]): Unit = {
    //开卡
    val account = new Account("gh00001",890.4,"111111")
    account.query("111111")
    account.withDraw("111111",100.0)
    account.query("111111")
  }
}

//编写一个Account类
class Account(inAccount:String,inBalance:Double,inPwd:String){
  /**
    * 属性：帐号 余额 密码
    * 方法：查询 取款 存款
    */
  val accountNo = inAccount
  var balance = inBalance
  var pwd = inPwd

  //查询
  def query(pwd:String):Unit={
    if(!this.pwd.equals(pwd)){
      println("密码错误")
      return
    }
    printf("帐号为%s 当前余额为=%f\n",this.accountNo,this.balance)
  }

  //取款
  def withDraw(pwd:String,money:Double):Any ={
    if(!this.pwd.equals(pwd)){
      println("密码错误")
      return
    }
    //判断money是否合理
    if(money > this.balance){
      println("余额不足")
      return
    }
    this.balance -= money
    money
  }

}
