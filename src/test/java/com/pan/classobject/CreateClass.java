package com.pan.classobject;

public class CreateClass {

    // 类变量、静态域变量
    private static String count;

    // 实例变量、域变量
    private String name;

    {
        // 实例代码块，也可以称为初始化代码块
        System.out.println("类里方法外用大括号括起来的一段代码块");
    }

    static {
        // 静态代码块，也可以称为静态初始化代码块
        System.out.println("类里方法外用大括号括起来的且前面有static来修饰的一段代码块");

    }

    //方法
    public void println() {
        {
            System.out.println("代码块");
        }

    }

    //静态方法
    public static void staticmethod() {

    }

    //构造类
    public CreateClass() {

    }

    //内部类
    class innerClass {

    }



}
