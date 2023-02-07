#collections:Counter,namedtuple,OrderedDict,defaultdict,deque


from collections import Counter, namedtuple, OrderedDict, defaultdict, deque
#counter
a = "aaaaaaaabbbbbbbcc"
my_counter = Counter(a)
print(my_counter)


print(my_counter.keys())
print(my_counter.values())
print(my_counter.most_common(1))
print(my_counter.most_common(2))
print(my_counter.most_common(1)[0][0])
print(list(my_counter.elements()))

#namedtuple
Point = namedtuple('Point','x,y')
pt = Point(1,-4)
print(pt)
print(pt.x, pt.y)

#ordereddict
ordered_dict = OrderedDict()
ordered_dict['a'] = 1
ordered_dict['b'] = 2
ordered_dict['c'] = 3
ordered_dict['d'] = 4
print(ordered_dict)




#defaultdict

d = defaultdict(int)

d['a'] = 1
d['b'] = 2
print(d['a'])
print(d['b'])
print(d['c'])#return default integer


#deque
de = deque()
de.append(1)

print(de)

de.append(2)
print(de)

de.appendleft(3)
print(de)

de.pop() #removes the last element
print(de)

de.extend([4,6,7])
print(de)

de.extendleft([5,8,9])
print(de)

de.rotate(1)
print(de)
de.rotate(2)
print(de)
