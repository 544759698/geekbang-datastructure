package com.bit.tiger;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Author: yangguojun01
 * @Date: 2020/6/26
 */
public class PreorderTraversalSolution {

    public List<Integer> preorderTraversal(Node root) {
        List<Integer> ret = new ArrayList<>();
        // 换成队列会变成广度优先遍历
        Stack<Element> stack = new Stack<>();
        stack.push(new Element(0, root));
        while (!stack.isEmpty()) {
            Element e = stack.pop();
            if (e.node == null) {
                continue;
            }
            if (e.type == 0) {
                // 栈后进先出，这里写成相反的
                stack.push(new Element(0, e.node.right));
                stack.push(new Element(0, e.node.left));
                stack.push(new Element(1, e.node));
            } else {
                ret.add(e.node.value);
            }
        }
        return ret;
    }

    private class Element {
        int type;// 0 visit 1 output
        Node node;

        Element(int type, Node node) {
            this.type = type;
            this.node = node;
        }
    }

    public static void main(String[] args) {
        CommonAncestorSolution helper = new CommonAncestorSolution();
        Node root = helper.buildTree(new int[] {1, 2, 3, -1, 4, 5, 6, -1, -1, 7, 8}, 0);
        PreorderTraversalSolution solution = new PreorderTraversalSolution();
        List<Integer> ret = solution.preorderTraversal(root);
        for (Integer num : ret) {
            System.out.println(num);
        }
    }
}
