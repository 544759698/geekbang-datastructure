package com.yang.algorithm.day34;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/generate-parentheses/
 * Created by yangguojun01 on 2020/5/6.
 */
public class Solution22 {

    public List<String> generateParenthesis(int n) {
        List<String> ret = new ArrayList<>();
        genRecursion("", n, n, ret);
        return ret;
    }

    public void genRecursion(String subRet, int left, int right, List<String> ret) {
        if (left == 0 && right == 0) {
            ret.add(subRet);
            return;
        }
        if (left > 0) {
            genRecursion(subRet + "(", left - 1, right, ret);
        }
        if (left < right) {
            genRecursion(subRet + ")", left, right - 1, ret);
        }
    }

}
