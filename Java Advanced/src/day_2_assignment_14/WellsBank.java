package day_2_assignment_14;

public class WellsBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer john = new Customer(1001,"John","TX",21212);
		SavingsAccount johnSA = new SavingsAccount(101,john,1000);
		johnSA.deposit(1000);
		
		// To-do: display the balance available in account no 101
		System.out.println(john.getCustomerName()+"'s Balance   "+johnSA.balanceEnquiry());
		// To-do: call the method to withdraw Rs.1600.
		johnSA.withdraw(1600);
		// To-do: display the balance available.
		System.out.println(john.getCustomerName()+"'s Balance   "+johnSA.balanceEnquiry());
		
		
		// To-do: Create an instance (jenny) for Customer
		Customer jenny = new Customer(1002,"Jenny","TX",21212);
		CurrentAccount jennyCA = new CurrentAccount(201,jenny,500,2000);
		// To-do: deposit Rs. 1500 to the account
		jennyCA.deposit(1500);
		// To-do: display the balance available in account no 201
		System.out.println(jenny.getCustomerName()+"'s Balance   "+jennyCA.balanceEnquiry());
		// To-do: call the method to withdraw Rs. 1000
		jennyCA.withdraw(1000);
		// To-do: display the balance available
		System.out.println(jenny.getCustomerName()+"'s Balance   "+jennyCA.balanceEnquiry());
		// To-do: call the method to withdraw Rs. 4000
		jennyCA.withdraw(4000);
		// To-do: display the balance available
		System.out.println(jenny.getCustomerName()+"'s Balance   "+jennyCA.balanceEnquiry());
		// To-do: call the method to withdraw Rs. 3000
		jennyCA.withdraw(3000);
		// To-do: display the balance available
		System.out.println(jenny.getCustomerName()+"'s Balance   "+jennyCA.balanceEnquiry());

	}

}
