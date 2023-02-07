print(end="Enter the Size of Array: ")
tot = int(input())
arr = []
print(end="Enter " + str(tot) + " Elements: ")

for i in range(tot):
    arr.append(input())
print(end="\nEnter the Value to Delete: ")
val = input()
if val in arr:
    arr.remove(val)
    print("\nThe New Value to Delete:")
    for i in range(tot - 1):
        print(end=arr[i] + " ")

else:
    print("\nElement doesn't exist in the List!")