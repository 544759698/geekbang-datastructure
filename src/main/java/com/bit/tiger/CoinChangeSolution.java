package com.bit.tiger;

import java.util.Arrays;

/**
 * @Author: yangguojun01
 * @Date: 2020/6/26
 */
public class CoinChangeSolution {

    public int getCoins(int[] coins, int target) {
        int[] memo = new int[target + 1];
        // -1 nosolution -2 no calculation
        Arrays.fill(memo, -2);
        memo[0] = 0;
        return getMemo(target, memo, coins);
    }

    private int getMemo(int target, int[] memo, int[] coins) {
        if (memo[target] != -2) {
            return memo[target];
        }
        int result = -1;
        for (int coin : coins) {
            if (target >= coin) {
                int temp = getMemo(target - coin, memo, coins);
                // 找最小硬币数
                if (temp != -1 && (result == -1 || temp + 1 < result)) {
                    result = temp + 1;
                }
            }
        }
        memo[target] = result;
        return memo[target];
    }

    public static void main(String[] args) {
        CoinChangeSolution solution = new CoinChangeSolution();
        System.out.println(solution.getCoins(new int[] {1, 2, 3, 4}, 10));
        System.out.println(solution.getCoins(new int[] {1, 5, 11}, 20));
    }
}
