//personal project
//banking application/money counter
import java.util.Scanner;

public class BankAccount
{
    private double balance;  
    private double prevTranscation;
    private String name;
    private String idNum;

    public BankAccount(double bal, String nm, String id)
    {
        
        balance = Math.abs(bal);



        name = nm;


       

        
        idNum = id;

    }
    

    public void deposit(double amount)
    {
        if(amount > 0 && balance >= 0)
        {
            balance += amount;
            prevTranscation = amount;
        }
        else if(amount < 0 && balance >= 0)
        {
            amount *= -1;
            balance += amount;
            prevTranscation = amount;

        }
        else
        {
            System.out.println("You can't depsoit a negative amount");

        }
    }
    public void withdraw(double amount)
    {
        if(amount > 0 && balance >= 0 && Math.abs(amount) <= balance)
        {
            balance -= amount;
            prevTranscation = amount;

        }
        else if(amount < 0 && balance >= 0 && Math.abs(amount) <= balance)
        {
            amount *= -1;
            balance -= amount;
            prevTranscation = amount;
        }
        else
        {
            System.out.println("You can't withdraw anything greater than your balance or you must be greater than zero");
        }
    }

    
    public void showMenu()
    {
        
        System.out.println("Welcome " + name);
        System.out.println("Your id is " + idNum);
        System.out.println();
        System.out.println("What do you want to do?");
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Previous Transaction");
        System.out.println("E. Exit");

        char option = '\0'; //a null for a char value
        Scanner chooser = new Scanner(System.in);
        char prevChoice = '\0';
        do 
        {
            System.out.print("Choose a option: ");
            option = chooser.next().charAt(0);
            System.out.println();
            System.out.println();
            switch(option)
            {
                case 'A':
                    System.out.println();
                    System.out.printf("Your current balance is %.2f\n", balance);
                    System.out.println();
                    break;
                case 'B':
                    System.out.println();
                    Scanner NumDepositChooser = new Scanner(System.in);
                    System.out.print("How much you would like to deposit: ");
                    double deposNum = Math.abs(NumDepositChooser.nextDouble());
                    deposit(deposNum);
                    System.out.println();
                    prevChoice = 'B';

                    break;
                case 'C':
                    System.out.println();
                    Scanner NumWithdrawChooser = new Scanner(System.in);
                    System.out.print("How much you would like to withdraw: ");
                    double withdrawNum = NumWithdrawChooser.nextDouble();
                    withdraw(withdrawNum);
                    prevChoice = 'C';

                    System.out.println();
                    break;
                case 'D':
                    System.out.println();
                    System.out.print("Your previous transcation is that ");
                    if(prevChoice == 'B')
                    {
                        System.out.print("the amount deposited is " + prevTranscation);
                    }
                    else if(prevChoice == 'C')
                    {
                        System.out.print("the amount withdrawed is " + prevTranscation);
                    }
                    else
                    {
                        System.out.print("there is no previous transcation");

                    }


                    System.out.println();
                    break;
                case 'E':
                    System.out.println("Thank You for using our service");
                    break;


                default:
                    System.out.println("Invalid option. Please enter again");
                    break;
                
            }



        } while (option != 'E');


    }
    public String getName()
    {
        return name;
    }



}
