package com.leetcode.problems;


/**
 * Given a string s, find the length of the longest substring without repeating characters.
 */
public class LongestSubstring {

    public static void main(String[] args) {
        String s = "abcabcdtr";
        System.out.println("max substring length: " + lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {

        StringBuilder sb = new StringBuilder();
        int maxLen = 0;

        int i = 0;

        while (i < s.length()) {
            sb.append(s.charAt(i));
            i++;
            int j = i - sb.length();
            while (j < i && i < s.length()) {
                if (s.charAt(i) == s.charAt(j)) {
                    maxLen = Math.max(maxLen, sb.length());
                    sb.setLength(0);
                    i = j + 1;
                }
                j++;
            }
        }
        return Math.max(maxLen, sb.length());
    }
}
