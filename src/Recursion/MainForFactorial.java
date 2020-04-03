package Recursion;

import java.util.Scanner;

public class MainForFactorial {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter an integer");
        int x = scan.nextInt();
        System.out.println(Factorial.factorial(x));
    }
}
