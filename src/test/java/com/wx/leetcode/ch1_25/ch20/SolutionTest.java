package com.wx.leetcode.ch1_25.ch20;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void isValid() {
        Assert.assertEquals(new Solution().isValid("()"), true);
        Assert.assertEquals(new Solution().isValid("()[]{}"), true);
        Assert.assertEquals(new Solution().isValid("(]"), false);
        Assert.assertEquals(new Solution().isValid("([)]"), false);
        Assert.assertEquals(new Solution().isValid("{[]}"), true);

    }
}