import copy

org = [0,1,2,3,4]
cpy = copy.copy(org)
cpy[0] -= 10
print(cpy)
print(org)