#for loops prints an exact number of times
print("Loop through a string")
for letter in "Hello, world!": #loops through all the charatcers from index 0 to length - 1
    print(letter) #prints each character in the string


print()

print("Loops through a array")
friends = ["Jim","Karen","Kevin","Bob"]

for friend in friends: #loops through array and prints each element in the array
    print(friend)


print()
print("Loops through numbers in a fixed range")
for index in range(1,10): #loops from 1 to 9
    print(index)

print()
print("Loops through numbers in a fixed range")
for index in range(10): #loops from 0 to 9
    print(index)

print()

print("Loops through a array")

for index in range(len(friends)):
    print(friends[index])
