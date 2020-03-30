package com.yang.algorithm.day24;

import java.util.List;

/**
 * https://leetcode-cn.com/problems/triangle/
 * <p>
 * Created by yangguojun01 on 2020/3/30.
 */
public class Solution120 {

    int row;
    Integer[][] memo;

    public int minimumTotal(List<List<Integer>> triangle) {
        row = triangle.size();
        memo = new Integer[row][row];
        return helper(0, 0, triangle);
    }

    public int helper(int level, int column, List<List<Integer>> triangle) {
        if (memo[level][column] != null) {
            return memo[level][column];
        }
        if (level == row - 1) {
            memo[level][column] = triangle.get(level).get(column);
            return memo[level][column];
        }
        int left = helper(level + 1, column, triangle);
        int right = helper(level + 1, column + 1, triangle);
        memo[level][column] = Math.min(left, right) + triangle.get(level).get(column);
        return memo[level][column];
    }

}
