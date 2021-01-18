package grokking_the_coding_interview.subsets;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Problem:
 * - Given a set of distinct numbers, find all of its permutations.
 * Example:
 * - Input: [1 2]
 * Output: [[2 1] [1 2]]
 * - Input: [1 2 3]
 * Output: [[3 2 1] [2 3 1] [2 1 3] [3 1 2] [1 3 2] [1 2 3]]
 * Approach:
 * - For every existing permutations, create new permutations by adding the number to
 * all of its positions.
 * Cost:
 * - O(n*n!) time, O(n*n!) space since n! is the total of permutations of a n-number set.
 */
public class Permutations {
    public List<List<Integer>> findPermutations(final int[] nums) {
        final List<List<Integer>> result = new ArrayList<>();

        final Queue<List<Integer>> permutations = new LinkedList<>();
        permutations.add(new ArrayList<>());

        for (int num : nums) {
            int n = permutations.size();
            for (int i = 0; i < n; i++) {
                final List<Integer> oldP = permutations.poll();

                // add num to every position
                for (int j = 0; j <= oldP.size(); j++) {
                    final List<Integer> newP = new ArrayList<>(oldP);
                    newP.add(j, num);
                    if (newP.size() == nums.length) result.add(newP);
                    else permutations.add(newP);
                }
            }
        }

        return result;
    }
}
