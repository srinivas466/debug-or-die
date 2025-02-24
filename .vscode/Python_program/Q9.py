def celsius_to_fahrenheit(celsius):
    return (celsius * 9/5) + 32

def fahrenheit_to_celsius(fahrenheit):
    return (fahrenheit - 32) * 5/9

temp = float(input("Enter temperature: "))
unit = input("Convert to (C/F): ")

if unit.upper() == "C":
    print("Temperature in Celsius:", fahrenheit_to_celsius(temp))
elif unit.upper() == "F":
    print("Temperature in Fahrenheit:", celsius_to_fahrenheit(temp))
else:
    print("Invalid unit. Please enter C or F."