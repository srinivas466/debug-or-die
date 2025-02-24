//Problem Statement
//Write a Java program to find the sum of digits of a number.

import java.util.Scanner;

class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, sum;
        System.out.println("Enter a number: ");
        num = sc.nextInt();

        while(num != 0) {
            sum += num % 10; 
            num /= 10;
        }

        System.out.println("Sum of digits: " + sum);
        sc.close();
    }
}

//Expected Output
        //Enter a number: 123
        //Sum of digits: 6


