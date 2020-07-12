package com.yang.practice.day25;

/**
 * Created by yangguojun01 on 2020/4/2.
 */
public class Solution50_1 {

    public double myPow(double x, int n) {
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        double ret = 1;
        double current = x;
        for (long i = N; i > 0; i = i / 2) {
            if (i % 2 == 1) {
                ret = ret * current;
            }
            current = current * current;
        }
        return ret;
    }

}
