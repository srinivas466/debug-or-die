//Problem Statement
//Write a C program to find the largest among three numbers.


#include <stdio.h>

int main() {
    int a, b, c;
    printf("Enter three numbers: ");
    scanf("%d %d %d", a, b, c); 

    if (a > b && a > c)
        printf("%d is the largest", a);
    else if (b > a && b > c)
        printf("%d is the largest", b);
    else
        printf("%d is the largest", c);

    return 0;
}
//Expected Output
    //Enter three numbers: 5 8 3
    //8 is the largest

