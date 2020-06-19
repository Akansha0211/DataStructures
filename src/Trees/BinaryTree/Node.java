package Trees.BinaryTree;

public class Node {
    int data;
    Node left;
    Node right;
    public Node(int value){
        left = null;
        right = null;
        this.data = value;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
