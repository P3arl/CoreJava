package com.leetcode;

public class PlusOne {

    public static void main(String[] args) {
        new PlusOne().plusOne(new int[]{1,2,3});
    }
    public int[] plusOne(int[] digits) {

        int carry = 1;
        final int length = digits.length;
        for (int i = length - 1; i >= 0; i--) {
            if (digits[i] + carry > 9) {
                carry = 1;
                digits[i] = 0;
                if (i == 0) {
                    int[] result = new int[length + 1];
                    result[0] = 1;
                    return result;
                }
            } else {
                digits[i] += carry;
                carry = 0;
            }
        }
        return digits;
    }
}
