package day_2_assignment_14;

public class Customer {
	
	private int customerId;
	private String customerName;
	private String customerAddress;
	private int pincode;
	
	Customer()
	{
		System.out.println("Customer() constructor called");
	}
	
	Customer(int customerId, String customerName, String customerAddress, int pincode)
	{
		this.setCustomerId(customerId);
		this.setCustomerName(customerName);
		this.setCustomerAddress(customerAddress);
		this.setPincode(pincode);
		System.out.println("Parameterized Customer() constructor called");
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

}
