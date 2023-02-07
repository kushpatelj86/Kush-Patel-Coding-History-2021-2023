number_file = open("1.txt","w") #writes everything in a file
print()

print(number_file.readable()) #returns true or false



print()
print(number_file.readline()) #writes the second line


print()
print(number_file.readline()) #writes the third line


print()
print(number_file.readlines()) #writes all the lines and puts them in a list
print()
#print(number_file.readlines()[0]) #writes the first element in the list


for number in number_file.readlines():
    print(number)




print()



number_file.close()