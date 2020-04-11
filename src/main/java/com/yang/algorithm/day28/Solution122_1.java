package com.yang.algorithm.day28;

/**
 * https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/solution/
 * <p>
 * Created by yangguojun01 on 2020/4/11.
 */
public class Solution122_1 {

    public int maxProfit(int[] prices) {
        int max = 0;
        for (int j = 1; j < prices.length; j++) {
            if (prices[j] > prices[j - 1]) {
                max += prices[j] - prices[j - 1];
            }
        }
        return max;
    }

}
