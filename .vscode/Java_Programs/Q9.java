//Problem Statement
//Write a Java program to check if a string is a palindrome.


import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str, rev = "";
        System.out.println("Enter a string: ");
        str = sc.nextLine();

        for(int i = str.length(); i >= 0; i--) 
            rev += str.charAt(i);

        if(str.equals(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not a palindrome");

        sc.close();
    }
}

//Expected Output
        //Enter a string: madam
        //Palindrome

