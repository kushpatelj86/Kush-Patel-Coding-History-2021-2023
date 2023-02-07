
import sys





#using a generator vs not using a generator


def firstn(n): # not using a generator
    nums = []
    num = 0
    while num < n:
        nums.append(num)
        num += 1
    return nums


mylist = firstn(10) # we can store it in a list
print(firstn(10)) #we can directly print it
print(sum(firstn(10)))






def firstn_generator(n): #using a generator
    num = 0 
    while num < n:
        yield num
        num += 1



print(firstn_generator(10))
print(sum(firstn_generator(10)))


print(sys.getsizeof(firstn_generator(10)))
print(sys.getsizeof(firstn(10)))

#not using in a generator takes more memory than a generator takes
#we dont have to wait for all the generators until all used if we use a generator
