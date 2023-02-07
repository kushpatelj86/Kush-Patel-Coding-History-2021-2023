numbers = [1,2,3,4,5]

isEven = lambda a: a % 2 == 0


result = filter(isEven,numbers)
print(list(result))