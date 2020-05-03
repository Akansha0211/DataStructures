package Stacks.otherImple;

public class StackASLinkedList {
    Node head;
    private static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    /**
     * This method checks whether there the Stack is empty or not
     * If the Stack is Empty it will return true otherwise false
     * @return boolean value accordingly (as stated above)...
     */
    public boolean isEmpty(){
        if (head == null){
            return true;
        }
        else return false;
    }


}
