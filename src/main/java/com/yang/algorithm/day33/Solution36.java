package com.yang.algorithm.day33;

import java.util.HashMap;

/**
 * https://leetcode-cn.com/problems/valid-sudoku/
 * <p>
 * Created by yangguojun01 on 2020/4/25.
 */
public class Solution36 {

    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, Integer>[] rows = new HashMap[9];
        HashMap<Integer, Integer>[] cols = new HashMap[9];
        HashMap<Integer, Integer>[] boxes = new HashMap[9];
        for (int i = 0; i < 9; i++) {
            rows[i] = new HashMap<>(9);
            cols[i] = new HashMap<>(9);
            boxes[i] = new HashMap<>(9);
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                int n = board[i][j] - '0';
                if (n < 0 || n > 9) {
                    continue;
                }
                rows[i].put(n, rows[i].getOrDefault(n, 0) + 1);
                cols[j].put(n, cols[j].getOrDefault(n, 0) + 1);
                int boxIndex = (i / 3) * 3 + j / 3;
                boxes[boxIndex].put(n, boxes[boxIndex].getOrDefault(n, 0) + 1);
                if (rows[i].get(n) > 1 || cols[j].get(n) > 1 || boxes[boxIndex].get(n) > 1) {
                    return false;
                }
            }
        }
        return true;
    }

}
