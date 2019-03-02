package com.wx.leetcode.ch1_25.ch5;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author xinquan.huangxq
 */
public class SolutionTest {
    @Test
    public void longestPalindrome() throws Exception {
        assertEquals(new Solution().longestPalindrome("babad"), "bab");
        assertEquals(new Solution().longestPalindrome("cbbd"), "bb");
        assertEquals(new Solution().longestPalindrome("abcba"), "abcba");

        assertEquals(new Solution().longestPalindrome2("babad"), "bab");
        assertEquals(new Solution().longestPalindrome2("cbbd"), "bb");
        assertEquals(new Solution().longestPalindrome2("abcba"), "abcba");

        //Assert.assertEquals(new Solution().longestPalindrome3("babad"), "bab");
        assertEquals(new Solution().longestPalindrome3("cbbd"), "bb");
        assertEquals(new Solution().longestPalindrome3("abcba"), "abcba");
    }

}