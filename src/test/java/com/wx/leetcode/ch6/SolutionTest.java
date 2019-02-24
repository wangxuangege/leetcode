package com.wx.leetcode.ch6;

import com.wx.leetcode.ch6.Solution;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void convert() {
        Assert.assertEquals(new Solution().convert("LEETCODEISHIRING", 3), "LCIRETOESIIGEDHN");
        Assert.assertEquals(new Solution().convert("LEETCODEISHIRING", 4), "LDREOEIIECIHNTSG");
    }

}