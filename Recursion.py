def factorial(n):
    if n <= 1: #base case that stopps the recursiion and if there was no base case, there would be infinite recursion
        return 1
    else:
        return n * factorial(n - 1)









print(factorial(5))