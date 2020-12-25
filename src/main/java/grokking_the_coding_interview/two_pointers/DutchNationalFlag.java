package grokking_the_coding_interview.two_pointers;

import java.util.Arrays;

/**
 * Problem:
 * - Given an array containing 0s, 1s and 2s, sort the array in-place.
 * Example:
 * - Input: []int{1, 0, 2, 1, 0}
 * Output: []int{0, 0, 1, 1, 2}
 * Approach:
 * - Have one pointer start at the beginning and the other at the end
 * while iterating through the array.
 * - We will move all 0s before that start pointer and 2s after the end
 * pointer so that all 1s would be between in the end.
 * Cost:
 * - O(n) time, O(1) space.
 */
public class DutchNationalFlag {
    public int[] sort(final int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        System.out.println("before:" + Arrays.toString(arr));

        int i = 0; // third pointer
        while (i <= right) {
            if (arr[i] == 0) {
                swap(arr, i, left);
                i++;
                left++;
            } else if (arr[i] == 1) {
                i++; // skip
            } else {
                swap(arr, i, right);
                right--;
            }
        }

        System.out.println("after:" + Arrays.toString(arr));
        return arr;
    }

    private void swap(final int[] arr, final int i, final int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
