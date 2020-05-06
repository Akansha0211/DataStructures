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

//    public void enQueue(int value){
//
//    }

}
