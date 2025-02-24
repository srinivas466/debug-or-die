//Problem Statement
//Write a Java program to find the largest element in an array.

import java.util.Scanner;

class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, max;
        System.out.println("Enter the number of elements: ");
        n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements: ");
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        for(int i = 1; i < n; i++) {
            if(arr[i] > max) 
                max = arr[i];
        }

        System.out.println("Largest element: " + max);
        sc.close();
    }
}

//Expected Output
        //Enter the number of elements: 5
        //Enter the elements: 2 8 1 6 4
        //Largest element: 8

