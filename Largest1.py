# Python program to find the largest among three numbers

# Input three numbers
num1 = 10
num2 = 20
num3 = 30

# Find the largest number
if num1 >= num2 and num1 >= num3:
    largest = num1
elif num2 >= num1 and num2 >= num3:
    largest = num2
else:
    largest = num3

# Display the result
print("The largest number is:", largest)
