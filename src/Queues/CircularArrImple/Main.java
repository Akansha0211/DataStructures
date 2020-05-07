package Queues.CircularArrImple;


//STILL SOME ISSUES WITH CIRCULAR QUEUE ARRAY IMPLE...

public class Main {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enQueue(1000);
        queue.enQueue(1000);
        System.out.println(queue.getSize());
        queue.dequeue();
    }


}
