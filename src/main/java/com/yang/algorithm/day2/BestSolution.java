package com.yang.algorithm.day2;

/**
 * https://leetcode-cn.com/problems/rotate-array/
 * <p>
 * Created by yangguojun01 on 2020/3/5.
 */
public class BestSolution {

    public static void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 1) {
            return;
        }
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6, 7};
        rotate(nums, 4);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

}
