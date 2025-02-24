//Question:
The following program tries to print an array element but has an error. 

#include <stdio.h>

int main() {
    int arr[3] = {1, 2, 3};
    printf("Fourth element: %d", arr[3]); // Error: Index out of bounds
    return 0;
}

//Expected Output
    Third element: 3
