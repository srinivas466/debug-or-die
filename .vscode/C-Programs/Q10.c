//Problem Statement
//Write a C program to generate the Fibonacci series up to n terms.

#include <stdio.h>

int main() {
    int n, a = 0, b = 1, c, i;
    printf("Enter the number of terms: ");
    scanf("%d", n); 

    printf("%d %d ", a, b);
    for(i = 2; i < n; i++) { 
        c = a + b;
        printf("%d ", c);
        a = b;
        b = c;
    }
    return 0;
}

//Expected Output
        //Enter the number of terms: 5
        //0 1 1 2 3

