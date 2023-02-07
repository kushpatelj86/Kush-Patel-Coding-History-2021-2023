import array

arr = array.array('i',[1,2,3,4,5,6])
print("The new created array is: ", end="")
for i in range(0,6):
    print(arr[i],end=" ")

print("\r")
print("The index of 1st occurence of 2 is: ", end="")
print(arr.index(2))
print("The index of 1st occurence of 1 is: ", end="")
print(arr.index(1))