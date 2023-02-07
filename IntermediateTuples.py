#tuples can't be changed after creating and uses parenthesis unlike can be change or brackets
import sys, timeit
myTuple = ("Max", 28, "Boston")
print(myTuple)


if "Boston" in myTuple:
    print("Yes")
else:
    print("No")

item = myTuple[0]
print(item)

for i in myTuple:
    print(i)


my_tuple = ('a','p','p','l','e')
print(len(my_tuple))
print(my_tuple.count('p'))
print(my_tuple.index('p'))



myList = list(my_tuple) #converts a tuple into a list
print(myList)





my_tuple2 = tuple(myList)





a = (1,2,3,4,5,6,7,8,9,10)


b = a[2:5] # it takes index 2 3 and 4, the last index substarcts 1
print(b)


c = a[:: - 1] # prints the list in reverse order 10,9,8,7,6,5,4,3,2,1
print(c)


d = a[2 :] # prints 3,4,5,6,7,8,9,10
print(d)




e = a[:: 1] #1,2,3,4,5,6,7,8,9,10
print(e)


f = a[:: 2] #1,3,5,7,9
print(f)



g = a[:: 3] #1,4,7,10
print(g)

myTup = "Max",28,"Boston"
name, age, city = myTup
print(name)
print(age)
print(city)


myTup2 = (0,1,2,3,4)
i1,*i2,i3 = myTup2

print(i1)
print(i3)
print(i2) # this gets converted into a list


AList = [0,1,2,3,"hello",True]
ATuple = (0,1,2,"hello",True)
print(sys.getsizeof(AList),"bytes")
print(sys.getsizeof(ATuple),"bytes")





print(timeit.timeit(stmt = "[0,1,2,3,4,5]"), number=1000) #100 times we want to create a list and gives the time needed to create the list
print(timeit.timeit(stmt = "(0,1,2,3,4,5)"), number=1000)#100 times we want to create a tuple and gives the time needed to create the tuple






