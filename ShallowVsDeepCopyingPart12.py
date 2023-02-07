import copy

class Person:
    def __init__(self,name,age):
        self.name = name
        self.age = age



class Company:
    def __init__(self, boss, employee):
        self.boss = boss
        self.employee = employee






p1 = Person("Alex",55)
p2 = Person("Joe",27)

company = Company(p1,p2)
company_clone = copy.copy(company)
company_clone.age = 56
print(company_clone.boss.age)
print(company.boss.age)
