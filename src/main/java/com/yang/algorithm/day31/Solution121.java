package com.yang.algorithm.day31;

/**
 * https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/
 * <p>
 * Created by yangguojun01 on 2020/4/21.
 */
public class Solution121 {

    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }

}
