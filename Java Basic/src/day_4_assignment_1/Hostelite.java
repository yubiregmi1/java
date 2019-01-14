package day_4_assignment_1;

public class Hostelite extends Student{
	
	private String hostelName;
	private int roomNumber;
	
	Hostelite()
	{
		//super();
		System.out.println("Default child consstructor called");		
	}
	
	Hostelite(int sId, char type, String firstname, String lastname, double fees, String hostelname, int roomno)
	{
		super(sId, type, firstname, lastname, fees);
		this.hostelName = hostelname;
		this.roomNumber = roomno;
		System.out.println("Parameterized child consstructor called");
	}
	
	public String getHostelName()
	{
		return hostelName;
	}
	
	public int getRoomNumber()
	{
		return roomNumber;
	}

}
