package com.wx.leetcode.ch1_25.ch20;

public class Solution {

    public boolean isValid(String s) {
        if (s == null || s.length() % 2 != 0) {
            return false;
        }

        char[] array = new char[s.length()];
        int k = 0;

        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            if (k == 0) {
                if (ch == '}' || ch == ']' || ch == ')') {
                    return false;
                }
                array[k++] = ch;
            } else {
                char top = array[k - 1];
                if ((top == '{' && ch == '}')
                        || (top == '[' && ch == ']')
                        || (top == '(' && ch == ')')) {
                    --k;
                } else {
                    array[k++] = ch;
                }
            }
        }
        return k == 0;
    }
}