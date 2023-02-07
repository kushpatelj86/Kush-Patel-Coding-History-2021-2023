arr= [10,22,36,35,33]
temp = 0


#displaying the elements of original array
print("Elements of orginal array")
for i in range(0, len(arr)):
    print(arr[i], end=" ")

#sort the array in ascending order
for i in range(0, len(arr)):
    for j in range(i + 1, len(arr)):
        if (arr[i] > arr[j]):
            temp = arr[i]
            arr[i] = arr[j]
            arr[j] = temp
print()
#Displaying elements of the array after sorting
print("Elements of array in asccending order")
for i in range(0, len(arr)):
    print(arr[i], end=" ")
