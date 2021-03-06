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

    /**
     * This method will delete the front from the Queue
     * @return the front ...
     */
    public Node dequeue(){
        Node response = null;
        if(!isEmpty()) {
            if (front == rear) {
                front = rear = null; // when there is only one Node in the Queue
                size--;
            }
            else {
                response = front;
                front = front.getNext();
                rear = front;
//                response = front;
//                rear = response.getNext();

                size--;
            }
        }
        return response;
    }

    /**
     * This method will return the front fo the Queue
     * @return front of the Queue...
     */
    public Node peek(){
        Node response = null;
        if (!isEmpty()){
            response = front;
            //response = rear.getNext();
        }
        return response;
    }

    /**
     * This method will return size of the Queue
     * @return size of the Queue...
     */
    public int getSize(){
        return size;
    }

}
