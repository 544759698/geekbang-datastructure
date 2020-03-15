package com.yang.algorithm.day9;

/**
 * Created by yangguojun01 on 2020/3/15.
 */
public class Solution9_1 {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x > 0 && x % 10 == 0)) {
            return false;
        }
        int reverseHalf = 0;
        while (x > reverseHalf) {
            reverseHalf = reverseHalf * 10 + x % 10;
            if (x == reverseHalf) {
                return true;
            }
            x = x / 10;
        }
        return x == reverseHalf;
    }
}
