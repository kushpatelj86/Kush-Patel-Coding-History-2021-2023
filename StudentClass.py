class StudentClass:

    def __init__(self, name, major, gpa, is_on_probation): #creating a constructor
        self.name = name
        self.major = major
        self.gpa = gpa
        self.is_on_probation = is_on_probation



    print("Class functions") #equivalent to methods in java

    def on_honor_roll(self): 
        if self.gpa >= 3.5:
            return True
        else:
            return False



