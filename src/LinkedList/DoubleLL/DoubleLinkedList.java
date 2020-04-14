package LinkedList.DoubleLL;

public class DoubleLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

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
        node.setPrevious(null); // this is difference from SingleLinkedList
        size = 1;
        return head;
    }

    /**
     * This method will return the value of head != null in boolean
     * i.e it will return true if LinkedList exists otherwise false.
     * @return boolean value...
     */
    public boolean existsLinkedList(){
        return head !=null;
    }

    /**
     *
     * @param nodeValue
     * @param location
     */
    public void insertInLinkedList(int nodeValue, int location){
        Node node = new Node();
        node.setData(nodeValue);
        if (!existsLinkedList()){
            System.out.println("LinkedList does not exists");
            return;
        }
        else if (location == 0){
            node.setPrevious(null);
            node.setNext(head);
            head.setPrevious(node);
            head = node;
        }
        else if (location >= size){
            node.setNext(null);
            node.setPrevious(tail);
            tail.setNext(node);
            tail = node;
        }
        else {
            Node tmpNode = head;
            for (int index = 0; index <location-1; index++) {
                tmpNode = tmpNode.getNext();
            }
            node.setPrevious(tmpNode);
            node.setNext(tmpNode.getNext());
            tmpNode.setNext(node);
            node.getNext().setPrevious(node);
        }
        size++; // size increased as one node is added...
    }

    /**
     * This method will search a node by matching the given nodeValue
     * @param nodeValue dataValue which is to be searched
     * @return true if node found otherwise false...
     */
    public boolean searchNode(int nodeValue){
        if (existsLinkedList()){
            Node tmpNode = head;
            for (int index = 0; index <getSize(); index++) {
                if (tmpNode.getData() == nodeValue){
                    System.out.println("Node found at index "+ index+"\n");
                    return true;
                }
                tmpNode = tmpNode.getNext();
            }
        }
        System.out.println("Linked list does not exists");
        return false;
    }
}
