package com.pan.classobject;

import org.testng.annotations.Test;

public class ClassThisTest {

    public int index;
    public ClassThisTest(){

    }

    public void println(String name) {
        System.out.println(this.index + ". Hello" + name);
    }

    public void println(int... nums) {
        if (nums == null) {
            System.out.println("is null");
            return;
        }
        if (nums.length == 0) {
            System.out.println("param length is zero");
            return;
        }
        System.out.println("打印传入的可变参数......");
        for (int n = 0;n < nums.length; n++) {
            System.out.println(nums[n]);
        }
    }

    @Test
    public void test1() {
        ClassThisTest obj = new ClassThisTest();
        obj.println("wendy");
    }

    public void tes2() {
        ClassThisTest obj = new ClassThisTest();
        obj.println(1,2,3);
        obj.println(1);
    }
}
