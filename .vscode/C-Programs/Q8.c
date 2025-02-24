//Problem Statement
//Write a program to calculate the sum of digits of a given number.

#include <stdio.h>

int main() {
    int num, sum;
    printf("Enter a number: ");
    scanf("%d", num); 

    while(num != 0) {
        sum += num % 10; 
        num = num / 10;
    }

    printf("Sum of digits: %d", sum);
    return 0;
}

//Expected Output
        //Enter a number: 123
        //Sum of digits: 6

