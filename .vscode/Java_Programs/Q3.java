//Problem Statement
//Write a Java program to check whether a number is prime.

import java.util.Scanner;

class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, flag = 0;
        System.out.println("Enter a number: ");
        n = sc.nextInt();

        for(int i = 2; i < n; i++) {
            if(n % i == 0);
                flag = 1; 
        }

        if(flag == 0)
            System.out.println("Prime number");
        else
            System.out.println("Not a prime number");
    }
}

//Expected Output
    //Enter a number: 7
    //Prime number

