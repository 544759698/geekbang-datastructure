package com.yang.practice.day27;

import java.util.PriorityQueue;

/**
 * https://leetcode-cn.com/problems/kth-largest-element-in-a-stream/
 * <p>
 * Created by yangguojun01 on 2020/4/6.
 */
public class KthLargest {

    private PriorityQueue<Integer> queue;
    private int count;

    public KthLargest(int k, int[] nums) {
        count = k;
        queue = new PriorityQueue<>(k);
        for (int n : nums) {
            add(n);
        }
    }

    public int add(int val) {
        if (queue.size() < count) {
            queue.offer(val);
        }else if(val>queue.peek()) {
            queue.poll();
            queue.offer(val);
        }
        return queue.peek();
    }

}
