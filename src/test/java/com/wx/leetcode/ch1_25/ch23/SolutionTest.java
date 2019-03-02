package com.wx.leetcode.ch1_25.ch23;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void mergeKLists() {
        ListNode[] lists = new ListNode[3];
        lists[0] = initListNode(541);
        lists[1] = initListNode(431);
        lists[2] = initListNode(62);
        ListNode result = new Solution().mergeKLists(lists);
        Assert.assertEquals(calculateNode(result), 11234456);
    }

    private int calculateNode(ListNode l) {
        int sum = 0;
        if (l == null) {
            return sum;
        }
        ListNode p = l;
        while (p != null) {
            sum = sum * 10 + p.val;
            p = p.next;
        }
        return sum;
    }

    private ListNode initListNode(long num) {
        ListNode result = null;
        ListNode pResult = null;

        while (num > 0) {
            ListNode newNode = new ListNode((int) num % 10);
            if (pResult == null) {
                pResult = newNode;
                result = newNode;
            } else {
                pResult.next = newNode;
                pResult = newNode;
            }
            num = num / 10;
        }

        return result;
    }
}