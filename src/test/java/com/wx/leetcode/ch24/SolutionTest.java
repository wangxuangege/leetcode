package com.wx.leetcode.ch24;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void swapPairs() {
        ListNode l = initListNode(4321);
        ListNode result = new Solution().swapPairs(l);
        Assert.assertEquals(calculateNode(result), 2143);
    }

    private int calculateNode(ListNode l) {
        if (l == null) {
            return 0;
        }
        ListNode p = l;
        int sum = 0;
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