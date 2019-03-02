package com.wx.leetcode.ch1_25.ch10;

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

    public boolean isMatch2(String s, String p) {
        if (s == null || p == null) {
            return false;
        }

        int sLen = s.length();
        int pLen = p.length();
        // 多1的原因是考虑其中一个遍历完成，为空状态下的匹配
        boolean sp[][] = new boolean[sLen + 1][pLen + 1];

        s = ' ' + s;
        p = ' ' + p;

        sp[0][0] = true;
        for (int i = 1; i <= sLen; ++i) {
            sp[i][0] = false;
        }
        for (int i = 1; i <= pLen; ++i) {
            if (i % 2 == 0) {
                sp[0][i] = p.charAt(i) == '*' && (i == 2 || sp[0][i - 2]);
            } else {
                sp[0][i] = false;
            }
        }

        for (int i = 1; i <= sLen; ++i) {
            for (int j = 1; j <= pLen; ++j) {
                if (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.') {
                    sp[i][j] = sp[i - 1][j - 1];
                } else if (p.charAt(j) == '*') {
                    if (j <= 1) {
                        // 格式不对
                        sp[i][j] = false;
                    } else if (p.charAt(j - 1) == '.') {
                        sp[i][j] = sp[i][j - 2] || sp[i - 1][j];
                    } else if (s.charAt(i) != p.charAt(j - 1)) {
                        sp[i][j] = sp[i][j - 2];
                    } else if (s.charAt(i) == p.charAt(j - 1)) {
                        sp[i][j] = i >= 1 && sp[i - 1][j] || sp[i][j - 1] || sp[i - 1][j - 1] || sp[i - 1][j - 2] || sp[i][j - 2];
                    }
                } else {
                    sp[i][j] = false;
                }
            }
        }

        return sp[sLen][pLen];
    }
}