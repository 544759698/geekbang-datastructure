package com.category.sort;

/**
 * @Author: yangguojun01
 * @Date: 2020/6/30
 */
public class QuickSort {

    public void quickSort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }
        int i = low;
        int j = high;
        // 基准值
        int baseValue = nums[low];
        while (i < j) {
            // 右边
            while (nums[j] >= baseValue && i < j) {
                j--;
            }
            // 左边
            while (nums[i] <= baseValue && i < j) {
                i++;
            }
            // 交换
            if (i < j) {
                int tmp = nums[j];
                nums[j] = nums[i];
                nums[i] = tmp;
            }
        }
        // 基准值放到正确位置
        nums[low] = nums[i];
        nums[i] = baseValue;
        // 左侧递归
        quickSort(nums, low, i - 1);
        // 右侧递归
        quickSort(nums, i + 1, high);
    }

    public static void main(String[] args) {
        int[] nums = new int[] {5, 3, 6, 1, 2, 8, 7, 9, 0, 4};
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(nums, 0, nums.length - 1);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
