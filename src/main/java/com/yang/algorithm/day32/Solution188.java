package com.yang.algorithm.day32;

/**
 * https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-iv/
 * <p>
 * Created by yangguojun01 on 2020/4/22.
 */
public class Solution188 {

    public int maxProfit(int k, int[] prices) {
        if (k == 0) {
            return 0;
        }
        if (k > prices.length / 2) {
            return profit(prices);
        }
        int n = prices.length;
        int[][][] dp = new int[n][k + 1][2];
        for (int i = 0; i < n; i++) {
            // base case
            //至今为止没有交易，收益为0
            dp[i][0][0] = 0;
            //交易了0次，但持有股票，不符合规则
            dp[i][0][1] = Integer.MIN_VALUE;
            for (int t = 1; t <= k; t++) {
                // base case
                if (i == 0) {
                    //第一天买入t次，当天卖出t次,收入为0
                    dp[i][t][0] = 0;
                    //甭管第一天买多少次，反正最后少卖一次，持有了股票
                    dp[i][t][1] = -prices[i];
                    continue;
                }
                // 买入+卖出 算一次交易
                dp[i][t][0] = Math.max(dp[i - 1][t][0], dp[i - 1][t][1] + prices[i]);
                dp[i][t][1] = Math.max(dp[i - 1][t][1], dp[i - 1][t - 1][0] - prices[i]);
            }

        }
        return dp[n - 1][k][0];
    }

    private int profit(int[] prices) {
        int dp_i_0 = 0;
        int dp_i_1 = Integer.MIN_VALUE;
        int tmp = 0;
        for (int i = 0; i < prices.length; i++) {
            tmp = dp_i_0;
            dp_i_0 = Math.max(dp_i_0, dp_i_1 + prices[i]);
            dp_i_1 = Math.max(dp_i_1, tmp - prices[i]);
        }
        return dp_i_0;
    }

}
