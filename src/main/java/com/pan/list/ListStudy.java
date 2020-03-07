package com.pan.list;

import java.util.*;

public class ListStudy {
    // List 主要有两种：ArrayList 和 LinkedList
    // ArrayList：内部是使用数组来实现的
    // LinkedList：内部使用的是一个双向链表来实现的
    // 创建：无参数构建；有参数构建 1指定容量大小 2复制已存在的List来创建
    // 添加：1 头插；2 尾插；3 中间插入
    // 删除：1 头删；2 尾删；3 中间删除
    // 遍历：
    //    1：使用 for 循环
    //    2：使用迭代器 Iterator，ListIterator
    //    3：使用迭代器对 List 进行添加、删除操作
    //    4：迭代器的使用注意事项：在使用迭代器对列表进行操作时，
    //          原对象不能发生结构性变化，否则迭代器操作会抛出异常。通过 modCount 计数来实现
    //          如果原对象发生结构变化，需要重新获取迭代器。
    // 底层实现原理及主要JDK源码：内部存储结构、添加/删除/遍历操作的流程
    // 对 List 进行排序：冒泡、插入、选择

    private static void addNumberToList(List<Integer> list, int count, int num){
        long start = System.currentTimeMillis();
        for(int i = 0; i < count; i++) {
            list.add(num);
        }
        System.out.println("耗时：" + (System.currentTimeMillis() - start) + "ms");
    }

    private static void studyArrayListOp() {
        // 创建ArrayList时，如果为指定容量大小，则会创建一个空数组。
        // 第一次调用 add 方法时，将容量扩充为默认容量大小
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);

        // 插入大量元素扩容时间影响
//        int count = 1000000;
//        addNumberToList(list,count,1);

        System.out.println("list1=" + list);
        list.add(0,100);
        list.add(3,20);
        System.out.println("list1=" + list);
        list.set(2,33);
        System.out.println("list1=" + list);

        // 删除
        list.remove(1);
        System.out.println("list1=" + list);
        list.remove(list.size()-1);
        System.out.println("list1=" + list);

        // 遍历 - for循环
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // 遍历 - 迭代器
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer integer = iterator.next();
            System.out.print(integer + " ");
        }
        System.out.println();

        // 遍历 - forEach 循环
        // 与iterator迭代器是等效的
        for(Integer num: list) {
            System.out.print(num + " ");
        }

        // 如果在创建 ArrayList 时，能预估数据规模，
        // 我们就可以指定一个初始容量大小，以减少扩容操作
        List<Integer> list2 = new ArrayList<>(1000000);
//        addNumberToList(list2,count,1);
        // 默认容量10，存第11个元素的时候引发扩容，15
        // 存16

/*        for(Integer n: list){
            list2.add(n);
        }
        System.out.println("list2=" + list2);*/
        // 上段代码相当于下面一条语句
