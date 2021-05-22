package org.example.java_hashmap;

import org.junit.Test;

public class MyHashMap6Test {
    /**
     * 用到的技术点：
     * 1、isEmpty
     * 2、remove, clear
     * 3、containsKey, containValue
     * 4、replace
     * 5、put, putIfAbsent
     */
    @Test
    public void testInputMap() {
        MyHashMap6 map = new MyHashMap6();
        // 判断是否为空
        boolean isNull = map.map.isEmpty();
        System.out.println("map1 is null = " + isNull);
        // 执行方法
        map.inputMap();
        System.out.println(map.map);
        // 判断是否为空
        isNull = map.map.isEmpty();
        System.out.println("map1 is null = " + isNull);
        // 删除节点
        System.out.println(map.map.remove("x"));
        System.out.println(map.map);
        System.out.println(map.map.remove("x123"));
        System.out.println(map.map);
        // 清空 HashMap
        map.map.clear();
        System.out.println(map.map);
        // 包含 key 或 value
        map.inputMap();
        System.out.println(map.map.containsKey("x"));
        System.out.println(map.map.containsKey("x123"));
        System.out.println(map.map.containsValue("123"));
        System.out.println(map.map.containsValue("x123"));
        // 替换
        System.out.println(map.map.replace("x", "999"));;
        System.out.println(map.map);
        // 替换不成功
        System.out.println(map.map.replace("x", "123", "666"));;
        System.out.println(map.map);
        // 替换
        System.out.println(map.map.replace("y", "456", "666"));;
        System.out.println(map.map);
        // 覆盖
        System.out.println(map.map.put("x", "888"));;
        System.out.println(map.map);
        // 不覆盖
        if (!map.map.containsKey("x")) {
            System.out.println(map.map.put("x", "777"));;
        }
        System.out.println(map.map);
        // 不覆盖
        System.out.println(map.map.putIfAbsent("x", "555"));;
        System.out.println(map.map);
        // 有效的情况
        map.map.clear();
        System.out.println(map.map);
        System.out.println(map.map.putIfAbsent("x", "444"));;
        System.out.println(map.map);
    }
}
