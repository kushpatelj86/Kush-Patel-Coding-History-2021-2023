import json 



#person = {"name": "John","age":30,"city": "New York", "hasChildren":False,"titles":["engineer","programmer"]}




#personJSON = json.dumps(person,indent=4,separators=('; ','= '),sort_keys=True) #converts it into a json object


#print(personJSON)

#with open('person.json', 'w') as file: #creates a json file
   # json.dump(person,file,indent=4)



#person = json.load(personJSON) #converts it back into a dictionary
#print(person)


#with open('person.json','r') as file:
    #person = json.load(file)
    #print(person)


class User:
    def __init__(self, name, age):
        self.name = name
        self.age = age


user = User('Max',27)


def encode_user(o): #encode object
    if isinstance(o,User):
        return {'name': o.name, 'age':o.age,o.__class__.__name__:True}
    else:
        raise TypeError('Object of type User is not JSON serializable')

from json import JSONEncoder
class UserEncoder(JSONEncoder):
    def default(self,o):
        if isinstance(o,User):
            return {'name': o.name, 'age':o.age,o.__class__.__name__:True}
        return JSONEncoder.default(self,o)

userJSON = json.dumps(user,default=encode_user,cls=UserEncoder)
#userJSON = UserEncoder().encode(user) another way to encode
print(userJSON)
 

 #decoding
#user = json.loads(userJSON)
#print(user)
#print(user)


def decode_user(dct):
    if User.__name__ in dct:
        return User(name=dct['name'],age=dct['age'])




user = json.loads(userJSON,object_hook=decode_user)
print(type(user))
print(user.name)