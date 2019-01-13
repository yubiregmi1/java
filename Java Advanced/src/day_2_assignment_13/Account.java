package day_2_assignment_13;

public abstract class Account {
	
	static int accNo=1;
	
	Customer customer;
	//float savingsAmount;
	
	public abstract void deposit(float amt);
	public abstract void withdraw(float amt);
	
	Account(Customer c)
	{
		if (c.accountNo==0)
		{	
			c.accountNo = accNo;
			accNo++;
			
		}
		
		this.customer = c;	
			
	}
	

}
