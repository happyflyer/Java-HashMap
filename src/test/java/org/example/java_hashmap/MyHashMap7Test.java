package org.example.java_hashmap;

import org.junit.Test;

public class MyHashMap7Test {
    /**
     * 用到的技术点：
     * 6、forEach((key, value) -> System.out.println(key + ": " + value))
     * 7、getOrDefault(Object key, V defaultValue)
     */
    @Test
    public void testInputMap() {
        MyHashMap7 map = new MyHashMap7();
        map.inputMap();
        map.intMap.forEach((key, value) -> {
            System.out.println(key + ": " + value);
        });
        System.out.println(map.intMap.getOrDefault(120, "123"));
        System.out.println(map.intMap.getOrDefault(123, "123"));
    }
}
