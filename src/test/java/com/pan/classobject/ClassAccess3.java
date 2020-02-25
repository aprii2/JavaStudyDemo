package com.pan.classobject;

import com.pan.classobject.ClassAccess;
import org.testng.annotations.Test;

public class ClassAccess3 extends ClassAccess {

    @Test
    public void testName() {
        System.out.println(pub);
        System.out.println(pro);
        System.out.println(def);

        System.out.println(getPub());
        System.out.println(getPro());
        System.out.println(getDef());

    }
}
