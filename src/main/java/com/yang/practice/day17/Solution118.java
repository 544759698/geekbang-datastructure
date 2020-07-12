package com.yang.practice.day17;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/pascals-triangle/
 * <p>
 * Created by yangguojun01 on 2020/3/19.
 */
public class Solution118 {

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<>(numRows);
        for (int i = 0; i < numRows; i++) {
            int subLength = i + 1;
            List<Integer> subList = new ArrayList<>(subLength);
            for (int k = 0; k < subLength; k++) {
                subList.add(1);
            }
            if (i == 0 || i == 1) {
                ret.add(subList);
                continue;
            }
            int j = 1;
            while (j < subList.size() - 1) {
                subList.set(j, ret.get(i - 1).get(j - 1) + ret.get(i - 1).get(j));
                j++;
            }
            ret.add(subList);
        }
        return ret;
    }

    public static void main(String[] args) {
        generate(5);
        System.out.println();
    }
}
