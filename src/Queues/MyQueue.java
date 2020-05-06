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
}
