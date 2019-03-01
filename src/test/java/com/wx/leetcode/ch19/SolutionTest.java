package com.wx.leetcode.ch19;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void removeNthFromEnd() {
        ListNode head = initListNode(54321);
        ListNode result = new Solution().removeNthFromEnd(head, 2);
        Assert.assertEquals(result.val, 1);
        Assert.assertEquals(result.next.val, 2);
        Assert.assertEquals(result.next.next.val, 3);
        Assert.assertEquals(result.next.next.next.val, 5);

        ListNode head2 = initListNode(1);
        ListNode result2 = new Solution().removeNthFromEnd(head2, 1);
        Assert.assertEquals(result2, null);
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