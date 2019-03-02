package com.wx.leetcode.ch1_25.ch12;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void intToRoman() {
        assertEquals(new Solution().intToRoman(3), "III");
        assertEquals(new Solution().intToRoman(4), "IV");
        assertEquals(new Solution().intToRoman(9), "IX");
        assertEquals(new Solution().intToRoman(58), "LVIII");
        assertEquals(new Solution().intToRoman(1994), "MCMXCIV");
    }
}