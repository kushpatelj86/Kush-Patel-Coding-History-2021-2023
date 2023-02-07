


number_file = open("1.txt","r") # reads everything in the file in java to create a file and file reader you do File MyFile = new File("1.txt") Scanner FileReader = new Scanner(MyFile)
#number_file = open("1.txt","w") # writes everything in the file in java to create a file and file reader you do File MyFile = new File("1.txt") Scanner FileReader = new Scanner(MyFile)
#number_file = open("1.txt","a") # adds somethings in the file in java to create a file and file reader you do File MyFile = new File("1.txt") Scanner FileReader = new Scanner(MyFile)
#number_file = open("1.txt","r+") # reads and write somethings in the file in java to create a file and file reader you do File MyFile = new File("1.txt") Scanner FileReader = new Scanner(MyFile)

print()



print(number_file.readable())
print()

print(number_file.readline()) #reads the first line
print()

print(number_file.readline()) #reads the second line
print()

print(number_file.readlines()) #reads the all lines ina file and puts them in a list/array
print()
#print(number_file.readlines()[1]) 


print()

for number in number_file.readlines():
    print(number)
    
print()






number_file.close()

