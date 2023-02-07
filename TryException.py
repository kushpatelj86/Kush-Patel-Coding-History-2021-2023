

#we will try to run some code and instead of the program crashing we will have the program throw exception messages instead

try: 
    numerator = int(input("Numerator: "))
    denominator = int(input("Denominator: "))
    print(numerator / denominator)

except ZeroDivisionError as err:
    print(err)


except ValueError:
    print("Invalid input")