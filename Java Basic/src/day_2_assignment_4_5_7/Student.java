package day_2_assignment_4_5_7;
public class Student 
{
	private int studentId;
	private char studentType;
	
	Student()
	{
		studentId = 10;
		studentType = 'F';
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
}