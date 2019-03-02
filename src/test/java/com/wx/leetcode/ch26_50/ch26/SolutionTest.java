package com.wx.leetcode.ch26_50.ch26;

import com.wx.leetcode.ch26_50.ch26.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void removeDuplicates() {
        int[] nums = new int[]{1, 1, 2};
        int length = new Solution().removeDuplicates(nums);
        Assert.assertEquals(length, 2);
        Assert.assertEquals(nums[0], 1);
        Assert.assertEquals(nums[1], 2);

        nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        length = new Solution().removeDuplicates(nums);
        Assert.assertEquals(length, 5);
        Assert.assertEquals(nums[0], 0);
        Assert.assertEquals(nums[1], 1);
        Assert.assertEquals(nums[2], 2);
        Assert.assertEquals(nums[3], 3);
        Assert.assertEquals(nums[4], 4);
    }
}