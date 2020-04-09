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
    }
}
