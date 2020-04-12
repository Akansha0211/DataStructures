package LinkedList.CircularSLL;

public class CircularSLLMain {
    public static void main(String[] args) {
        CircularSingleLinkedList list = new CircularSingleLinkedList();
        list.createSingleLinkedList(5);
        list.insertInsertLinkedList(10,1);
        list.insertInsertLinkedList(15,2);

        System.out.println("Linked List now :");
        list.traverseLinkedList();

        list.insertInsertLinkedList(30,2);
        list.traverseLinkedList();

        System.out.println("Searching node with value 15 ....");
        list.searchNode(15);

        System.out.println("Deleting the node");
        System.out.println("Before deletion");
        list.traverseLinkedList();
        System.out.println("After deletion");
        list.deletionOfNode(0);
        list.traverseLinkedList();

        System.out.println("Before deleting the last node");
        list.traverseLinkedList();
        list.deletionOfNode(list.getSize());
        System.out.println("After deleting the last node");
        list.traverseLinkedList();



        list.deleteLinkedList();
        list.traverseLinkedList();

    }
}
