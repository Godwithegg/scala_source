package com.danhuang.chapter07.myextends;

public class JavaFieldOverride {
    public static void main(String[] args) {
        //创建两个对象
        Sub2 c1 = new Sub2();
        System.out.println(c1.s);//Sub
        System.out.println(((Super2)c1).s);//通过强转仍然可以访问被隐藏的字段

        Super2 c2 = new Super2();
        System.out.println(c2.s);//Super


    }
}
class Super2{
    String s = "super";
}
class Sub2 extends Super2{
    String s = "sub";
}
