package com.wx.leetcode.ch1_25.ch11;

/**
 * @author xinquan.huangxq
 */
public class Solution {

    public int maxArea(int[] height) {
        if (height == null || height.length < 2) {
            return 0;
        }

        int max = 0;
        for (int i = 0; i < height.length - 1; ++i) {
            for (int j = i + 1; j < height.length; ++j) {
                max = Math.max(area(height, i, j), max);
            }
        }
        return max;
    }

    public int maxArea2(int[] height) {
        if (height == null || height.length < 2) {
            return 0;
        }

        int max = 0;
        int start = 0, end = height.length - 1;
        while (start < end) {
            max = Math.max(max, Math.min(height[start], height[end]) * (end - start));
            if (height[start] > height[end]) {
                --end;
            } else {
                ++start;
            }
        }
        return max;
    }

    private int area(int[] height, int start, int end) {
        return (end - start) * Math.min(height[end], height[start]);
    }
}
