package jeantimex.data_structures;

import java.util.HashMap;
import java.util.Map;

/**
 * Implement a trie with insert, search, and startsWith methods.
 */
public class Trie {
    public static class TrieNode {
        public Map<Character, TrieNode> children = new HashMap<>();
        public boolean end;
    }

    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(final String word) {
        TrieNode current = root;

        for (final char c : word.toCharArray())
            current = current.children.computeIfAbsent(c, k -> new TrieNode());

        current.end = true;
    }

    public boolean search(final String word) {
        TrieNode current = root;

        for (final char c : word.toCharArray()) {
            TrieNode node = current.children.get(c);
            if (node == null) return false;
            current = node;
        }

        return current.end;
    }

    public boolean startsWith(final String prefix) {
        TrieNode current = root;

        for (final char c : prefix.toCharArray()) {
            TrieNode node = current.children.get(c);
            if (node == null) return false;
            current = node;
        }

        return true;
    }
}
