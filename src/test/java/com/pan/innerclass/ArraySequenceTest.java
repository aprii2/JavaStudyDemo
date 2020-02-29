package com.pan.innerclass;

import org.testng.annotations.Test;

public class ArraySequenceTest {

    @Test
    public void testPrint() {
        ArraySequence as = new ArraySequence(5);
        as.add(1);
        as.add(2);
        as.add(3);
        as.add(4);
        as.add(5);
        as.print();

        as.add(6);
        as.add(7);
        as.print();


        ArraySequence.SelectorImpl impl = as.new SelectorImpl();
        while (impl.end()) {
            System.out.println(">" + impl.current());
            impl.next();
        }

        Selector impl1 = as.selector();
        while (!impl1.end()){
            System.out.println(">" + impl1.current());
            impl1.next();
        }
    }
}
