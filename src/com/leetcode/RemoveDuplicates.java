package com.leetcode;

public class RemoveDuplicates {

    public static void main(String[] args) {
        new RemoveDuplicates().solution(new int[]{0,0,1,1,1,2,2,3,3,4});
    }
    public int solution(int[] nums) {

        int count = 0;
        int i=0, j=1;
        while (i<nums.length && j< nums.length) {
            if(nums[i] == nums[j]) {
                j++;
            } else {
                nums[i+1] = nums[j];
                i = i+1;
                j = j+1;
                count++;
            }
        }
        return count+1;
    }
}
