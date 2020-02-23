package com.pan.string;

public class CheckUtils {

    public static boolean isAnyEmpty(String... strings) {
        for(int index = 0; index < strings.length; index ++) {
            if (strings[index].trim().equals("")) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEmpty(Object[] arr) {
        for(int index = 0;index < arr.length;index ++) {
            if ( arr[index] == null || "".equals(arr[index])) {
                return true;
            }
        }
        return false;
    }

    public static boolean equals(String str1,String str2) {
        if (str1 == null || str2 == null) {
            return false;
        }else if (str1.equals(str2)) {
            return true;
        }else return false;
    }

    public  static boolean equals(Integer n1,Integer n2) {
        if (n1 == null || n2 == null) {
            return false;
        }else if (n1.equals(n2)) {
            return true;
        }else return false;
    }

}
