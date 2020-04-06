package com.yang.algorithm.day27;

import java.util.ArrayDeque;

/**
 * https://leetcode-cn.com/problems/sliding-window-maximum/
 * <p>
 * Created by yangguojun01 on 2020/4/7.
 */
public class Solution239 {

    ArrayDeque<Integer> deq = new ArrayDeque<>();
    int[] nums;

    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if (n * k == 0) {
            return new int[0];
        }
        if (k == 1) {
            return nums;
        }
        this.nums = nums;
        int maxIdx = 0;
        for (int i = 0; i < k; i++) {
            cleanDeque(i, k);
            deq.addLast(i);
            if (nums[i] > nums[maxIdx]) {
                maxIdx = i;
            }
        }
        int[] output = new int[n - k + 1];
        output[0] = nums[maxIdx];
        for (int i = k; i < n; i++) {
            cleanDeque(i, k);
            deq.addLast(i);
            output[i - k + 1] = nums[deq.getFirst()];
        }
        return output;
    }

    public void cleanDeque(int i, int k) {
        if (!deq.isEmpty() && deq.getFirst() == i - k) {
            deq.removeFirst();
        }
        while (!deq.isEmpty() && nums[i] > nums[deq.getLast()]) {
            deq.removeLast();
        }
    }

}
