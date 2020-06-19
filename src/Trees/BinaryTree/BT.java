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
    public boolean isEmpty() {
        return root == null;
    }

    @Override
    public void insert(int data) {
        root = insert(root,data);
    }
    public Node insert(Node currentNode , int data){
        if (currentNode == null){
            currentNode = new Node(data);
        }
        else if (data< currentNode.getData()){
            currentNode.left = insert(currentNode.left,data);
        }else {
            currentNode.right = insert(currentNode.right,data);
        }
        return currentNode;
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
