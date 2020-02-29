package com.pan.innerclass;

import org.testng.annotations.Test;

import java.util.Arrays;

public class CalcMinMaxTest {

    @Test
    public void testCalc() {
        Integer[] result = CalcMinMax.calc(1,3,2,9,30,7,20);
        System.out.println(Arrays.toString(result));
        System.out.printf("最小值为：%d%n",result[0]);
        System.out.printf("最大值为：%d",result[1]);
    }

    @Test
    public void testCalc2() {
        CalcMinMax.Pair result = CalcMinMax.calc2(1,4,6,8,10,51,20,19);
        System.out.printf("最小值为：%d%n",result.getMinValue());
        System.out.printf("最大值为：%d",result.getMaxValue());
    }
}
