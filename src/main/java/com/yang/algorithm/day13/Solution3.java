package com.yang.algorithm.day13;

/**
 * https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
 * <p>
 * Created by yangguojun01 on 2020/3/15.
 */
public class Solution3 {

    public static int lengthOfLongestSubstring(String s) {
        if (s == null || "".equals(s)) {
            return 0;
        }
        int maxLength = 1;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int subMax = 1;
            for (int j = i + 1; j < chars.length; j++) {
                if (s.substring(i, j).indexOf(chars[j]) > -1) {
                    break;
                } else {
                    subMax++;
                }
            }
            maxLength = subMax > maxLength ? subMax : maxLength;
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

}
