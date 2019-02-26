package com.wx.leetcode.ch15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author xinquan.huangxq
 */
public class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3) {
            return Collections.emptyList();
        }

        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (int i = 0; i < nums.length - 2; ++i) {
            if (nums[i] > 0) {
                // 第一个正数，肯定不可能加起来为0，可以直接退出
                break;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                // 之前计算过此种情况
                continue;
            }
            int total = 0 - nums[i];
            int l = i + 1, h = nums.length - 1;
            // 用来排重
            Integer bl = null;
            while (l < h) {
                if (nums[l] + nums[h] == total && (bl == null || bl != nums[l])) {
                    bl = nums[l];

                    List<Integer> e = new ArrayList<Integer>();
                    e.add(nums[i]);
                    e.add(nums[l]);
                    e.add(nums[h]);
                    result.add(e);
                    ++l;
                } else if (nums[l] + nums[h] > total) {
                    --h;
                } else {
                    ++l;
                }
            }
        }
        return result;
    }
}