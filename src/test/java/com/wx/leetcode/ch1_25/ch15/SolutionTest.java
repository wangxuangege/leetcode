package com.wx.leetcode.ch1_25.ch15;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void threeSum() {
        System.out.println(new Solution().threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
        System.out.println(new Solution().threeSum(new int[]{0, 0, 0}));
        System.out.println(new Solution().threeSum(new int[]{0, 0, 0, 0}));
        System.out.println(new Solution().threeSum(new int[]{-1, 0, 1, 0}));
    }
}