package org.example.java_hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author lifei
 */
public class MyHashMap1 {
    Map<String, Integer> userMap = new HashMap<>();

    /**
     * inputMap
     */
    public void inputMap() {
        userMap.put("zhang1", 1);
        userMap.put("zhang2", 2);
        userMap.put("zhang3", 3);
        userMap.put("zhang4", 4);
        userMap.put("zhang5", 5);
    }

    /**
     * keySet()
     */
    public void outputMap1() {
        Integer value;
        for (String key : userMap.keySet()) {
            // System.out.println(key + ": " + userMap.get(key));
            value = userMap.get(key);
        }
    }

    /**
     * values()
     */
    public void outputMap2() {
        Integer value;
        for (Integer v : userMap.values()) {
            // System.out.println(v);
            value = v;
        }
    }

    /**
     * entrySet()
     */
    public void outputMap3() {
        Integer value;
        for (Map.Entry<String, Integer> entry : userMap.entrySet()) {
            // System.out.println(entry.getKey() + ": " + entry.getValue());
            value = entry.getValue();
        }
    }

    /**
     * Iterator
     */
    public void outputMap4() {
        Iterator<Map.Entry<String, Integer>> it = userMap.entrySet().iterator();
        Integer value;
        while (it.hasNext()) {
            Entry<String, Integer> entry = it.next();
            // System.out.println(entry.getKey() + ": " + entry.getValue());
            value = entry.getValue();
        }
    }

    /**
     * inputMap2
     */
    public void inputMap2() {
        String[] strs = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        String key;
        Integer value;
        for (int i = 0; i < 1000000; i++) {
            int m = (int) (Math.random() * 10);
            key = String.valueOf(strs[m] + i * 100);
            value = i;
            userMap.put(key, value);
        }
    }
}
