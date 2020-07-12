package com.yang.practice.day6;

/**
 * https://leetcode-cn.com/problems/plus-one/
 * <p>
 * Created by yangguojun01 on 2020/3/8.
 */
public class Solution66 {

    public static int[] plusOne(int[] digits) {
        if (digits == null) {
            return null;
        }
        int temp = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            temp = digits[i] + 1;
            if (temp != 10) {
                digits[i] = temp;
                break;
            } else {
                digits[i] = 0;
            }
        }
        if (temp == 10) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            System.arraycopy(digits, 0, result, 1, digits.length);
            return result;
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] digits = new int[] {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        plusOne(digits);
    }

}
