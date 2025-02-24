//Problem Statement
//Write a Java program to swap two numbers without using a third variable.

import java.util.Scanner;

class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();

        a = a + b;
        b = a - b;
        a = b - a; 

        System.out.println("After swapping: " + a + " " + b);
    }
}

//xpected Output
    //Enter two numbers: 3 7
    //After swapping: 7 3

