package com.wx.leetcode.ch11;

import com.wx.leetcode.ch11.Solution;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void maxArea() {
        Assert.assertEquals(new Solution().maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}), 49);
        Assert.assertEquals(new Solution().maxArea(new int[]{2,3,4,5,18,17,6}), 17);

        Assert.assertEquals(new Solution().maxArea2(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}), 49);
        Assert.assertEquals(new Solution().maxArea2(new int[]{2,3,4,5,18,17,6}), 17);
    }
}