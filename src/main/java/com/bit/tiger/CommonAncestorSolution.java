package com.bit.tiger;

/**
 * @Author: yangguojun01
 * @Date: 2020/6/26
 */

class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
    }
}

public class CommonAncestorSolution {

    public Node buildTree(int[] nums, int pos) {
        if (pos >= nums.length || nums[pos] == -1) {
            return null;
        }
        Node node = new Node(nums[pos]);
        node.left = buildTree(nums, pos * 2 + 1);
        node.right = buildTree(nums, pos * 2 + 2);
        return node;
    }

    public int findAncestor(Node root, int value1, int value2) {
        if (root == null) {
            return -1;
        }
        if (root.value == value1 || root.value == value2) {
            return root.value;
        }
        int leftValue = findAncestor(root.left, value1, value2);
        int rightValue = findAncestor(root.right, value1, value2);
        // 左右都找到
        if (leftValue != -1 && rightValue != -1) {
            return root.value;
        }
        // 只找到一个或者未找到
        return leftValue + rightValue + 1;
    }

    public static void main(String[] args) {
        CommonAncestorSolution solution = new CommonAncestorSolution();
        Node root = solution.buildTree(new int[] {1, 2, 3, -1, 4, 5, 6, -1, -1, 7, 8}, 0);
        //        System.out.println(root.value);
        System.out.println(solution.findAncestor(root, 7, 8));
    }

}

