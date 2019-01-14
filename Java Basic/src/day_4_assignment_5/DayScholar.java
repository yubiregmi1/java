package day_4_assignment_5;

public class DayScholar extends PostGradStudent{
	
	private String residentialAddress;
	private double fees;
	
	DayScholar(int pCourseId, String pCourseName, int pCourseFees, int sId, char sType, String sName, String resAdd)
	{
		super(sId, sName, pCourseId, sType, pCourseName);
		this.residentialAddress = resAdd;
	}
	
	public void calculateFees()
	{
		fees = this.postCourseFees/6;
	}
	
	public double getFees()
	{
		System.out.println("fees	:"+fees);
		return fees;
	}

}
