package com.leetcode.problems;

import java.util.Arrays;
import java.util.Collections;

/**
 * https://leetcode.com/problems/container-with-most-water/
 *
 * Find two lines, which, together with the x-axis forms a container,
 * such that the container contains the most water.
 */
public class MostWaterContainer {

    public static void main(String[] args) {
        int[] array = new int[] {1,8,6,2,5,4,8,3,7};
        System.out.println("max area: " + maxArea(array));
    }

    public static int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int maxArea = Integer.MIN_VALUE;

        while (i < j) {
            if (height[i] > height[j]) {
                maxArea = Math.max(maxArea, (j - i) * height[j]);
                j--;
            } else {
                maxArea = Math.max(maxArea, (j - i) * height[i]);
                i++;
            }
        }

        return maxArea;
    }

}
