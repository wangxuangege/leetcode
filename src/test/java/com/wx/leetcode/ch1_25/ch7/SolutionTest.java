package com.wx.leetcode.ch1_25.ch7;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void reverse() {
        Assert.assertEquals(new Solution().reverse(-123), -321);
        Assert.assertEquals(new Solution().reverse(120), 21);
    }
}