package org.example.java_hashmap;

import org.example.java_hashmap.common.LruMap;
import org.junit.Test;

import java.util.LinkedHashMap;

public class MyLinkedHashMap2Test {
    /**
     * 1、录入顺序
     * 2、使用顺序
     */
    @Test
    public void testMap() {
        // 录入顺序
        MyLinkedHashMap2 map1 = new MyLinkedHashMap2(new LinkedHashMap<>());
        map1.inputMap1();
        System.out.println(map1.linkedHashMap);
        // 使用顺序
        MyLinkedHashMap2 map2 = new MyLinkedHashMap2(new LinkedHashMap<>(16, 0.75f, true));
        map2.inputMap1();
        map2.linkedHashMap.get("b1");
        map2.linkedHashMap.get("c1");
        System.out.println(map2.linkedHashMap);
    }

    /**
     * 实现 LRU 缓存
     */
    @Test
    public void testLruMap() {
        LruMap<String, String> lruMap = new LruMap<>(3);
        MyLinkedHashMap2 map = new MyLinkedHashMap2(lruMap);
        map.inputMap1();
        lruMap.get("b1");
        System.out.println(lruMap);
        lruMap.get("c1");
        System.out.println(lruMap);
    }
}
