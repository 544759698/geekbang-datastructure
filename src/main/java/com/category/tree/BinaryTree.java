package com.category.tree;

import java.util.ArrayList;
import java.util.List;

import com.bit.tiger.CommonAncestorSolution;
import com.bit.tiger.Node;

/**
 * @Author: yangguojun01
 * @Date: 2020/6/30
 */
public class BinaryTree {

    public List<Integer> preorderTraversal(Node root) {
        List<Integer> result = new ArrayList<>();
        preorder(root, result);
        return result;
    }

    private void preorder(Node node, List<Integer> result) {
        if (node == null) {
            return;
        }
        result.add(node.value);
        if (node.left != null) {
            preorder(node.left, result);
        }
        if (node.right != null) {
            preorder(node.right, result);
        }
    }

    public static void main(String[] args) {
        CommonAncestorSolution helper = new CommonAncestorSolution();
        Node root = helper.buildTree(new int[] {1, 2, 3, -1, 4, 5, 6, -1, -1, 7, 8}, 0);
        BinaryTree tree = new BinaryTree();
        List<Integer> result = tree.preorderTraversal(root);
        for (Integer item : result) {
            System.out.println(item);
        }
    }
}