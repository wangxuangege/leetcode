package com.wx.leetcode.ch1_25.ch17;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void letterCombinations() {
        System.out.println(new Solution().letterCombinations("23"));
        System.out.println(new Solution().letterCombinations("7"));
        System.out.println(new Solution().letterCombinations("72"));
        System.out.println(new Solution().letterCombinations("79"));
        System.out.println(new Solution().letterCombinations("8"));

        System.out.println(new Solution().letterCombinations2("23"));
        System.out.println(new Solution().letterCombinations2("7"));
        System.out.println(new Solution().letterCombinations2("72"));
        System.out.println(new Solution().letterCombinations2("79"));
        System.out.println(new Solution().letterCombinations2("8"));
    }
}