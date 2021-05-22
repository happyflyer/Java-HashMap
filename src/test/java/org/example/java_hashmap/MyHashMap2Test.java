package org.example.java_hashmap;

import org.junit.Test;

public class MyHashMap2Test {
    @Test
    public void testInputMap() {
        MyHashMap2 map = new MyHashMap2();
        map.inputMap();
        System.out.println(map.stuMap);
        System.out.println(map.stuMap.get("zhang1"));
    }

    @Test
    public void testInputMap2() {
        MyHashMap2 map = new MyHashMap2();
        map.inputMap2();
        System.out.println(map.stuList);
        System.out.println(map.stuList.get(0));
    }
}
