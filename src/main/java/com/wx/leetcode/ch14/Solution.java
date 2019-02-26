package com.wx.leetcode.ch14;

/**
 * @author xinquan.huangxq
 */
public class Solution {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }

        int k = 0;
        while (k < strs[0].length()) {
            char ch = strs[0].charAt(k);
            for (int i = 1; i < strs.length; ++i) {
                if (k == strs[i].length() || strs[i].charAt(k) != ch) {
                    return strs[0].substring(0, k);
                }
            }
            ++k;
        }
        return strs[0];
    }

    public String longestCommonPrefix2(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        if (strs.length == 1) {
            return strs[0];
        }

        String str = strs[0];
        for (int i = 1; i < strs.length; ++i) {
            int index = longestCommonIndex(str, strs[i]);
            if (index == -1) {
                return "";
            }
            str = str.substring(0, index + 1);
        }
        return str;
    }

    private int longestCommonIndex(String left, String right) {
        int i = 0;
        while (i < left.length() && i < right.length()) {
            if (left.charAt(i) != right.charAt(i)) {
                return i - 1;
            }
            ++i;
        }
        return Math.min(left.length(), right.length()) - 1;
    }

    public String longestCommonPrefix3(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        if (strs.length == 1) {
            return strs[0];
        }

        return longestCommonPrefix3(strs, 0, strs.length - 1);
    }

    private String longestCommonPrefix3(String[] strs, int i, int j) {
        if (i == j) {
            return strs[i];
        }

        if (j - i == 1) {
            int index = longestCommonIndex(strs[i], strs[j]);
            return index == -1 ? "" : strs[i].substring(0, index + 1);
        }

        int mid = (i + j) / 2;
        String left = longestCommonPrefix3(strs, i, mid);
        String right = longestCommonPrefix3(strs, mid + 1, j);
        if (left == "" || right == "") {
            return "";
        }
        int index = longestCommonIndex(left, right);
        return index == -1 ? "" : left.substring(0, index + 1);
    }


}