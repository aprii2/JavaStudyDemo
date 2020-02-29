package com.pan.innerclass;

public class PrintClass {
    protected String name;

    public PrintClass() {

    }

    public PrintClass(String name){
        this.name = name;
        System.out.println("调用了父类的构造器，name为" + name);
    }

    public void print() {
        System.out.println("调用 PrintClass的print方法");
    }
}
