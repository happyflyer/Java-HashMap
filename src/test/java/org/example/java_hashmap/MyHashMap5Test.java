package org.example.java_hashmap;

import org.junit.Test;

public class MyHashMap5Test {
    /**
     * 1、创建 10 个 HashMap，每个 HashMap 含有 10w 条记录
     * 2、传递不通的构造方法的参数，比较速度
     * 3、实验参数：构造方法传参 (16, 0.75f) 和 (16384, 0.75f)
     */
    @Test
    public void testInputMap() {
        MyHashMap5 map = new MyHashMap5();
        Long sum = 0L;
        for (int i = 0; i < 10; i++) {
            // sum += myHashMap5.inputMap(16, 0.75f);
            sum += map.inputMap(16384, 0.75f);
        }
        System.out.println(sum / 10);
    }
}
