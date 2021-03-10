package com.leetcode;

public class MoveZeroes {

    public static void main(String[] args) {
        new MoveZeroes().moveZeroes(new int[]{0});
    }
    public void moveZeroes(int[] nums) {

        int i=0, j=0;
        final int length = nums.length;
        while (j < length) {
            if(nums[j]==0) {
                j++;
            } else {
                nums[i] = nums[j];
                j++;
                i++;
            }
        }
        for(int k = i; k< length; k++) {
            nums[k] = 0;
        }
    }
}
