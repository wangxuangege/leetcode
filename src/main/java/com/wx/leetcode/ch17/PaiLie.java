package com.wx.leetcode.ch17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 全排列，重温回溯法（循环和递归两种实现方式）
 *
 * @author xinquan.huangxq
 */
public class PaiLie {

    public static void main(String[] args) {
        int n = 5;
        // 循环实现全排列
        paiLie(n).stream().map(Arrays::toString).forEach(System.out::println);
        System.out.println();
        // 递归实现全排列
        paiLie2(n).stream().map(Arrays::toString).forEach(System.out::println);
    }

    private static List<int[]> paiLie(int n) {
        List<int[]> result = new ArrayList<>();

        int[] nums = new int[n];
        int k = 0;
        while (k >= 0 && k < n) {
            while (k >= 0 && k < n && nums[k] < n) {
                nums[k] += 1;
                if (check(nums, k, nums[k])) {
                    if (k == n - 1) {
                        result.add(Arrays.copyOf(nums, n));
                        break;
                    }
                    ++k;
                }
            }
            nums[k] = 0;
            --k;
        }
        return result;
    }

    private static List<int[]> paiLie2(int n) {
        List<int[]> result = new ArrayList<>();

        int[] nums = new int[n];
        paiLie2(result, nums, 0);

        return result;
    }

    private static void paiLie2(List<int[]> result, int[] nums, int k) {
        if (k == nums.length) {
            result.add(Arrays.copyOf(nums, nums.length));
            return;
        }
        for (int i = 1; i <= nums.length; ++i) {
            nums[k] = i;
            if (check(nums, k, nums[k])) {
                paiLie2(result, nums, k + 1);
            }
        }
    }

    private static boolean check(int[] nums, int k, int v) {
        for (int i = 0; i < k; ++i) {
            if (nums[i] == v) {
                return false;
            }
        }
        return true;
    }
}
