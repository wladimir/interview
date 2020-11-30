package interviewcake.sorting_searching_and_logarithms;

/**
 * Problem:
 * - Given a list of words, return an index of a rotation point.
 * Example:
 * - Input:
 * []String{
 * "ptolemaic",
 * "retrograde",
 * "supplant",
 * "undulate",
 * "xenoepist",
 * "asymptote", // <-- rotates here!
 * "babka",
 * "banoffee",
 * "engender",
 * "karpatka",
 * "othellolagkage",
 * },
 * Output: 5
 * Approach:
 * - Use a binary search approach to search for word, to either go right or go
 * left because they are in order alphabetically.
 * - Keep track of the lower and upper bounds and so that when they are next
 * to each other, the floor is the last item while the ceiling is the rotation
 * point.
 * Solution:
 * - Keep track of the lower and upper bounds on the rotation points.
 * - While is lower bound is less than the upper bound, check if the guessed word
 * (the one in the middle of the range), comes after the first word.
 * - If so, go right by making the floor index be the guessed index.
 * - Otherwise, go left by making the ceiling index be the guessed index.
 * - When the floor index and ceiling index have converged, the ceiling is
 * the rotation point.
 * Cost:
 * - O(logn) time, O(1) space.
 */
public class FindRotationPoint {
    public int findRotationPoint(String[] words) {
        if (words == null) return -1;
        if (words.length < 2) return 0;

        final String first = words[0];
        int floor = 0;
        int ceiling = words.length - 1;

        while (floor < ceiling) {
            final int guess = floor + (ceiling - floor) / 2;

            // if guess comes after first word or is the first word
            if (words[guess].compareTo(first) >= 0) floor = guess;
            else ceiling = guess;

            if (floor + 1 == ceiling) return ceiling;
        }

        return -1;
    }
}
