package day_2_assignment_13;

public class Savings extends Account{
	
	protected float savingsAmount;
	
		
	Savings(Customer c,float initialSavingAmount) {
		// TODO Auto-generated constructor stub
		super(c);
		this.savingsAmount = initialSavingAmount;
	}

	Savings(Customer c) {
		// TODO Auto-generated constructor stub
		super(c);
	}

	public void deposit(float depositAmount)
	{
		savingsAmount = savingsAmount+depositAmount;
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
			System.out.println("Not Enough money in Savings Account. Overdraft account can be set up");			
		}
			
	}
	
	public final float calculateInterest()
	{
		float interest=0;
		interest = savingsAmount*0.12f;
		return interest;
	}

	

}
