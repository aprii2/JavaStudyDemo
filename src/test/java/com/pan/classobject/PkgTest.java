package com.pan.classobject;


import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Date;

public class PkgTest {
    @Test
    public void testPkg() {
//        java.util.Date date = new java.util.Date();
//        System.out.println(date.toString());
        Date date = new Date();
        System.out.println(date.toString());

        int[] nums1 = new int[3];
        int[] nums2 = new int[] {1,2,3};
        int[] nums3 = {1,2,3};
//        System.out.println(java.util.Arrays.toString(nums1));
//        System.out.println(java.util.Arrays.toString(nums2));
//        System.out.println(java.util.Arrays.toString(nums2));
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        System.out.println(Arrays.toString(nums3));
    }
}
