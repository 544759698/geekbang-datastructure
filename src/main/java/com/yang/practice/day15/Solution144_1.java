package com.yang.practice.day15;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by yangguojun01 on 2020/3/17.
 */
public class Solution144_1 {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        if (root == null) {
            return ret;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode curr = stack.pop();
            ret.add(curr.val);
            if (curr.right != null) {
                stack.push(curr.right);
            }
            if (curr.left != null) {
                stack.push(curr.left);
            }
        }
        return ret;
    }

}
