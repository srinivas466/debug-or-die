//Problem Statement
//Write a Java program to reverse a given number.

import java.util.Scanner;

class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, reverse;
        System.out.println("Enter a number: ");
        num = sc.nextInt();

        while(num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit; 
            num /= 10;
        }

        System.out.println("Reversed number: " + reverse);
        sc.close();
    }
}

//Expected Output
        //Enter a number: 1234
        //Reversed number: 4321

