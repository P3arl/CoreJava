package com.leetcode;

public class RomanToInt {

    public int solution(String s) {

        int result = 0;

        for (int i = 0; i < s.length(); i++) {

            if (i > 0 && charToInt(s.charAt(i)) > charToInt(s.charAt(i - 1))) {
                result += charToInt(s.charAt(i)) - 2 * charToInt(s.charAt(i - 1));
            } else {
                result += charToInt(s.charAt(i));
            }
        }
        return result;
    }

    int charToInt(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}
