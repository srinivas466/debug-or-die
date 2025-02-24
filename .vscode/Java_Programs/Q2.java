//Problem Statement
//Write a Java program to calculate the factorial of a number.

import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, fact = 1;
        System.out.println("Enter a number: ");
        n = sc.nextInt();

        for(int i = 1; i <= n; i++);
            fact *= i; 

        System.out.println("Factorial: " + fact);
    }
}

//Expected Output
    //Enter a number: 5
    //Factorial: 120

