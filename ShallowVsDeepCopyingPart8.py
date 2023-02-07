import copy

org = [[0,1,2,3,4],[5,6,7,8,9]]

cpy = copy.copy(org)

cpy[0][1] = -10
print(cpy)
print(org)