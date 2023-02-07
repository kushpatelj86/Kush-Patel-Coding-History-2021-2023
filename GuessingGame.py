#we will be creating a guessing game in pythonn
answer_ = "Sending"
guess_ = ""

num_guesses_ = 0
max_guesses_ = 3
is_out_of_guesses_ = False
while guess_ != answer_ and is_out_of_guesses_ == False:
    if num_guesses_ < max_guesses_:
        guess_ = input("Enter guess:")
        num_guesses_ += 1
    else:
        is_out_of_guesses_ = True




if guess_ == answer_ or num_guesses_ < max_guesses_:
    print("You win")
else:
    print("You lose")










