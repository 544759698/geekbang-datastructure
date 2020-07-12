package com.yang.practice.day7;

/**
 * https://leetcode-cn.com/problems/design-circular-queue/
 * <p>
 * Created by yangguojun01 on 2020/3/9.
 */
public class MyCircularQueue622 {

    private int[] data;
    private int head;
    private int tail;
    private int count;
    private int capacity;

    /**
     * Initialize your data structure here. Set the size of the queue to be k.
     */
    public MyCircularQueue622(int k) {
        data = new int[k];
        head = 0;
        tail = 0;
        capacity = k;
        count = 0;
    }

    /**
     * Insert an element into the circular queue. Return true if the operation is successful.
     */
    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        if (tail == data.length) {
            tail = 0;
        }
        data[tail] = value;
        tail++;
        count++;
        return true;
    }

    /**
     * Delete an element from the circular queue. Return true if the operation is successful.
     */
    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        if (head == data.length) {
            head = 0;
        }
        data[head] = 0;
        head++;
        count--;
        return true;
    }

    /**
     * Get the front item from the queue.
     */
    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        return data[head];
    }

    /**
     * Get the last item from the queue.
     */
    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        return data[tail - 1];
    }

    /**
     * Checks whether the circular queue is empty or not.
     */
    public boolean isEmpty() {
        return count == 0;
    }

    /**
     * Checks whether the circular queue is full or not.
     */
    public boolean isFull() {
        return count == capacity;
    }

    public static void main(String[] args) {
        MyCircularQueue622 circularQueue = new MyCircularQueue622(3); // 设置长度为 3

        circularQueue.enQueue(1); // 返回 true

        circularQueue.enQueue(2); // 返回 true

        circularQueue.enQueue(3); // 返回 true

        circularQueue.enQueue(4); // 返回 false，队列已满

        circularQueue.Rear(); // 返回 3

        circularQueue.isFull(); // 返回 true

        circularQueue.deQueue(); // 返回 true

        circularQueue.enQueue(4); // 返回 true

        circularQueue.Rear(); // 返回 4
    }
}
