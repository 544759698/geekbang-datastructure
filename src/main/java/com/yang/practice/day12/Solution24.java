package com.yang.practice.day12;

/**
 * https://leetcode-cn.com/problems/swap-nodes-in-pairs/
 * <p>
 * Created by yangguojun01 on 2020/3/14.
 */
public class Solution24 {

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode ret = head.next;
        ListNode pre = null;
        ListNode tmp;
        while (head != null && head.next != null) {
            tmp = head.next;
            head.next = head.next.next;
            tmp.next = head;
            if (pre != null) {
                pre.next = tmp;
            }
            pre = head;
            head = head.next;
        }
        return ret;
    }

}
