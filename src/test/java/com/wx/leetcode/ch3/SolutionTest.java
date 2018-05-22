package com.wx.leetcode.ch3;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author xinquan.huangxq
 */
public class SolutionTest {

    @Test
    public void lengthOfLongestSubstring() throws Exception {
        Assert.assertEquals(new Solution().lengthOfLongestSubstring("abcabcbb"), 3);
        Assert.assertEquals(new Solution().lengthOfLongestSubstring("bbbbb"), 1);
        Assert.assertEquals(new Solution().lengthOfLongestSubstring("pwwkew"), 3);
    }

}