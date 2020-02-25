package com.pan.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LeetCode167Test {

    @Test
    public void testTargetIndex() {

        int[] array = new int[]{2,7,11,15};
        int[] ans = new int[]{0,1};
        int[] array2 = {9,10,11,12};
        int[] array3 = {2,4,5,8,12,14};
        int[] ans3 = new int[]{2,3};
        int[] array4 = {6,7,11,15,20,30};
        Assert.assertEquals(LeetCode167.targetIndex(array,9),ans);
        Assert.assertEquals(LeetCode167.targetIndex(array2,9),null);
        Assert.assertEquals(LeetCode167.targetIndex(array3,13),ans3);
        Assert.assertEquals(LeetCode167.targetIndex(array3,50),null);
        Assert.assertEquals(LeetCode167.targetIndex(array4,9),null);

    }
}
