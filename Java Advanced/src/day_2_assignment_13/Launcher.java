package day_2_assignment_13;

public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer customer1 = new Customer("Firname1","N/A","Lname1","1234 Drive, TX",999123000);
		Customer customer2 = new Customer("Firname2","Mname2","Lname2","1234 Drive, TX",999124000);
		
		Account cust1_acc = new Savings(customer1,1500);
		Account cust2_acc = new Overdraft(customer2,1000,500);
		
		cust1_acc.withdraw(500);
		cust1_acc.withdraw(2000);
		cust1_acc.withdraw(5);
		
		cust2_acc.withdraw(500);
		cust2_acc.withdraw(1000);
		cust2_acc.withdraw(5);

	}

}
