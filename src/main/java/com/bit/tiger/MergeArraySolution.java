package com.bit.tiger;

/**
 * @Author: yangguojun01
 * @Date: 2020/6/25
 */
public class MergeArraySolution {

    public void mergeArrays(int[] nums1, int length1, int[] nums2, int length2) {
        int currIdx = length1 + length2 - 1;
        while (currIdx >= 0) {
            if (length1 > 0 && length2 > 0 && (nums1[length1 - 1] > nums2[length2 - 1])) {
                nums1[currIdx] = nums1[length1 - 1];
                length1--;
            } else if (length2 > 0) {
                nums1[currIdx] = nums2[length2 - 1];
                length2--;
            }
            currIdx--;
        }
        //        while (length2 > 0) {
        //            nums1[currIdx] = nums2[length2 - 1];
        //            length2--;
        //            currIdx--;
        //        }
    }

    public static void main(String[] args) {
        MergeArraySolution solution = new MergeArraySolution();
        int[] nums1 = new int[] {1, 3, 5, 0, 0, 0};
        int[] nums2 = new int[] {2, 4, 6};
        solution.mergeArrays(nums1, 3, nums2, 3);
        for (int num : nums1) {
            System.out.println(num);
        }
    }

}
