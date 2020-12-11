package leetcode.array_and_string;

/**
 * Problem:
 * - Implement strstr() that finds the first occurrence of the substring
 * needle in the string haystack. It returns -1 if needle is not part of the
 * haystack.
 * Example:
 * - Input: haystack = "aaabacd", needle = "ba"
 * Output: 3, because needle "ba" starts at index 3 in the haystack.
 * Approach:
 * - Scan the needle with the haystack from its first position and start matching
 * all subsequent letters one by one.
 * - If one letter does not match, start again with the next position in the
 * haystack.
 * Cost:
 * - O(nm) time, O(1) space, where n is the length of haystack while m is the
 * length of needle.
 */
public class StrStr {
    public int strStr(final String haystack, final String needle) {
        if (haystack == null || haystack.length() == 0 || needle == null || needle.length() == 0) return 0;

        for (int i = 0; i < haystack.length(); i++) {
            if (needle.length() + i > haystack.length()) return -1;

            int x = i;
            for (int j = 0; j < needle.length(); j++) {
                if (needle.charAt(j) == haystack.charAt(x)) {
                    x++;
                    if (j == needle.length() - 1) return i;
                } else break;
            }
        }

        return -1;
    }

    public int strStr2(final String haystack, final String needle) {
        for (int i = 0; ; i++) {
            for (int j = 0; ; j++) {
                if (j == needle.length()) return i;
                if (i + j == haystack.length()) return -1;
                if (needle.charAt(j) != haystack.charAt(i + j)) break;
            }
        }
    }
}
