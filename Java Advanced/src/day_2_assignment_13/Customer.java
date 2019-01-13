package day_2_assignment_13;

public class Customer {
	
	int accountNo;
	String firstname;
	String middlename;
	String lastname;
	String address;
	double phoneno;
	
	Customer (int accNo, String firstname, String middlename, String lastname, String address, double pn)
	{
		this.accountNo = accNo;
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.address = address;
		this.phoneno = pn;
	}
	
	Customer (String firstname, String middlename, String lastname, String address, double pn)
	{
		//this.accountNo = accNo;
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.address = address;
		this.phoneno = pn;
	}
	
		

}
