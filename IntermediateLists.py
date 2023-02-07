mylist = ["banana", "cherry","apple"]
print(mylist)


mylist2 = list() #equivalento to ArrayList<String> mylist2 = new ArrayList<String>() or String[] list = new String[5];
print(mylist2)



mylist3 = ["banana", True,5,5]
print(mylist3)



item = mylist[-1] #last item
print(item)

for i in mylist:
    print(i)


if "banana" in mylist:
    print("yes")
else:
    print("no")

print(len(mylist))

mylist.append("lemon") #equialent to .add() in java
print(mylist)

mylist.insert(1,"blueberry") #equialent to .add() in java
print(mylist)

mylist.remove("lemon") #equialent to .add() in java
print(mylist)


mylist.reverse() 
print(mylist)


item2 = mylist.sort()
print(item2)



new_list = sorted(mylist)

print(new_list)

other_list = mylist + mylist2

print(other_list)


aList = [1,2,3,4,5,6]

a = mylist[1 : 5]
print(a)

list_cpy = mylist3.copy()