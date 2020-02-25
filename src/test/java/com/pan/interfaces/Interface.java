package com.pan.interfaces;

public interface Interface {
    class InnerClase{

    }

    interface InnerInterface{

    }
    int MAX_COUNT = 100;

    void method();

    default void print() {
        System.out.println("我是一个默认方法");
    }

    static void print0(){
        System.out.println("我是java8中的静态方法");
    }

}
