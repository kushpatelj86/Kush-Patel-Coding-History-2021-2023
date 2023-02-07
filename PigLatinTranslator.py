#we will create a pig latin translator

word = input("Enter the word you want to translate: ")


def translate(word2):
    new_word = ""
    if len(word2) > 0:
        if word2[0] == 'a' or word2[0] == 'e' or word2[0] == 'i' or word2[0] == 'o' or word2[0] == 'u' or word2[0] == 'A' or word2[0] == 'E' or word2[0] == 'I' or word2[0] == 'O' or word2[0] == 'U':
            new_word = word2 + "way"
        else:
            for i in range(1, len(word2)):
                new_word += word2[i]
            
            
            
            new_word += word2[0] + "ay"

    return new_word
        



print("pig latin:")
print(translate(word))