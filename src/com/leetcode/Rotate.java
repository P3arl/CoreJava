package com.leetcode;

public class Rotate {

    public static void main(String[] args) {
        new Rotate().solutionInSpace(new int[]{1,2,3,4,5,6,7}, 3);
    }

    // O(k) extra space
    /**
     * From Leetcode -> Success - Details
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Rotate Array.
     * Memory Usage: 39.3 MB, less than 90.23% of Java online submissions for Rotate Array.
     */
    public void solutionWithExtraSpace(int[] nums, int k) {

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

    public void solutionInSpace(int[] nums, int k) {
        if(nums.length == 1 || k == 0) {
            return;
        }
        final int length = nums.length;
        k = k % length;
        reverse(nums, 0, length);
        reverse(nums, 0, k);
        reverse(nums, k, length);
    }

    private void reverse(int[] a, int start, int end) {

        int t;
        final int mid = (start + end)/2;
        for (int i = start; i < mid; i++) {
            t = a[i];
            final int endIndex = end - 1 - i + start;
            a[i] = a[endIndex];
            a[endIndex] = t;
        }
    }
}
