package com.wx.leetcode.ch7;

import com.wx.leetcode.ch7.Solution;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void reverse() {
        Assert.assertEquals(new Solution().reverse(-123), -321);
        Assert.assertEquals(new Solution().reverse(120), 21);
    }
}