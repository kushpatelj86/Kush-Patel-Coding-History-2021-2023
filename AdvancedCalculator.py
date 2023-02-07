do_u_want_specific_times =  input("Yes or No ,do you want a specfic number of times: ")
stop_calclulation = False

if do_u_want_specific_times == "Yes" or do_u_want_specific_times == "yes" or do_u_want_specific_times == "yEs"or do_u_want_specific_times == "yeS"or do_u_want_specific_times == "YEs"or do_u_want_specific_times == "yES"or do_u_want_specific_times == "YeS"or do_u_want_specific_times == "YES" or do_u_want_specific_times == " Yes" or do_u_want_specific_times == " yes" or do_u_want_specific_times == " yEs"or do_u_want_specific_times == "yeS"or do_u_want_specific_times == " YEs"or do_u_want_specific_times == " yES"or do_u_want_specific_times == " YeS"or do_u_want_specific_times == " YES" or do_u_want_specific_times == "Yes " or do_u_want_specific_times == "yes " or do_u_want_specific_times == "yEs "or do_u_want_specific_times == "yeS "or do_u_want_specific_times == "YEs "or do_u_want_specific_times == "yES "or do_u_want_specific_times == "YeS "or do_u_want_specific_times == "YES ":
    how_many_times_do = int(input("How many times do you want to calculate something: "))
    starting_num = float(input("Enter the starting number to calculate: "))
    sum = starting_num
    for i in range(0, how_many_times_do):
        op = input("Enter operator: ")
        num = float(input("Enter number: "))

        if op == "+":
            sum = sum + num
        elif op == "-":
            sum = sum - num
        elif op == "/":
            sum = sum / num
        elif op == "*":
            sum = sum * num
        else:
            sum = sum + 0
            print("Invalid Operator") 
 
 

elif do_u_want_specific_times == "No" or do_u_want_specific_times == "no"or do_u_want_specific_times == "nO"or do_u_want_specific_times == "NO" or do_u_want_specific_times == " No" or do_u_want_specific_times == " no"or do_u_want_specific_times == " nO"or do_u_want_specific_times == " NO" or do_u_want_specific_times == "No " or do_u_want_specific_times == "no "or do_u_want_specific_times == "nO "or do_u_want_specific_times == "NO ":
    starting_num = float(input("Enter the starting number to calculate: "))
    sum = starting_num
    start_count = True

    while start_count == True:
        op = input("Enter operator: ")
        num2 = float(input("Enter number: "))
        if op == "+":
            sum = sum + num2
            cont_counting = input("Do you want to continue adding: ")
            if cont_counting == "Yes" or cont_counting == "yes" or cont_counting == "YeS" or cont_counting == "YES" or cont_counting == "yES" or cont_counting == "yeS"or cont_counting == "YEs" or cont_counting == " Yes" or cont_counting == " yes" or cont_counting == " YeS" or cont_counting == " YES" or cont_counting == " yES" or cont_counting == " yeS"or cont_counting == " YEs" or cont_counting == "Yes " or cont_counting == "yes " or cont_counting == "YeS " or cont_counting == "YES " or cont_counting == "yES " or cont_counting == "yeS "or cont_counting == "YEs ":
                start_count = True
            else:
                start_count = False

        elif op == "-":
            sum = sum - num2
            cont_counting = input("Do you want to continue calculating: ")
            if cont_counting == "Yes" or cont_counting == "yes" or cont_counting == "YeS" or cont_counting == "YES" or cont_counting == "yES" or cont_counting == "yeS"or cont_counting == "YEs" or cont_counting == " Yes" or cont_counting == " yes" or cont_counting == " YeS" or cont_counting == " YES" or cont_counting == " yES" or cont_counting == " yeS"or cont_counting == " YEs" or cont_counting == "Yes " or cont_counting == "yes " or cont_counting == "YeS " or cont_counting == "YES " or cont_counting == "yES " or cont_counting == "yeS "or cont_counting == "YEs ":
                start_count = True
            else:
                start_count = False    
        elif op == "/":
            sum = sum / num2
            cont_counting = input("Do you want to continue calculating: ")
            if cont_counting == "Yes" or cont_counting == "yes" or cont_counting == "YeS" or cont_counting == "YES" or cont_counting == "yES" or cont_counting == "yeS"or cont_counting == "YEs" or cont_counting == " Yes" or cont_counting == " yes" or cont_counting == " YeS" or cont_counting == " YES" or cont_counting == " yES" or cont_counting == " yeS"or cont_counting == " YEs" or cont_counting == "Yes " or cont_counting == "yes " or cont_counting == "YeS " or cont_counting == "YES " or cont_counting == "yES " or cont_counting == "yeS "or cont_counting == "YEs ":
                start_count = True
            else:
                start_count = False    
        elif op == "*":
            sum = sum * num2
            cont_counting = input("Do you want to continue calculating: ")
            if cont_counting == "Yes" or cont_counting == "yes" or cont_counting == "YeS" or cont_counting == "YES" or cont_counting == "yES"or cont_counting == "yeS"or cont_counting == "YEs":
                start_count = True
            else:
                start_count = False    
        else:
            sum = sum + 0
            cont_counting = input("Do you want to continue calculating: ")
            if cont_counting == "Yes" or cont_counting == "yes" or cont_counting == "YeS" or cont_counting == "YES" or cont_counting == "yES" or cont_counting == "yeS"or cont_counting == "YEs" or cont_counting == " Yes" or cont_counting == " yes" or cont_counting == " YeS" or cont_counting == " YES" or cont_counting == " yES" or cont_counting == " yeS"or cont_counting == " YEs" or cont_counting == "Yes " or cont_counting == "yes " or cont_counting == "YeS " or cont_counting == "YES " or cont_counting == "yES " or cont_counting == "yeS "or cont_counting == "YEs ":
                start_count = True
            else:
                start_count = False



            print("Invalid Operator") 

        

else:
    
    print("Sorry we can't calculate it for you")




print(sum)