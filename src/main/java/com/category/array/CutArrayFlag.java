package com.category.array;

/**
 * @Author: yangguojun01
 * @Date: 2020/7/4
 */
public class CutArrayFlag {

    public int getCutFlag(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        // 消除重复元素
        int n = nums.length - 1;
        while (n >= 0 && nums[0] == nums[n]) {
            n--;
        }
        if (n <= 0) {
            return -1;
        }
        // 纯递增直接返回
        if (nums[0] < nums[n]) {
            return nums[0];
        }
        // 非纯递增二分查找 [l,mid] [mid+1,r]
        int l = 0;
        int r = n;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] > nums[l]) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return nums[l];
    }

    public static void main(String[] args) {
        int[] nums = new int[] {3, 4, 5, 1, 2};
        CutArrayFlag cutArrayFlag = new CutArrayFlag();
        System.out.println(cutArrayFlag.getCutFlag(nums));
    }

}
