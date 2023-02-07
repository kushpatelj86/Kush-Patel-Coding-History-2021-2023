#operator overloading
class Dog:


    def __init__(self, name, age):
        self.name = name
        self.age = age
    def __gt__(self,other):
        return True if self.age > other.age else False




roger = Dog('Roger',8)
sid = Dog('Sid',7)




print(roger > sid)



#there are so many examples of operators such as 

#__lt__() responds to <
#__add__ responds to +
#__sub__ responds to -
#__mul__ responds to *
#__truediv__ responds to /
#__floordiv__ responds to //
#__mod__ responds to %
#__pow__ responds to **
#__rshift__ responds to >>
#__lshift__ responds to <<
#__and__ responds to &
#__or__ responds to | 


