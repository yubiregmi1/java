package day_3_assignment_8;

public class Student 
{
	private int studentId;
	private char studentType;
	private String studentName;
	private String residentialStatus;
	private double feesPerMonth;
	
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

	public String getResidentialStatus() {
		return residentialStatus;
	}

	public void setResidentialStatus(String residentialStatus) {
		this.residentialStatus = residentialStatus;
	}
	
	public static void main(String args[])
	{
		Student student;
		student = new Student(2, 'F', "FirstName","LastName");
		
		student.setResidentialStatus("Day Scholar");
		
		//set fees
		double semesterFees = 3000.0;
		double hostelFees = 2000.0;
		//calculate fee
		if (student.getResidentialStatus().equals("Day Scholar"))
			student.calculateFees(semesterFees);
		else
			student.calculateFees(semesterFees, hostelFees);
		
		//display details
		System.out.println("Student Name: "+student.getStudentName());
		System.out.println("Student ID:   "+student.getStudentId());
		System.out.println("Student type: "+student.getStudentType());
		System.out.println("Residential status: "+student.getResidentialStatus());
		System.out.println("Fees per month: "+student.getFees());
	}
}