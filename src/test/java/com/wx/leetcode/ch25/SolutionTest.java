package com.wx.leetcode.ch25;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void reverseKGroup() {
        ListNode l = initListNode(54321);
        Assert.assertEquals(calculateNode(new Solution().reverseKGroup(l, 2)), 21435);
        ListNode l2 = initListNode(54321);
        Assert.assertEquals(calculateNode(new Solution().reverseKGroup(l2, 3)), 32145);
    }


    private int calculateNode(ListNode l) {
        if (l == null) {
            return 0;
        }
        ListNode p = l;
        int sum = 0;
        while (p != null) {
            sum = p.val + sum * 10;
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