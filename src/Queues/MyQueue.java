package Queues;

public class MyQueue {
    private Node front; // works as like head
    private Node rear;  // works as like tail
    private int size;  // size of the queue

    MyQueue() {
        front = null; // creating a blank Queue
        rear = null;
        size = 0;
    }

    /**
     * This method will check whether the Queue is Empty
     *
     * @return true if Queue is empty or else return false
     */
    public boolean isEmpty() {
        boolean response = false;
        if (size == 0) {
            response = true;
        }
        return response;
    }

    /**
     * This method will insert a element in the queue.
     * Since it is a linear queue so adding of element is at one end
     * We are here considering the rear end is end where insertion is done.
     * So can't add at the other end .Only removal of elements i.e dequeue operation can be done from the front
     *
     * @param nodeValue value which is added ....
     */
    public void enQueue(int nodeValue) {
        Node node = new Node(nodeValue); // create a node and add value to it...
        node.setNext(null);
        if (rear == null) {
            front = rear = node;
            size++;
        } else {
            rear.setNext(node);
            rear = node;
            size++;
        }
    }

    /**
     * This method will remove element from the Front of the Queue
     * @return deleted element and if no element present in The Queue then return null...
     */
    public Node dequeue() {
        Node tmpNode = null;
        if (front != null) { // checking whether the Queue is empty...
           if (front.getNext() != null){ // checking if the node to be deleted is the only node in the Queue...
               tmpNode = new Node(front.getData());
               front = front.getNext();
               size--;
           }
           else {
               tmpNode = new Node(front.getData());
               front = rear = null;
               size--;
           }
        }
        return tmpNode;  // return null if the Queue is Empty...
    }
}
