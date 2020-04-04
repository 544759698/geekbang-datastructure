package com.yang.algorithm.day26;

/**
 * https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/
 * <p>
 * Created by yangguojun01 on 2020/4/4.
 */
public class Solution19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int last = 0;
        ListNode curr = head;
        ListNode beforeN = head;
        while (curr != null) {
            last++;
            if (last > n + 1) {
                beforeN = beforeN.next;
            }
            curr = curr.next;
        }
        if (last == n) {
            return head.next;
        }
        beforeN.next = beforeN.next.next;
        return head;
    }

}
