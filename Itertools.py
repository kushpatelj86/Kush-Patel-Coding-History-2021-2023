#itertools:products,permutations,combinations,accumulat,groupby, and  infinite iterators
#permutations return all possible orderings
from itertools import product, permutations, combinations, combinations_with_replacement,accumulate,groupby,count,cycle,repeat
import operator
a = [1,2]
b = [3,4]
prod = product(a,b) #cartesian product
print()
print(prod) #print the adress
print()

print(list(prod)) #print the products
print()

prod2 = product(a,b,repeat=2)
print(prod2)
print()

c = [1,2,3]
perm = permutations(c)
print()

print(perm) #print the adress
print()

print(list(perm)) #print the products
print()

perm2 = permutations(c,2)
print(perm2) #print the adress
print()

print(list(perm2)) #print the products
print()

d = [1,2,3,4]

comb = combinations(d, 2) # second paramater gives the length
print(comb)

print()

comb_wr = combinations_with_replacement((d, 2))
print(list(comb_wr))
print()


acc = accumulate(d)
print(d)
print(list(acc))
print()

e = [1,5,3,4]

acc2 = accumulate(e,func=operator.mul)
print(e)
print(list(acc2))
print()



f = [1,2,5,3,4]

acc3 = accumulate(f,func=max)
print(f)
print(list(acc3))
print()


def smaller_than_3(x):
    return x < 3


g = [1,2,3,4]
group_obj = groupby(g,key=smaller_than_3)
for key, val in group_obj:
    print(key,list(val))




print()


h = [1,2,3,4]
group_obj2 = groupby(g,key=lambda x: x<3)
for key, val in group_obj:
    print(key,list(val))




print()



persons = [{'name':'Tim', 'age' : 25},{'name':'Dan', 'age' : 25},{'name':'Lisa', 'age' : 27},{'name':'Claire', 'age' : 28}]

group_obj2 = groupby(g,key=lambda x: x['age'])
for key, val in group_obj:
    print(key,list(val))


print()

for i in count(10):
    print(i)
    if i == 15:
        break




k = [1,2,3]
for k in cycle(10):
    print(k)


for l in repeat(1, 4):
    print(1)





