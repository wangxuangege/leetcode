package com.wx.leetcode.ch24;

public class Solution {

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode p = head;
        head = head.next;

        // pre用来记录每两个之间的衔接处
        ListNode pre = null;
        while (p != null && p.next != null) {
            ListNode pFirst = p;
            ListNode pSecond = p.next;
            p = p.next.next;

            pFirst.next = pSecond.next;
            pSecond.next = pFirst;
            if (pre != null) {
                pre.next = pSecond;
            }
            pre = pFirst;
        }

        return head;
    }
}