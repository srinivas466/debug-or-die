//Question:
The following program intends to print a floating-point number but contains an error. Identify and fix it.

#include <stdio.h>

int main() {
    float num = 5.5;
    printf("The number is: %d", num); // Error: %d should be %f
    return 0;
}

//Expected Output
    The number is: 5.500000
