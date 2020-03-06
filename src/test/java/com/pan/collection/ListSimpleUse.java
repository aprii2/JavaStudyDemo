package com.pan.collection;


import java.util.*;

public class ListSimpleUse {

//    private static void printElement(ArrayList<String> list){
    private static void printElement(List<String> list){

        System.out.println("list的元素个数：" + list.size());

        // 遍历 - for循环使用元素索引的方式
        System.out.print("使用for循环遍历：");
        for(int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if(i > 0) {
                System.out.print(',');
            }
            System.out.print(str);
        }
        System.out.println();
//        list.remove(1);
//        list.remove("F");
//        System.out.println(list);

        // 遍历 - 使用迭代器方式
        Iterator<String> iterator = list.iterator();
        // 迭代器的位置使在元素之间
        // 存在 n 个元素的列表，迭代器的位置可能存在 n+1个
        // 获取迭代器后，迭代器的位置在第一个元素之前
        // 未调用 next()方法时，调用 remove() 抛出异常IllegalStateException
        // remove() 方法删除的是调用next() 方法时返回的元素(越过的元素)
        /* Iterator<String> iterator = list.iterator();
           iterator.remove();
           直接执行会报错 */
        /*
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        上述语句存在如下异常 ：
        // 当迭代器达到最后一个元素之后时
        // 再调用next() 方法，抛出 NoSuchElementException 异常
        可以如下改写：
        */
        while(iterator.hasNext()){
            // next() 方法有两个作用：
            // 1.将迭代器的位置移动至下一个位置
            // 2.同时返回越过的元素
            String str = iterator.next();
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        // 集合分为两大类：
        // 1.单个元素的序列，全部都实现了Collection接口
        // 1.1 List，列表，有序的，按照插入顺序排序，可以有重复的元素
        // 1.2 Set，集，不可以有重复元素，可以包含 null
        // 1.3 Queue，队列，按一定规则进行添加/删除
        // 2.键值对，全部都实现了Map接口

        // 可以通过<>括号来知道列表里要放的元素的类型
        // 如果 add 添加了不同类型的元素，再编译阶段就会报错
//        List<String> list = new ArrayList<>();
//        ArrayList<String> list = new ArrayList<>();
//        LinkedList<String> list = new LinkedList<>();

//        ArrayList<String> list = new ArrayList<>();
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("C");
        list.add("B");
        list.add("F");
        printElement(list);

//        LinkedList<String> list2 = new LinkedList<>();
        List<String> list2 = new LinkedList<>();
        list2.add("1");
        list2.add("3");
        list2.add("2");
        list2.add("4");
        list2.add("6");
        list2.add("5");


/*      只能加入定义的数据类型
        list2.add(1);
        list2.add(new Date());
        list2.add(1d);
        printElement(list2);*/


        // 使用泛型的好处：
        List list3 =  new ArrayList();
        // 会将基本类型自动装箱为它的包装类
        list3.add(1);
        list3.add("字符串");
        list3.add((new ListSimpleUse()).new CustomClass());
        list3.add(new Date());

        for(int i = 0; i < list3.size(); i++) {

            // 如果需要进行强制类型转换时，需要使用 instanceof 来判断该变量的实际类型
            Object obj = list3.get(i);
            if(obj instanceof String){
                String str = (String) obj;
                System.out.println("字符串：" + str);
            }else if(obj instanceof Integer){
                Integer n = (Integer) obj;
                System.out.println("Int型数值：" + n);
            }else if(obj instanceof Date){
                Date date = (Date)obj;
                System.out.println("日期：" + date);
            }else{
                System.out.println("不支持的类型：" + obj.getClass().getName());
            }
        }
    }

    // 不用static定义就是内部类
    // new的时候要用(new CollectionSimpleUser()).new CustomClass()
    class CustomClass{

    }
}
