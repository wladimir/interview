package grokking_the_coding_interview.subsets;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem:
 * - Given a set with distinct elements, find all the distinct subsets.
 * Example:
 * - Input: [1 2]
 * Output: [[] [1] [2] [1 2]]
 * - Input: [1 2 3]
 * Output: [[] [1] [2] [1 2] [3] [1 3] [2 3] [1 2 3]]
 * Approach:
 * - Start with an empty set.
 * - Iterate through the set using BFS and add them to existing sets to create new ones.
 * Cost:
 * - O(2^n) time, O(2^n) space since we would have a total of 2^n subsets.
 */
public class Subsets {
    public List<List<Integer>> findSubsets(final int[] nums) {
        final List<List<Integer>> subsets = new ArrayList<>();
        subsets.add(new ArrayList<>());

        for (int num : nums) {
            int n = subsets.size();
            for (int i = 0; i < n; i++) {
                final List<Integer> current = new ArrayList<>(subsets.get(i));

                current.add(num);
                subsets.add(current);
            }
        }

        return subsets;
    }
}
