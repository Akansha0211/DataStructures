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
    public void setSize(int size){
        this.size = size;
    }

    /**
     * This method will create a Single linkedList
     *
     * steps:
     * step1: create a head refernce and tail refenenec and assign them with blank values
     * as till now it the List is empty.
     * step 2: create a node and give data to it and se its next to Null
     * step 3: Now set the head reference to Node which you have created
     * and the tail will also point to that Node as you are having only one Node in the linkedList...
     *
     * @param nodeValue it is data in the Node
     * @return head  as we need to know the first reference of the Node i.e location of first node in the memory...
     */
    public Node createSingleLinkedList(int nodeValue){
        head = new Node();
        Node node = new Node();
        node.setData(nodeValue);
        node.setNext(null);
        head = node;
        tail = node;
        size = 1;
        return head;
    }
    public void insertLinkedList(int nodeValue,int location){
        Node node = new Node();
        node.setData(nodeValue);
        if (!existsLinkedList()){
            System.out.println("Linked List does not exists");
            return;
        }
        else if (location == 0){
            node.setNext(head);
            head = node;
        }
        else if (location >= size){
            node.setNext(null);
            tail.setNext(node);
            tail = node;
        }
        else {
            Node tmpNode = head;
           // int index = 0;
            for ( int index = 0; index < location-1; index++) {
                tmpNode = tmpNode.getNext(); // references node after which we should insert a new node
            }
            Node nextNode = tmpNode.getNext(); // this is immediate nxt node after new node
            tmpNode.setNext(nextNode); // update reference of tmpNode to reference to new node
            node.setNext(nextNode); // update newly added node's next

        }
        setSize(getSize()+1);


    }

    public boolean existsLinkedList(){
        return head != null;
    }

    /**
     * This method will traverse the entire Linked List and will print all its elements...
     */
    public void traverseLinkedList(){
        if (existsLinkedList()){
            Node tmpNode = head;
            for (int i = 0; i < getSize(); i++) {
                System.out.println(tmpNode.getData());
                if (i!=getSize()-1){
                    System.out.println(" ->");
                }
                tmpNode = tmpNode.getNext();
            }



        }
        else{
            System.out.println("Linked List does not exists !");
        }
        System.out.println("\n");

    }








}
