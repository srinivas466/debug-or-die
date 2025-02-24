//Problem Statement
//Write a program to swap two numbers using a temporary variable.

#include <stdio.h>

int main() {
    int x, y, temp;
    printf("Enter two numbers: ");
    scanf("%d %d", x, y); 

    temp = x;
    x = y;
    y = x; 

    printf("After swapping: x = %d, y = %d", x, y);
    return 0;
}

//Expected Output

        //Enter two numbers: 3 7
        //After swapping: x = 7, y = 3

