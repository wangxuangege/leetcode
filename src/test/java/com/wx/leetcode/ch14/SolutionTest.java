package com.wx.leetcode.ch14;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void longestCommonPrefix() {
        Assert.assertEquals(new Solution().longestCommonPrefix(new String[]{"flower", "flow", "flight"}), "fl");
        Assert.assertEquals(new Solution().longestCommonPrefix(new String[]{"dog", "racecar", "car"}), "");
        Assert.assertEquals(new Solution().longestCommonPrefix(new String[]{}), "");

        Assert.assertEquals(new Solution().longestCommonPrefix2(new String[]{"flower", "flow", "flight"}), "fl");
        Assert.assertEquals(new Solution().longestCommonPrefix2(new String[]{"dog", "racecar", "car"}), "");
        Assert.assertEquals(new Solution().longestCommonPrefix2(new String[]{}), "");

        Assert.assertEquals(new Solution().longestCommonPrefix3(new String[]{"flower", "flow", "flight"}), "fl");
        Assert.assertEquals(new Solution().longestCommonPrefix3(new String[]{"dog", "racecar", "car"}), "");
        Assert.assertEquals(new Solution().longestCommonPrefix3(new String[]{}), "");
    }
}