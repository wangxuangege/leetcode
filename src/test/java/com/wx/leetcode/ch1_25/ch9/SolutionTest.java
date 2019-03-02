package com.wx.leetcode.ch1_25.ch9;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void isPalindrome() {
        Assert.assertEquals(new Solution().isPalindrome(121), true);
        Assert.assertEquals(new Solution().isPalindrome(-121), false);
        Assert.assertEquals(new Solution().isPalindrome(10), false);

    }
}