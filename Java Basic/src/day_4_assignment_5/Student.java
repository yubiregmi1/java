package day_4_assignment_5;

public class Student {
	
	protected static int studentId;
	
	protected int stdID;
	protected char studentType;
	protected String studentName;
	
	Student(int sId)
	{
		System.out.println("Parent non parameterized constructor (Student()) called");
		studentId++;
		this.stdID = sId;
		
	}
	
	Student(int sId, char sType, String sName)
	{
		
		this(sId);
		this.studentType = sType;
		this.studentName = sName;
		System.out.println("Parent parameterized constructor  called");
	}
	

	public void displayDetails() {
		// TODO Auto-generated method stub
		System.out.println("Student id		:"+stdID);
		System.out.println("Student type	:"+studentType);
		System.out.println("Student name	:"+studentName);
	}

	

}
