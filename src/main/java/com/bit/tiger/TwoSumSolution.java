package com.bit.tiger;

import java.util.HashMap;

/**
 * @Author: yangguojun01
 * @Date: 2020/6/25
 */
public class TwoSumSolution {

    public boolean hasTwoSumEqualsTarget(int[] arr, int target) {
        if (arr == null || arr.length < 2) {
            return false;
        }
        HashMap<Integer, Integer> map = new HashMap<>(arr.length);
        for (int num : arr) {
            if (map.get(target - num) != null) {
                return true;
            }
            map.put(num, 1);
        }
        return false;
    }

}
