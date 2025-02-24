//Question:
The following C program is intended to print the sum of two numbers. However, it contains an error that prevents it from compiling successfully. Identify the error and correct the program.

#include <stdio.h>

int main() {
    int a = 5, b = 10;
    printf("The sum is: " sum(a, b));
    return 0;
}

int sum(int x, int y) {
    return x + y;
}

//Expected Output :

    The sum is: 15
