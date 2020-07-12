package com.yang.practice.day19;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/lru-cache/
 * <p>
 * Created by yangguojun01 on 2020/3/21.
 */
public class LRUCacheLinkedHashMap extends LinkedHashMap<Integer, Integer> {

    private int capatity;

    public LRUCacheLinkedHashMap(int capacity) {
        super(capacity, 0.75F, true);
        this.capatity = capacity;
    }

    public int get(int key) {
        return super.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        super.put(key, value);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return this.size() > capatity;
    }
}
