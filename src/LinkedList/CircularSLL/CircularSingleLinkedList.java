package LinkedList.CircularSLL;


public class CircularSingleLinkedList {
    private Node head;
    private  Node tail;
    private int size;

    public Node getHead(){
        return head;
    }
    public Node getTail(){
        return tail;
    }
    public int getSize(){
        return size;
    }
    public void setHead(Node head){
        this.head = head;
    }
    public void setTail(Node tail){
        this.tail = tail;
    }
    public void setSize(int size){
        this.size = size;
    }

    /**
     * This method will create anode when there was no node ata beginning i.e at time time of formation of first node of the LinkedList
     * @param nodeValue the data value of the node
     * @return head reference from where we can start pointing the entire Linked list in teh memory...
     */
    public Node createSingleLinkedList(int nodeValue){
        head = new Node();
        tail = new Node();
        Node node = new Node();
//        node.setData(nodeValue);
//        node.setNext(node);
        node.data = nodeValue;
        node.next = node;
        head = node ;
        tail = node;
        size = 1;
        return head;
    }




}
