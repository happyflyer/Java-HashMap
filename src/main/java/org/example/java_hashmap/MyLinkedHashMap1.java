package org.example.java_hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author lifei
 */
public class MyLinkedHashMap1 {
    Map<String, String> hashMap = new HashMap<>();
    Map<String, String> linkedHashMap = new LinkedHashMap<>();
    int count = 1000000;

    public void inputMap1() {
        for (int i = 0; i < count; i++) {
            hashMap.put(String.valueOf(i), "value");
        }
    }

    public void inputMap2() {
        for (int i = 0; i < count; i++) {
            linkedHashMap.put(String.valueOf(i), "value");
        }
    }

    public void outputMap1() {
        String value;
        for (String v : hashMap.values()) {
            value = v;
        }
    }

    public void outputMap2() {
        String value;
        for (String v : linkedHashMap.values()) {
            value = v;
        }
    }
}
