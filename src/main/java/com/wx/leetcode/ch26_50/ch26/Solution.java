package com.wx.leetcode.ch26_50.ch26;

public class Solution {

    public int removeDuplicates(int[] nums) {
        if (nums == null) {
            return 0;
        }

        if (nums.length == 0) {
            return 0;
        }

        int k = 1;
        int before = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] != before) {
                nums[k++] = nums[i];
                before = nums[i];
            }
        }
        return k;
    }
}
