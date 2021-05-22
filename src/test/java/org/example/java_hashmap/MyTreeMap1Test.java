package org.example.java_hashmap;

import org.junit.Test;

import java.util.Comparator;

public class MyTreeMap1Test {
    /**
     * 默认是按 key 进行升序排列
     */
    @Test
    public void testMap1() {
        MyTreeMap1 map = new MyTreeMap1();
        map.inputMap1();
        System.out.println(map.treeMap);
    }

    /**
     * 如果要按照降序，需要自定义比较器 Comparator
     * 在 compare 方法中进行定义
     */
    @Test
    public void testMap2() {
        // MyTreeMap1 map = new MyTreeMap1(new Comparator<String>() {
        //     @Override
        //     public int compare(String o1, String o2) {
        //         return o2.compareTo(o1);
        //     }
        // });
        // MyTreeMap1 map = new MyTreeMap1((o1, o2) -> o2.compareTo(o1));
        MyTreeMap1 map = new MyTreeMap1(Comparator.reverseOrder());
        map.inputMap1();
        System.out.println(map.treeMap);
    }
}
