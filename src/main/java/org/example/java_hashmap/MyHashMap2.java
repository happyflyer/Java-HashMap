package org.example.java_hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lifei
 */
public class MyHashMap2 {
    Map<String, Map<String, Integer>> stuMap = new HashMap<>();
    List<Map<String, Integer>> stuList = new ArrayList<>();

    /**
     * inputMap
     */
    public void inputMap() {
        Map<String, Integer> stu1Map = new HashMap<>();
        stu1Map.put("chinese", 90);
        stu1Map.put("math", 80);
        stu1Map.put("english", 72);
        Map<String, Integer> stu2Map = new HashMap<>();
        stu2Map.put("chinese", 74);
        stu2Map.put("math", 60);
        stu2Map.put("english", 85);
        Map<String, Integer> stu3Map = new HashMap<>();
        stu3Map.put("chinese", 83);
        stu3Map.put("math", 75);
        stu3Map.put("english", 69);
        Map<String, Integer> stu4Map = new HashMap<>();
        stu4Map.put("chinese", 91);
        stu4Map.put("math", 85);
        stu4Map.put("english", 82);
        Map<String, Integer> stu5Map = new HashMap<>();
        stu5Map.put("chinese", 85);
        stu5Map.put("math", 97);
        stu5Map.put("english", 77);
        stuMap.put("zhang1", stu1Map);
        stuMap.put("zhang2", stu2Map);
        stuMap.put("zhang3", stu3Map);
        stuMap.put("zhang4", stu4Map);
        stuMap.put("zhang5", stu5Map);
    }

    /**
     * inputMap2
     */
    public void inputMap2() {
        Map<String, Integer> stu1Map = new HashMap<>();
        stu1Map.put("chinese", 90);
        stu1Map.put("math", 80);
        stu1Map.put("english", 72);
        Map<String, Integer> stu2Map = new HashMap<>();
        stu2Map.put("chinese", 74);
        stu2Map.put("math", 60);
        stu2Map.put("english", 85);
        Map<String, Integer> stu3Map = new HashMap<>();
        stu3Map.put("chinese", 83);
        stu3Map.put("math", 75);
        stu3Map.put("english", 69);
        Map<String, Integer> stu4Map = new HashMap<>();
        stu4Map.put("chinese", 91);
        stu4Map.put("math", 85);
        stu4Map.put("english", 82);
        Map<String, Integer> stu5Map = new HashMap<>();
        stu5Map.put("chinese", 85);
        stu5Map.put("math", 97);
        stu5Map.put("english", 77);
        stuList.add(stu1Map);
        stuList.add(stu2Map);
        stuList.add(stu3Map);
        stuList.add(stu4Map);
        stuList.add(stu5Map);
    }
}
