package com.wx.leetcode.ch4;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author xinquan.huangxq
 */
public class SolutionTest {
    @Test
    public void findMedianSortedArrays() throws Exception {
        Assert.assertEquals(new Solution().findMedianSortedArrays(new int[] {1, 3}, new int[] {2}), 2.0, 0.0001);
        Assert.assertEquals(new Solution().findMedianSortedArrays(new int[] {1, 2}, new int[] {3, 4}), 2.5, 0.0001);
    }

}