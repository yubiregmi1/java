package day_3_assignment_26;

public class CurrentAccount extends Account {
	
	private double currentAmount=10000;	//allowed overdraft amount
	
	CurrentAccount()
	{
		
	}
	
	CurrentAccount(int accountNo, Customer customer, double balance, double currentAmount)
	{
		super(accountNo, customer, balance);
		this.currentAmount = currentAmount;
	}
	
	
	public void withdraw(double amount) throws InsufficientBalanceException
	{
		if (currentAmount==0)
		{
			//System.out.println("Overdraft limit reached. Cannot withdraw");
			throw new InsufficientBalanceException();
		}
		if (balance>amount)
		{
			balance = balance-amount;
		}
		else if (currentAmount+balance>amount)
		{
			balance = 0;
			System.out.println("Overdraft used");
			currentAmount = currentAmount-(amount-balance);
			System.out.println("Remaining overdraft : "+this.currentAmount);
		}
		else
		{
			currentAmount = 0;
			balance = 0;
			System.out.println("Overdraft limit reached");
		}
	}
	
	public double getEligibilityAmount()
	{
		return -this.currentAmount;
	}
	
	public void setElegibilityAmount(double ea)
	{
		this.currentAmount = ea;
	}
	
	public double getElegibilityAmount()
	{
		return this.currentAmount;
	}

}
