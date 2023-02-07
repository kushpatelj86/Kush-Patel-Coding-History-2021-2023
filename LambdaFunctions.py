from functools import reduce
add10 = lambda x: x + 10
print(add10(5)) #prints 15

def add10_function(x):
    return x + 10



mult = lambda x,y: x * y
print(2,7) #prints 14




points2D = [(1,2),(15,1),(5,-1),(10,4)]






points2D_sorted = sorted(points2D)
points2D_sortedKey = sorted(points2D, key=lambda x: x[0] + x[1])
print(points2D)
print(points2D_sorted)


a = [1,2,3,4,5]
b = map(lambda x: x*2, a)
print(list(b))

c = [ x*2 for x in a]
print(c)






d = [1,2,3,4,5,6]
e = filter(lambda x : x%2==0, a)
print(e)

f = [x for x in a if  x%2==0]

g = [1,2,3,4,5,6]

product_g = reduce(lambda x, y: x*y, g)

print(product_g)