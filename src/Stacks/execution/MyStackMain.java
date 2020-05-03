package Stacks.execution;

import Stacks.definition.MyStack;

import java.util.Scanner;

public class MyStackMain {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        Scanner scanner = new Scanner(System.in);

        int choice = 0;
        while(true){
            System.out.println(" Press 1 for Push i.e inserting an item at the top of the Stack");
            System.out.println("Press 2 for peek ");
            System.out.println("Press 3 for pop i.e removing an item from the top of the Stack");
            System.out.println("Press 4 to exit");

            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter the data that you want to push");
                    int data = scanner.nextInt();
                    stack.push(data);
                    break;
                case 2:
                    System.out.println("Top Of The Stack is :"+ stack.peek());
                    break;
                case 3:
                    System.out.println("Popped data is :"+ stack.pop());
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Please enter a valid choice");
            }

        }
    }
}
