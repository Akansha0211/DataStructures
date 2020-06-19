package Trees.BinaryTree;

public interface BTadt {
    boolean isEmpty();
    void insert(int data);
    boolean search(int value);
    void inOrder();
    void preOrder();
    void postOrder();
}
