package com.yang.practice.day29;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

/**
 * https://leetcode-cn.com/problems/top-k-frequent-elements/
 * <p>
 * Created by yangguojun01 on 2020/4/20.
 */
public class Solution347 {

    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int n : nums) {
            countMap.put(n, countMap.getOrDefault(n, 0) + 1);
        }
        PriorityQueue<Integer> topKQueue = new PriorityQueue<>(Comparator.comparing(countMap::get));
        for (int n : countMap.keySet()) {
            topKQueue.offer(n);
            if (topKQueue.size() > k) {
                topKQueue.poll();
            }
        }
        List<Integer> ret = new ArrayList<>(k);
        while (!topKQueue.isEmpty()) {
            ret.add(topKQueue.poll());
        }
        Collections.reverse(ret);
        return ret;
    }

}
