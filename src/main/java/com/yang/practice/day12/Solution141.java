package com.yang.practice.day12;

/**
 * https://leetcode-cn.com/problems/linked-list-cycle/
 * <p>
 * Created by yangguojun01 on 2020/3/14.
 */
public class Solution141 {

    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (slow != null && fast != null && fast.next != null) {
            //慢指针每次走一步
            slow = slow.next;
            //快指针每次走两步
            fast = fast.next.next;
            //判断是否为同一节点
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

}
