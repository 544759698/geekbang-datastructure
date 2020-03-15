package com.yang.algorithm.day8;

/**
 * https://leetcode-cn.com/problems/reverse-integer/
 * <p>
 * Created by yangguojun01 on 2020/3/10.
 */
public class Solution7 {

    public int reverse(int x) {
        int modLeft = 0;
        int ret = 0;
        while (x != 0) {
            modLeft = x % 10;
            if (ret > Integer.MAX_VALUE / 10 || (ret == Integer.MAX_VALUE / 10 && modLeft > 7)) {
                return 0;
            }
            if (ret < Integer.MIN_VALUE / 10 || (ret == Integer.MIN_VALUE / 10 && modLeft < -8)) {
                return 0;
            }
            ret = ret * 10 + modLeft;
            x = x / 10;
        }
        return ret;
    }

}
