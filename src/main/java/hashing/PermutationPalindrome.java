package hashing;

import java.util.HashSet;
import java.util.Set;

/**
 * Problem:
 * - Given a list of movie lengths (integer) and a flight length (integer), determine if
 * there exist two movies that add up to the total length. Assume that an user
 * watch exactly two movies, but not the same one twice.
 * Example:
 * - Input: list=[]int{2, 3, 4}, length=6
 * Output: true, because there exists 2 and 4 that add up to 6
 * Approach:
 * - Could use hashmap to keep track of movie lengths that we've seen so far and
 * look it up as we iterate through the list.
 * Solution:
 * - Use a hashmap to keep track of movie lengths that we've seen so far.
 * - As we iterate through the list, we calculate the difference for each value
 * (total length - current movie length) and check if the difference is equal
 * to the movie length that we've seen.
 * - Return true if that's the case.
 * Cost:
 * - O(n) time, O(n) space.
 */
public class PermutationPalindrome {
    public boolean hasPalindromePermutation(final String input) {
        final Set<Character> unpaired = new HashSet<>();

        for (Character c : input.toCharArray()) {
            if (unpaired.contains(c)) unpaired.remove(c);
            else unpaired.add(c);
        }

        return unpaired.size() <= 1;
    }
}
