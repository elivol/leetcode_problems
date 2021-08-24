package com.leetcode.problems;

public class Palindrome {

    public String longestPalindrome(String s) {
        if (s.length() == 1) {
            return s;
        }

        String palindrome = String.valueOf(s.charAt(0));
        StringBuilder substring = new StringBuilder(palindrome);

        for (int i = 1; i < s.length(); i++) {
            substring.append(s.charAt(i));

            if (substring.charAt(0) == s.charAt(i)) {
                palindrome = substring.toString();
            }
        }
        return palindrome;
    }

}
