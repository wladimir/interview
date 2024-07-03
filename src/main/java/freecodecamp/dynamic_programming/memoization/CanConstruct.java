package freecodecamp.dynamic_programming.memoization;

import java.util.List;

public class CanConstruct {
    // O(n^m*n) time, O(m^2) space
    public boolean canConstruct(final String target, final List<String> wordBank) {
        if (target.isEmpty()) return true;

        for (final String word : wordBank) {
            if (target.startsWith(word)) {
                final boolean canConstruct = canConstruct(target.substring(word.length()), wordBank);
                if (canConstruct) return true;
            }
        }

        return false;
    }
}
