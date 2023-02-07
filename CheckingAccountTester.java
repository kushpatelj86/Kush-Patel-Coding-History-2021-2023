/**
 *<BR> Name:          Kush Patel
 *<BR> Date:          12-20-2021
 *<BR> Period:        2
 *<BR> Assignment:    ICT Lesson 13.1
 *<BR> Description:   We will be throwing exceptions 
 *<BR> Cite Sources:  Mr.Eliot taught me how to always set goodData to faLse before running and brady reiss abd I got the same average/we comparex our averages
 */
 
import java.util.Scanner;

import jdk.nashorn.api.tree.WhileLoopTree;

import java.lang.IllegalArgumentException;

public class CheckingAccountTester
{
	public static void main(String[] args)
	{
		Scanner Console = new Scanner(System.in);
		CheckingAccount MyChecking = new CheckingAccount();
		double depositAmount;
		double withdrawAmount;
		double startingBalance;
		boolean goodData = false;

		
		//**********************************
		//Construct a CheckingAccount object
		//**********************************
		goodData = false;
        while(goodData == false)    
        {
            System.out.print("Please enter the starting balance --> ");
			startingBalance = Console.nextDouble();
    
            try
            {
				MyChecking = new CheckingAccount(startingBalance);
                goodData = true;
            }
            catch(IllegalArgumentException sArgumentException)
            {
                System.out.println(sArgumentException.getMessage());
            }
        }
        

		System.out.println();
		System.out.println("Account opened with a balance = " + MyChecking.getBalance());
		System.out.println();

		
		//**************
		//Make a deposit
		//**************
        goodData = false;
		while(goodData == false)    
        {
            System.out.print("Please enter the amount to deposit --> ");
            depositAmount = Console.nextDouble();
    
            try
            {
                MyChecking.deposit(depositAmount);
                goodData = true;
            }
            catch(IllegalArgumentException sArgumentException)
            {
                System.out.println(sArgumentException.getMessage());
            }
        }
		System.out.println();
		System.out.println("Deposit made. Current account balance = " + MyChecking.getBalance());
		System.out.println();

		
		//****************
		//Make a withdrawl
		//****************
		goodData = false;

		while(goodData == false)
        {
            System.out.print("Please enter the amount to withdraw --> ");
		    withdrawAmount = Console.nextDouble();
            try
            {
                MyChecking.withdraw(withdrawAmount);
                goodData = true;
            }   
            catch(IllegalArgumentException sArgumentException) 
            {
                System.out.println(sArgumentException.getMessage());
            }

            
        }
		System.out.println();
		System.out.println("Withdrawal made. Current account balance (includes a $0.15 check charge) = " + MyChecking.getBalance());
		System.out.println();

		
		//Say goodbye
		System.out.println("Thank you for using Exception Free Checking (c)...goodbye!");
	}
}


