package freecodecamp.dynamic_programming;

import java.util.List;

public class CanConstruct {
    // O(n^m*n) time, O(m^2) space
    public boolean canConstruct(final String target, final List<String> wordBank) {
        if (target.length() == 0) return true;

        for (final String word : wordBank) {
            if (target.startsWith(word)) {
                final boolean canConstruct = canConstruct(target.substring(word.length()), wordBank);
                if (canConstruct) return true;
            }
        }

        return false;
    }
}
