package Trees.BinaryTree;
/**
 * A binary tree is a non-linear DS where each node can have atmost two children.
 *                2
 *             /     \
 *            7       5
 *           / \       \
 *          2   6       9
 *             /  \     /
 *            5   11   4
 *
 *    Leaf node - have 0 children.
 *    Now to search any node you will have to search entire tree in worst case scenario (Time complexity = O(n))
 *    As there is no ordering.
 *    Insertion of node is done in level order.
 */
public class BT implements BTadt{
    private Node root;
    public BT(){
        root = null;
    }

    @Override
    public boolean isEmpty(int data) {
        return root == null;
    }

    @Override
    public void insert() {

    }

    @Override
    public boolean search() {
        return false;
    }

    @Override
    public void inOrder() {

    }

    @Override
    public void preOrder() {

    }

    @Override
    public void postOrder() {

    }
}
