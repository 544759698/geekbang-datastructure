package com.yang.algorithm.day26;

/**
 * Created by yangguojun01 on 2020/4/4.
 */
public class ReverseList {

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode pre = null;
        while (head != null) {
            ListNode tmp = head.next;
            head.next = pre;
            pre = head;
            head = tmp;
        }
        return pre;
    }

}
