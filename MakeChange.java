public class MakeChange
{
    private int dollars;
    private int quarters;
    private int dimes;
    private int nickels;
    private int pennies;
    


    public static void totalChange(int purchased, int tendered)
    {
       
        int cents = tenderedAmount(tendered) - purchaseAmount(purchased);

        
        System.out.println("Input the amount of the purchase, in cents:" + purchaseAmount(purchased));
        System.out.println("Input the amount tendered, in cents:" + tenderedAmount(tendered));
        System.out.println();
        System.out.println("Total change due = " + cents);
        System.out.println();
        System.out.println("Change in dollars through pennies is: ");
        System.out.println(getDollars(cents) + " dollars");
        System.out.println(getQuarters(cents) + " quarters");
        System.out.println(getDimes(cents) + " dimes");
        System.out.println(getNickels(cents) + " nickels");
        System.out.println(getPennies(cents) + " pennies");


    }

    public static int purchaseAmount(int purchased)
    {
       
        int cents = purchased;
        return cents;
    }

    public static int tenderedAmount(int tendered)
    {
       
        int cents = tendered;
        return cents;
    }
    

    

    public static int  getDollars(int cents)
    {
        int dollars = (cents / 100);
        return dollars;
    }

    public static int getQuarters(int cents)
    {
        int quarters = (cents % 100) / 25;
        return quarters;
    }

    public static int getDimes(int cents)
    {
        int dimes = (((cents % 100) % 25) / 10);
        return dimes;
    }

    public static int getNickels(int cents)
    {
        int nickels = ((((cents % 100) % 25) % 10) / 5);
        return nickels;
    }

    public static int getPennies(int cents)
    {
        int nickels = (((((cents % 100) % 25) % 10) % 5) / 1);
        return nickels;
    }

    public static void main(String[] args) 
    {
        
        MakeChange.totalChange(216, 500);
        
        
        


    }

}