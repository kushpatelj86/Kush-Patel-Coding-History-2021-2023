/**
 *<BR> Name:          Kush Patel
 *<BR> Date:          10-05-2021
 *<BR> Period:        2
 *<BR> Assignment:    ICT Lesson 5.1
 *<BR> Description:   In this assignment we will be calculating the the total amount of money in a piggy bank, along with the total number of pennies, nickels, dimes, quarters, half dollars, and dollars
 *<BR> Cite Sources:  Mr.Elliot taught me what mistakes I made in the past, I didn't use any outside websites besides https://ap.mreliot.com/LessonA05/Lab-A5-1.html
 */



public class PiggyBank 
{
    /// private primitve values
    private int myPennies;
    private int myNickels;
    private int myDimes;
    private int myQuarters;
    private int myHalfDollars;
    private int myDollars;
    private String MyName;

    /// constructor method
    public PiggyBank()
    {
        MyName = "Obipig Pigoby";
        myPennies = 0;
        myNickels = 0;
        myDimes = 0;
        myQuarters = 0;
        myHalfDollars = 0;
        myDollars = 0;
    }

    public PiggyBank(String Name, int pennies, int nickels, int dimes, int quarters, int halfDollars, int dollars)
    {
        MyName = Name;
        myPennies = pennies;
        myNickels = nickels;
        myDimes = dimes;
        myQuarters = quarters;
        myHalfDollars = halfDollars;
        myDollars = dollars; 
    }

    public PiggyBank(String Name, PiggyBank OtherPiggyBank)
    {
        MyName = OtherPiggyBank.getName();
        myPennies = OtherPiggyBank.getPennies();
        myNickels = OtherPiggyBank.getNickels();
        myDimes = OtherPiggyBank.getDimes();
        myQuarters = OtherPiggyBank.getQuarters();
        myHalfDollars = OtherPiggyBank.getHalfDollars();
        myDollars = OtherPiggyBank.getDollars();
    }
    
    public void printPiggyBank()
    {
        System.out.println("Name: " + MyName);
        System.out.println("Current # of Pennies is " + myPennies);
        System.out.println("Current # of Nickels is " + myNickels);
        System.out.println("Current # of Dimes is " + myDimes);
        System.out.println("Current # of Quarters is " + myQuarters);
        System.out.println("Current # of Half-Dollars is " + myHalfDollars);
        System.out.println("Current # of Dollars is " + myDollars);
        System.out.println("Current Dollar Amount is $" + calculatePiggyBankBalance());
    }

    
    public void depositCoins(int pennies, int nickels, int dimes, int quarters, int halfDollars, int dollars)
    {
        myPennies += pennies;
        myNickels += nickels;
        myDimes += dimes;
        myQuarters += quarters;
        myHalfDollars += halfDollars;
        myDollars += dollars;
    }

    public void depositNickels(int nickels)
    {
        myNickels += nickels;
    }

    public void depositPennies(int pennies)
    {
        myPennies += pennies;
    }

    public void depositDimes(int dimes)
    {
        myDimes += dimes;
    }

    public void depositQuarters(int quarters)
    {
        myQuarters += quarters;
    }

    public void depositHalfDollars(int halfDollars)
    {
        myHalfDollars += halfDollars;
    }

    public void depositDollars(int dollars)
    {
        myDollars += dollars;
    }

    
    public void withdrawNickels(int nickels)
    {
        myNickels -= nickels;
    }

    public void withdrawPennies(int pennies)
    {
        myPennies -= pennies;
    }

    public void withdrawDimes(int dimes)
    {
        myDimes -= dimes;
    }

    public void withdrawQuarters(int quarters)
    {
        myQuarters -= quarters;
    }

    public void withdrawHalfDollars(int halfDollars)
    {
        myHalfDollars -= halfDollars;
    }

    public void withdrawDollars(int dollars)
    {
        myDollars -= dollars;
    }
    
    public void withdrawCoins(int pennies, int nickels, int dimes, int quarters, int halfDollars, int dollars)
    {
        myPennies -= pennies;
        myNickels -= nickels;
        myDimes -= dimes;
        myQuarters -= quarters;
        myHalfDollars -= halfDollars;
        myDollars -= dollars;
    }
    
    public double calculatePiggyBankBalance()
    {
        double myPiggyBankBalance;   
        myPiggyBankBalance = (myPennies * 0.01) + (myNickels * 0.05) + (myDimes * 0.10) + (myQuarters * 0.25) + (myHalfDollars * 0.50) + (myDollars * 1.00);
        myPiggyBankBalance = roundTwoDecimals(myPiggyBankBalance);
        return myPiggyBankBalance;
    }
    

    private double roundTwoDecimals(double amount)
    {
        double roundedAmount;
        
        roundedAmount = amount * 100.0;
        roundedAmount += 0.5;
        roundedAmount = (int) roundedAmount;
        roundedAmount = roundedAmount / 100.0;
        return roundedAmount;
    }

    public int getPennies() 
    {
        return myPennies;
    }

    public int getNickels()
    {
        return myNickels;
    }

    public int getDimes()
    {
        return myDimes;
    }

    public int getQuarters()
    {
        return myQuarters;
    }

    public int getHalfDollars()
    {
        return myHalfDollars;
    }

    public int getDollars()
    {
        return myDollars;
    }

    public String getName()
    {
        return MyName;
    }

    


}










