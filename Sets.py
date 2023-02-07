#sets dont allow duplicate elements

mySet = {1,2,3,1,2} #only one of each element is set
print(mySet)

# if you want a empty set use the set function

myset = set("Hello") #creates a set, seperates each character
print(myset)

miset = set() #if you want an empy set use the set function or else it would intepret it as a dictioanry

miset.add(1)
miset.add(2)
miset.add(3) #adds a element to the set

miset.remove(3) # causes error if the element isn't include
print(miset)
miset.discard(4) #doesn't cause error if the element isn't include
print(miset)

print(miset)

print(miset.pop()) #removes the first element from our set
print(miset)


for i in mySet: #looping through a set
    print(i)



if 1 in mySet:
    print("yes")


odds = {1,3,5,7,9}
evens  = {0,2,4,6,8}
primes = {2,3,5,7}


u = odds.union(evens)#combines elements from two sets without duplicates
print(u)



i = odds.intersection(evens) # you get an empty set becasue odds and even dont have any of the same elements
print(i)


a = odds.intersection(primes) # returns 3,5,7becuase both set have the same elements

setA = {1,2,3,4,5,6,7,8,9}
setB ={1,2,3,10,11,12}


diff1 = setA.difference(setB) #returns the last 6 elements of set A
print(diff1)


diff2 = setB.difference(setA) # returns the last three elements of set b 
print(diff2)


symDiff1 = setA.symmetric_difference(setB)#returns the different elements from set A and b but not elements from both sets if they are the same
print(symDiff1)

symDiff2 = setB.symmetric_difference(setA) #returns the different elements from set A and b but not elements from both sets if they are the same 
print(symDiff2)


setC = {1,2,3,4,5,6,7,8,9}
setD ={1,2,3,10,11,12}


setC.update(setD) #updates the set by adding elements from a another set that isn't in the current set or the other set
print(setC)
setCa = {1,2,3,4,5,6,7,8,9}
setDb ={1,2,3,10,11,12}

setDb.update(setCa) #updates the set by adding elements from a another set that isn't in the current set or the other set
print(setDb)








setEa = {1,2,3,4,5,6,7,8,9}
setFa ={1,2,3,10,11,12}

setEa.intersection_update(setFa) #only keeps elements found in both sets
print(setEa)

setEb = {1,2,3,4,5,6,7,8,9}
setFb ={1,2,3,10,11,12}

setFb.intersection_update(setEb) #only keeps elements found in both sets
print(setFb)

setG = {1,2,3,4,5,6,7,8,9}
setH ={1,2,3,10,11,12}

setG.difference_update(setH) #updates set by removing elements found in both sets when comparing
print(setG)

setI = {1,2,3,4,5,6,7,8,9}
setJ ={1,2,3,10,11,12}

setJ.difference_update(setI) #updates set by removing elements found in both sets when comparing
print(setJ)

setK = {1,2,3,4,5,6,7,8,9}
setL ={1,2,3,10,11,12}

print(setK.issubset(setL)) # checks to see if all elements are in the same order with the other  set if larger
print(setL.issubset(setK)) # checks to see if all elements are in the same order with the other  set if larger



print(setK.issuperset(setL)) # checks to see if first set contains all the numbers from the second set
print(setL.issuperset(setK)) #  checks to see if first set contains all the numbers from the second set


print(setK.isdisjoint(setL)) # checks to see if both have a null intersection so no same elements
print(setL.isdisjoint(setK)) # checks to see if both have a null intersection so no same elements





setM = {1,2,3,4,5,6,7,8,9}
setN ={1,2,3,10,11,12}



setN = setM #keeps both sets always the same
setN.add(7)
print(setN)
print(setM)

a = frozenset([1,2,3,4])#you can't change a frozen set after its creation
print(a) 
