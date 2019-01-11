package day_2_assignment_9;
public class Student
{
	private static int sID = 549;
	private int studentId;
	private char studentType;
	private String studentName;
	
	Student()
	{
		studentId = sID; sID++;
		studentType = 'F';
		studentName = "test";
	}
	
	Student(char sType, String fname, String lname)
	{
		studentId = sID; sID++;
		studentType = sType;
		studentName = fname+lname;
	}
	
	public void displayDetails(Student std)
	{
		//System.out.println("ID : "+studentId);
		//System.out.println("Type : "+studentType);
		//System.out.println("Name : "+studentName);
		System.out.println("ID : "+std.studentId);
		System.out.println("Type : "+std.studentType);
		System.out.println("Name : "+std.studentName);
		
	}
	
	public static void main(String args[])
	{
		Student displayValues = new Student();
		Student studentOne = new Student('D',"Bony","Thomas");
		//displayValues.displayDetails(studentOne);
		studentOne.displayDetails(studentOne);
		
		Student studentTwo = new Student('H',"Dinil","Bose");
		//displayValues.displayDetails(studentOne);
		studentTwo.displayDetails(studentTwo);
	}
	
}