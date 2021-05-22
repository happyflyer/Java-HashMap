package org.example.java_hashmap;

import java.util.Map;

/**
 * @author lifei
 */
public class MyLinkedHashMap2 {
    Map<String, String> linkedHashMap;

    public MyLinkedHashMap2(Map<String, String> linkedHashMap) {
        this.linkedHashMap = linkedHashMap;
    }

    public void inputMap1() {
        linkedHashMap.put("a1", "value1");
        linkedHashMap.put("b1", "value2");
        linkedHashMap.put("c1", "value3");
        linkedHashMap.put("d1", "value4");
    }
}
