is_Male = True

if is_Male:
    print("You are a male") #only will print if this returns true



is_Male = False
is_Tall = True

if is_Male:
    print("You are a male") #if true it prints this
else:
    print("You are not a male") #if false it prints this



if is_Male or is_Tall: 
    print("You are a male or tall") #will print this if one of the conditions is true
else:
    print("You are neither male or tall") #will print this if both conditions are false





if is_Male and is_Tall:
    print("You are a tall male") #will print this if both conditions are true
elif is_Male and not(is_Tall):
    print("You are a short male") #will print this if one condition is true but the other is false
elif not(is_Male) and is_Tall:
    print("You are a tall female")#will print this if one condition is true but the other is false
else:
    print("You are a short female") #will print this if the other if statements/conditions are false


def max_num(num1,num2,num3):
    if num1 >= num2 and num1 >= num3:
        return num1
    elif num2 >= num1 and num2 >= num3:
        return num2
    else:
        return num3

print(max_num(3,4,5))