import random
feet_in_mile = 5280
meters_in_kilometer = 1000
beatles =["John Lennin", "Paul Mccartney", "George Harrison", "Ringo Star"]


def get_fil_ext(filename):
    return filename[filename.index(".") + 1:]



def roll_dice(num):
    return random.randit(1,num)