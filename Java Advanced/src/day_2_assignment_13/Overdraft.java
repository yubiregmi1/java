package day_2_assignment_13;

public class Overdraft extends Savings{
	
	private float remainingOverdraft;
	private float overdraftLimit;
	
	Overdraft(Customer c, float overdraftLimit)
	{
		super(c);
		this.overdraftLimit = overdraftLimit;
	}
	
	Overdraft(Customer c, float initialSavings, float overdraftLimit)
	{
		super(c,initialSavings);
		this.overdraftLimit = overdraftLimit;
	}
	
	public void withdraw(float withdrawAmount)
	{
		if ((savingsAmount-withdrawAmount)>0)
		{
			System.out.println("$"+ withdrawAmount+" Withdrawed");
			savingsAmount = savingsAmount-withdrawAmount;
		}
		else
		{
			//System.out.println("Not Enough money in Savings Account. Overdraft account can be set up");	
			
			if (savingsAmount>withdrawAmount)
			{
				System.out.println("Amount Withdrawed");
				savingsAmount = savingsAmount-withdrawAmount;
			}
			else if (remainingOverdraft+savingsAmount>withdrawAmount)
			{
				savingsAmount=0;
				remainingOverdraft = remainingOverdraft-savingsAmount;
				System.out.println("Account overdraft");
				System.out.println("Savings = 0");
				System.out.println("Remaining overdraft="+remainingOverdraft);				
			}
			else
			{
				System.out.println("Withdraw amount exceeds overdraft limit. Remaining overdraft limit=0");
				remainingOverdraft=0;
			}			
		}
			
	}
	
	public void deposit(float depositAmount)
	{
		if (remainingOverdraft<overdraftLimit)
		{
			if (depositAmount<=(overdraftLimit-remainingOverdraft))
			{
				remainingOverdraft = remainingOverdraft+depositAmount;				
			}
			else
			{
				remainingOverdraft = overdraftLimit;
				savingsAmount = depositAmount - (overdraftLimit-remainingOverdraft);
			}
		}
		else
		{
			savingsAmount = savingsAmount+depositAmount;
		}
	}	

}
