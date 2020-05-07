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

}
