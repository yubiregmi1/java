package day_4_assignment_3;

public class DayScholar extends Student {
	
	private String residentialAddress;
	
	DayScholar()
	{
		//super();
		System.out.println("Default child day scholar consstructor called");		
	}
	
	DayScholar(int sId, char type, String firstname, String lastname, double fees, String residentialAddress)
	{
		super(sId, type, firstname, lastname, fees);
		this.residentialAddress = residentialAddress;
		
		System.out.println("Parameterized child day scholar consstructor called");
	}
	
	public String getResidentialAddress()
	{
		return this.residentialAddress;
	}
	
	@Override
	public void displayStudentDetails()
	{
		super.displayStudentDetails();
		System.out.println("Residential Address	:"+this.residentialAddress);
		System.out.println("Overriden display in day scholar called");
	
	}
	

}
