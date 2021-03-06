package com.yang.practice.day39;

import java.util.Stack;

/**
 * Created by yangguojun01 on 2020/5/23.
 */
public class MyQueue {

    // 主存储
    private Stack<Integer> s1;
    private Stack<Integer> s2;
    private int front;

    /**
     * Initialize your data structure here.
     */
    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        if (s1.isEmpty()) {
            front = x;
        }
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        s2.push(x);
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        int ret = s1.pop();
        if (!s1.isEmpty()) {
            front = s1.peek();
        }
        return ret;
    }

    private void swapStack(Stack source, Stack target) {
        while (!source.isEmpty()) {
            target.push(source.pop());
        }
    }

    /**
     * Get the front element.
     */
    public int peek() {
        return front;
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return s1.isEmpty();
    }
}
