package com.wx.leetcode.ch12;

import com.wx.leetcode.ch12.Solution;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void intToRoman() {
        Assert.assertEquals(new Solution().intToRoman(3), "III");
        Assert.assertEquals(new Solution().intToRoman(4), "IV");
        Assert.assertEquals(new Solution().intToRoman(9), "IX");
        Assert.assertEquals(new Solution().intToRoman(58), "LVIII");
        Assert.assertEquals(new Solution().intToRoman(1994), "MCMXCIV");
    }
}