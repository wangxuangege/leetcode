package com.wx.leetcode.ch10;

/**
 * @author xinquan.huangxq
 */
public class Solution {

    public boolean isMatch(String s, String p) {
        if (s == null || p == null) {
            return false;
        }
        return isMatch(s, p, s.length() - 1, p.length() - 1);
    }

    public boolean isMatch(String s, String p, int i, int j) {
        if (j < 0 && i >= 0) {
            return false;
        }

        if (i < 0 && j < 0) {
            return true;
        }

        if (i < 0) {
            return j != 0 && p.charAt(j) == '*' && isMatch(s, p, i, j - 2);
        }

        if (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.') {
            return isMatch(s, p, i - 1, j - 1);
        }

        if (j >= 1 && p.charAt(j) == '*' && p.charAt(j - 1) == '.') {
            return isMatch(s, p, i, j - 2) || isMatch(s, p, i - 1, j);
        }

        if (j >= 1 && p.charAt(j) == '*' && s.charAt(i) != p.charAt(j - 1)) {
            return isMatch(s, p, i, j - 2);
        }

        if (j >= 1 && p.charAt(j) == '*' && s.charAt(i) == p.charAt(j - 1)) {
            return isMatch(s, p, i - 1, j)
                    || isMatch(s, p, i, j - 1)
                    || isMatch(s, p, i - 1, j - 1)
                    || isMatch(s, p, i - 1, j - 2)
                    || isMatch(s, p, i, j - 2);
        }

        return false;
    }
}