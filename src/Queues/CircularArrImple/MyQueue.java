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

}
