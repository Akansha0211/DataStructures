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

}
