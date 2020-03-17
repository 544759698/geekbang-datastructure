package com.yang.algorithm.day15;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/binary-tree-postorder-traversal/
 * <p>
 * Created by yangguojun01 on 2020/3/17.
 */
public class Solution145 {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        recursionTree(root, ret);
        return ret;
    }

    public void recursionTree(TreeNode root, List<Integer> ret) {
        if (root != null) {
            recursionTree(root.left, ret);
            recursionTree(root.right, ret);
            ret.add(root.val);
        }

    }

}
