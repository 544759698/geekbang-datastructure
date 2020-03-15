package com.yang.algorithm.day11;

/**
 * https://leetcode-cn.com/problems/longest-common-prefix/
 * <p>
 * Created by yangguojun01 on 2020/3/16.
 */
public class Solution14_1 {

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        String ret = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (strs[i] == "") {
                return "";
            }
            for (int j = ret.length() - 1; j >= 0; j--) {
                if (strs[i].startsWith(ret.substring(0, j + 1)) && !"".equals(ret) && ret != null) {
                    ret = ret.substring(0, j + 1);
                    break;
                }
                if (j == 0 || "".equals(ret) || ret == null) {
                    return "";
                }
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        String[] strs = new String[] {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }

}
