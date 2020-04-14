package LinkedList.DoubleLL;

public class Node {

    private  int data;
    private Node next;
    private Node previous;

    /**
     * This constructor will crate a node on creating an object of Node class
     * @param dataItem data value of the node
     * @param next stores the reference of the next node
     * @param prev stores the reference of the previous node...
     */
    public Node(int dataItem, Node next, Node prev){
        dataItem = data;
        next = this.next;
        prev = previous;
    }
    //create a no parameter constructor
    public Node() {

    }

    public int getData(){
        return data;
    }
    public Node getNext(){
     return next;
    }
    public Node getPrevious(){
        return previous;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }
}
