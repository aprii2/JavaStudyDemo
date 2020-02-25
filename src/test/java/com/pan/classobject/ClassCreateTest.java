package com.pan.classobject;

public class ClassCreateTest {
//    初始化方法一：声明变量时初始化
//    private String name = "这是一个成员变量";
//    private static int MAX_COUNT = 6;

//    初始化方法二：在代码块中初始化
//    private String name;
    {
        name = "这是一个成员变量";
    }
    private static int MAX_COUNT;
    static {
        MAX_COUNT = 6;
    }
//    初始化方法三：在构造器中初始化
    private String name;
    public ClassCreateTest() {
        this.name = "这是一个成员变量";
    }

//    初始化方法四：未进行赋值的域变量，系统自动初始化为基本类型默认2进制0，引用类型null

    public void println() {
        System.out.println(name);
    }

}
