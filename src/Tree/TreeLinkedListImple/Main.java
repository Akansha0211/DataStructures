package Tree.TreeLinkedListImple;

public class Main {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        BinaryTree.Node root = new BinaryTree.Node(5);
        binaryTree.insert(root,2);
        binaryTree.insert(root,4);
        binaryTree.insert(root,8);
        binaryTree.insert(root,6);
        binaryTree.insert(root,7);
        binaryTree.insert(root,3);
        binaryTree.insert(root,9);

        System.out.println("Traversing tre in order");
        binaryTree.traverseInOrder(root);

        System.out.println("Traversing tree in pre-Order");
        binaryTree.tarversePreOder(root);

//        System.out.println("Traversing tree in postOrder");
//        binaryTree.
    }
}
