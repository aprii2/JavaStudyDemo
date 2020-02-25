package com.pan.leetcode;

public class LeetCode1 {

    // 给定一个整数数组 nums 和一个目标值 target
    // 请你在该数组中找出和为目标值的那 两个整数
    // 并返回他们的数组下标。
    // 给定 nums = [2, 7, 11, 15], target = 9

    // 基础解法
    public static int[] targetIndex(int[] nums,int target) {
        int len = nums.length;
        for (int i = 0; i < len-1; i ++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

}
