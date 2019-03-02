package com.wx.leetcode.ch1_25.ch18;

import java.util.*;

/**
 * @author xinquan.huangxq
 */
public class Solution {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        if (nums == null || nums.length < 4) {
            return Collections.emptyList();
        }

        List<List<Integer>> result = new ArrayList<List<Integer>>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 3; ++i) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < nums.length - 2; ++j) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                int gap = target - (nums[i] + nums[j]);
                int l = j + 1;
                int h = nums.length - 1;
                while (l < h) {
                    int sum = nums[l] + nums[h];
                    if (gap > sum) {
                        l++;
                    } else if (gap < sum) {
                        h--;
                    } else {
                        result.add(Arrays.asList(nums[i], nums[j], nums[l], nums[h]));
                        while (l < h && nums[l] == nums[l + 1]) {
                            ++l;
                        }
                        while (l < h && nums[h] == nums[h - 1]) {
                            --h;
                        }
                        l++;
                    }
                }
            }
        }
        return result;
    }
}
