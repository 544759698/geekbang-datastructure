package com.yang.algorithm.day21;

/**
 * https://leetcode-cn.com/problems/fibonacci-number/
 * <p>
 * Created by yangguojun01 on 2020/3/25.
 */
public class Solution509 {

    public int fib(int N) {
        if (N == 0) {
            return 0;
        }
        if (N == 1) {
            return 1;
        }
        return fib(N - 1) + fib(N - 2);
    }

    public int fib2(int N) {
        if (N == 0) {
            return 0;
        }
        if (N == 1) {
            return 1;
        }
        int[] fibArr = new int[N + 1];
        fibArr[1] = 1;
        for (int i = 2; i <= N; i++) {
            fibArr[i] = fibArr[i - 1] + fibArr[i - 2];
        }
        return fibArr[N];
    }

}
