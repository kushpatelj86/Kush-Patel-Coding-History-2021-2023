from timeit import default_timer as timer









my_string = """ Hello \
World"""# doesn't create a new line
print(my_string)

substring1 = my_string[1:5] #really 1 : 4
print(substring1)


substring2 = my_string[:5] # starts from index zero and ends at index 4
print(substring2)


substring3 = my_string[5:] # starts from index 5 to the end
print(substring3)

for i in my_string:
    print(i)

if 'e' in my_string:
    print('yes')
else:
    print("no")


my_dtring2 = '                     Hello Wold          '
my_dtring2 = my_dtring2.strip() #removes the spaces
print(my_dtring2)




my_string3 = 'Hello World'
print(my_string3.startswith('Hello')) #checks to see if from index zero the the length of the parameter  it starts
print(my_string3.endswith('Hello')) #checks to see if from lastindex of both strings to the length of the parameter, but it loops backward  it starts

print(my_string3.find('e')) #returns the first index where that character is located at
print(my_string3.count('e')) #returns the num times e is found


print(my_string3.replace('World', 'Universe')) #if the left parameter has a word that isn't located in a string, it doesn't get replaced with the left paramer


MiString = 'how are you doing'
my_list = MiString.split(" ") # puts each word seprstly after a parameter is given into a list
print(my_list)


new_string = ''.join(my_list) # converts a list back into a string, and concatenates all of the lements in the list, the obejct before .join() is the concatenation we use
print(new_string)





my2_list = ['a'] * 6 # clones this element into a lsit
print(my2_list)

start1 = timer()
mrlsit = ''
for i in mrlsit: #creates from list into string the longer and dirtier wayy
    mrlsit += i
stop1 = timer()
print(mrlsit)
print(stop1 - start1)


my3_list = ['a'] * 6 # clones this element into a lsit

start2 = timer()
print(my3_list)
mu_string = ''.join(my3_list)#creates from list into string the faster and cleaner wayy
stop2 = timer()
print(stop2 - start2)




mjString = ''





var = 'Tim'
my_string4 = "the vairable is %2s+" % var # %s gives spaces
print(my_string4)
var2 = 4.2465436

my_string5 = "the variable %d" % var #gives the full number
print(my_string5)

my_string6 = "the variable 9s #.2f" % var #rounds to two digits
print(my_string6)


my_string7 = "the variable is {:.2f} and {:.2f}.format(var)"
print(my_string7)


