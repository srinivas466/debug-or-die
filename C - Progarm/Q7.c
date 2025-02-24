//Question:
The following program tries to perform division, but it contains an error.

#include <stdio.h>

int main() {
    int a = 10, b = 0;
    printf("Result: %d", a / b); // Error: Division by zero
    return 0;
}

//Expected Output
    Cannot divide by zero.
