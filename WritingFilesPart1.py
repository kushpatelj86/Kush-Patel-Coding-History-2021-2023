
#writing files


number_file = open("1.txt","w") #we can modify existing files

number_file.write("\n 3")
number_file.write("\n 4") #add it to the file
number_file.write("\n 3")
number_file.write("\n 2")
number_file.write("\n 24")
number_file.close()