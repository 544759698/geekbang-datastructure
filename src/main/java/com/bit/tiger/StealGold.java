package com.bit.tiger;

/**
 * @Author: yangguojun01
 * @Date: 2020/7/12
 */
public class StealGold {

    public int getMaxGold(int[] houses) {
        int[] memo = new int[houses.length];
        return getMemo(0, memo, houses);
    }

    public int getMemo(int id, int[] memo, int[] houses) {
        if (id >= memo.length) {
            return 0;
        }
        if (memo[id] != 0) {
            return memo[id];
        }
        int chooseElement = houses[id] + getMemo(id + 2, memo, houses);
        int noChooseElement = getMemo(id + 1, memo, houses);
        return memo[id] = Math.max(chooseElement, noChooseElement);
    }

    public static void main(String[] args) {
        StealGold solution = new StealGold();
        System.out.println(solution.getMaxGold(new int[] {3, 5, 2, 10}));
    }

}
