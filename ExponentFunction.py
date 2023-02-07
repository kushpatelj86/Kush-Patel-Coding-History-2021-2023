print( 2**3) # prints out 8 becuase ** means exponent




#we wil create a easier function 
def pow(base, exp):
    init_num = 1
 
 
    for i in range(exp):
        init_num *= base
 
    return init_num
    



print(pow(3,4))