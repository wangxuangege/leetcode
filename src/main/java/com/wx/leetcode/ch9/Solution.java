package com.wx.leetcode.ch9;

/**
 * @author xinquan.huangxq
 */
public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int y1 = x;
        int y2 = 0;
        while (x > 0) {
            y2 = y2 * 10 + x % 10;
            x = x / 10;
        }
        return y1 == y2;
    }
}
