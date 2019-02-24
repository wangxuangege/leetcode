package com.wx.leetcode.ch1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xinquan.huangxq
 */
public class Solution {

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; ++i) {
            for (int j = i + 1; j < nums.length; ++j) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> elementMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
            elementMap.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; ++i) {
            int element = target - nums[i];
            if (elementMap.containsKey(element) && elementMap.get(element) != i) {
                return new int[] { i, elementMap.get(element) };
            }
        }
        return new int[]{-1, -1};
    }
}
