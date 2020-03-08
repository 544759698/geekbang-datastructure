package com.yang.algorithm.day6;

/**
 * https://leetcode-cn.com/problems/reverse-linked-list/
 * <p>
 * Created by yangguojun01 on 2020/3/8.
 */
public class Solution206 {

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

}
