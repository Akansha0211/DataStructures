package Queues;

public class MyQueue {
    private Node front; // works as like head
    private Node rear;  // works as like tail
    private int size;  // size of the queue

    MyQueue(){
        front = null; // creating a blank Queue
        rear = null;
        size = 0;
    }

    /**
     * This method will check whether the Queue is Empty
     * @return true if Queue is empty or else return false
     */
    public  boolean isEmpty(){
        boolean response = false;
        if (size == 0){
            response = true;
        }
         return response;
    }
}
