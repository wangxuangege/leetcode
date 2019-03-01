package com.wx.leetcode.ch21;

import org.junit.Assert;
import org.junit.Test;


public class SolutionTest {

    @Test
    public void mergeTwoLists() {
        ListNode l1 = initListNode(421);
        Assert.assertEquals(calculateNode(l1), 124);

        ListNode l2 = initListNode(431);
        Assert.assertEquals(calculateNode(l2), 134);

        ListNode result = new Solution().mergeTwoLists(l1, l2);
        Assert.assertEquals(calculateNode(result), 112344);

    }

    private int calculateNode(ListNode l) {
        if (l == null) {
            return 0;
        }
        int sum = 0;
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