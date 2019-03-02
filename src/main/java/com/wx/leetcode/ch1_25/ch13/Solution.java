package com.wx.leetcode.ch1_25.ch13;

/**
 * @author xinquan.huangxq
 */
public class Solution {
    public int romanToInt(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int result = 0;
        for (int i = 0; i < s.length(); ) {
            int l = getV(s.charAt(i));
            if (l == -1) {
                throw new IllegalArgumentException("非法的罗马数字:" + s);
            }
            if (i + 1 >= s.length()) {
                result += l;
                break;
            }

            int r = getV(s.charAt(i + 1));
            if (r == -1) {
                throw new IllegalArgumentException("非法的罗马数字:" + s);
            }
            if (l >= r) {
                result += l;
                ++i;
            } else {
                if (!beforeLR(l, r)) {
                    throw new IllegalArgumentException("非法的罗马数字:" + s);
                }
                result += r - l;
                i += 2;
            }
        }

        return result;
    }

    private static int getV(char c) {
        return c == 'I' ? 1
                : (c == 'V' ? 5
                : (c == 'X' ? 10
                : (c == 'L' ? 50
                : (c == 'C' ? 100
                : (c == 'D' ? 500
                : (c == 'M' ? 1000 : -1))))));
    }

    private static boolean beforeLR(int l, int r) {
        if (l == 1) {
            return r == 5 || r == 10;
        } else if (l == 10) {
            return r == 50 || r == 100;
        } else if (l == 100) {
            return r == 500 || r == 1000;
        }
        return false;
    }
}