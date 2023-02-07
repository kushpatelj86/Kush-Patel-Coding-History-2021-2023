
/**
 *<BR> Name:          Kush Patel
 *<BR> Date:          12-20-2021
 *<BR> Period:        2
 *<BR> Assignment:    ICT Lesson 13.1
 *<BR> Description:   We will be throwing exceptions 
 *<BR> Cite Sources:  Mr.Eliot taught me how to always set goodData to faLse before running and brady reiss abd I got the same average/we comparex our averages
 */
import java.util.zip.Checksum;

public class CheckingAccount
{
	private final double CHECK_CHARGE = 0.15;
	private double myBalance;

	/**
	Constructs a bank account with a zero balance
	*/
	public CheckingAccount()
	{
		myBalance = 0.00;
	}

	/**
	Constructs a bank account with a given balance
	@param initialBalance the initial balance
	*/
	public CheckingAccount(double initialBalance)
	{
        if(initialBalance < 0.00)
        {
            throw(new IllegalArgumentException("You can't have a negative balance, please reenter the balance"));
        }
		myBalance = initialBalance;

	}

	/**
	Deposits money into the bank account.
	@param amount the amount to deposit
	*/
	public void deposit(double amount)
	{
		if(amount < 0.00)
        {
            throw(new IllegalArgumentException("You can't enter a negative deposit amount, please try again"));
        }
        myBalance = myBalance + amount;
	}

	/**
	Withdraws money from the bank account.
	@param amount the amount to withdraw
	*/
	public void withdraw(double amount)
	{ 
		if(amount < 0.00)
		{
			throw(new IllegalArgumentException("You can't enter a negative withdraw amount, please try again"));
		}
	
		if(amount + CHECK_CHARGE > myBalance)
		{
			throw(new IllegalArgumentException("You can't have the withdrawn amount and $0.15 service charged greater than the balance, please try again "));
		}

        myBalance = myBalance - CHECK_CHARGE - amount;	

		
	}

	/**
	Gets the current balance of the bank account.
	@return the current balance
	*/
	public double getBalance()
	{
		return myBalance;
	}
}
