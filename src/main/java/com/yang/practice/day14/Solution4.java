package com.yang.practice.day14;

/**
 * https://leetcode-cn.com/problems/median-of-two-sorted-arrays/
 * <p>
 * Created by yangguojun01 on 2020/3/16.
 */
public class Solution4 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        boolean isOdd = (m + n) % 2 == 0;
        int retIndex = isOdd ? (m + n) / 2 : (m + n - 1) / 2;
        int i = 0, j = 0;
        boolean isJ = false;
        while ((i + j) < retIndex) {
            if (i > nums1.length - 1) {
                i = nums1.length - 1;
            }
            if (j > nums2.length - 1) {
                j = nums2.length - 1;
            }
            if (nums1[i] > nums2[j]) {
                j++;
                isJ = false;
            } else {
                i++;
                isJ = true;
            }
        }
        if (isOdd) {
            return (double) (nums1[i] + nums2[j]) / 2;
        }
        if (!isOdd) {
            return isJ ? nums2[j] : nums1[i];
        }
        return 0;
    }
}
