package com.wx.leetcode.ch5;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author xinquan.huangxq
 */
public class SolutionTest {
    @Test
    public void longestPalindrome() throws Exception {
        Assert.assertEquals(new Solution().longestPalindrome("babad"), "bab");
        Assert.assertEquals(new Solution().longestPalindrome("cbbd"), "bb");
        Assert.assertEquals(new Solution().longestPalindrome("abcba"), "abcba");

        Assert.assertEquals(new Solution().longestPalindrome2("babad"), "bab");
        Assert.assertEquals(new Solution().longestPalindrome2("cbbd"), "bb");
        Assert.assertEquals(new Solution().longestPalindrome2("abcba"), "abcba");

        //Assert.assertEquals(new Solution().longestPalindrome3("babad"), "bab");
        Assert.assertEquals(new Solution().longestPalindrome3("cbbd"), "bb");
        Assert.assertEquals(new Solution().longestPalindrome3("abcba"), "abcba");
    }

}