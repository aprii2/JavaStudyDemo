package com.pan.array;

import org.testng.annotations.Test;

import java.util.Arrays;

public class ArrayTest {

    @Test
    public void testArrayDeclare() {
        int[] arr1;     //more common
        String[] arr2;
        int arr3[];
        String arr4[];
    }

    @Test
    public void testSetValue() {
        //基本数据类型数组初始化
        int[] arr1 = new int[5];
        System.out.println(Arrays.toString(arr1));

        boolean[] arr2 = new boolean[3];
        System.out.println(Arrays.toString(arr2));

        //引用类型数组初始化
        String[] arr3 = new String[3];  //同时声明与赋值
        System.out.println(Arrays.toString(arr3));

        // 先声明后初始化
        int[] arr4;
        arr4 = new int[2];
        System.out.println(Arrays.toString(arr4));

        int[] arr6 = new int[] {1,3};
        System.out.println(Arrays.toString(arr6));

        String[] arr7 = {"字符串1",null,"字符串2",""};
        System.out.println(Arrays.toString(arr7));

        Integer[] arr9 = {1,2,9,null,43,0};
        System.out.println(Arrays.toString(arr9));

    }
}
