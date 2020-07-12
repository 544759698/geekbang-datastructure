package com.yang.practice.day1;

/**
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
 * <p>
 * Created by yangguojun01 on 2020/3/5.
 */
public class BestSolution {

    public static int removeDuplicates(int[] nums) {
        if (nums == null) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                nums[i + 1] = nums[j];
                i++;
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {0, 0, 1, 1, 2, 3, 3, 5, 6};
        int distinctCount = removeDuplicates(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        System.out.println(distinctCount);
    }

}
