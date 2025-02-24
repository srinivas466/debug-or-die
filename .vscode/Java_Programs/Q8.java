//Problem Statement
//Write a Java program to print the Fibonacci series up to n terms.

import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter number of terms: ");
        n = sc.nextInt();

        int a = 0, b = 1, c;
        for(int i = 1; i <= n; i++) {
            System.out.println(a);
            a = b;
            b = c; 
            c = a + b;
        }
    }
}

//Expected Output

       // Enter number of terms: 5
        //0 1 1 2 3 
        

