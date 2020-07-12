package com.yang.practice.day10;

/**
 * https://leetcode-cn.com/problems/add-two-numbers/
 * <p>
 * Created by yangguojun01 on 2020/3/12.
 */
public class Solution2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode preHead = new ListNode(0);
        int carry = 0;
        ListNode curr = preHead;
        while (l1 != null || l2 != null) {
            int sum = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + carry;
            carry = sum / 10;
            ListNode tmp = new ListNode(sum % 10);
            curr.next = tmp;
            curr = tmp;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }

        return preHead.next;
    }

}
