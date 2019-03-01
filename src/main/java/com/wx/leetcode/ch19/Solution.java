package com.wx.leetcode.ch19;

public class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || n < 0) {
            throw new IllegalArgumentException("参数错误");
        }
        if (n == 0) {
            return head;
        }

        ListNode pre = new ListNode(-1);
        pre.next = head;

        ListNode p = pre;
        int k = 0;
        while (p != null && k < n) {
            p = p.next;
            ++k;
        }

        if (k < n) {
            throw new IllegalArgumentException("链表不足" + n + "个节点");
        }

        ListNode q = pre;
        while (p.next != null) {
            p = p.next;
            q = q.next;
        }
        q.next = q.next.next;
        return pre.next;
    }
}