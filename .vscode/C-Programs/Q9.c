//Problem Statement
//Write a program to find the length of a given string.

#include <stdio.h>

int main() {
    char str[50];
    int i, length = 0;
    printf("Enter a string: ");
    gets(str); 

    while(str[i] != '\0') { 
        length++;
        i++;
    }

    printf("Length of string: %d", length);
    return 0;
}

//Expected Output
        //Enter a string: hello
        //Length of string: 5

