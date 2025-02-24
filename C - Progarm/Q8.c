//Question:
The following program is supposed to print numbers from 1 to 5, but it contains an error.

#include <stdio.h>

int main() {
    int i = 1;
    while (i <= 5) {
        printf("%d ", i);
        // Missing increment, causing infinite loop
    }
    return 0;
}

//Expected Output
    1 2 3 4 5 
