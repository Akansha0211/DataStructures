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

    /**
     * We add nodes in two scenarios :
     * case1: we add a node when there is no node in the linked list that was the previous case
     * case 2: we add a node when there is already presence of other nodes as well
     * so in case 2 when we add a node then the new node created needs to point the next node to it for that we are using here nodeRef variable
     * @param dataItem
     * @param nodeRef
     */
    private Node(int dataItem,Node nodeRef){
        dataItem = data;
        next = nodeRef;
    }

    public Node() {

    }

    public int getData(){
        return data;
    }
    public Node getNext(){
        return next;
    }
    public void setData(int data){
        this.data = data;
    }
    public void setNext(){
        this.next = next;
    }

}
