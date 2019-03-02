package com.wx.leetcode.ch1_25.ch2;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author xinquan.huangxq
 */
public class SolutionTest {

    @Test
    public void addTwoNumbers() throws Exception {
        ListNode l1 = initListNode(342);
        ListNode l2 = initListNode(465);

        ListNode result = new Solution().addTwoNumbers(l1, l2);
        Assert.assertEquals(result.val, 7);
        Assert.assertEquals(result.next.val, 0);
        Assert.assertEquals(result.next.next.val, 8);
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