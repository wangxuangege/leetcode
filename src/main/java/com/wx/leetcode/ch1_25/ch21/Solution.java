package com.wx.leetcode.ch1_25.ch21;

public class Solution {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }

        ListNode head = null;

        ListNode p = l1;
        ListNode q = l2;
        ListNode t = null;
        while (p != null && q != null) {
            int val = Math.min(p.val, q.val);
            ListNode tmp = new ListNode(val);

            if (t == null) {
                t = tmp;
                head = t;
            } else {
                t.next = tmp;
                t = t.next;
            }

            if (p.val == val) {
                p = p.next;
            } else {
                q = q.next;
            }
        }

        ListNode other = p != null ? p : q;
        while (other != null) {
            ListNode tmp = new ListNode(other.val);

            t.next = tmp;
            t = t.next;

            other = other.next;
        }

        return head;
    }
}