package com.pan.string;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckUtilsTest {

    @Test
    public void testIsAnyEmpty() {
        //`String... strings` 为可变参数，你可以认为它是 String[] strings。
        // 如果 strings 中有任意一个字符串为空，则返回 false，否则返回 true。
        Assert.assertEquals(CheckUtils.isAnyEmpty("hello"),true);
        Assert.assertEquals(CheckUtils.isAnyEmpty(""),false);
        Assert.assertEquals(CheckUtils.isAnyEmpty("","hello"),false);
        Assert.assertEquals(CheckUtils.isAnyEmpty("    "),false);
    }

    @Test
    public void testIsEmpty() {
        // 判断引用类型数组是否为空，为空或 null 则返回 true，否则返回 false。
        // public static boolean isEmpty(Object[] arr)
        Object[] arr1 = new Object[]{"ewhuo",213};
        Object[] arr2 = new Object[]{null,57312133L};
        Object[] arr3 = new Object[]{"",89.311};
        Object[] arr4 = new Object[]{8244,"sagew"};
        Assert.assertEquals(CheckUtils.isEmpty(arr1),false);
        Assert.assertEquals(CheckUtils.isEmpty(arr2),true);
        Assert.assertEquals(CheckUtils.isEmpty(arr3),true);
        Assert.assertEquals(CheckUtils.isEmpty(arr4),false);

    }

    @Test
    public void testEquals() {
        // 判断 str1 字符串是否相等，相等则返回 true，否则返回 false。
        // 当其中一个是 null 时返回 false。
        Assert.assertEquals(CheckUtils.equals(null, ""),false);
        Assert.assertEquals(CheckUtils.equals(new String(), ""),true);
        Assert.assertEquals(CheckUtils.equals("hello", "hello"),true);
        Assert.assertEquals(CheckUtils.equals("hello", null),false);
        Assert.assertEquals(CheckUtils.equals("hello", ""),false);
        Assert.assertEquals(CheckUtils.equals("","hello"),false);

    }

    @Test
    public void testEquals2() {
        // 判断 n1 和 n2 的值是否相等，相等则返回 true，否则返回 false。
        // 当其中一个是 null 时返回 false。
        Assert.assertEquals(CheckUtils.equals(12,0),false);
        Assert.assertEquals(CheckUtils.equals(6,6),true);
        Assert.assertEquals(CheckUtils.equals(-7,-7),true);
        Assert.assertEquals(CheckUtils.equals(-25,25),false);
        Assert.assertEquals(CheckUtils.equals(null,2),false);
    }
}
