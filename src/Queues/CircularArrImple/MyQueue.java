package Queues.CircularArrImple;

import java.util.Queue;

public class MyQueue {
    int front;
    int rear;
    int size;
    int[]arr = new int[size];

    MyQueue(int size){
        this.size = size;
        front = rear = -1;
        arr = new int[size];
    }

    /**
     * This method will check if the array is full
     * @return true if array is full otherwise return false...
     */
    public boolean isFull(){
        if (rear+1 == front){
            return true;
        }
        else if ((front == 0)&& (rear+1 ==size)){
            return true;
        }
        else return false;
    }

    /**
     * This method will insert the item in the  Circular Queue
     * @param value to be added....
     */
    public void enQueue(int value){
        if (isFull()){
            System.out.println("Queue is full");
        }else if (rear+1 == size){
            rear = 0;
            arr[rear] = value;
        }else {
            rear++;
            arr[rear] = value;
        }
    }

    /**
     * This method will check whether the Queue is empty or not
     * @return true if Queue is empty otherwise false...
     */
    public boolean isEmpty(){
        if(rear == -1){
            return true;
        }
        else return false;
    }


    /**
     * This method will remove the element from the Ring Buffer which is used in case of Circular Array
     * @return the deleted element from the Queue...
     */
    public int dequeue(){
        int response = 0;
        if (isEmpty()){
            System.out.println("Queue is Empty");
        }else {
            response = arr[front];
            if (rear == front){
                front = rear = -1;  // when there is only one element which is to be deleted from the Queue

            }
            else if (front+1 == size){
                front = 0;
            }
            else {
                front++;
            }

        }
        size--;
        return response;
    }

    /**
     * This method returns the front element of the Queue
     * without deleting it
     * @return front element...
     */
    public int peek(){
        if (!isEmpty()){
            return arr[front];
        }
        return Integer.parseInt(null);
    }

}
