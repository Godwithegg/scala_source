package com.danhuang.chapter15.customercrm.app

import com.danhuang.chapter15.customercrm.view.CustomerView

object CustomerCrm {
  def main(args: Array[String]): Unit = {
    new CustomerView().mainMenu()
  }

}
