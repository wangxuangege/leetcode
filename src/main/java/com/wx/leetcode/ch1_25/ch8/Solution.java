package com.wx.leetcode.ch1_25.ch8;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xinquan.huangxq
 */
public class Solution {

    public int myAtoi(String str) {
        if (str == null) {
            return 0;
        }

        str = str.trim();
        if (str.length() == 0) {
            return 0;
        }

        boolean flag = true;
        int sum = 0;
        if (str.charAt(0) == '-') {
            flag = false;
        } else if (str.charAt(0) == '+') {
            flag = true;
        } else if (str.charAt(0) >= '0' && str.charAt(0) <= '9') {
            sum = str.charAt(0) - '0';
        } else {
            return 0;
        }

        for (int i = 1; i < str.length(); ++i) {
            int e = str.charAt(i) - '0';
            if (e < 0 || e > 9) {
                return flag ? sum : -sum;
            }
            if (flag && (sum > Integer.MAX_VALUE / 10 || (sum == Integer.MAX_VALUE / 10 && e > 7))) {
                return Integer.MAX_VALUE;
            } else if (!flag && (sum > Integer.MAX_VALUE / 10 || (sum == Integer.MAX_VALUE / 10 && e > 8))) {
                return Integer.MIN_VALUE;
            }
            sum = sum * 10 + e;
        }

        return flag ? sum : -sum;
    }
}