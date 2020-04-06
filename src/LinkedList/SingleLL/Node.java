package LinkedList.SingleLL;

/**
 *   A node is a Data Structure that contains data and one or more links.
 *   A link is a reference to a node
 *   Node can be of type Generic and type can be specified at the time of object creation
 *   But here we are not creating Generic type Node...
 */
public class Node {
    //Data Fields
    private int data;
    private Node next;

    /**
     * Crete a constructor to create a blank node with data and with next reference as Null
     * @param dataItem The data stored
     */
    private Node(int dataItem){
        dataItem = data;
        next = null;
    }
}
