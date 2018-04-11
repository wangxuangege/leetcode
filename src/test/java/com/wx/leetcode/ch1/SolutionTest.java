package com.wx.leetcode.ch1;

import org.junit.Assert;

import static org.junit.Assert.*;

/**
 * @author xinquan.huangxq
 */
public class SolutionTest {

    @org.junit.Test
    public void twoSum() throws Exception {
        int[] result = new Solution().twoSum(new int[]{2, 7, 11, 15}, 9);
        Assert.assertArrayEquals(result, new int[]{0, 1});
    }

}