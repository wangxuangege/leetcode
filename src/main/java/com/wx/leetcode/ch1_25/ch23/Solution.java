package com.wx.leetcode.ch1_25.ch23;

public class Solution {

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        if (lists.length == 1) {
            return lists[0];
        }

        ListNode result = null;
        ListNode p = null;

        ListNode[] headLists = new ListNode[lists.length];
        for (int i = 0; i < lists.length; ++i) {
            headLists[i] = new ListNode(0);
            headLists[i].next = lists[i];
        }

        while (true) {
            int min = Integer.MAX_VALUE;
            ListNode minHeadNode = null;
            for (int i = 0; i < headLists.length; ++i) {
                if (headLists[i].next != null && headLists[i].next.val < min) {
                    min = headLists[i].next.val;
                    minHeadNode = headLists[i];
                }
            }

            if (minHeadNode == null) {
                break;
            }

            minHeadNode.next = minHeadNode.next.next;

            ListNode tmp = new ListNode(min);
            if (p == null) {
                result = tmp;
                p = tmp;
            } else {
                p.next = tmp;
                p = tmp;
            }

        }
        return result;
    }
}