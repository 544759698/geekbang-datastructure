package com.bit.tiger;

/**
 * @Author: yangguojun01
 * @Date: 2020/6/26
 */
public class FibonaciSolution {

    public int fibnaci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return n - 1;
        }
        int[] memo = new int[n];
        memo[0] = 0;
        memo[1] = 1;
        for (int i = 2; i < n; i++) {
            memo[i] = memo[i - 1] + memo[i - 2];
        }
        return memo[n - 1];
    }

    public static void main(String[] args) {
        FibonaciSolution solution = new FibonaciSolution();
        System.out.println(solution.fibnaci(5));
    }

}
