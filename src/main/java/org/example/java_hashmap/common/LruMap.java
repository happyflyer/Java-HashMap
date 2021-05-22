package org.example.java_hashmap.common;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author lifei
 */
public class LruMap<K, V> extends LinkedHashMap<K, V> {
    private int maxSize;

    public LruMap(int maxSize) {
        super(16, 0.75f, true);
        this.maxSize = maxSize;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > this.maxSize;
    }
}
