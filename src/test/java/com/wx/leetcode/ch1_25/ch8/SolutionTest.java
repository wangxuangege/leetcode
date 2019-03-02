package com.wx.leetcode.ch1_25.ch8;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void myAtoi() {
        assertEquals(new Solution().myAtoi("  -123"), -123);
        assertEquals(new Solution().myAtoi("  42"), 42);
        assertEquals(new Solution().myAtoi("  +42"), 42);
        assertEquals(new Solution().myAtoi("4193 with words"), 4193);
        assertEquals(new Solution().myAtoi("-4193 with words"), -4193);
        assertEquals(new Solution().myAtoi("words and 987"), 0);
        assertEquals(new Solution().myAtoi("-91283472332"), -2147483648);
        assertEquals(new Solution().myAtoi("91283472332"), 2147483647);

    }
}