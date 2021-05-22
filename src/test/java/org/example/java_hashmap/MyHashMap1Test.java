package org.example.java_hashmap;

import org.junit.Test;

public class MyHashMap1Test {
    @Test
    public void testInputMap() {
        MyHashMap1 map = new MyHashMap1();
        map.inputMap();
        System.out.println(map.userMap);
    }

    @Test
    public void testOutputMap1() {
        MyHashMap1 map = new MyHashMap1();
        map.inputMap2();
        Long start = System.currentTimeMillis();
        map.outputMap1();
        Long end = System.currentTimeMillis();
        System.out.println("keySet=" + (end - start));
    }

    @Test
    public void testOutputMap2() {
        MyHashMap1 map = new MyHashMap1();
        map.inputMap2();
        Long start = System.currentTimeMillis();
        map.outputMap2();
        Long end = System.currentTimeMillis();
        System.out.println("values=" + (end - start));
    }

    @Test
    public void testOutputMap3() {
        MyHashMap1 map = new MyHashMap1();
        map.inputMap2();
        Long start = System.currentTimeMillis();
        map.outputMap3();
        Long end = System.currentTimeMillis();
        System.out.println("entrySet=" + (end - start));
    }

    @Test
    public void testOutputMap4() {
        MyHashMap1 map = new MyHashMap1();
        map.inputMap2();
        Long start = System.currentTimeMillis();
        map.outputMap4();
        Long end = System.currentTimeMillis();
        System.out.println("Iterator=" + (end - start));
    }
}
