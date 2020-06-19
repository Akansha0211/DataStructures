package Trees.BinaryTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        BT binaryTree = new BT();
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

    }
}
