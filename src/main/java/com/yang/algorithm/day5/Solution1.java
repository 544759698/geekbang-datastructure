package com.yang.algorithm.day5;

import java.util.HashMap;

/**
 * https://leetcode-cn.com/problems/two-sum/
 * <p>
 * Created by yangguojun01 on 2020/3/7.
 */
public class Solution1 {

    public int[] twoSum(int[] nums, int target) {
        int[] ret = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                ret[0] = map.get(target - nums[i]);
                ret[1] = i;
            } else {
                map.put(nums[i], i);
            }
        }
        return ret;
    }

}
