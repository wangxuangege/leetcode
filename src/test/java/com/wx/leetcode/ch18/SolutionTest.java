package com.wx.leetcode.ch18;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void fourSum() {
        System.out.println(new Solution().fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0));
        System.out.println(new Solution().fourSum(new int[]{0, 0, 0, 0}, 0));
        System.out.println(new Solution().fourSum(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0}, 0));
    }
}