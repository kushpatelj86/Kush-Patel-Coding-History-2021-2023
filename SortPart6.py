



friends = [
    ("Kush",4.7,"Computer Science"),
    ("Jason",4.3,"Aerospace Engineering"),
    ("Ethan",4.1,"Finance"),
    ("Carter",4.9,"Biology"),
    ("Michael",4.2,"Electrical Engineering"),
    ("Trevor",4.4,"Supply Chain Management"),
    ("Alex",4.3,"Civil Engineering"),
    ("Devan",4.5,"Industrial Engineering")    
]

GPA = lambda GPAs: GPAs[1] #sort by position of tuple



friends.sort(key=GPA)

for i in friends:
    print(i)














































