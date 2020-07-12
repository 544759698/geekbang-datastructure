package com.yang.practice.day28;

/**
 * https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/solution/
 * <p>
 * Created by yangguojun01 on 2020/4/11.
 */
public class Solution122 {

    public int maxProfit(int[] prices) {
        return calculate(prices, 0);
    }

    public int calculate(int[] prices, int s) {
        if (s >= prices.length) {
            return 0;
        }
        int max = 0;
        for (int start = s; start < prices.length; start++) {
            for (int j = start + 1; j < prices.length; j++) {
                if (prices[j] <= prices[start]) {
                    continue;
                }
                int profit = calculate(prices, j) + prices[j] - prices[start];
                max = Math.max(max, profit);
            }
        }
        return max;
    }

}
