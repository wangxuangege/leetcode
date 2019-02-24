package com.wx.leetcode.ch9;

import com.wx.leetcode.ch9.Solution;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void isPalindrome() {
        Assert.assertEquals(new Solution().isPalindrome(121), true);
        Assert.assertEquals(new Solution().isPalindrome(-121), false);
        Assert.assertEquals(new Solution().isPalindrome(10), false);

    }
}