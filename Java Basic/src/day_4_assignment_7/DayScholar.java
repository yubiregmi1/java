package day_4_assignment_7;

public final class DayScholar extends Student{
	
	private String residentialAddress;
	
	DayScholar()
	{
		//System.out.println("Residential Address:"+residentialAddress);
	}
	
	DayScholar(int sId,char sType,String sName,double fees,String rAddress)
	{
		
	}
	
	public void setResAddress(String resAddress){
		this.residentialAddress=resAddress;
	}
	
	/*
	public void displayDetails(){
		super.displayDetails();
		//System.out.println("Student Name "+studentName);
		System.out.println("Residential Address:"+residentialAddress);
	}
	*/
	

}
