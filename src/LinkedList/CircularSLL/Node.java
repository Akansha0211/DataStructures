package LinkedList.CircularSLL;

public class Node {
    int data;
    Node next;

    /**
     * Create a constructor to create a blank node i.e when the first node is added in the Linked List...
     * @param dataItem
     */
    public Node(int dataItem){
        dataItem = data;
        next = null;
    }

    /**
     * This constructor will create a node when there is Linked lits already present in the memory
     * We just need to create new node and add it to the beginning of the LinedList
     * @param dataItem  data value of the node to be added
     * @param nodeRef   next of the new node which is added i.e next node  reference immediately after the first node
     */
    public Node(int dataItem, Node nodeRef){
        dataItem = data;
        next = nodeRef;
    }

    /**
     * Create a no parameter constructor in the Node class...
     */
    public Node() {

    }

    public int getData(){
        return  data;
    }
    public Node getNext(){
        return next;
    }
    public void setData(int data){
        this.data = data;
    }
    public void setNext(Node next){
        this.next = next;
    }


}
