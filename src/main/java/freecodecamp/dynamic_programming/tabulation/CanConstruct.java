package freecodecamp.dynamic_programming.tabulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CanConstruct {
    // m - target, n - word bank
    // O(m^2*n) time, O(m) space
    public boolean canConstruct(final String target, final List<String> wordBank) {
        final List<Boolean> table = new ArrayList<>(Collections.nCopies(target.length() + 1, false));
        table.set(0, true);

        for (int i = 0; i <= target.length(); i++)
            if (table.get(i))
                for (final String word : wordBank)
                    // if word matches characters as position i
                    if (target.startsWith(word, i))
                        table.set(i + word.length(), true);

        return table.get(target.length());
    }
}
