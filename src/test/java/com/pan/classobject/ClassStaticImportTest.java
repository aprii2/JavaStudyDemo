package com.pan.classobject;

import static com.pan.classobject.ClassStaticImport.name;
import static com.pan.classobject.ClassStaticImport.println;
import org.testng.annotations.Test;

public class ClassStaticImportTest {

    @Test
    public void testUser1() {
        System.out.println(name);
        println();
    }
}
