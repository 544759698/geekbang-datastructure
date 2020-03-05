package com.yang.algorithm.day1;

/**
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
 *
 * Created by yangguojun01 on 2020/3/4.
 */
public class Solution {

    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int i = 0;
        int newIndex = 1;
        while (i < nums.length - 1) {
            int j = i + 1;
            while (j < nums.length && nums[i] == nums[j]) {
                j++;
            }
            if (j >= nums.length) {
                break;
            }
            nums[newIndex++] = nums[j];
            i = j;
        }
        return newIndex;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {0, 0, 1, 1, 2, 2, 3, 3, 4};
        int distinctCount = removeDuplicates(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        System.out.println(distinctCount);
    }

}

