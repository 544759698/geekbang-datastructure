package com.yang.algorithm.day13;

/**
 * Created by yangguojun01 on 2020/3/29.
 */
public class Solution5_1 {

    public String longestPalindrome(String s) {
        if (s == "" || s.length() < 1) {
            return "";
        }
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCentor(s, i, i);
            int len2 = expandAroundCentor(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > (end - start)) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    public int expandAroundCentor(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
