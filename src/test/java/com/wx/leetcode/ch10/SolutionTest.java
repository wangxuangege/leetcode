package com.wx.leetcode.ch10;

import com.wx.leetcode.ch10.Solution;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void isMatch() {
        Assert.assertEquals(new Solution().isMatch("aa", "a"), false);
        Assert.assertEquals(new Solution().isMatch("aa", "a*"), true);
        Assert.assertEquals(new Solution().isMatch("ab", ".*"), true);
        Assert.assertEquals(new Solution().isMatch("aab", "c*a*b"), true);
        Assert.assertEquals(new Solution().isMatch("mississippi", "mis*is*p*."), false);
        Assert.assertEquals(new Solution().isMatch("a", ".*.a*"), true);
        Assert.assertEquals(new Solution().isMatch("a", ".*..a*"), false);
        Assert.assertEquals(new Solution().isMatch("", ".*"), true);
    }
}