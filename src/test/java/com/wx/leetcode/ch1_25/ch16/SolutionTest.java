package com.wx.leetcode.ch1_25.ch16;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void threeSumClosest() {
        Assert.assertEquals(new Solution().threeSumClosest(new int[]{-1, 2, 1, -4}, 1), 2);
        Assert.assertEquals(new Solution().threeSumClosest(new int[]{1, 1, 1, 0}, 100), 3);
    }
}