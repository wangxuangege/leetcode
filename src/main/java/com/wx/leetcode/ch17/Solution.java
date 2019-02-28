package com.wx.leetcode.ch17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author xinquan.huangxq
 */
public class Solution {

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return Collections.emptyList();
        }

        List<String> result = new ArrayList<String>();

        int[] indexArray = new int[digits.length()];
        for (int i = 0; i < digits.length(); ++i) {
            indexArray[i] = 0;
        }

        int k = 0;
        while (k >= 0) {
            while (k < digits.length()
                    && ((digits.charAt(k) == '7' || digits.charAt(k) == '9')
                    ? indexArray[k] < 4 : indexArray[k] < 3)) {
                indexArray[k] += 1;
                if (k == digits.length() - 1) {
                    result.add(buildStr(digits, indexArray));
                } else {
                    k++;
                }
            }
            indexArray[k] = 0;
            --k;
        }

        return result;
    }

    private static String buildStr(String digits, int[] indexArray) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < digits.length(); ++i) {
            result.append(get(digits.charAt(i), indexArray[i]));
        }
        return result.toString();
    }

    private static char get(char ch, int index) {
        switch (ch) {
            case '2':
                return (char) ('a' + (index - 1));
            case '3':
                return (char) ('d' + (index - 1));
            case '4':
                return (char) ('g' + (index - 1));
            case '5':
                return (char) ('j' + (index - 1));
            case '6':
                return (char) ('m' + (index - 1));
            case '7':
                return (char) ('p' + (index - 1));
            case '8':
                return (char) ('t' + (index - 1));
            case '9':
                return (char) ('w' + (index - 1));
            default:
                throw new IllegalArgumentException("数字错误：" + ch);
        }
    }

    public List<String> letterCombinations2(String digits) {
        if (digits == null || digits.length() == 0) {
            return Collections.emptyList();
        }

        List<String> result = new ArrayList<String>();
        int[] indexArray = new int[digits.length()];

        letterCombinations2Do(result, indexArray, digits, 0);

        return result;
    }

    private void letterCombinations2Do(List<String> result, int[] indexArray, String digits, int k) {
        if (k == digits.length()) {
            result.add(buildStr(digits, indexArray));
            return;
        }

        char ch = digits.charAt(k);
        int num = (ch == '7' || ch == '9') ? 4 : 3;

        for (int i = 1; i <= num; ++i) {
            indexArray[k] = i;
            letterCombinations2Do(result, indexArray, digits, k + 1);
        }
    }
}