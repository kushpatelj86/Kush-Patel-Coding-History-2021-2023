def mygenerator():
    yield 1
    yield 2
    yield 3

    
print()



g = mygenerator()
print(g) #prints memort adress


print()



for i in g:
    print(i)











print()




value = next(g)
print(value) #print 1



value = next(g)
print(value) #print 2



value = next(g)
print(value) # print 3 if you do value another time there'll be a error


print()


print(sum(g)) #prints the sum

print()
print(sorted(g)) # returns a new list
print()





print()

def countdown(num):
    print("Starting")
    while num > 0:
        yield num
        num -= 1


cd = countdown(4)
value = next(cd)
print(value) #pritn starting
print(next(cd)) #print 4
print(next(cd)) #print 3
print(next(cd)) #print 2
print(next(cd)) #print 1 after doing this there will be a error












