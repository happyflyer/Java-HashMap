package org.example.java_hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author lifei
 */
public class MyTreeMap2 {
    Map<String, String> hashMap = new HashMap<>();
    Map<String, String> linkedHashMap = new LinkedHashMap<>();
    Map<String, String> treeMap = new TreeMap<>();
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

    public void inputMap3() {
        for (int i = 0; i < count; i++) {
            treeMap.put(String.valueOf(i), "value");
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

    public void outputMap3() {
        String value;
        for (String v : treeMap.values()) {
            value = v;
        }
    }
}
