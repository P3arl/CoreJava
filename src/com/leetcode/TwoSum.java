package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        new TwoSum().solution(new int[]{-3,4,3,90}, 0);
    }
    public int[] solution(int[] nums, int target) {

        final Map<Integer, Integer> map = new HashMap<>();

        for (int num:nums) {
            map.put(num, target-num);
        }

        return new int[]{};

    }
}
