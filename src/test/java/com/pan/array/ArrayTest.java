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

    @Test
    public void testTraversal() {
        // 用三种方法遍历
        Integer[] arr = {1, 2, 3, 4, 5};

        System.out.println("第一种for循环遍历");
        for (int index = 0; index < arr.length; index ++){
            System.out.println(String.format("下标： %d，存放的值是：%d",index,arr[index]));
        }

        System.out.println("第二种for each循环遍历");
        int index = 0;
        for (int val : arr) {
            System.out.println(String.format("下标： %d，存放的值是：%d",index,val));
            index ++;
        }

        System.out.println("第三种lambda表达式");
        Arrays.asList(arr).forEach(val -> System.out.println("值是" + val));
    }

    @Test
    public void testCopy() {
        Integer[] arr1 = {1,2,3,4,5};
        Integer[] arr2 = {6,7,8,9,10};

        Integer[] arr11 = new Integer[3];
        arr11[0] = arr1[0];
        arr11[1] = arr1[1];
        arr11[2] = arr1[2];
        System.out.println("arr11 = " + Arrays.toString(arr11));

        // 拷贝arr1的前三位元素到一个新的数组
        Integer[] arr12 = Arrays.copyOf(arr1,3);
        System.out.println("arr12 = " + Arrays.toString(arr12));

        // 拷贝arr1的第1到3位元素(不包括第3位)到一个新的数组
        Integer[] arr14 = Arrays.copyOfRange(arr1,0,2);
        System.out.println("arr14 = " + Arrays.toString(arr14));

        //拷贝arr1的后三位元素到一个新的数组
        Integer[] arr13 = Arrays.copyOfRange(arr1,arr1.length - 3,arr1.length);
        System.out.println("arr13 = " + Arrays.toString(arr13));

        //拷贝数组arr2 的后三位到arr1的后三位
        System.arraycopy(arr2,arr2.length - 3, arr1, arr1.length - 3,3);
        System.out.println("arr1 = " + Arrays.toString(arr1));





    }
}
