package org.example.java_hashmap;

import org.junit.Test;

public class MyLinkedHashMap1Test {
    /**
     * 1、分别给 HashMap 和 LinkedHashMap 录入 100w 条记录，并循环遍历，观察耗时
     * 2、都采用不带参的空构造方法
     */
    @Test
    public void testMap() {
        MyLinkedHashMap1 map = new MyLinkedHashMap1();
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
    }
}
