package com.yang.practice.day5;

import java.util.Stack;

/**
 * https://leetcode-cn.com/problems/valid-parentheses/
 * <p>
 * Created by yangguojun01 on 2020/3/7.
 */
public class Solution20 {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if ('(' == c) {
                stack.push(')');
            } else if ('[' == c) {
                stack.push(']');
            } else if ('{' == c) {
                stack.push('}');
            } else if (stack.isEmpty() || c != stack.pop()) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));
    }

}
