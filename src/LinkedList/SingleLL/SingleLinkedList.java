package LinkedList.SingleLL;

public class SingleLinkedList {
    private Node head; // stores reference of the first node i.e where the first node is stored in the memory
    private Node tail ; // stores the refernce of the last node .This reference is basically used to reduce time complexity
    private int size; // stores the current size of the Linked Lit


    //Create getters and setters for all th data fields of SingleLinkedList class
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




}
