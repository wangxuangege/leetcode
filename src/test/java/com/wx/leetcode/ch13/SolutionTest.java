package com.wx.leetcode.ch13;

import com.wx.leetcode.ch13.Solution;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void romanToInt() {
        Assert.assertEquals(new Solution().romanToInt("III"), 3);
        Assert.assertEquals(new Solution().romanToInt("IV"), 4);
        Assert.assertEquals(new Solution().romanToInt("IX"), 9);
        Assert.assertEquals(new Solution().romanToInt("LVIII"), 58);
        Assert.assertEquals(new Solution().romanToInt("MCMXCIV"), 1994);
    }
}