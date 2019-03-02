package com.wx.leetcode.ch1_25.ch22;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

    public List<String> generateParenthesis(int n) {
        if (n < 1) {
            return Collections.emptyList();
        }

        List<String> result = new ArrayList<>();

        // 1代表( 2代表)
        int[] array = new int[n * 2];
        int k = 0;

        while (k >= 0 && k < n * 2) {
            while (k >= 0 && k < n * 2 && array[k] < 2) {
                array[k] = array[k] + 1;
                if (check(array, k)) {
                    if (k == n * 2 - 1) {
                        result.add(convert(array));
                        break;
                    } else {
                        ++k;
                    }
                }
            }
            array[k] = 0;
            --k;
        }

        return result;
    }

    public static String convert(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; ++i) {
            if (array[i] == 1) {
                sb.append('(');
            } else {
                sb.append(')');
            }
        }
        return sb.toString();
    }

    /**
     * 左边的1一定要比2多才行
     *
     * @param array
     * @param k
     * @return
     */
    private boolean check(int[] array, int k) {
        int s1 = 0;
        int s2 = 0;
        for (int i = 0; i <= k; ++i) {
            if (array[i] == 1) {
                s1++;
            } else {
                s2++;
            }
        }
        return s1 >= s2 && s2 >= (k - array.length / 2 + 1);
    }

    public List<String> generateParenthesis2(int n) {
        if (n < 1) {
            return Collections.emptyList();
        }

        List<String> result = new ArrayList<>();

        // 1代表( 2代表)
        int[] array = new int[n * 2];
        generateParenthesis2(result, array, 0);

        return result;
    }

    public void generateParenthesis2(List<String> result, int[] array, int k) {
        if (k == array.length) {
            result.add(convert(array));
            return;
        }

        for (int i = 1; i <= 2; ++i) {
            array[k] = i;
            if (check(array, k)) {
                generateParenthesis2(result, array, k + 1);
            }
        }
    }

    public List<String> generateParenthesis3(int n) {
        if (n < 1) {
            return Collections.emptyList();
        }

        List<String> result = new ArrayList<>();
        generateParenthesis3(result, "", 0, 0, n);

        return result;
    }

    public void generateParenthesis3(List<String> result, String before, int s1, int s2, int n) {
        if (s1 > n || s2 > n) {
            return;
        }

        if (s1 == n && s2 == n) {
            result.add(before);
            return;
        }

        if (s1 >= s2) {
            generateParenthesis3(result, before + "(", s1 + 1, s2, n);
            generateParenthesis3(result, before + ")", s1, s2 + 1, n);
        }
    }
}
