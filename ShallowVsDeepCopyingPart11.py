import copy

class Person:
    def __init__(self,name,age):
        self.name = name
        self.age = age



p1 = Person("Alex",27)
p2 = copy.copy(p1) # an acutal copy


print(p2.age)
print(p1.age)

