package com.yang.algorithm.day3;

/**
 * https://leetcode-cn.com/problems/move-zeroes/
 * <p>
 * Created by yangguojun01 on 2020/3/5.
 */
public class Solution283 {
    public void moveZeroes(int[] nums) {
        if (nums == null) {
            return;
        }
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
    }
}
