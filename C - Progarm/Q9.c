//Question:
The following program intends to check if a number is even, but it contains an error.

#include <stdio.h>

int main() {
    int num = 4;
    if (num = 0) // Error: Should use == instead of =
        printf("Even number");
    else
        printf("Odd number");
    return 0;
}

//Expected Output
    Even number
