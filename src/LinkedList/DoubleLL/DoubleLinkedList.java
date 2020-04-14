package LinkedList.DoubleLL;

public class DoubleLinkedList {
    private Node head;
    private Node tail;
    private int size;

    /**
     * This method will create a node
     * @param nodeValue data value of the node
     * @return head .i.e location of the 1st element...
     */
    public Node createLinkedList(int nodeValue){
        head = new Node();
        tail = new Node();
        Node node = new Node();
        node.setData(nodeValue);
        head = node;
        tail = node;
        node.setNext(null);
        node.setPrevious(null);
        size = 1;
        return head;
    }
}
