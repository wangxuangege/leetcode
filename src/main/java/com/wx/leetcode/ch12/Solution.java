package com.wx.leetcode.ch12;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xinquan.huangxq
 */
public class Solution {
    public String intToRoman(int num) {
        if (num < 1 || num > 3999) {
            throw new IllegalArgumentException();
        }

        final String[] S = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        final int[] V = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};

        StringBuilder result = new StringBuilder();
        for (int i = V.length - 1; i >= 0; --i) {
            int v = V[i];
            if (num >= v) {
                int size = num / v;
                for (int j = 0; j < size; ++j) {
                    result.append(S[i]);
                }
                num = num % v;
                if (num == 0) {
                    return result.toString();
                }
            }
        }
        throw new IllegalArgumentException();
    }
}