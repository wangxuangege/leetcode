package com.wx.leetcode.ch8;

import com.wx.leetcode.ch8.Solution;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void myAtoi() {
        Assert.assertEquals(new Solution().myAtoi("  -123"), -123);
        Assert.assertEquals(new Solution().myAtoi("  42"), 42);
        Assert.assertEquals(new Solution().myAtoi("  +42"), 42);
        Assert.assertEquals(new Solution().myAtoi("4193 with words"), 4193);
        Assert.assertEquals(new Solution().myAtoi("-4193 with words"), -4193);
        Assert.assertEquals(new Solution().myAtoi("words and 987"), 0);
        Assert.assertEquals(new Solution().myAtoi("-91283472332"), -2147483648);
        Assert.assertEquals(new Solution().myAtoi("91283472332"), 2147483647);

    }
}