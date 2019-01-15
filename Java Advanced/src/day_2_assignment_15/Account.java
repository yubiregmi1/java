package day_2_assignment_15;

public class Account {
	
	private int accountNo;
	private Customer customer;
	protected double balance;
	
	public Account()
	{
		System.out.println("Account() constructor called");
	}
	
	public Account(int accountNo, Customer customer, double balance)
	{
		this.accountNo = accountNo;
		this.customer = customer;
		this.balance = balance;
		System.out.println("Parameterized Account() constructor called");
	}
	
	public double balanceEnquiry()
	{
		return this.balance;
	}
	
	public void deposit(double amount)
	{
		this.balance = this.balance+amount;
	}
	
	public Customer getCustomer()
	{
		return this.customer;
	}

}
