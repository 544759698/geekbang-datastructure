package com.yang.algorithm.day28;

import java.util.Stack;

/**
 * https://leetcode-cn.com/problems/implement-queue-using-stacks/
 * <p>
 * Created by yangguojun01 on 2020/4/11.
 */
public class MyQueue {

    Stack<Integer> s1;
    Stack<Integer> s2;
    boolean lastIsPop;

    /**
     * Initialize your data structure here.
     */
    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
        lastIsPop = false;
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        if (lastIsPop) {
            move(s1, s2);
        }
        if (s1.isEmpty()) {
            s2.push(x);
        } else {
            s1.push(x);
        }
        lastIsPop = false;
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        if (empty()) {
            return -1;
        }
        if (!lastIsPop) {
            move(s1, s2);
        }
        lastIsPop = true;
        return s1.isEmpty() ? s2.pop() : s1.pop();
    }

    /**
     * Get the front element.
     */
    public int peek() {
        if (empty()) {
            return -1;
        }
        if (!lastIsPop) {
            move(s1, s2);
        }
        lastIsPop = true;
        return s1.isEmpty() ? s2.peek() : s1.peek();
    }

    private void move(Stack s1, Stack s2) {
        if (!s1.isEmpty()) {
            while (!s1.isEmpty()) {
                Integer x = (Integer) s1.pop();
                s2.push(x);
            }
            return;
        }
        if (!s2.isEmpty()) {
            while (!s2.isEmpty()) {
                Integer x = (Integer) s2.pop();
                s1.push(x);
            }
        }
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }

}
