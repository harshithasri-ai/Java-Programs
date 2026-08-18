# Program to Add and Multiply Complex Numbers

# Input first complex number
real1 = float(input("Enter the real part of first complex number: "))
imag1 = float(input("Enter the imaginary part of first complex number: "))

c1 = complex(real1, imag1)

# Input second complex number
real2 = float(input("Enter the real part of second complex number: "))
imag2 = float(input("Enter the imaginary part of second complex number: "))

c2 = complex(real2, imag2)

# Addition
addition = c1 + c2

# Multiplication
multiplication = c1 * c2

# Display results
print("\nFirst Complex Number:", c1)
print("Second Complex Number:", c2)
print("Addition:", addition)
print("Multiplication:", multiplication)
