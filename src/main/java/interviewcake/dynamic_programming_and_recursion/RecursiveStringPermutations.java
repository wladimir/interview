package interviewcake.dynamic_programming_and_recursion;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
Problem:
- Write a recursive function for generating all permutations of an input
  string. Assume that every character in the string is unique.
Example:
- Input: "cat"
  Output: []set{"cat", "cta", "act", "atc", "tca", "tac"}
Approach:
- Get all the permutations for all characters before the last one.
- Put the last character in all possible position for each of these
  permutations.
Solution:
- Initialize permutations as a set.
- If there is only one character in a string (or less than), return it
  immediately.
- Get the last character and all the characters before it.
- Get all permutations for all characters expect the last one.
- Iterate through the list of permutations before the last character
  and put the last character in all possible position for each of these
  permutations.
Cost:
- O(n) time, O(n) space.
*/
public class RecursiveStringPermutations {
    public Set<String> getPermutations(final String input) {
        if (input.length() < 2) return Collections.singleton(input);

        final char last = input.charAt(input.length() - 1);
        final String rest = input.substring(0, input.length() - 1);

        final Set<String> result = new HashSet<>();

        final Set<String> permutations = getPermutations(rest);
        System.err.println(permutations);
        for (final String p : permutations)
            for (int i = 0; i <= rest.length(); i++) {
                final String item = p.substring(0, i) + last + p.substring(i);
                System.err.println(item);
                result.add(item);
            }

        return result;
    }
}
