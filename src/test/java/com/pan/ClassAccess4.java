package com.pan;

import com.pan.classobject.ClassAccess;
import org.testng.annotations.Test;

public class ClassAccess4 {

    @Test
    public void testName() {
        ClassAccess ca = new ClassAccess();
        System.out.println(ca.pub);
//        System.out.println(ca.pro);
//        System.out.println(ca.def);

        System.out.println(ca.getPub());
//        System.out.println(ca.getPro());
//        System.out.println(ca.getDef());

    }
}
