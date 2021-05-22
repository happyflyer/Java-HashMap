package org.example.java_hashmap;

import org.junit.Test;

public class MyTreeMap2Test {
    @Test
    public void testMap() {
        MyTreeMap2 map = new MyTreeMap2();
        long start;
        long end;
        // HashMap
        start = System.currentTimeMillis();
        map.inputMap1();
        end = System.currentTimeMillis();
        System.out.println("HashMap put: " + (end - start));
        // LinkedHashMap
        start = System.currentTimeMillis();
        map.inputMap2();
        end = System.currentTimeMillis();
        System.out.println("LinkedHashMap put: " + (end - start));
        // TreeMap
        start = System.currentTimeMillis();
        map.inputMap3();
        end = System.currentTimeMillis();
        System.out.println("TreeMap put: " + (end - start));
        // HashMap
        start = System.currentTimeMillis();
        map.outputMap1();
        end = System.currentTimeMillis();
        System.out.println("HashMap get: " + (end - start));
        // LinkedHashMap
        start = System.currentTimeMillis();
        map.outputMap2();
        end = System.currentTimeMillis();
        System.out.println("LinkedHashMap get: " + (end - start));
        // TreeMap
        start = System.currentTimeMillis();
        map.outputMap3();
        end = System.currentTimeMillis();
        System.out.println("TreeMap get: " + (end - start));
    }
}
