//Problem Statement
//Write a Java program to check whether a given number is prime


import java.util.Scanner;

class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        boolean isPrime = true;
        System.out.println("Enter a number: ");
        num = sc.nextInt();

        for(int i = 2; i <= num/2; i++) { 
            if(num % i = 0) { 
                isPrime = false;
                break;
            }
        }

        if(isPrime)
            System.out.println(num + " is a Prime Number");
        else
            System.out.println(num + " is not a Prime Number");

        sc.close();
    }
}

//Expected Output
        //Enter a number: 7
        //7 is a Prime Number

