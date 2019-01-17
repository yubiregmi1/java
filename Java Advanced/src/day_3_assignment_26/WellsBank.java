package day_3_assignment_26;

public class WellsBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer john = new Customer(1001,"John","TX",21212);
		SavingsAccount johnSA = new SavingsAccount(101,john,1000);
		WellsBank bank = new WellsBank();
		
		bank.transaction(johnSA, 1000);		
		// To-do: display the balance available in account no 101
		System.out.println(john.getCustomerName()+"'s Balance   "+johnSA.balanceEnquiry());
		// To-do: call the method to withdraw Rs.1600.
		try
		{
			johnSA.withdraw(1600);
		}
		catch (InsufficientBalanceException e)
		{
			System.out.println(e.getMessage());
		}
		
		// To-do: display the balance available.
		System.out.println(john.getCustomerName()+"'s Balance   "+johnSA.balanceEnquiry());
		
		
		// To-do: Create an instance (jenny) for Customer
		Customer jenny = new Customer(1002,"Jenny","TX",21212);
		CurrentAccount jennyCA = new CurrentAccount(201,jenny,500,2000);
		// To-do: deposit Rs. 1500 to the account
		bank.transaction(jennyCA,1500);
		// To-do: display the balance available in account no 201
		System.out.println(jenny.getCustomerName()+"'s Balance   "+(jennyCA.balanceEnquiry()+jennyCA.getElegibilityAmount()));
		// To-do: call the method to withdraw Rs. 1000
		try
		{
			jennyCA.withdraw(1000);
		}
		catch (InsufficientBalanceException e)
		{
			System.out.println(e.getMessage());
		}
		
		// To-do: display the balance available
		System.out.println(jenny.getCustomerName()+"'s Balance   "+(jennyCA.balanceEnquiry()+jennyCA.getElegibilityAmount()));
		// To-do: call the method to withdraw Rs. 4000
		try {
			jennyCA.withdraw(4000);
		} catch (InsufficientBalanceException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		// To-do: display the balance available
		System.out.println(jenny.getCustomerName()+"'s Balance   "+(jennyCA.balanceEnquiry()+jennyCA.getElegibilityAmount()));
		// To-do: call the method to withdraw Rs. 3000
		try {
			jennyCA.withdraw(3000);
		} catch (InsufficientBalanceException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		// To-do: display the balance available
		System.out.println(jenny.getCustomerName()+"'s Balance   "+(jennyCA.balanceEnquiry()+jennyCA.getElegibilityAmount()));

	}
	
	public void transaction(Account account, double amount) { 
		account.deposit(amount);
		try {
			( account).withdraw(100);
		} catch (InsufficientBalanceException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
	
	

}
