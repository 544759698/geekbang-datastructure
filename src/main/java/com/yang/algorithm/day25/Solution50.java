package com.yang.algorithm.day25;

/**
 * https://leetcode-cn.com/problems/powx-n/
 * <p>
 * Created by yangguojun01 on 2020/4/2.
 */
public class Solution50 {

    public double myPow(double x, int n) {
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        return fastPow(x, n);
    }

    public double fastPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        double half = fastPow(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }

}
