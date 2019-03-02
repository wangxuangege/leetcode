package com.wx.leetcode.ch1_25.ch4;


import java.util.ArrayList;
import java.util.List;

/**
 * @author xinquan.huangxq
 */
public class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<Integer>(nums1.length + nums2.length);
        int i = 0;
        int j = 0;
        while (i < nums1.length || j < nums2.length) {
            if (i < nums1.length && j < nums2.length) {
                if (nums1[i] <= nums2[j]) {
                    list.add(nums1[i++]);
                } else {
                    list.add(nums2[j++]);
                }
            } else if (i >= nums1.length) {
                while (j < nums2.length) {
                    list.add(nums2[j++]);
                }
            } else {
                while (i < nums1.length) {
                    list.add(nums1[i++]);
                }
            }
        }
        return list.size() % 2 == 0
                ? (list.get(list.size() / 2) + list.get(list.size() / 2 - 1)) / 2.0
                : list.get(list.size() / 2);
    }
}

