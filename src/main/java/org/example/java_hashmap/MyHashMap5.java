package org.example.java_hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lifei
 */
public class MyHashMap5 {
    /**
     * inputMap
     */
    public Long inputMap(int initialCapacity, float loadFactor) {
        String key;
        String value;
        Map<String, String> map = new HashMap<>(initialCapacity, loadFactor);
        Long start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            key = String.valueOf(i);
            value = "value";
            map.put(key, value);
        }
        Long end = System.nanoTime();
        Long time = end - start;
        System.out.println("time=" + time);
        return time;
    }
}
