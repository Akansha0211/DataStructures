package Queues.CircularQLinkedList;

public class MyQueue {
    private Node front;
    private  Node rear;
    private int size ;


    MyQueue(){
        front = rear = null;
        size = 0;
    }

    /**
     * This method will check whether the Queue is Empty or not
     * @return true if the Queue is Empty otherwise return false...
     */
    public boolean isEmpty(){
        boolean response = false;
        if(front == null){
            response = true;
        }
        return response;
    }

    /**
     * This method will insert an element in the Queue
     * @param nodeValue which is to be inserted...
     */
    public void enQueue(int nodeValue){
        Node node = new Node(nodeValue);
        if(front == null){
            //  only one node in the Queue which is self pointing  i.e front and rar points to same node
            front = rear = node;
            size++;
        }
        else {
            rear = node;
            // circular behaviour of Queue
            rear.setNext(front.getNext());
            size++;
        }

    }

}
