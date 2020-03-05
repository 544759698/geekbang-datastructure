package com.yang.algorithm.day2;

/**
 * https://leetcode-cn.com/problems/rotate-array/
 *
 * Created by yangguojun01 on 2020/3/4.
 */
public class Solution {

    public static void rotate(int[] nums, int k) {
        if (nums == null || nums.length <= 1) {
            return;
        }
        for (int i = 0; i < k; i++) {
            int last = nums[nums.length - 1];
            for (int j = nums.length - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = last;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6, 7};
        rotate(nums, 3);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
