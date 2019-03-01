package com.wx.leetcode.ch20;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

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