myDict = {
    "name" : "Max",
    "age" : 28,
    "city" : "New York"
}



print(myDict)
mydict = {
    "name" : "Chase",
    "age" : 18,
    "city" : "New Hampshire"
}
myDict2 = dict(name = "Mary", age = 27, city = "Boston")   #using the dict function to create a dictionary
print(myDict2)


mergedictioanries = mydict.update(myDict2) # addsa these two dictorinaries together
print(mergedictioanries)

value = myDict["name"] # accessing the value

myDict["Email"] = "Max.E@gmail.com" #setting a new value
print(myDict)

del  myDict["name"]
print(myDict)   # remove the pair is not part of the dictionary

myDict.pop("age") #removes the diction
print(myDict)

mydict.popitem()
print(mydict)

if "name" in mydict:
    print(mydict["name"])


try:
    print(mydict["name"])
except:
    print("Error")


for key in mydict:
    print(key)


for key in mydict.keys():
    print(key)


for value in mydict.values():
    print(key)


for key, value in mydict.items():
    print(key, value)

mydictcp2 = mydict.copy() # orginal one doesnt change
mydictcp3 = dict(mydict)
mydictcp2["email"] = "mabc@yahoo.com"
print(mydictcp2)
print(mydict)
print(mydictcp3)

mydict_cpy = mydict # coppying dictioanries and original one does change
print(mydict_cpy)
mydict_cpy["email"] = "mcy@yahoo.com"
print(mydict_cpy)
print(mydict)











