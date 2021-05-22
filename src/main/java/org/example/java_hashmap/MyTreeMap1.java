package org.example.java_hashmap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author lifei
 */
public class MyTreeMap1 {
    Map<String, String> treeMap;

    public MyTreeMap1() {
        treeMap = new TreeMap<>();
    }

    public MyTreeMap1(Comparator<String> comparator) {
        treeMap = new TreeMap<>(comparator);
    }

    public void inputMap1() {
        treeMap.put("a", "value1");
        treeMap.put("cd", "value4");
        treeMap.put("cb", "value3");
        treeMap.put("bc", "value2");
    }
}
