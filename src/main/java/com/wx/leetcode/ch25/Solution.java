package com.wx.leetcode.ch25;

public class Solution {

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) {
            return null;
        }

        ListNode p = head;
        ListNode pre = null;

        // 先置空，后面再赋值
        head = null;

        ListNode[] a = new ListNode[k];
        while (true) {
            for (int i = 0; i < k; ++i, p = p.next) {
                a[i] = p;
                if (p == null) {
                    return head == null ? a[0] : head;
                }
            }
            if (head == null) {
                // 只有第一次需要赋值
                head = a[k - 1];
            }

            ListNode next = a[k - 1].next;
            for (int i = k - 1; i >= 1; --i) {
                a[i].next = a[i - 1];
            }
            a[0].next = next;

            if (pre != null) {
                pre.next = a[k - 1];
            }
            pre = a[0];

            p = pre.next;
        }
    }
}