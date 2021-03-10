package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    /**
     * Runtime: 3 ms, faster than 99.69% of Java online submissions for Contains Duplicate.
     * Memory Usage: 42.7 MB, less than 81.59% of Java online submissions for Contains Duplicate.
     *
     * @param nums
     * @return
     */
    public boolean solution(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);
        for(int i:nums) {
            if(!set.add(i)) {
                return true;
            }
        }
        return false;
    }
}
