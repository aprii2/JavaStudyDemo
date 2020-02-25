package com.pan.classobject;

public class ClassStaticTest {
//    private static final int MAX_COUNT = 6;
    private static final int MAX_COUNT;
    private static int count = 0;

    {
        // 代码块，也可称为初始化代码块
        System.out.println("初始化代码块1");
    }

    static {
        // 静态代码块，也可以称为静态代码块
        MAX_COUNT = 6;
        System.out.println("静态代码块");
    }
    {
        System.out.println("初始化代码块2");
    }


    public ClassStaticTest() throws Exception {
        count++;
        if (count > MAX_COUNT) {
            throw new Exception(String.format("只能创建 %d 个实例对象",MAX_COUNT));
        }
    }

    public static void println() {
        System.out.println(String.format("总共有 %d 个实例",count));
    }

    public static void main(String[] args) throws Exception {
        new ClassStaticTest();
        ClassStaticTest obj = new ClassStaticTest();
        new ClassStaticTest();
        new ClassStaticTest();
        new ClassStaticTest();
        new ClassStaticTest();
//        new ClassStaticTest();


        ClassStaticTest.println();  //more popular
        obj.println();              //not recommended
    }
}
