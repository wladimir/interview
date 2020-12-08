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
}
