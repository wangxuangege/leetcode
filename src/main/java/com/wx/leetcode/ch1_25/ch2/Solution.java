package com.wx.leetcode.ch1_25.ch2;

/**
 * @author xinquan.huangxq
 */
public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;
        ListNode pResult = null;

        int upgrade = 0;
        ListNode p = l1, q = l2;
        while (p != null || q != null || upgrade > 0) {
            int currentVal = upgrade + (p != null ? p.val : 0) + (q != null ? q.val : 0);
            upgrade = currentVal / 10;
            ListNode newNode = new ListNode(currentVal - upgrade * 10);
            if (pResult == null) {
                pResult = newNode;
                result = newNode;
            } else {
                pResult.next = newNode;
                pResult = pResult.next;
            }
            if (p != null) {
                p = p.next;
            }
            if (q != null) {
                q = q.next;
            }
        }

        return result;
    }
}
