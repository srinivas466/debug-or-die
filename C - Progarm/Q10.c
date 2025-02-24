//Question:
The following program tries to return a float from an int function, causing an issue.

#include <stdio.h>

int getAverage(int a, int b) {
    return (a + b) / 2.0; // Error: Integer division
}

int main() {
    printf("Average: %d", getAverage(4, 5));
    return 0;
}

//Expected Output
    Average: 4.50
