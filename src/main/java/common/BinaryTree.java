package common;

public class BinaryTree {
    public int value;
    public BinaryTree left;
    public BinaryTree right;

    public BinaryTree(int value) {
        this.value = value;
    }

    public BinaryTree insertLeft(int leftValue) {
        this.left = new BinaryTree(leftValue);
        return this.left;
    }

    public BinaryTree insertRight(int rightValue) {
        this.right = new BinaryTree(rightValue);
        return this.right;
    }
}

