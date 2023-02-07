#functions/methods are a collection or set of code that performs a specfice task and they help organize the code

def sayhi():#we have to use def if we want to create a fucntion
     print("Hello my name is chris")


sayhi() # we are using the method right now and it wil ldo stuff that is  written on the indented part of it


def say_hi(name): # the stuff listed inside the parenthesis of a function is called a parameter
    print("Hello " + name)

say_hi("Ethan")

def sayHello(name, age): #we can have up to as many parameters as we want adn we need to use , to seprate a parameter
    print("Hello " + name + " , you are " + age)

sayHello("William", "18")