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

    /**
     * This method returns the boolean condition head!= null
     * @return will return true if head!= null and
     * if head == null then then head will not be pointing to any LinkedList in the memory..
     * return value of this method will further be used in other methods...
     *
     */
    public boolean existsLinkedList(){
        return head!= null;
    }

    public void insertInsertLinkedList(int nodeValue,int location){
        Node node = new Node();
        node.data = nodeValue;
        if(!existsLinkedList()){
            System.out.println("Linked List does not exists");
            return;
        }
        else if (location == 0){
            node.next = head;
            //node.setNext(head);
            head = node;
            tail.setNext(node);
            //tail.next = node;
        }
        else if (location >= size){
            node.next = head;
            tail.setNext(node);
            tail = node;

        }
        else {
            Node tmpNode = head;
            for (int index = 0; index<location - 1;index++){
                tmpNode = tmpNode.getNext();
            }
            Node nextNode = tmpNode.getNext(); // stores the reference of node just after the node which is to be added
            tmpNode.setNext(node);
            node.setNext(nextNode);
        }
        setSize(getSize()+1);
    }

    /**
     * This method will visit each node of the LinkedList and will print the data value of each of its Node...
     */
    public  void traverseLinkedList(){
        Node tmpNode = head;
        if (existsLinkedList()){
            for (int index = 0; index < getSize() ; index++) {
                System.out.println(tmpNode.getData());
                if (index != getSize()-1){
                    System.out.println(" ->");
                }
                tmpNode = tmpNode.getNext();
            }
        }
        else {
            System.out.println("Linked List does not exists");
        }
        System.out.println("\n");
    }

    /**
     * This method will search a Node by searching with its value i.e by comparing it with the value of each node in the Linked List..
     * @param nodeValue the node with this value is to be searched
     * @return true if node with nodeValue is found otherwise return false...
     */
    public  boolean searchNode(int nodeValue){
        Node tmpNode =  head;
        if (existsLinkedList()){
            for (int index = 0; index <getSize() ; index++) {
               if (tmpNode.getData() == nodeValue){
                   System.out.println("Found the node at location"+ index+"\n");
                   return true;
               }
               tmpNode = tmpNode.getNext();
            }
        }
        System.out.println("Node not found ");  // Linked List does not exists..
        return false;

    }

    /**
     * This method deletes the Node at any particular index.
     * @param location whose Node is to be deleted...
     */
    public void deletionOfNode( int location){
        if (!existsLinkedList()){
            System.out.println("Linked List does not exists");
            return;
        }
        else if (location == 0){
            head = head.getNext();
            tail.next = head;
            setSize(getSize()-1);
            if (getSize()== 0){
                head = tail = null;
            }
            else if (location >= getSize()){
                Node tmpNode = head;
                for (int index = 0; index <getSize() ; index++) {
                    tmpNode = tmpNode.getNext();
                }
                tmpNode.setNext(head);
                tail = tmpNode;
                setSize(getSize()-1);
            }
            else {
                Node tmpNode = head;
                for (int index = 0; index <location-1 ; index++) {
                    tmpNode = tmpNode.getNext();
                }
                tmpNode.setNext(tmpNode.getNext().getNext()); // deltes the requied node
                setSize(getSize()-1);
            }
        }
    }

    /**
     * This method will delete the entire Lined List
     */
    public void deleteLinkedList(){
        System.out.println("Deleting entire Linked List");
        head = null;
        if (tail == null){
            System.out.println("Linked List is already deleted , nothing to delete");
        }
        tail.setNext(null);
        tail = null;
        System.out.println("Linked list is successfully deleted !");
    }




}
