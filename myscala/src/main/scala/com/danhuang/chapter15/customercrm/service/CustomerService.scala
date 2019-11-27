package com.danhuang.chapter15.customercrm.service

import com.danhuang.chapter15.customercrm.bean.Customer
import util.control.Breaks._
import scala.collection.mutable.ArrayBuffer

class CustomerService {
  var customerNum = 1
  //customers是存放客户的，这里我们先初始化一个
  val customers = ArrayBuffer(new Customer(1,"Tom",'男',10,"110","tom@souhu.com"))
  def list():ArrayBuffer[Customer]={
    this.customers
  }

  //添加客户
  def add(customer:Customer):Boolean={
    //设置id
    customerNum += 1
    customer.id = customerNum
    //加入到customers
    customers.append(customer)
    true
  }

  def del(id:Int):Boolean={
    val index = findIndexById(id)
    if(index != -1){
      //删除
      customers.remove(index)
      true
    }else{
      false
    }
  }

  //根据id找到index
  def findIndexById(id:Int)={
    var index = -1 //默认-1，如果找到就改成对应的，如果没有找到就返回-1
    //遍历customers
    breakable{
      for(i <- 0 until customers.length){
        if(customers(i).id == id){//找到了
          index = i
          break()
        }
      }
    }
    index
  }}