/*
RUN OUTPUT:
Please enter the starting balance --> 2.0

Account opened with a balance = 2.0

Please enter the amount to deposit --> 2.0

Deposit made. Current account balance = 4.0

Please enter the amount to withdraw --> 2.0

Withdrawal made. Current account balance (includes a $0.15 check charge) = 1.85

Thank you for using Exception Free Checking (c)...goodbye!





Please enter the starting balance --> 4

Account opened with a balance = 4.0

Please enter the amount to deposit --> -2
You can't enter a negative deposit amount, please try again
Please enter the amount to deposit --> 2

Deposit made. Current account balance = 6.0

Please enter the amount to withdraw --> -2
You can't enter a negative withdraw amount, please try again
Please enter the amount to withdraw --> 6
You can't have the withdrawn amount and $0.15 service charged greater than the balance, please try again
Please enter the amount to withdraw --> 5

Withdrawal made. Current account balance (includes a $0.15 check charge) = 0.85

Thank you for using Exception Free Checking (c)...goodbye!



Please enter the starting balance --> -2
You can't have a negative balance, please reenter the balance
Please enter the starting balance --> 2

Account opened with a balance = 2.0    

Please enter the amount to deposit --> 2

Deposit made. Current account balance = 4.0

Please enter the amount to withdraw --> 2  

Withdrawal made. Current account balance (includes a $0.15 check charge) = 1.85

Thank you for using Exception Free Checking (c)...goodbye!







Please enter the starting balance --> 2

Account opened with a balance = 2.0    

Please enter the amount to deposit --> -6
You can't enter a negative deposit amount, please try again
Please enter the amount to deposit --> 6

Deposit made. Current account balance = 8.0

Please enter the amount to withdraw --> -8 
You can't enter a negative withdraw amount, please try again
Please enter the amount to withdraw --> 8
You can't have the withdrawn amount and $0.15 service charged greater than the balance, please try again 
Please enter the amount to withdraw --> 7

Withdrawal made. Current account balance (includes a $0.15 check charge) = 0.85

Thank you for using Exception Free Checking (c)...goodbye!




Please enter the starting balance --> 2

Account opened with a balance = 2.0    

Please enter the amount to deposit --> -2
You can't enter a negative deposit amount, please try again
Please enter the amount to deposit --> 2

Deposit made. Current account balance = 4.0

Please enter the amount to withdraw --> 1  

Withdrawal made. Current account balance (includes a $0.15 check charge) = 2.85

Thank you for using Exception Free Checking (c)...goodbye!





Please enter the starting balance --> 5

Account opened with a balance = 5.0

Please enter the amount to deposit --> 5

Deposit made. Current account balance = 10.0

Please enter the amount to withdraw --> -5
You can't enter a negative withdraw amount, please try again
Please enter the amount to withdraw --> 5

Withdrawal made. Current account balance (includes a $0.15 check charge) = 4.85

Thank you for using Exception Free Checking (c)...goodbye!




Please enter the starting balance --> 2

Account opened with a balance = 2.0    

Please enter the amount to deposit --> 2

Deposit made. Current account balance = 4.0

Please enter the amount to withdraw --> 3.85

Withdrawal made. Current account balance (includes a $0.15 check charge) = 0.0

Thank you for using Exception Free Checking (c)...goodbye!



Please enter the starting balance --> 204.45

Account opened with a balance = 204.45 

Please enter the amount to deposit --> -355.34
You can't enter a negative deposit amount, please try again
Please enter the amount to deposit --> 345.53

Deposit made. Current account balance = 549.98

Please enter the amount to withdraw --> 342.24

Withdrawal made. Current account balance (includes a $0.15 check charge) = 207.59000000000003

Thank you for using Exception Free Checking (c)...goodbye!




Please enter the starting balance --> 4.24

Account opened with a balance = 4.24   

Please enter the amount to deposit --> 6.43 

Deposit made. Current account balance = 10.67

Please enter the amount to withdraw --> 12.53
You can't have the withdrawn amount and $0.15 service charged greater than the balance, please try again 
Please enter the amount to withdraw --> 2

Withdrawal made. Current account balance (includes a $0.15 check charge) = 8.52

Thank you for using Exception Free Checking (c)...goodbye!




Please enter the starting balance --> 2

Account opened with a balance = 2.0    

Please enter the amount to deposit --> 4.2

Deposit made. Current account balance = 6.2

Please enter the amount to withdraw --> -5.3
You can't enter a negative withdraw amount, please try again
Please enter the amount to withdraw --> 5.2

Withdrawal made. Current account balance (includes a $0.15 check charge) = 0.8499999999999996

Thank you for using Exception Free Checking (c)...goodbye!




Please enter the starting balance --> 2.42

Account opened with a balance = 2.42   

Please enter the amount to deposit --> -3.42
You can't enter a negative deposit amount, please try again
Please enter the amount to deposit --> 3.53 

Deposit made. Current account balance = 5.949999999999999

Please enter the amount to withdraw --> -3.242
You can't enter a negative withdraw amount, please try again
Please enter the amount to withdraw --> 3.14

Withdrawal made. Current account balance (includes a $0.15 check charge) = 2.659999999999999

Thank you for using Exception Free Checking (c)...goodbye!




Please enter the starting balance --> 3.56

Account opened with a balance = 3.56   

Please enter the amount to deposit --> 3.24

Deposit made. Current account balance = 6.800000000000001

Please enter the amount to withdraw --> -3.35
You can't enter a negative withdraw amount, please try again
Please enter the amount to withdraw --> 9.65
You can't have the withdrawn amount and $0.15 service charged greater than the balance, please try again 
Please enter the amount to withdraw --> 7.53
You can't have the withdrawn amount and $0.15 service charged greater than the balance, please try again 
Please enter the amount to withdraw --> 5.35

Withdrawal made. Current account balance (includes a $0.15 check charge) = 1.3000000000000007

Thank you for using Exception Free Checking (c)...goodbye!



Please enter the starting balance --> 4.24

Account opened with a balance = 4.24   

Please enter the amount to deposit --> -5.24
You can't enter a negative deposit amount, please try again
Please enter the amount to deposit --> -0.24
You can't enter a negative deposit amount, please try again
Please enter the amount to deposit --> 0.0

Deposit made. Current account balance = 4.24

Please enter the amount to withdraw --> -7.46
You can't enter a negative withdraw amount, please try again
Please enter the amount to withdraw --> 7.56
You can't have the withdrawn amount and $0.15 service charged greater than the balance, please try again 
Please enter the amount to withdraw --> 4.31
You can't have the withdrawn amount and $0.15 service charged greater than the balance, please try again 
Please enter the amount to withdraw --> 2.12

Withdrawal made. Current account balance (includes a $0.15 check charge) = 1.9699999999999998

Thank you for using Exception Free Checking (c)...goodbye!




Please enter the starting balance --> 2.45

Account opened with a balance = 2.45   

Please enter the amount to deposit --> 3.64

Deposit made. Current account balance = 6.09

Please enter the amount to withdraw --> 2.45

Withdrawal made. Current account balance (includes a $0.15 check charge) = 3.4899999999999993

Thank you for using Exception Free Checking (c)...goodbye!




Please enter the starting balance --> 2.45

Account opened with a balance = 2.45   

Please enter the amount to deposit --> -4.24
You can't enter a negative deposit amount, please try again
Please enter the amount to deposit --> 3.34

Deposit made. Current account balance = 5.79

Please enter the amount to withdraw --> 6.36
You can't have the withdrawn amount and $0.15 service charged greater than the balance, please try again 
Please enter the amount to withdraw --> -6.36
You can't enter a negative withdraw amount, please try again
Please enter the amount to withdraw --> 3.55

Withdrawal made. Current account balance (includes a $0.15 check charge) = 2.09

Thank you for using Exception Free Checking (c)...goodbye!





Please enter the starting balance --> -0.35
You can't have a negative balance, please reenter the balance
Please enter the starting balance --> 0.35

Account opened with a balance = 0.35   

Please enter the amount to deposit --> -35.35
You can't enter a negative deposit amount, please try again
Please enter the amount to deposit --> 76.35

Deposit made. Current account balance = 76.69999999999999

Please enter the amount to withdraw --> -3.5325
You can't enter a negative withdraw amount, please try again
Please enter the amount to withdraw --> 543.45
You can't have the withdrawn amount and $0.15 service charged greater than the balance, please try again 
Please enter the amount to withdraw --> 76.36

Withdrawal made. Current account balance (includes a $0.15 check charge) = 0.18999999999998352

Thank you for using Exception Free Checking (c)...goodbye!




Please enter the starting balance --> 2

Account opened with a balance = 2.0    

Please enter the amount to deposit --> 2

Deposit made. Current account balance = 4.0

Please enter the amount to withdraw --> 4  
You can't have the withdrawn amount and $0.15 service charged greater than the balance, please try again 
Please enter the amount to withdraw --> 3.99
You can't have the withdrawn amount and $0.15 service charged greater than the balance, please try again 
Please enter the amount to withdraw --> 4.01
You can't have the withdrawn amount and $0.15 service charged greater than the balance, please try again 
Please enter the amount to withdraw --> 3.85

Withdrawal made. Current account balance (includes a $0.15 check charge) = 0.0

Thank you for using Exception Free Checking (c)...goodbye!





Please enter the starting balance --> 342.24

Account opened with a balance = 342.24 

Please enter the amount to deposit --> -442.24
You can't enter a negative deposit amount, please try again
Please enter the amount to deposit --> -.34
You can't enter a negative deposit amount, please try again
Please enter the amount to deposit --> 3.56

Deposit made. Current account balance = 345.8

Please enter the amount to withdraw --> -3.537 
You can't enter a negative withdraw amount, please try again
Please enter the amount to withdraw --> 4.24

Withdrawal made. Current account balance (includes a $0.15 check charge) = 341.41

Thank you for using Exception Free Checking (c)...goodbye!






Please enter the starting balance --> -3.45
You can't have a negative balance, please reenter the balance
Please enter the starting balance --> 3.53

Account opened with a balance = 3.53   

Please enter the amount to deposit --> -.35 
You can't enter a negative deposit amount, please try again
Please enter the amount to deposit --> .357

Deposit made. Current account balance = 3.8869999999999996

Please enter the amount to withdraw --> -4.35 
You can't enter a negative withdraw amount, please try again
Please enter the amount to withdraw --> 4.36
You can't have the withdrawn amount and $0.15 service charged greater than the balance, please try again 
Please enter the amount to withdraw --> 3.86
You can't have the withdrawn amount and $0.15 service charged greater than the balance, please try again 
Please enter the amount to withdraw --> 2

Withdrawal made. Current account balance (includes a $0.15 check charge) = 1.7369999999999997

Thank you for using Exception Free Checking (c)...goodbye!





Please enter the starting balance --> 2

Account opened with a balance = 2.0

Please enter the amount to deposit --> -3
You can't enter a negative deposit amount, please try again
Please enter the amount to deposit --> 3

Deposit made. Current account balance = 5.0

Please enter the amount to withdraw --> 5 
You can't have the withdrawn amount and $0.15 service charged greater than the balance, please try again 
Please enter the amount to withdraw --> 4.85

Withdrawal made. Current account balance (includes a $0.15 check charge) = 0.0

Thank you for using Exception Free Checking (c)...goodbye!





Please enter the starting balance --> 2

Account opened with a balance = 2.0

Please enter the amount to deposit --> -3
You can't enter a negative deposit amount, please try again
Please enter the amount to deposit --> 3

Deposit made. Current account balance = 5.0

Please enter the amount to withdraw --> 5 
You can't have the withdrawn amount and $0.15 service charged greater than the balance, please try again 
Please enter the amount to withdraw --> 4.85

Withdrawal made. Current account balance (includes a $0.15 check charge) = 0.0

Thank you for using Exception Free Checking (c)...goodbye!





Please enter the starting balance --> -7.64
You can't have a negative balance, please reenter the balance
Please enter the starting balance --> 6.86

Account opened with a balance = 6.86   

Please enter the amount to deposit --> 7.64

Deposit made. Current account balance = 14.5

Please enter the amount to withdraw --> -.75
You can't enter a negative withdraw amount, please try again
Please enter the amount to withdraw --> 7.75

Withdrawal made. Current account balance (includes a $0.15 check charge) = 6.6

Thank you for using Exception Free Checking (c)...goodbye!





Please enter the starting balance --> 1.24

Account opened with a balance = 1.24   

Please enter the amount to deposit --> -2.42
You can't enter a negative deposit amount, please try again
Please enter the amount to deposit --> 2.43

Deposit made. Current account balance = 3.67

Please enter the amount to withdraw --> 2.12

Withdrawal made. Current account balance (includes a $0.15 check charge) = 1.4

Thank you for using Exception Free Checking (c)...goodbye!






Please enter the starting balance --> 7.64

Account opened with a balance = 7.64   

Please enter the amount to deposit --> 7.64

Deposit made. Current account balance = 15.28

Please enter the amount to withdraw --> -9.53
You can't enter a negative withdraw amount, please try again
Please enter the amount to withdraw --> 14.34

Withdrawal made. Current account balance (includes a $0.15 check charge) = 0.7899999999999991

Thank you for using Exception Free Checking (c)...goodbye!





Please enter the starting balance --> 3

Account opened with a balance = 3.0    

Please enter the amount to deposit --> 3

Deposit made. Current account balance = 6.0

Please enter the amount to withdraw --> 7  
You can't have the withdrawn amount and $0.15 service charged greater than the balance, please try again 
Please enter the amount to withdraw --> 5

Withdrawal made. Current account balance (includes a $0.15 check charge) = 0.8499999999999996

Thank you for using Exception Free Checking (c)...goodbye!





Please enter the starting balance --> 3

Account opened with a balance = 3.0    

Please enter the amount to deposit --> 3.7

Deposit made. Current account balance = 6.7

Please enter the amount to withdraw --> -8 
You can't enter a negative withdraw amount, please try again
Please enter the amount to withdraw --> 6.7
You can't have the withdrawn amount and $0.15 service charged greater than the balance, please try again 
Please enter the amount to withdraw --> 5

Withdrawal made. Current account balance (includes a $0.15 check charge) = 1.5499999999999998

Thank you for using Exception Free Checking (c)...goodbye!




Please enter the starting balance --> -2.35
You can't have a negative balance, please reenter the balance
Please enter the starting balance --> 2.35

Account opened with a balance = 2.35

Please enter the amount to deposit --> 2.45

Deposit made. Current account balance = 4.800000000000001

Please enter the amount to withdraw --> -1.24
You can't enter a negative withdraw amount, please try again
Please enter the amount to withdraw --> 4.8
You can't have the withdrawn amount and $0.15 service charged greater than the balance, please try again
Please enter the amount to withdraw --> 3

Withdrawal made. Current account balance (includes a $0.15 check charge) = 1.6500000000000004

Thank you for using Exception Free Checking (c)...goodbye!




Please enter the starting balance --> -2.34
You can't have a negative balance, please reenter the balance
Please enter the starting balance --> 2.34

Account opened with a balance = 2.34

Please enter the amount to deposit --> -2.45
You can't enter a negative deposit amount, please try again
Please enter the amount to deposit --> 78.35

Deposit made. Current account balance = 80.69

Please enter the amount to withdraw --> 23.24

Withdrawal made. Current account balance (includes a $0.15 check charge) = 57.3

Thank you for using Exception Free Checking (c)...goodbye!





Please enter the starting balance --> 2.42

Account opened with a balance = 2.42

Please enter the amount to deposit --> 1.42

Deposit made. Current account balance = 3.84

Please enter the amount to withdraw --> 3.69

Withdrawal made. Current account balance (includes a $0.15 check charge) = 0.0

Thank you for using Exception Free Checking (c)...goodbye!





Please enter the starting balance --> 3.42

Account opened with a balance = 3.42

Please enter the amount to deposit --> 3.42

Deposit made. Current account balance = 6.84

Please enter the amount to withdraw --> -6.84
You can't enter a negative withdraw amount, please try again
Please enter the amount to withdraw --> 6.84
You can't have the withdrawn amount and $0.15 service charged greater than the balance, please try again
Please enter the amount to withdraw --> 7.24
You can't have the withdrawn amount and $0.15 service charged greater than the balance, please try again
Please enter the amount to withdraw --> 5.99

Withdrawal made. Current account balance (includes a $0.15 check charge) = 0.6999999999999993

Thank you for using Exception Free Checking (c)...goodbye!





Please enter the starting balance --> 50

Account opened with a balance = 50.0

Please enter the amount to deposit --> 50

Deposit made. Current account balance = 100.0

Please enter the amount to withdraw --> 99.86
You can't have the withdrawn amount and $0.15 service charged greater than the balance, please try again
Please enter the amount to withdraw --> 99.85

Withdrawal made. Current account balance (includes a $0.15 check charge) = 0.0

Thank you for using Exception Free Checking (c)...goodbye!
*/


