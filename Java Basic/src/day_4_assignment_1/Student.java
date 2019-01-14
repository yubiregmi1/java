package day_4_assignment_1;

public class Student 
{
	private int studentId;
	private char studentType;
	private String studentName;
	//private String residentialStatus;
	private double feesPerMonth;
	
	Student()
	{
		studentId = 10;
		studentType = 'F';
		System.out.println("Default parent consstructor called");
		
	}
	
	Student(int id, char type, String firstName, String lastName, double feespermonth)
	{
		this.studentId = id;
		this.studentType = type;
		this.setStudentName(firstName,lastName);
		this.setFeesPerMonth(feespermonth);
		System.out.println("Parameterized parent consstructor called");
	}
	
	/*
	public String getFees()
	{
		return ("Fees returned"+feesPerMonth);
	}
	
	public void calculateFees(double semesterFees)
	{
		feesPerMonth = semesterFees/6.0;
		System.out.println("fees calculated for day scholar");
	}
	
	public void calculateFees(double semesterFees, double hostelFees)
	{
		feesPerMonth = semesterFees/6.0;
		feesPerMonth = feesPerMonth+hostelFees;
		System.out.println("fees calculated for hostelite");
	}
	*/
	
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
	
	public double getFeesPerMonth() {
		return feesPerMonth;
	}

	public void setFeesPerMonth(double feesPerMonth) {
		this.feesPerMonth = feesPerMonth;
	}

	/*
	public String getResidentialStatus() {
		return residentialStatus;
	}

	public void setResidentialStatus(String residentialStatus) {
		this.residentialStatus = residentialStatus;
	}
	*/
	


	
}