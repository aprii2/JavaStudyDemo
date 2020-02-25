package com.pan.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LeetCode1Test {
    // 给定一个整数数组 nums 和一个目标值 target
    // 请你在该数组中找出和为目标值的那 两个整数
    // 并返回他们的数组下标。
    // 给定 nums = [2, 7, 11, 15], target = 9
    @Test
    public void testTargetIndex() {

        int[] array = new int[]{2,7,11,15};
        int[] ans = new int[]{0,1};
        Assert.assertEquals(LeetCode1.targetIndex(array,9),ans);
    }

}
