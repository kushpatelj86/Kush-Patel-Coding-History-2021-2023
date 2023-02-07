   #left side is key, right is value
monthConversions = {
        "Jan" : "January",
        "Feb" : "Febuary",
        "Mar" : "March",
        "Apr" : "April",
        "May" : "May",
        "Jun" : "June",
        "Aug" : "August",
        "Sep" : "September",
        "Oct" : "October",
        "Nov" : "November",
        "Dec" : "December",
   } #creating a dictionary

#accessing a element

print(monthConversions["Nov"]) #we insert the key and it returns a value, returns november
print(monthConversions.get("Dec")) #returns december



