package com.yang.algorithm.day9;

/**
 * https://leetcode-cn.com/problems/palindrome-number/
 * <p>
 * Created by yangguojun01 on 2020/3/11.
 */
public class Solution9 {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String xStr = x + "";
        char[] chars = xStr.toCharArray();
        if (chars.length == 1) {
            return true;
        }
        int i = 0;
        int j = chars.length - 1;
        while (i < j) {
            if (chars[i] != chars[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}
