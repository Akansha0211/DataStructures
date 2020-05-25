package Tree.TreeLinkedListImple;

public class BinaryTree {
    public static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
            left = null;
            right = null;
        }
    }

    /**
     * This method will add a node in orderly manner  to keep them sorted
     *If we want ot add a node , rules are:
     * If the new node's value is lower than the current node's value go to the left child,
     * If new node's value is greater than the current node's value go to the right child,
     * When the current node is null we have reached a leaf node , we insert the new node in that position.
     * @param node is the current node.
     * @param value node's value which is to be added
     */
    public void insert(Node node, int value){
        if (value<node.value){
            if (node.left != null){
                insert(node.left,value);
            }else {
                System.out.println("Inserted "+ value+ " to the left of "+ node.value);
                node.left = new Node(value);
            }
        }
        else if (value> node.value){
            if (node.right != null){
                insert(node.right,value);
            }else {
                System.out.println("Inserted "+ value+" to the right of "+node.value);
                node.right = new Node(value);
            }
        }
    }

    /**
     * This method will traverse the Tree in InOrder manner.
     * left node
     * root
     * Right node
     * @param node
     */
    public void traverseInOrder(Node node){
        if (node != null){
            traverseInOrder(node.left);
            System.out.print(" "+ node.value);
            traverseInOrder(node.right);
        }
    }

    public void tarversePreOder(Node node){
        if (node != null){
            System.out.println(" "+node.value);
            tarversePreOder(node.left);
            tarversePreOder(node.right);
        }
    }
}
