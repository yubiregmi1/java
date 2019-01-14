package day_4_assignment_5;

public class PostGradStudent extends Student{
	
	protected int postCourseId;
	protected String postCourseName;
	protected int postCourseFees;
	
	PostGradStudent(int pCourseId, String pCourseName, int pCourseFees, int sId, char sType, String sName)
	{
		super(sId, sType, sName);
		this.postCourseId = pCourseId;
		this.postCourseName = pCourseName;
		this.postCourseFees = pCourseFees;
	}
	
	PostGradStudent(int sId, String sName, int pCourseId, char sType, String pCourseName)
	{
		super(sId, sType, sName);
		this.postCourseId = pCourseId;
		this.postCourseName = pCourseName;
		//this.postCourseFees = pCourseFees;
	}
	
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("Postgrad Course ID	:"+postCourseId);
		System.out.println("Postgrad Course name:"+postCourseName);
		System.out.println("Postgrad Course fees:"+postCourseFees);

	}
	
	
	public int getcourseId()
	{
		System.out.println("Course ID	:"+this.postCourseId);
		return this.postCourseId;
	}
	
	public String getcourseName()
	{
		System.out.println("Course Name	:"+this.postCourseName);
		return this.postCourseName;
	}

}
