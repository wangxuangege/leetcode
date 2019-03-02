package com.wx.leetcode.ch1_25.ch11;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void maxArea() {
        Assert.assertEquals(new Solution().maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}), 49);
        Assert.assertEquals(new Solution().maxArea(new int[]{2,3,4,5,18,17,6}), 17);

        Assert.assertEquals(new Solution().maxArea2(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}), 49);
        Assert.assertEquals(new Solution().maxArea2(new int[]{2,3,4,5,18,17,6}), 17);
    }
}