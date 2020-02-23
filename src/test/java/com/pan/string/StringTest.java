package com.pan.string;

import org.junit.Test;

public class StringTest {

    @Test
    public void test字符串内存使用() {
        String str1 = "hello";              // 字符常量池查找无，创建后返回引用
        String str2 = "hello";              // 字符常量池查找后返回引用
        System.out.println(str1 == str2);   // true

        String str3 = "hello world";        //字符常量池查找无，创建后返回引用
        String str4 = str1 + "world";       //堆查找无，创建后返回引用
        System.out.println(str3 == str4);   //false

        String str5 = new String("hello");  //堆创建后返回引用
        String str6 = new String("hello");  //堆创建后返回引用
        System.out.println(str5 == str6);            //false

        String str7 = str6.intern();        //字符常量池查找后返回引用
        System.out.println(str1 == str7);   //true

    }

    @Test
    public void testLength() {
        String str1 = "hello world";
        System.out.println(str1.length());

        String str2 = "hello,\uD835\uDD5D\uD835\uDD60\uD835\uDD60\uD835\uDD5C";
        System.out.println(str2);
        System.out.println(str2.length());
        System.out.println(str2.codePointCount(0,str2.length()));
    }

    @Test
    public void testSubString() {
        String str1 = "hello, china.";
        String str2 = str1.substring(7,str1.length());
        String str3 = str1.substring(7);
        String str4 = str1.substring(7, str1.length() - 1);
//        String str5 = str1.substring(7, str1.length() + 1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
//        System.out.println(str5);
    }

    @Test
    public void testMerge() {
        String str1 = "hello" + "world";
        str1 += "." + "2019";
        System.out.println(str1);
    }

    @Test
    public void testFormat() {
        String str1 = "大写a：" + "A" + " " + "\n";
        System.out.println(str1);

        String str2 = String.format("大写a： %c ,它的 ASCII 码值是：%d %n",'A',(int)'A');
        System.out.println(str2);
    }

    @Test
    public void testEqual() {
        String str1 = "Hello";
        String str2 = "hello";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));

    }

    @Test
    public void testJu() {
        String str1 = "hello";
        System.out.println(str1.startsWith("h"));
        System.out.println(str1.startsWith("he"));
        System.out.println(str1.startsWith(" h"));
        System.out.println(str1.startsWith("a"));

        System.out.println(str1.endsWith("o"));
        System.out.println(str1.endsWith("llo"));
        System.out.println(str1.endsWith("o "));

        System.out.println(str1.contains("ello"));
        System.out.println(str1.contains("elo"));
        System.out.println(str1.contains("hello"));
    }

    @Test
    public void testFind() {
        String str1 = "hello, world, today is 2019-12-10, say hi to me.";

        int at1 = str1.indexOf("o");
        int at2 = str1.indexOf("o",7);
        int at3 = str1.indexOf("z");
        System.out.println(at1);
        System.out.println(at2);
        System.out.println(at3);

        int index = -1;
        do {
            int at4 = str1.indexOf("o",index + 1);
            if (at4 == -1) {
                break;
            }
            System.out.println(String.format("第 %d 位是小写字母o",at4 + 1));
            index = at4;
        }while(true);

        int at5 = str1.lastIndexOf("o");
        System.out.println(String.format("第 %d 位是小写字母o",at5 + 1));

        int index1 = str1.length() -1;
        do {
            int at6 = str1.lastIndexOf("o",index1 - 1);
            if (at6 == -1){
                break;
            }
            index1 = at6;
            System.out.println(String.format("第 %d 位小写字母o", at6 + 1));
        }while(true);
    }

    @Test
    public void testRepl() {
        System.out.println("hello,world!".replace("o","O"));
        System.out.println("hello,world!".replaceAll("o","O"));
    }

    @Test
    public void testRemovePlace() {
        String str1 = "    hello  ";
        System.out.println(str1.trim());
        System.out.println(str1.trim().toUpperCase());
        System.out.println(str1.trim().toLowerCase());

        String strEmpty = "";
        String strNull = null;
    }
}
