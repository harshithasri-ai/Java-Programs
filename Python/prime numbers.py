# Program to display all prime numbers within an interval

# Input the interval
lower = int(input("Enter the lower limit: "))
upper = int(input("Enter the upper limit: "))

print("Prime numbers between", lower, "and", upper, "are:")

# Check each number in the interval
for num in range(lower, upper + 1):

    if num > 1:
        is_prime = True

        # Check for factors
        for i in range(2, int(num**0.5) + 1):
            if num % i == 0:
                is_prime = False
                break

        # Display the prime number
        if is_prime:
            print(num, end = " ")
