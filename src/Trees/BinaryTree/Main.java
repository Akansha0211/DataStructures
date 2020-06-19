package Trees.BinaryTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        BT binaryTree = new BT();
        char ch;
        do{
            System.out.println("Enter your choice\n" +
                    "Press 1 to insert an element\n" +
                    "Press 2 to search an element\n" +
                    "Press 3 to check if empty");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter an integer element that you want to insert");
                    binaryTree.insert(scanner.nextInt());
                    break;
                case 2:
                    System.out.println("Enter an integer element that you want to search");
                    binaryTree.search(scanner.nextInt());
                    break;
                default:
                    System.out.println("Wrong Entry");
                    break;

            }
            System.out.println("\n Post Order:");
            binaryTree.postOrder();
            System.out.println("\n Pre Order:");
            binaryTree.preOrder();
            System.out.println("\n InOrder:");
            binaryTree.inOrder();

            System.out.println("Do you want to continue (Type y or n)\n");
            ch = scanner.next().charAt(0);

        }while (ch== 'Y'|| ch == 'y');
    }
}