//        List<Integer> list3 = new ArrayList<>(list);

        // 数组是由容量大小限制，当 add 操作时，如果数组已满，就会引发扩容
        // 1. 计算新的容量大小：原来容量的1.5倍
        // 2. 按新的容量大小创建一个新的数组
        // 3. 将旧的数组里的元素全部复制到新创建的数组中
        // 4. 丢弃旧的数组
    }

    private static void listIterator() {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        ListIterator<String> listIterator = list.listIterator();
        System.out.println("hasPrevious=" + listIterator.hasPrevious());    //false
        System.out.println("hasNext=" + listIterator.hasNext());            //true
        System.out.println("previousIndex=" + listIterator.previousIndex());//-1
        System.out.println("nextIndex=" + listIterator.nextIndex());        //0

        // NoSuchElementException
        // listIterator.previous();

        // next()返回A
        String str = listIterator.next();
        System.out.println("next=" + str);
        System.out.println("hasPrevious=" + listIterator.hasPrevious());    //true
        System.out.println("hasNext=" + listIterator.hasNext());            //true
        System.out.println("previousIndex=" + listIterator.previousIndex());//0
        System.out.println("nextIndex=" + listIterator.nextIndex());        //1

        System.out.println(list);

        // 迭代器操作元素的时候，
        // set 和 remove 方法和迭代器的状态有关，
        // 更新或者删除的是上一次调用 next 或者 previous 方法返回的元素
        // add 方法只和迭代器的位置有关,在当前迭代器位置之前添加元素
        listIterator.set("A-Update");
        System.out.println(list);

        listIterator.add("A-New");
        System.out.println(list);

//        listIterator.set("A-Update2");
//        System.out.println(list);
        System.out.println("previous=" + listIterator.previous());

        listIterator.remove();
        System.out.println(list);
        listIterator.add("New1");
        listIterator.add("New2");
        System.out.println(list);

        //
        System.out.println(listIterator.next());

/*        list.add("D");  //modCount++;会导致结构变化*/

        list.set(1,"B1");   //不会报错，只是修改元素，并不改变结构
        System.out.println(list);
        // 在发生修改后重新获取迭代器，从0号位重新定位
//        listIterator = list.listIterator();
        System.out.println(listIterator.next());
//        while (listIterator.hasNext()){
//            list.add("D");
//            System.out.println(listIterator.next());
//        }

    }

    public static void studyLinkedList(){
        List list1 = new LinkedList();
        list1.add("A");
        list1.add("B");
        System.out.println(list1);

        List list2 =new LinkedList(list1);
        System.out.println(list2);

        // 其余操作和ArrayList一样

        System.out.println(list1.get(1));

    }

    public static void listOpTime(List<Integer> list) {
        // for 循环遍历
        // 对于 LinkedList 每次 get(index)，都会从头开始查找
        // 优化：如果 i > length / 2 时，从尾部开始查找
        long start = System.currentTimeMillis();
        for(int i = 0; i < list.size(); i++) {
            list.get(i);
        }
        System.out.printf("[%s] for循环遍历耗时 %dms%n",list.getClass().getSimpleName(),System.currentTimeMillis() - start);

        // iterator 循环遍历
        // 使用迭代器没有区别
        start = System.currentTimeMillis();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            iterator.next();
        }
        System.out.printf("[%s] 迭代器循环遍历耗时 %dms%n",list.getClass().getSimpleName(),System.currentTimeMillis() - start);

        // For-Each循环
        start = System.currentTimeMillis();
        for(Integer integer : list) {
        }
        System.out.printf("[%s] for-each循环遍历耗时 %dms%n",list.getClass().getSimpleName(),System.currentTimeMillis() - start);

        // 在第5位插入 10000 个 1
        // 插入 LinkedList更快
        start = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++) {
            list.add(4,1);
        }
        System.out.printf("[%s] 在第5位插入10000个1耗时 %dms%n",list.getClass().getSimpleName(),System.currentTimeMillis() - start);

        // 在末尾插入 10000 个 1
        // 两者没有差别
        start = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++) {
            list.add(1);
        }
        System.out.printf("[%s] 在末尾插入10000个1耗时 %dms%n",list.getClass().getSimpleName(),System.currentTimeMillis() - start);

    }

    public static void main(String[] args) {
//        studyArrayListOp();
//        listIterator();
//        studyLinkedList();
        // ArrayList 和 LinkedList 区别
        // ArrayList 长于随机快速访问，而从列表中间删除/插入元素很慢
        // LinkedList 长于从列表中间删除/插入元素，但随机访问很慢
        // 随机访问：list.get(index)，通过索引来访问

        List<Integer> list = new ArrayList<>();
        fill(list);
        listOpTime(list);

        List<Integer> linkedlist = new LinkedList<>();
        fill(linkedlist);
        listOpTime(linkedlist);
    }

    private static void  fill(List<Integer> list) {
        for(int i = 0; i < 10000; i++) {
            list.add(i);
        }
    }
}
