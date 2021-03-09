package com.leetcode;

public class Rotate {

    public static void main(String[] args) {
        new Rotate().solution(new int[]{-1,-100,3,99}, 2);
    }
    public void solution(int[] nums, int k) {

        final int length = nums.length;
        k = k%length;

        int[] a = new int[k];
        for (int i=a.length-1,j=0;i>=0 && j<k;i--,j++) {
            a[i] = nums[length-1-j];
        }
        int m = k;
        for (int i=length-1;i>=k;i--){
            nums[i] = nums[length-1-m];
            m++;
        }

        if (a.length > 0) System.arraycopy(a, 0, nums, 0, a.length);
    }
}
