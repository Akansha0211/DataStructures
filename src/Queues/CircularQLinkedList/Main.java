package Queues.CircularQLinkedList;

public class Main {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enQueue(1000);
        queue.enQueue(2000);
        System.out.println(queue.getSize());
        System.out.println(queue.peek().getData());
//        Node delete = queue.dequeue();
//        if (delete != null){
//            System.out.println(delete.getData()+ " is deleted from the Queue");
//        }
        System.out.println(queue.dequeue().getData() + " is deleted from the Queue");
    }
}
