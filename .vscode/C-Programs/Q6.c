//Problem Statement
//Write a program to check whether a given number is prime.

#include <stdio.h>

int main() {
    int n, i, flag = 0;
    printf("Enter a number: ");
    scanf("%d", n); 

    for(i = 2; i < n/2; i++) { 
        if(n % i == 0) {
            flag = 1;
            break;
        }
    }

    if (flag = 0) 
        printf("Prime number");
    else
        printf("Not a prime number");

    return 0;
}

//Expected Output
    
    //Enter a number: 7
    //Prime number
