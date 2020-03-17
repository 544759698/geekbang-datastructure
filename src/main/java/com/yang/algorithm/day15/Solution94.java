package com.yang.algorithm.day15;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/binary-tree-inorder-traversal/
 * <p>
 * Created by yangguojun01 on 2020/3/17.
 */
public class Solution94 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        recursionTree(root, ret);
        return ret;
    }

    public void recursionTree(TreeNode root, List<Integer> ret) {
        if (root != null) {
            recursionTree(root.left, ret);
            ret.add(root.val);
            recursionTree(root.right, ret);
        }
    }

}
