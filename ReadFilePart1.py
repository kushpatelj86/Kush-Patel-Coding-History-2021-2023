
number_file = open("1.txt","r") #reads everything in the file 

print()
print("Readable: ")
print(number_file.readable()) #returns true or false

print("First line: ")

print(number_file.readline())#read the first line
print()
print("Second line: ")

print(number_file.readline())#read the second line
print()
print("Third line: ")

print(number_file.readline())#read the third line
print()



print("List: ")
#print(number_file.readlines())#read all lines in a file and puts them in a list
print()
print(number_file.readlines()[0])#prints the first element of the list
print()



for number in number_file.readlines():
    print(number)
print()


number_file.close()










