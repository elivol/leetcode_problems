package com.leetcode.problems;

public class ZigZagConverter {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 4;
        System.out.println("original: " + s);
        System.out.println("converted: " + convert(s, numRows));
    }

    public static String convert(String s, int numRows) {
        StringBuilder sb = new StringBuilder();

        if (numRows == 1) {
            return s;
        }

        int distance = 2 * (numRows - 1);

        for (int i = 0; i < numRows && i < s.length(); i++) {
            for (int j = i; j < s.length(); j += distance){
                sb.append(s.charAt(j));
                if (i > 0 && i < numRows - 1 && j + distance - 2 * i < s.length()) {
                    sb.append(s.charAt(j + distance - 2 * i));
                }
            }
        }
        return sb.toString();
    }
}
