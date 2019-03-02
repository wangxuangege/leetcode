package com.wx.leetcode.ch1_25.ch13;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void romanToInt() {
        assertEquals(new Solution().romanToInt("III"), 3);
        assertEquals(new Solution().romanToInt("IV"), 4);
        assertEquals(new Solution().romanToInt("IX"), 9);
        assertEquals(new Solution().romanToInt("LVIII"), 58);
        assertEquals(new Solution().romanToInt("MCMXCIV"), 1994);
    }
}