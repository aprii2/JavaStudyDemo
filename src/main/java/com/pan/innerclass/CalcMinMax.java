package com.pan.innerclass;

public class CalcMinMax {

//    public static int[] calc(int...numbs) {
//        int min = 0;
//        int max = 0;
//
//        for (int numb: numbs){
//            if (min > numb) {
//                min = numb;
//            }
//            if (max < numb) {
//                max = numb;
//            }
//        }
//
//        return new int[] {min,max};
//
//    }


// 上面的写法容易引起最小数为0的情况

    public static Integer[] calc(int... numbs) {
        Integer min = null;
        Integer max = null;

        for(int numb:numbs){
            if(min == null || min > numb){
                min = numb;
            }
            if(max == null || max < numb){
                max = numb;
            }
        }
        return new Integer[]{min,max};
    }

    public static Pair calc2(int... numbs){
        Integer min = null;
        Integer max = null;

        for(int numb:numbs){
            if(min == null || min > numb){
                min = numb;
            }
            if(max == null || max < numb){
                max = numb;
            }
        }
        return new Pair(min,max);
        // 用类来返回，最小值与最大值就可以用get来访问，而不是下标
    }

    public static class Pair{
        private int minValue;
        private int maxValue;

        public Pair(int minValue,int maxValue){
            this.minValue = minValue;
            this.maxValue = maxValue;
        }

        public int getMinValue() {
            return minValue;
        }

        public void setMinValue(int minValue) {
            this.minValue = minValue;
        }

        public int getMaxValue() {
            return maxValue;
        }

        public void setMaxValue(int maxValue) {
            this.maxValue = maxValue;
        }
    }
}
