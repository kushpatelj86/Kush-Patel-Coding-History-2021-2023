#Errors and Exceptions

x = -5
#if x < 0:
 #   raise Exception("X should be positve")



#y = -2
#assert(x >= 0), "X is not positve"




try:
    a = 5 / 0
    b = a + '10'

except ZeroDivisionError as e:
    print(e)

except TypeError as e:
    print(e)
else:
    print("Everything is fine")
finally:
    print("cleaning up...")



class ValueTooHighError(Exception):
    pass






def test_value(x):
    if x > 100:
        raise ValueTooHighError('value is to high')


try:
    test_value(200)

except ValueTooHighError as e:
    print(e)

