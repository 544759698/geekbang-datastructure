package com.yang.practice.day22;

/**
 * https://leetcode-cn.com/problems/valid-anagram/
 * <p>
 * Created by yangguojun01 on 2020/3/28.
 */
public class Solution110 {

    public boolean isAnagram(String s, String t) {
        int[] retArr = new int[26];
        char[] sChars = s.toCharArray();
        for (int i = 0; i < sChars.length; i++) {
            retArr[sChars[i] - 'a']++;
        }
        char[] tChars = t.toCharArray();
        for (int i = 0; i < tChars.length; i++) {
            retArr[tChars[i] - 'a']--;
        }
        for (int i = 0; i < retArr.length; i++) {
            if (retArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

}
