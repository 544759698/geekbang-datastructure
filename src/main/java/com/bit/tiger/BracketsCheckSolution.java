package com.bit.tiger;

import java.util.Stack;

import org.apache.commons.lang.StringUtils;

/**
 * @Author: yangguojun01
 * @Date: 2020/6/26
 */
public class BracketsCheckSolution {

    public boolean check(String str) {
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        Stack<Character> stack = new Stack<Character>();
        char[] brackets = str.toCharArray();
        for (int i = 0; i < brackets.length; i++) {
            if ('(' == brackets[i]) {
                stack.push(')');
                continue;
            }
            if ('[' == brackets[i]) {
                stack.push(']');
                continue;
            }
            if ('{' == brackets[i]) {
                stack.push('}');
                continue;
            }
            if (stack.isEmpty()) {
                return false;
            }
            Character item = stack.pop();
            if (brackets[i] != item) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        BracketsCheckSolution solution = new BracketsCheckSolution();
        System.out.println(solution.check("[()]{}"));
    }

}
