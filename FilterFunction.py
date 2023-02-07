numbers = [1,2,3,4,5]



def isEven(n):
    return n % 2 == 0


result = filter(isEven,numbers)
print(list(result))