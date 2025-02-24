//Question:
The following program tries to return a value from a function, but it contains an error. Identify and fix it.

#include <stdio.h>

int add(int a, int b) {
    int sum = a + b;
} // Error: Function does not return a value

int main() {
    printf("Sum: %d", add(3, 4));
    return 0;
}

//Expected Output 
    Sum: 7
