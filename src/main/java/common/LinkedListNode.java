package common;

public class LinkedListNode {
    @Override
    public String toString() {
        return "LinkedListNode{" + "value=" + value + ", next=" + next + '}';
    }

    public int value;
    public LinkedListNode next;

    public LinkedListNode(int value) {
        this.value = value;
    }

    public static LinkedListNode[] valuesToLinkedListNodes(int[] values) {
        final LinkedListNode[] nodes = new LinkedListNode[values.length];
        for (int i = 0; i < values.length; ++i) {
            nodes[i] = new LinkedListNode(values[i]);
            if (i > 0) {
                nodes[i - 1].next = nodes[i];
            }
        }
        return nodes;
    }
}
