package com.yang.algorithm.day35;

/**
 * https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted/description/
 * <p>
 * Created by yangguojun01 on 2020/5/7.
 */
public class Solution167 {

    public int[] twoSum(int[] numbers, int target) {
        int[] ret = new int[2];
        int i = 0;
        int j = numbers.length - 1;
        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if (sum == target) {
                ret[0] = i + 1;
                ret[1] = j + 1;
                return ret;
            } else if (sum > target) {
                j--;
            } else if (sum < target) {
                i++;
            }
        }
        return ret;
    }

}
