print("List functions: ")
friends = ["Kevin","Karen", "Jim", "Oscar"]
luckey_numbers = [4,24,5,24,25,24,2,6]
friends.extend(luckey_numbers) # combines the the two lists
print(friends)
friends.append("Chase") #adds a element to the list at the end of the list
print(friends)
friends.insert(2,"Ethan") #adds a element at a specific index you want to add it the left  parameter is index location, and right parameter is the leement where it is located
print(friends)
friends.remove("Karen") # removes which element you want to remove if the lement doesn't exisit an error will show up
print(friends)
friends.pop() #removes the last element of a list
print(friends.index("Kevin")) #returns the index where that ellement is located if that element isn't located it will return a error
print(friends.count("Karen")) #returns the number of times that element is located
print(len(friends)) #returns the length of that list
friends.clear() #removes everey element from the lsit
print(friends)


