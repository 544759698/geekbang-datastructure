package com.yang.practice.day16;

/**
 * https://leetcode-cn.com/problems/remove-element/
 * <p>
 * Created by yangguojun01 on 2020/3/18.
 */
public class Solution27 {

    public static int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int ret = 0;
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            if (nums[i] == val) {
                while (j > i && nums[j] == val) {
                    j--;
                    if (j < 0) {
                        break;
                    }
                }
                if (j > i) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    j--;
                    ret++;
                }
            } else {
                ret++;
            }
            i++;
        }
        return ret;
    }

    public static int removeElement1(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int ret = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                if (ret != i) {
                    nums[ret] = nums[i];
                }
                ret++;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {3, 2, 2, 3, 2, 2, 4, 5};
        System.out.println(removeElement(nums, 2));
        System.out.println(removeElement1(nums, 2));
    }

}
