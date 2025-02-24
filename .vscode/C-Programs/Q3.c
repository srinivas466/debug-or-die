//Problem Statement
//Write a program to compute the factorial of a number.


#include <stdio.h>

int main() {
    int n, fact = 1, i;
    printf("Enter a number: ");
    scanf("%d", n); 
    for(i = 1; i < n; i++) 
        fact *= i;
    printf("Factorial is: %d", fact);
    return 0;
}

//Expected Output

    //Enter a number: 5
    //Factorial is: 120
