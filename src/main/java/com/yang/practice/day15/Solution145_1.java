package com.yang.practice.day15;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created by yangguojun01 on 2020/3/17.
 */
public class Solution145_1 {

    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> ret = new LinkedList<>();
        if (root == null) {
            return ret;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode curr = stack.pop();
            ret.addFirst(curr.val);
            if (curr.left != null) {
                stack.push(curr.left);
            }
            if (curr.right != null) {
                stack.push(curr.right);
            }
        }
        return ret;
    }

}
