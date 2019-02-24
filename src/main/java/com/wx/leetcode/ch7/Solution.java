package com.wx.leetcode.ch7;

/**
 * @author xinquan.huangxq
 */
public class Solution {

    /**
     * 2^31-1=2147483647,-2^31=-2147483648
     *
     * @param x
     * @return
     */
    public int reverse(int x) {
        long result = 0;

        boolean flag = x > 0;
        x = x > 0 ? x : -x;

        while (x > 0) {
            result = result * 10 + x % 10;
            x = x / 10;
        }

        if (flag && result > Integer.MAX_VALUE) {
            return 0;
        } else if (!flag && result > ((long) Integer.MAX_VALUE) + 1) {
            return 0;
        }

        return (int) (flag ? result : -result);
    }
}
