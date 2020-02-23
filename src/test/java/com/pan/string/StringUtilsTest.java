package com.pan.string;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilsTest {
    //去掉字符串开头/结尾/中间的空格（不使用 trim 方法）
    @Test
    public void testTrimAll() {

        String hello = "hello";

        Assert.assertEquals(StringUtils.trimAll("   hello"),hello);
        Assert.assertEquals(StringUtils.trimAll("he  llo"),hello);
        Assert.assertEquals(StringUtils.trimAll("hello "),hello);
        Assert.assertEquals(StringUtils.trimAll("    he llo  "),hello);
    }

    @Test
    public void testReverse() {
        Assert.assertEquals(StringUtils.reverse("hello"),"olleh");
        Assert.assertEquals(StringUtils.reverse("123"),"321");
        Assert.assertEquals(StringUtils.reverse("soup"),"puos");
    }
}
