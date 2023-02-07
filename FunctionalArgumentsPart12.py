def foo():
    global number
    x = number
    number = 3
    print("Number inside function: ",x)






number = 0
foo()
print(number)