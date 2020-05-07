package com.yang.algorithm.day35;

import java.util.List;

/**
 * https://leetcode-cn.com/problems/longest-word-in-dictionary-through-deleting/description/
 * <p>
 * Created by yangguojun01 on 2020/5/7.
 */
public class Solution524 {

    public String findLongestWord(String s, List<String> d) {
        String ret = "";
        for (String subd : d) {
            if ((subd.length() > ret.length() || (subd.length() == ret.length() && ret.compareTo(subd) > 0))
                    && isSubString(s, subd)) {
                ret = subd;
            }
        }
        return ret;
    }

    public boolean isSubString(String s, String subd) {
        int i = 0;
        int j = 0;
        while (i < s.length() && j < subd.length()) {
            if (s.charAt(i) == subd.charAt(j)) {
                j++;
            }
            i++;
        }
        return j == subd.length();
    }

}
