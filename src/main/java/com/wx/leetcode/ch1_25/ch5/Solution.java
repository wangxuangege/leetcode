package com.wx.leetcode.ch1_25.ch5;

/**
 * @author xinquan.huangxq
 */
public class Solution {

    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        int start = 0, end = 0;
        for (int i = 0; i < s.length(); ++i) {
            int len1 = length(i - 1, i + 1, s);
            int len2 = length(i, i + 1, s);
            if (len1 >= len2 && len1 > end - start + 1) {
                start = i - (len1 - 1) / 2;
                end = i + (len1 - 1) / 2;
            } else if (len2 > end - start + 1) {
                start = i - (len2 - 1) / 2;
                end = i + (len2 - 1) / 2 + 1;
            }
        }
        return s.substring(start, end + 1);
    }

    private int length(int i, int j, String s) {
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            --i;
            ++j;
        }
        return j - i - 1;
    }

    public String longestPalindrome2(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        if (s.length() == 1) {
            return s;
        }

        int start = 0, length = 1;
        for (int i = 0; i < s.length(); ++i) {
            for (int j = i + 1; j < s.length(); ++j) {
                int b = i, e = j;
                for (; b < e; ++b, --e) {
                    if (s.charAt(b) != s.charAt(e)) {
                        break;
                    }
                }
                if (b >= e && length < j - i + 1) {
                    start = i;
                    length = j - i + 1;
                }
            }
        }
        return s.substring(start, start + length);
    }

    public String longestPalindrome3(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        if (s.length() == 1) {
            return s;
        }

        boolean a[][] = new boolean[s.length()][];
        for (int i = 0; i < s.length(); ++i) {
            a[i] = new boolean[s.length()];
            a[i][i] = true;
            if (i + 1 < s.length()) {
                a[i][i + 1] = s.charAt(i) == s.charAt(i + 1);
            }
        }

        int max = 1, start = 0, end = 0;
        for (int i = s.length() - 1; i >= 0; --i) {
            for (int j = i + 1; j < s.length(); ++j) {
                if (i <= j - 2) {
                    a[i][j] = a[i + 1][j - 1] && s.charAt(i) == s.charAt(j);
                }
                if (a[i][j] && j - i + 1 > max) {
                    max = j - i + 1;
                    start = i;
                    end = j;
                }
            }
        }

        return s.substring(start, end + 1);
    }
}
