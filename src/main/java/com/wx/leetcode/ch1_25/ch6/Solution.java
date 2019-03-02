package com.wx.leetcode.ch1_25.ch6;

/**
 * @author xinquan.huangxq
 */
public class Solution {

    public String convert(String s, int numRows) {
        if (s == null || s.length() == 0 || numRows <= 1) {
            return s;
        }

        StringBuilder r = new StringBuilder();
        int gap = (numRows - 1) * 2;
        for (int i = 0; i < numRows; ++i) {
            for (int j = i; j < s.length() + gap; j += gap) {
                if (i == 0 && j < s.length()) {
                    r.append(s.charAt(j));
                } else {
                    if (j - 2 * i > j - gap && j - 2 * i >= 0 && j - 2 * i < s.length()) {
                        r.append(s.charAt(j - 2 * i));
                    }
                    if (j < s.length()) {
                        r.append(s.charAt(j));
                    }
                }
            }
        }

        return r.toString();
    }
}
