package com.wx.leetcode.ch1_25.ch16;

import java.util.Arrays;

/**
 * @author xinquan.huangxq
 */
public class Solution {

    public int threeSumClosest(int[] nums, int target) {
        if (nums == null || nums.length < 3) {
            throw new IllegalArgumentException("参数错误");
        }

        Arrays.sort(nums);

        int gap = Math.abs(nums[0] + nums[1] + nums[2] - target);
        int r1 = 0, r2 = 1, r3 = 2;
        for (int i = 0; i < nums.length - 2; ++i) {
            int near = target - nums[i];
            int l = i + 1, h = nums.length - 1;
            while (l < h) {
                int sum = nums[l] + nums[h];
                if (sum == near) {
                    return target;
                }

                int abs = Math.abs(sum - near);
                if (gap > abs) {
                    gap = abs;

                    r1 = i;
                    r2 = l;
                    r3 = h;
                }

                if (sum > near) {
                    --h;
                } else {
                    ++l;
                }
            }
        }
        return nums[r1] + nums[r2] + nums[r3];
    }
}