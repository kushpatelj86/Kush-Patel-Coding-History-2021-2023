from Question import Question

question_prompts = [
    "What GPA do most employers want?\n(a) 2.5\n(b) 3.0\n(c) 3.5\n\n",
    "What computer science field pays the most?\n(a) Software\n(b) Web Development\n(c) Depends on the company\n\n"
    "What major do most Software Engineers major in?\n(a) Computer Science\n(b) Computer Engineering\n(c) Electrical Engineering\n\n"


]


questions = [
    Question(question_prompts[0],"b"),
    Question(question_prompts[1],"c"),
    Question(question_prompts[2],"a"),


]


def run_test(questions):
    score = 0
    
    
    
    
    for question in questions:
        answer = input(question.prompt)
        if answer == question.answer:
            score += 1

    
    print("You got " + str(score) + "/" + str(len(question)) + " correct")
    
    
    
    
    
    
    
    





    
