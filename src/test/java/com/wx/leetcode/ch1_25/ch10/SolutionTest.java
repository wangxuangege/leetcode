package com.wx.leetcode.ch1_25.ch10;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void isMatch() {
        assertEquals(new Solution().isMatch("aa", "a"), false);
        assertEquals(new Solution().isMatch("aa", "a*"), true);
        assertEquals(new Solution().isMatch("ab", ".*"), true);
        assertEquals(new Solution().isMatch("aab", "c*a*b"), true);
        assertEquals(new Solution().isMatch("mississippi", "mis*is*p*."), false);
        assertEquals(new Solution().isMatch("a", ".*.a*"), true);
        assertEquals(new Solution().isMatch("a", ".*..a*"), false);
        assertEquals(new Solution().isMatch("", ".*"), true);

        assertEquals(new Solution().isMatch2("aa", "a"), false);
        assertEquals(new Solution().isMatch2("aa", "a*"), true);
        assertEquals(new Solution().isMatch2("ab", ".*"), true);
        assertEquals(new Solution().isMatch2("aab", "c*a*b"), true);
        assertEquals(new Solution().isMatch2("mississippi", "mis*is*p*."), false);
        assertEquals(new Solution().isMatch2("a", ".*.a*"), true);
        assertEquals(new Solution().isMatch2("a", ".*..a*"), false);
        assertEquals(new Solution().isMatch2("", ".*"), true);
    }
}