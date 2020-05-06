package Queues;

public class Main {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enQueue(1000);
        System.out.println(queue.getSize());
        System.out.println(queue.peek().getData()+ " is at the front");
        queue.enQueue(10500);
        queue.enQueue(25000);
        queue.dequeue();
        System.out.println(queue.peek().getData() + " is at the front");
        System.out.println(queue.getSize() + " is the size of the Queue");
    }

}
