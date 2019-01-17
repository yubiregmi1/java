package day_4_assignment_28;

public class WellsBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer john = new Customer();
		
		john.setCustomerAddress("213 Sunny Ln, TX");
		john.setCustomerId(101);
		john.setCustomerName("FirstnameLastname");
		john.setPincode(12345);
		
		System.out.println(john.getCustomerAddress());
		System.out.println(john.getCustomerId());
		System.out.println(john.getCustomerName());
		System.out.println(john.getPincode());
		
		

	}

}
