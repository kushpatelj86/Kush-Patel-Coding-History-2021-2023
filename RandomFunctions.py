import random,secrets
import numpy as np
a = random.random() #prints a random float
print(a)


b =random.uniform(1,10) #produces a random float from 1 to 10
print(b)



c = random.randint(1,10) #prints a random int from 1 to 10 with lower and upper bounds included
print(c)




d = random.randrange(1,10) #prints a random int from 1 to 10 with upper bounds not included
print(d)


e = random.normalvariate(0,1) #from a normal distribution with a  mean of 0 and standard deviation of 1




myList = list("ABCDEFGH")
print(myList)

f = random.choice(myList) #grabs one values from a list
print(f)

g = random.sample(myList,3)#grabs multiple values from a list
print(g)

h = random.choices(myList, k=3) 
print(h)


random.shuffle(myList) # shuffles the list
print(myList)


random.seed(1)
print(random.random())
print(random.randint(1,10))

random.seed(2)
print(random.random())
print(random.randint(1,10))





i = secrets.randbelow(10) #prints a integer from 0 to 10 and 10 is not included
print(i)


j = secrets.randbits(4) #returns an integer with the number of bits in a paramater
print(j)


k = secrets.choice(myList)#picks a random choice that not reproducable
print(k)


list = np.random.rand(3) # produces a 1d array with a number of elements specified in the parameter
print(list)

list2D = np.random.rand(2,3) # produces a 2 by 3 array with a number of elements specified in the parameter
print(list)

list3D = np.random.rand(3,3) # produces a 3 by 3 array with a number of elements specified in the parameter
print(list)


l = np.random.randint(0,10,3)
print(l)


m = np.random.randint(0,10,(3,4))
print(m)


arr = np.array([1,2,3],[4,5,6],[7,8,9])
print(arr)


