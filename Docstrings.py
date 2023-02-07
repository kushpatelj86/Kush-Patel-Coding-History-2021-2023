#DocStrings

"""Dog module, this module does so many things"""




def increment(n):
    """Increment a number""" #a doc string has thre " on each side
    return n + 1




class Dog:
    """A class representing a dog"""
    def __init__(self,name,age):
        self.name = name
        self.age = age

    def bark(self):
        """Let the dog bark"""
        print("WOF!")



print(help(Dog)) #give information about the class


