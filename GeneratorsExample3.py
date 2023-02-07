import sys

mygenerator = (i for i in range(10) if i % 2 == 0)
print(list(mygenerator)) # we can convert it into a list
mylist = (i for i in range(10) if i % 2 == 0)
print(mylist) 

print(sys.getsizeof(mygenerator)) # generators take up less memory than a list
print(sys.getsizeof(mylist)) 



