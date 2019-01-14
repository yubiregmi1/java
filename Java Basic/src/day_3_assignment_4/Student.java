package day_3_assignment_4;

public class Student 
{
	private int studentId;
	private char studentType;
	private String studentName;
	
	Student()
	{
		studentId = 10;
		studentType = 'F';
		
	}
	
	Student(int id, char type, String firstName, String lastName)
	{
		this.studentId = id;
		this.studentType = type;
		this.setStudentName(firstName,lastName);
	}
	
	public void setStudentId(int id)
	{
		studentId = id;
	}
	
	public void setStudentType(char type)
	{
		studentType = type;
	}
	
	public int getStudentId()
	{
		return studentId;
	}
	
	public char getStudentType()
	{
		return studentType;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String firstName, String lastName) {
		this.studentName = firstName+lastName;
	}
}