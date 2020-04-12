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


}
