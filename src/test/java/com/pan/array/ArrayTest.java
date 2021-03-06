package com.pan.array;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Random;

public class ArrayTest {

    @Test
    public void testArrayDeclare() {
        int[] arr1;     //more popular
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
//        int[] arr = {1,2,3,4,5};

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
        System.out.println(Arrays.asList(arr));
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

    @Test
    public void testFill() {
        // 定义一个大小为 10 的 int 数组，并将数组全部初始化为指定的值 5，打印数组；
        // 然后将数组后 3 为赋值为 3，再次打印数组。
        int[] arr = new int[10];
//        for (int index = 0; index < arr.length; index ++) {
//            arr[index] = 5;
//        }

        Arrays.fill(arr, 5);
        System.out.println(Arrays.toString(arr));

//        for (int index = arr.length - 3;index < arr.length; index ++) {
//            arr[index] = 3;
//        }
        Arrays.fill(arr,arr.length - 3, arr.length, 3);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void testSort() {
        // 1、定义一个大小为 100 的 int 数组
        // 2、随机给每一位赋值一个 `0 ~ 100` 之间的数值，
        // 3、然后对该数组进行排序
        // 4、并打印排序结果。
        int[] arr = new int[100];
        int index = 0;
        for (int val : arr) {
            arr[index] = new Random().nextInt(100);
            index ++;
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void testMultiArray() {
        // 1、定义一个二维数组
        // 2、第一维表示用户
        // 3、第二维表示用户的具体信息（1. 编码, 2. 姓名, 3.性别, 4.年龄）。
        // 4、定义赋值并打印。

        String[][] users = new String[5][];
        users[0] = new String[4];
        users[0][0] = "001";
        users[0][1] = "张三";
        users[0][2] = "男";
        users[0][3] = "25";

        users[1] = new String[3];
        users[1][0] = "002";
        users[1][1] = "李四";
        users[1][2] = "男";
//        users[1][3] = "未知";

//        System.out.println(Arrays.toString(users)); 输出对象的引用

        // 方法一
        Arrays.asList(users).forEach(user -> System.out.println(Arrays.toString(user)));


        //方法二：
        for (String[] user : users) {
            System.out.println(Arrays.toString(user));
        }
    }
}
