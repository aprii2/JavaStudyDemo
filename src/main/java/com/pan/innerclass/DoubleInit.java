package com.pan.innerclass;

import java.util.ArrayList;
import java.util.List;

public class DoubleInit {
    public static void main(String[] args) {
        //双括号初始化
        List<Integer> numbs = new ArrayList();
        numbs.add(1);
        numbs.add(2);
        numbs.add(3);
        numbs.add(4);
        numbs.add(5);
        System.out.println(numbs);

        class ArrayListNew extends ArrayList {
            private String name = "";

            {
                //初始化代码块
                add(1);
                add(2);
                add(3);
                add(4);
                add(5);
                add(6);

            }

        }
        List<Integer> numbs2 = new ArrayListNew();
        System.out.println("numbs2 = " + numbs);

        List<Integer> numbs3 = new ArrayList() {
            {
                //初始化代码块
                add(1);
                add(3);
                add(3);
                add(4);
                add(5);
                add(6);

            }
        };
        System.out.println(numbs3);
    }
}
