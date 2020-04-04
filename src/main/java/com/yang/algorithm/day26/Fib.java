package com.yang.algorithm.day26;

/**
 * Created by yangguojun01 on 2020/4/4.
 */
public class Fib {

    public int fib0(int N) {
        return N == 0 ? 0 : N == 1 ? 1 : fib0(N - 1) + fib0(N - 2);
    }

    public int fib(int N) {
        if (N <= 1) {
            return N;
        }
        int[] memo = new int[N + 1];
        memo[1] = 1;
        for (int i = 2; i <= N; i++) {
            memo[i] = memo[i - 1] + memo[i - 2];
        }
        return memo[N];
    }

}
