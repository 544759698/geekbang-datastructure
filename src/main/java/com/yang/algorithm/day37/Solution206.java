package com.yang.algorithm.day37;

/**
 * Created by yangguojun01 on 2020/5/18.
 */
public class Solution206 {

    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTmp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = nextTmp;
        }
        return pre;
    }

}
