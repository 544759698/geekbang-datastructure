package com.yang.practice.day3;

/**
 * https://leetcode-cn.com/problems/merge-two-sorted-lists/
 * <p>
 * Created by yangguojun01 on 2020/3/5.
 */
public class Solution21 {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode start = l1.val <= l2.val ? l1 : l2;
        ListNode curNode = start;
        if (l1.val <= l2.val) {
            l1 = l1.next;
        } else {
            l2 = l2.next;
        }
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                curNode.next = l1;
                curNode = curNode.next;
                l1 = l1.next;
            } else {
                curNode.next = l2;
                curNode = curNode.next;
                l2 = l2.next;
            }
        }
        curNode.next = l1 == null ? l2 : l1;
        return start;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        print(l1);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        print(l2);
        ListNode start = mergeTwoLists(l1, l2);
        print(start);
    }

    private static void print(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }

}
