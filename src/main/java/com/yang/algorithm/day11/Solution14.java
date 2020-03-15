package com.yang.algorithm.day11;

/**
 * https://leetcode-cn.com/problems/longest-common-prefix/
 * <p>
 * Created by yangguojun01 on 2020/3/13.
 */
public class Solution14 {

    public String longestCommonPrefix(String[] strs) {
        String ret = "";
        for (int i = 0; i < strs.length; i++) {
            for (int j = strs[i].length() - 1; j >= 0; j--) {
                String pre = strs[i].substring(0, j + 1);
                int k = 0;
                while (k < strs.length) {
                    if (k == i) {
                        k++;
                        continue;
                    }
                    if (strs[k].startsWith(pre)) {
                        k++;
                    } else {
                        break;
                    }
                }
                if (k == strs.length) {
                    if (pre.length() > ret.length()) {
                        ret = pre;
                    }
                }
            }
        }
        return ret;
    }

}
