package com.wx.leetcode.ch3;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xinquan.huangxq
 */
public class Solution {

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int max = 0;
        int start = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) >= start) {
                start = map.get(s.charAt(i)) + 1;
            }
            map.put(s.charAt(i), i);
            max = Math.max(i - start + 1, max);
        }
        return max;
    }
}

