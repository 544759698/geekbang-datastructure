package com.bit.tiger;

/**
 * @Author: yangguojun01
 * @Date: 2020/6/26
 */
public class FindOneSolution {

    public int findOne(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        while (left < right) {
            mid = left + (right - left) / 2;
            if (nums[mid] == 0) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return nums[left] == 1 ? left : -1;
    }

    public static void main(String[] args) {
        FindOneSolution solution = new FindOneSolution();
        int[] nums = new int[] {0, 0, 0, 1, 1, 1, 1, 1, 1, 1};
        System.out.println(solution.findOne(nums));
    }
}
