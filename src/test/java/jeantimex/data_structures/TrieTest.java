package jeantimex.data_structures;

import junit.framework.TestCase;

public class TrieTest extends TestCase {
    public void testTrie() {
        final Trie trie = new Trie();

        trie.insert("abc");
        trie.insert("abx");

        assertTrue(trie.search("abx"));
        assertFalse(trie.search("abcd"));

        assertTrue(trie.startsWith("ab"));
    }
}
