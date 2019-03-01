package com.wx.leetcode.ch22;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void generateParenthesis() {
        System.out.println(new Solution().generateParenthesis(3));

        System.out.println(new Solution().generateParenthesis2(3));

        System.out.println(new Solution().generateParenthesis3(3));
    }
}