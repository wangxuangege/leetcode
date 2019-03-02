package com.wx.leetcode.ch1_25.ch6;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void convert() {
        assertEquals(new Solution().convert("LEETCODEISHIRING", 3), "LCIRETOESIIGEDHN");
        assertEquals(new Solution().convert("LEETCODEISHIRING", 4), "LDREOEIIECIHNTSG");
    }

}