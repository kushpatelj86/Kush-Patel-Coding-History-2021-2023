



friends = (
("Kush",4.7,"Computer Science","Indian","Soccer","Purdue University","1 Brother and 1 Sister"," 6 3 "),
("Jason",4.3,"Aerospace Engineering","White","Baseball","Cal Poly Pomona","2 Brothers and 1 Sister"," 6 0 "),
("Ethan",4.1,"Finance","Asian/Japanese","Tennis","Cal State Fullerton","1 Brother", " 5 8 "),
("Carter",4.9,"Biology","Mexican/Latino","Cross Country and Track","UCLA","2 Brothers and 3 Sisters"," 6 2 "),
("Michael",4.2,"Electrical Engineering","White","Water Polo and Swim","Cal Poly Slo","2 Sisters", " 6 4 "),
("Trevor",4.4,"Supply Chain Management","African American","Basketball and Volleyball","University of Arizona","1 Brother and 2 Sisters"," 6 8 "),
("Alex",4.3,"Civil Engineering","White","Football","Cal Poly Pomona","1 Sister", " 6 0"),
("Devan",4.5,"Industrial Engineering","White","Lacrosse","Cal Poly Slo","1 Brother", " 5 10 ")
)


GPA = lambda GPAs: GPAs[1]


sorted_friends = sorted(friends,key=GPA)

for i in sorted_friends:
    print(i)













































