package com.yang.practice.day38;

import java.util.HashMap;

/**
 * https://leetcode-cn.com/problems/swap-nodes-in-pairs/
 *
 * Created by yangguojun01 on 2020/5/19.
 */
public class Solution24 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = new ListNode(-1);
        pre.next = head;
        ListNode ret = head.next;
        while (head != null && head.next != null) {
            ListNode l1 = head;
            ListNode l2 = head.next;
            pre.next = l2;
            l1.next = l2.next;
            l2.next = l1;
            pre = l1;
            head = head.next;
            HashMap<Integer,Integer> map = new HashMap<>();
            map.containsKey(1);
            map.get(1);
        }
        return ret;
    }
}
