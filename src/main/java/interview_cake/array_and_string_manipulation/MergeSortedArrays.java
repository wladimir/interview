package interview_cake.array_and_string_manipulation;

/**
 * Problem:
 * - Merge two sorted arrays.
 * Example:
 * - Input: []int{1, 3, 5}, []int{2, 4, 6}
 * Output: []int{1, 2, 3, 4, 5, 6}
 * - Input: []int{1, 3, 5}, []int{2, 4, 6, 7}
 * Output: []int{1, 2, 3, 4, 5, 6, 7},
 * Approach:
 * - Since these arrays are sorted, can use two pointers approach to iterate
 * through both of them and append the smaller value to a new merged list at
 * each step.
 * Solution:
 * - Have two pointers start at the beginning of these two arrays.
 * - While both of them does not reach the end, compare two current values
 * at each step and append the smaller one two a new merged list.
 * - Move the two pointers up accordingly as values get merged in.
 * - In the case where one of these pointers reach the end first and the
 * other one is still in the middle of the array, simply add the rest of
 * its values to the merged list since they are all sorted and guaranteed
 * to be in ascending order.
 * Cost:
 * - O(n) time, O(n) space.
 */

public class MergeSortedArrays {
    public int[] merge(final int[] a1, final int[] a2) {
        if (a1 == null || a1.length == 0) return a2;
        if (a2 == null || a2.length == 0) return a1;

        final int[] merged = new int[a1.length + a2.length];

        int i = 0, i1 = 0, i2 = 0;

        while (i1 < a1.length && i2 < a2.length)
            if (a1[i1] <= a2[i2]) merged[i++] = a1[i1++];
            else merged[i++] = a2[i2++];

        // one of arrays is not exausted
        while (i1 < a1.length) merged[i++] = a1[i1++];
        while (i2 < a2.length) merged[i++] = a2[i2++];

        return merged;
    }
}
