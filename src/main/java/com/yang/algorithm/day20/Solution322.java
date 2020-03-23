package com.yang.algorithm.day20;

/**
 * https://leetcode-cn.com/problems/coin-change/
 * XXXXXXXXXXXXXXXXXXX
 * Created by yangguojun01 on 2020/3/24.
 */
public class Solution322 {

    public int coinChange(int[] coins, int amount) {
        int ret = Integer.MAX_VALUE;
        for (int i = coins.length - 1; i >= 0; i--) {
            int iRet = coinChange(coins, amount, i);
            if (iRet != -1) {
                ret = Math.min(ret, iRet);
            }
        }
        return ret < Integer.MAX_VALUE ? ret : -1;
    }

    private int coinChange(int[] coins, int amount, int idx) {
        coins = coinsSort(coins);
        int ret = 0;
        while (amount > 0 && idx >= 0) {
            ret += amount / coins[idx];
            amount = amount % coins[idx];
            idx--;
        }
        return amount == 0 ? ret : -1;
    }

    public int[] coinsSort(int[] coins) {
        for (int i = coins.length - 1; i >= 0; i--) {
            int maxIndex = i;
            int max = coins[i];
            for (int j = 0; j < i; j++) {
                if (coins[j] > max) {
                    max = coins[j];
                    maxIndex = j;
                }
            }
            coins[maxIndex] = coins[i];
            coins[i] = max;
        }
        return coins;
    }

}
