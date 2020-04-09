package LinkedList.SingleLL;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        list.createSingleLinkedList(5);
        list.traverseLinkedList();
        list.insertLinkedList(20,2);
        list.traverseLinkedList();
        list.insertLinkedList(25,3);
        list.insertLinkedList(30,4);
        list.insertLinkedList(35,5);
        list.traverseLinkedList();
        System.out.println("Searching the node value");
        list.searchNode(30);
        System.out.println("Deleting the node at the location = 2");
        System.out.println("Before deletion");
        list.traverseLinkedList();
        System.out.println("After deletion");
        list.deletionOfNode(2);
        list.traverseLinkedList();
        System.out.println("Now deleting the entire LinkedList");
        list.deleteLinkedList();
        list.traverseLinkedList();
    }
}
