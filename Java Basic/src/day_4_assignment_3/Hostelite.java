package day_4_assignment_3;

public class Hostelite extends Student{
	
	private String hostelName;
	private int roomNumber;
	
	Hostelite()
	{
		//super();
		System.out.println("Default child (Hostelite) consstructor called");		
	}
	
	Hostelite(int sId, char type, String firstname, String lastname, double fees, String hostelname, int roomno)
	{
		super(sId, type, firstname, lastname, fees);
		this.hostelName = hostelname;
		this.roomNumber = roomno;
		System.out.println("Parameterized child (Hostelite) consstructor called");
	}
	
	public String getHostelName()
	{
		return hostelName;
	}
	
	public int getRoomNumber()
	{
		return roomNumber;
	}
	
	@Override
	public void displayStudentDetails()
	{
		super.displayStudentDetails();
		System.out.println("Hostel Name		:"+this.hostelName);
		System.out.println("Hostel Room NO		:"+this.roomNumber);
		System.out.println("Overriden display in hostelite called");
		
	}

}
