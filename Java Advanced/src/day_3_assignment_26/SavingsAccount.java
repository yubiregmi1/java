package day_3_assignment_26;

public class SavingsAccount extends Account {
	
	private double minimumBalance=500;
	private int interestRate=12;
	
	SavingsAccount()
	{
		System.out.println("SavingsAccount() called");
	}
	
	SavingsAccount(int accountNo, Customer customer, double balance)
	{
		super(accountNo, customer, balance);
		System.out.println("Parameterized SavingsAccount() called");
	}
	
	public void withdraw(double amount) throws InsufficientBalanceException
	{
		if ((balance-amount)>minimumBalance)
			balance = balance-amount;
		else
			//System.out.println("Withdraw amount results account to have less than minimum amount");
			throw new InsufficientBalanceException();
	}
	
	public void calculateInterest()
	{
		System.out.println("Interest calculated");
	}

}
