package com.leetcode.problems;

/**
 * Given two sorted arrays nums1 and nums2 of size m and n respectively,
 * return the median of the two sorted arrays.
 */
public class MedianOfTwoArrays {

    public static void main(String[] args) {
        try {
            int[] nums1 = new int[]{2};
            int[] nums2 = new int[]{1, 3, 4};
            System.out.println("median: " + median(nums1, nums2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static double median(int[] nums1, int[] nums2) {
        final int length = nums1.length + nums2.length;
        int index = length / 2;

        if (nums1.length == 0) {
            return findMedian(nums2);
        }

        if (nums2.length == 0) {
            return findMedian(nums1);
        }

        int i = 0, j = 0;
        int median = 0, previous = 0;

        while (i + j <= index) {
            previous = median;

            if (i == nums1.length) {
                median = nums2[j++];
            }
            else if (j == nums2.length) {
                median = nums1[i++];
            }
            else {
                median = nums1[i] < nums2[j] ? nums1[i++] : nums2[j++];
            }
        }
        return length % 2 == 0 ? (median + previous) / 2.0 : median;
    }

    static double findMedian(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        return len % 2 == 0 && len > 1 ?
                (nums[len / 2] + nums[(len / 2) - 1]) / 2.0 :
                nums[len / 2];
    }
}
