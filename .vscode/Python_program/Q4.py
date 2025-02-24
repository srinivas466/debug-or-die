def factorial(n):
    result = 1
    for i in range(1, n+1):
        result *= i
    return results

num = int(input("Enter a number to calculate factorial: "))
if num < 0:
    print("Factorial not defined for negative numbers.")
else:
    print("Factorial of", num, "is:", factorial(num))