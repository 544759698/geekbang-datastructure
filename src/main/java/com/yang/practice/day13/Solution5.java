package com.yang.practice.day13;

/**
 * https://leetcode-cn.com/problems/longest-palindromic-substring/
 * <p>
 * Created by yangguojun01 on 2020/3/15.
 */
public class Solution5 {

    public static String longestPalindrome(String s) {
        if (s == null || "".equals(s)) {
            return "";
        }
        char[] chars = s.toCharArray();
        char[] newChars = new char[2 * chars.length - 1];
        for (int k = 0; k < newChars.length; k++) {
            if (k % 2 == 0) {
                newChars[k] = chars[k / 2];
            } else {
                newChars[k] = ' ';
            }
        }
        int start = 0;
        int end = 0;
        for (int i = 1; i < newChars.length; i++) {
            int j = 1;
            while ((i - j >= 0) && (i + j < newChars.length)) {
                if (newChars[i - j] == newChars[i + j]) {
                    j++;
                } else {
                    break;
                }
            }
            if ((2 * (j - 1) + 1) > (end - start + 1)) {
                start = i - j + 1;
                end = i + j - 1;
            }
            if ((2 * (j - 1) + 1) == (end - start + 1)&&newChars[start]==' ') {
                start = i - j + 1;
                end = i + j - 1;
            }
        }
        StringBuilder sbRet = new StringBuilder();
        while (start <= end) {
            if (newChars[start] != ' ') {
                sbRet.append(newChars[start]);
            }
            start++;
        }
        return sbRet.toString();
    }

    public static void main(String[] args) {
        String s = "cbbd";
        System.out.println(longestPalindrome(s));
    }

}
