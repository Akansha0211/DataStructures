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

    /**
     * This method will push the node Value given as parameter on the Stack
     * @param nodeValue value which is pushed on the Stack i.e it is the top of the Stack
     */
    public void push(int nodeValue){
       Node newNode = new Node(nodeValue);
       if(head == null){
           head = newNode;
       }
       else {
           newNode.data = nodeValue;
           newNode.next = head;
           head = newNode;
       }
        System.out.println(nodeValue  + " is pushed to the Stack");
    }


}
