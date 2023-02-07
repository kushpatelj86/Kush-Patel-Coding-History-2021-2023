#sort() method = used with lists
#sort() function = used with iterables

friends = (
("Kush",4.7,"Computer Science"),
("Jason",4.3,"Aerospace Engineering"),
("Ethan",4.1,"Finance"),
("Carter",4.9,"Biology"),
("Michael",4.2,"Electrical Engineering"),
("Trevor",4.4,"Supply Chain Management"),
("Alex",4.3,"Civil Engineering"),
("Devan",4.5,"Mechanical Engineering")
)

GPA = lambda GPAs: GPAs[1] #sorts by position of tuple

sorted_friends = sorted(friends)

for i in sorted_friends:
    print(i)






















































